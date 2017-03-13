package es.eina.tfg.EventDiscoverManager.portlet;

import com.google.gson.Gson;
import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.EventDiscoverManager.exception.UnableToObtainEventException;
import es.eina.tfg.EventDiscoverManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.EventDiscoverManager.exception.UnableToProcessActionException;
import es.eina.tfg.EventDiscoverManager.model.DTO.FullcalendarEventRequest;
import es.eina.tfg.EventDiscoverManager.model.EventManager;
import es.eina.tfg.RunTrackerBL.dao.EventDAO;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.util.UserUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

public class PortletController extends MVCPortlet {

    private static final Gson GSON = new Gson();

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        User user = UserUtils.getCurrentUser(request);

        //Add today
        String today = getTodayDateAsString();
        request.setAttribute(WebKeys.PARAM_TODAY, today);

        //Selected Event
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        try {
            Event event = EventManager.getSelectedEvent(idEvent, user.getUserId());
            request.setAttribute(WebKeys.REQUESTED_EVENT, event);
        } catch (UnableToObtainEventException e) {
            _log.error("UnableToObtainEventException while EventManager.getSelectedEvent for: " + idEvent, e);
            SessionErrors.add(request, "No se ha podido obtener el evento solicitado.");
        }

        super.render(request, response);
    }

    public void addParticipationEventAction(ActionRequest request, ActionResponse response){
        User user = UserUtils.getCurrentUser(request);
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        _log.info("Adding participation for event: " + idEvent + " user: " + user);

        try {
            EventManager.addParticipation(user.getUserId(), idEvent);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, "0");
            SessionMessages.add(request, WebKeys.MESSAGE_ADD_EVENT_ACTION_SUCCESS);
        } catch (UnableToProcessActionException e) {
            _log.error("UnableToProcessActionException while addParticipation", e);
            SessionErrors.add(request, "Ha ocurrido un error al procesar su participacion en el evento");
        }
    }

    @Override
    public void serveResource(ResourceRequest request, ResourceResponse response)
            throws IOException, PortletException {
        String requestType = ParamUtil.getString(request, WebKeys.PARAM_RESOURCEREQUEST_TYPE);
        _log.info("received: " + requestType + " message");
        if (WebKeys.PARAM_RESOURCEREQUEST_GET_MONTH_EVENTS.equals(requestType)){
            getMonthEvents(request, response);
        }
        super.serveResource(request, response);
    }

    private static String getTodayDateAsString(){
        DateTimeFormatter dtFormatter = DateTimeFormat.forPattern(WebKeys.TODAY_DATE_PATTERN);
        return dtFormatter.print(DateTime.now());
    }

    private void getMonthEvents(ResourceRequest request, ResourceResponse response)
            throws IOException {
        FullcalendarEventRequest eventRequest = new FullcalendarEventRequest();
        eventRequest.setStart(getDateTimeFromParam(request, WebKeys.PARAM_START_DATE));
        eventRequest.setEnd(getDateTimeFromParam(request, WebKeys.PARAM_END_DATE));
        eventRequest.setIdUser(UserUtils.getCurrentUserId(request));
        eventRequest.setContextPath(request.getContextPath());

        try {
            List events = EventManager.getDisponibleMonthRacesAsEvents(eventRequest);
            String eventsJson = GSON.toJson(events);
            _log.info("created JSON: " + eventsJson);
            response.getWriter().write(eventsJson);
        } catch (UnableToParseJSONDataException e) {
            _log.error("UnableToParseJSONDataException while getMonthRacesAsEvents for: " + eventRequest);
            SessionErrors.add(request, "No se han podido obtener entrenamientos para el mes seleccionado");
        }
    }

    private DateTime getDateTimeFromParam(ResourceRequest request, String paramName){
        String dateString = ParamUtil.getString(request, paramName);
        return Validator.isNotNull(dateString) ? new DateTime(dateString) : null;
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

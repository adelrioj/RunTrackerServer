package es.eina.tfg.EventViewerManager.portlet;

import com.google.gson.Gson;
import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.EventViewerManager.exception.UnableToObtainEventException;
import es.eina.tfg.EventViewerManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.EventViewerManager.exception.UnableToProcessActionException;
import es.eina.tfg.EventViewerManager.model.DTO.FullcalendarEventRequest;
import es.eina.tfg.EventViewerManager.model.EventManager;
import es.eina.tfg.EventViewerManager.model.RouteManager;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.entity.Route;
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

        //Add user routes
        List<Route> routes = RouteManager.getUserSelectedRoutes(user);
        request.setAttribute(WebKeys.ADDEVENT_ROUTE_LIST, routes);

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

    public void addEventAction(ActionRequest request, ActionResponse response) {
        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        String name = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_NAME);
        String startDate = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_STARTDATE);
        String startTime = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_STARTHOUR);
        String endDate = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_ENDDATE);
        String endTime = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_ENDHOUR);
        Long idRoute = ParamUtil.getLong(uploadPortletRequest, WebKeys.PARAM_ADDEVENT_IDROUTE);
        User author = UserUtils.getCurrentUser(request);
        try {
            Event added = EventManager.insert(name, startDate, startTime, endDate, endTime, idRoute, author);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, String.valueOf(added.getIdEvent()));
            SessionMessages.add(request, WebKeys.MESSAGE_ADD_EVENT_ACTION_SUCCESS);
        } catch (Exception e) {
            SessionErrors.add(request, "Ha ocurrido un error al añadir el evento");
        }
    }

    public void deleteParticipationEventAction(ActionRequest request, ActionResponse response){
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        Long idUser = UserUtils.getCurrentUserId(request);
        _log.info("Starting delete for participant: " + idUser + " and event: " + idEvent);

        try {
            EventManager.deleteParticipation(idEvent, idUser);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, "0");
            SessionMessages.add(request, WebKeys.MESSAGE_DELETE_EVENT_ACTION_SUCCESS);
        } catch (UnableToProcessActionException e) {
            SessionErrors.add(request, "Ha ocurrido un error al eliminar el evento");
        }
    }

    public void deleteParticipantAction(ActionRequest request, ActionResponse response)
            throws IOException, PortletException {
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        Long idUser = ParamUtil.getLong(request, WebKeys.PARAM_SELECTED_PARTICIPANT_ID);
        _log.info("Starting delete for participant: " + idUser + " and event: " + idEvent);

        try {
            EventManager.deleteParticipation(idEvent, idUser);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, "0");
            SessionMessages.add(request, WebKeys.MESSAGE_DELETE_PARTICIPANT_ACTION_SUCCESS);
        } catch (UnableToProcessActionException e) {
            SessionErrors.add(request, "Ha ocurrido un error al eliminar el evento");
        }

        response.setRenderParameter("jspPage","/jsp/participants/view_participants.jsp");
    }

    public void startEventAction(ActionRequest request, ActionResponse response){
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        _log.info("Started event: " + idEvent);
        try {
            Event event = EventManager.startEvent(idEvent);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, String.valueOf(event.getIdEvent()));
            SessionMessages.add(request, WebKeys.MESSAGE_START_EVENT_ACTION_SUCCESS);
        } catch (Exception e) {
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, String.valueOf(idEvent));
            SessionErrors.add(request, "Ha ocurrido un error al iniciar el evento");
        }
    }

    public void finishEventAction(ActionRequest request, ActionResponse response){
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        _log.info("Finished event: " + idEvent);

        try {
            Event event = EventManager.finishEvent(idEvent);
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, String.valueOf(event.getIdEvent()));
            SessionMessages.add(request, WebKeys.MESSAGE_FINISH_EVENT_ACTION_SUCCESS);
        } catch (Exception e) {
            response.setRenderParameter(WebKeys.PARAM_EVENT_ID, String.valueOf(idEvent));
            SessionErrors.add(request, "Ha ocurrido un error al finalizar el evento");
        }
    }

    public void redirectToDiscoverAction(ActionRequest request, ActionResponse response)
            throws IOException {
        String portletName = "EventDiscoverManager_WAR_EventDiscoverManagerPortletportlet_";
        long plid = 24107;
        PortletURL redirectURL = PortletURLFactoryUtil.create(
                PortalUtil.getHttpServletRequest(request), portletName, plid, PortletRequest.RENDER_PHASE);
        response.sendRedirect(redirectURL.toString());
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
            List events = EventManager.getMonthRacesAsEvents(eventRequest);
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

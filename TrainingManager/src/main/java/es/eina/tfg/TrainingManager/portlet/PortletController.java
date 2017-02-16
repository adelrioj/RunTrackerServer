package es.eina.tfg.TrainingManager.portlet;

import com.google.gson.Gson;
import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.UserEmailAddressException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.util.UserUtils;
import es.eina.tfg.TrainingManager.exception.UnableToDeleteRaceException;
import es.eina.tfg.TrainingManager.exception.UnableToObtainRaceException;
import es.eina.tfg.TrainingManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.TrainingManager.model.DTO.FullcalendarEventRequest;
import org.joda.time.DateTime;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

public class PortletController extends MVCPortlet {

    private static final Gson GSON = new Gson();

    @Override
    public void doView(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {

        String today = TrainingManager.getTodayDateAsString();
        request.setAttribute(WebKeys.PARAM_TODAY, today);

        Long idUser = UserUtils.getCurrentUserId(request);
        Long idRace = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        try {
            Race race = TrainingManager.getSelectedRace(idRace, idUser);
            if (Validator.isNotNull(race)){
                request.setAttribute(WebKeys.REQUESTED_RACE, race);
            }
        } catch (UnableToObtainRaceException e) {
            _log.error("UnableToObtainRaceException while TrainingManager.getByIdRace for: " + idRace, e);
            SessionErrors.add(request, "No se ha podido obtener el evento solicitado.");
        }

        this.include(viewTemplate, request, response);
    }

    public void deleteRaceAction(ActionRequest request, ActionResponse response) {
        Long idRace = ParamUtil.getLong(request, WebKeys.PARAM_EVENT_ID);
        try {
            TrainingManager.deleteRace(idRace);
            _log.info("Successfully deleted Race for idRace: " + idRace);
            SessionMessages.add(request, WebKeys.MESSAGE_DELETE_ACTION_SUCCESS);
        } catch (UnableToDeleteRaceException e) {
            _log.error("UnableToDeleteRaceException while TrainingManager.deleteRace for: " + idRace, e);
            SessionErrors.add(request, "No se ha podido borrar el evento solicitado.");
        }
    }

    public void addSampleDataAction(ActionRequest request, ActionResponse response)
            throws SystemException, PortalException {
        User user = UserUtils.getCurrentUser(request);
        TrainingManager.addSampleData(user);
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

    private void getMonthEvents(ResourceRequest request, ResourceResponse response)
            throws IOException {
        FullcalendarEventRequest eventRequest = new FullcalendarEventRequest();
        eventRequest.setStart(getDateTimeFromParam(request, WebKeys.PARAM_START_DATE));
        eventRequest.setEnd(getDateTimeFromParam(request, WebKeys.PARAM_END_DATE));
        eventRequest.setIdUser(UserUtils.getCurrentUserId(request));
        eventRequest.setContextPath(request.getContextPath());

        try {
            List events = TrainingManager.getMonthRacesAsEvents(eventRequest);
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

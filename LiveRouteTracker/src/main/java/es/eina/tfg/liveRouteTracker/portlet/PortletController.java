package es.eina.tfg.liveRouteTracker.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.liveRouteTracker.exception.UnableToObtainEventException;
import es.eina.tfg.liveRouteTracker.model.DTO.Participant;
import es.eina.tfg.liveRouteTracker.model.EventManager;
import es.eina.tfg.liveRouteTracker.model.ParticipantManager;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

/**
 * Portlet controller class.
 * Handles all the actions called from JSP
 *
 * @author adelrioj.
 */
public class PortletController extends MVCPortlet {

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        //Params
        Long idParticipant = ParamUtil.getLong(request, WebKeys.PARAM_SHOW_PARTICIPANT_ID);
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_SELECTED_IDEVENT);

        //Show participant
        if (Validator.isNotNull(idParticipant) && Validator.isNotNull(idEvent)){
            Participant participant = ParticipantManager.getById(idEvent, idParticipant);
            _log.info("Selected participant found: " + participant);
            request.setAttribute(WebKeys.SELECTED_PARTICIPANT, participant);
        }
        //Participant list
        List<Participant> participants = ParticipantManager.getParticipants(idEvent);
        _log.info("Participant list size: " + participants.size());
        request.setAttribute(WebKeys.PARTICIPANT_LIST, participants);

        //Selected Event
        if (Validator.isNotNull(idEvent)){
            try {
                Event event = EventManager.getByIdEvent(idEvent);
                request.setAttribute(WebKeys.SELECTED_EVENT, event);
            } catch (UnableToObtainEventException e) {
                _log.error("UnableToObtainEventException while EventManager.getSelectedEvent for: " + idEvent, e);
                SessionErrors.add(request, "No se ha podido obtener el evento solicitado.");
            }
        }

        super.render(request, response);
    }

    public void addSampleDataAction(ActionRequest request, ActionResponse response){
        Long idEvent = ParamUtil.getLong(request, WebKeys.PARAM_SELECTED_IDEVENT);
        String mvcPath = ParamUtil.getString(request, "mvcPath");

        try {
            ParticipantManager.addParticipantRaceSampleData(idEvent);
        } catch (SystemException e) {
            _log.error("SystemException while addParticipantRaceSampleData for idEvent: " + idEvent, e);
        } catch (PortalException e) {
            _log.error("PortalException while addParticipantRaceSampleData for idEvent: " + idEvent, e);
        }

        response.setRenderParameter(WebKeys.PARAM_SELECTED_IDEVENT, String.valueOf(idEvent));
        if (Validator.isNotNull(mvcPath)){
            response.setRenderParameter("jspPage", mvcPath);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

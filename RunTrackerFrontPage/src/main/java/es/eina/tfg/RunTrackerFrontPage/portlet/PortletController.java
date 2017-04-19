package es.eina.tfg.RunTrackerFrontPage.portlet;

import com.google.gson.Gson;
import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RunTrackerBL.dao.*;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.UserAdditionalData;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;
import es.eina.tfg.RunTrackerBL.util.UserUtils;
import es.eina.tfg.RunTrackerFrontPage.exception.UnableToFindRaceException;
import es.eina.tfg.RunTrackerFrontPage.manager.TrainingManager;
import es.eina.tfg.RunTrackerFrontPage.manager.UserAdditionalDataManager;

import javax.portlet.*;
import java.io.IOException;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

public class PortletController extends MVCPortlet {

    private static final Gson GSON = new Gson();

    @Override
    public void doView(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        Long idUser = UserUtils.getCurrentUserId(request);

        //UserAdditionalData
        try {
            UserAdditionalData data = UserAdditionalDataManager.getByIdOrCreate(idUser);
            request.setAttribute(WebKeys.USER_ADDITIONAL_DATA, data);
        } catch (Exception e) {
            _log.error("Exception while getByIdOrCreate for idUser: " + idUser, e);
        }

        //User statistics
        long myAddedRoutes = 0;
        long myTrainings = 0;
        long myAddedEvents = 0;
        long myParticipatedEvents = 0;
        try {
            myAddedRoutes = RouteDAO.countByIdAuthor(idUser);
            myTrainings = RaceDAO.countByIdUser(idUser);
            myAddedEvents = EventDAO.countByIdAuthor(idUser);
            myParticipatedEvents = UserAndEventDAO.countParticipationByIdUser(idUser);
        } catch (SystemException e) {
            _log.error("SystemException while gathering statistics for idUser: " + idUser);
        }
        request.setAttribute(WebKeys.MY_ADDED_ROUTES, myAddedRoutes);
        request.setAttribute(WebKeys.MY_TRAININGS, myTrainings);
        request.setAttribute(WebKeys.MY_ADDED_EVENTS, myAddedEvents);
        request.setAttribute(WebKeys.MY_PARTICIPATED_EVENTS, myParticipatedEvents);

        //Last races
        try {
            List<Race> lastRaces = TrainingManager.getLastRaces(idUser);
            String lastRacesJson = GSON.toJson(lastRaces);
            _log.info("created JSON: " + lastRacesJson);
            request.setAttribute(WebKeys.LAST_RACES, lastRaces);
            request.setAttribute(WebKeys.LAST_RACES_JSON, lastRacesJson);
        } catch (UnableToFindRaceException e) {
            _log.error("UnableToFindRaceException for idUser: " + idUser, e);
            SessionErrors.add(request, "No se ha podido obtener los entrenamientos solicitados.");
        }

        this.include(viewTemplate, request, response);
    }

    public void updateUserDataAction(ActionRequest request, ActionResponse response){
        Integer height = ParamUtil.getInteger(request, WebKeys.PARAM_USER_HEIGHT);
        Integer weight = ParamUtil.getInteger(request, WebKeys.PARAM_USER_WEIGHT);
        User user = UserUtils.getCurrentUser(request);
        try {
            UserAdditionalDataManager.update(user, weight, height);
            SessionMessages.add(request, WebKeys.MESSAGE_UPDATE_USERDATA_ACTION_SUCCESS);
        } catch (Exception e) {
            _log.error("Exception while UserAdditionalDataDAO.update for user: " + user.getUserId()
                    + "height: " + height
                    + " height: " + height, e);
            SessionErrors.add(request, "No se ha podido realizar la actualizacion de datos de usuario.");
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}
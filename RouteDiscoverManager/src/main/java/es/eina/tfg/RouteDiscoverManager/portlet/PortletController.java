package es.eina.tfg.RouteDiscoverManager.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RouteDiscoverManager.exception.UnableToAddRouteToUserException;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.util.UserUtils;

import javax.portlet.*;
import java.io.IOException;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

public class PortletController extends MVCPortlet {

    private static final String MESSAGE_ROUTE_ADD_ERROR = "Ha ocurrido un error al añadir la nueva ruta";

    @Override
    public void doView(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        Long idRoute = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        Long idUser = UserUtils.getCurrentUserId(request);

        Route route = RouteManager.getRouteToRender(idRoute, idUser);
        if (isNotNull(route)){
            request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT, route);
        }

        this.include(viewTemplate, request, response);
    }

    public void addRouteAction(ActionRequest request, ActionResponse response) {
        Long idRoute = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        Long idUser = UserUtils.getCurrentUserId(request);

        try {
            RouteManager.addRouteToUserRoutes(idRoute, idUser);
            SessionMessages.add(request, WebKeys.MESSAGE_ADD_ROUTE_ACTION_SUCCESS);
        } catch (UnableToAddRouteToUserException e) {
            _log.error("UnableToAddRouteToUserException while adding route: " + idRoute + " to user: " + idUser);
            SessionErrors.add(request, MESSAGE_ROUTE_ADD_ERROR);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

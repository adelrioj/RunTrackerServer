package es.eina.tfg.RouteViewer.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RouteViewer.exception.UnableToAddException;
import es.eina.tfg.RouteViewer.exception.UnableToDeleteException;
import es.eina.tfg.RouteViewer.exception.UnableToUpdateException;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.util.UserUtils;

import javax.portlet.*;
import java.io.File;
import java.io.IOException;

import static com.liferay.portal.kernel.util.Validator.isNotNull;
import static es.eina.tfg.RouteViewer.util.FileValidator.validateFileParamNotEmpty;

/**
 * Portlet controller class.
 * Handles all the actions called from JSP
 *
 * @author adelrioj.
 */
public class PortletController extends MVCPortlet {

    private static final String MESSAGE_ROUTE_ADD_ERROR = "Ha ocurrido un error al añadir la nueva ruta";
    private static final String MESSAGE_ROUTE_DELETE_ERROR = "Ha ocurrido un error al borrar la ruta";
    private static final String MESSAGE_ROUTE_UPDATE_ERROR = "Ha ocurrido un error al actualizar la ruta con los datos proporcionados";
    private static final String MESSAGE_ROUTE_FILE_NOT_VALID = "Ha ocurrido un error al añadir la ruta con el archivo proporcionado";

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
        Route route = new Route();
        route.setAuthor(UserUtils.getCurrentUser(request));
        route.setType(ParamUtil.getString(request, WebKeys.PARAM_ROUTETYPE));
        route.setName(ParamUtil.getString(request, WebKeys.PARAM_ROUTENAME));
        route.setDescription(ParamUtil.getString(request, WebKeys.PARAM_ROUTEDESC));
        route.setPublic(ParamUtil.getString(request, WebKeys.PARAM_ISPUBLIC).equalsIgnoreCase(StringPool.TRUE));

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        try {
            validateFileParamNotEmpty(uploadPortletRequest, WebKeys.PARAM_ROUTE_IMPORT_FILE_NAME);
            File inputFile = uploadPortletRequest.getFile(WebKeys.PARAM_ROUTE_IMPORT_FILE_NAME, true);

            Route addedRoute = RouteManager.addRoute(route, inputFile);

            response.setRenderParameter(WebKeys.PARAM_ROUTEID, String.valueOf(addedRoute.getIdRoute()));
            SessionMessages.add(request, WebKeys.MESSAGE_ADD_ROUTE_ACTION_SUCCESS);
        } catch (SystemException e) {
            _log.error("SystemException while validateFileParamNotEmpty");
            SessionErrors.add(request, MESSAGE_ROUTE_FILE_NOT_VALID);
        } catch (UnableToAddException e) {
            _log.error("UnableToAddException while addRoute for: " + route);
            SessionErrors.add(request, MESSAGE_ROUTE_ADD_ERROR);
        }
    }

    public void editRouteAction(ActionRequest request, ActionResponse response) {
        Route route = new Route();
        route.setIdRoute(ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID));
        route.setAuthor(UserUtils.getCurrentUser(request));
        route.setType(ParamUtil.getString(request, WebKeys.PARAM_ROUTETYPE));
        route.setName(ParamUtil.getString(request, WebKeys.PARAM_ROUTENAME));
        route.setDescription(ParamUtil.getString(request, WebKeys.PARAM_ROUTEDESC));
        try {
            Route updatedRoute = RouteManager.updateRoute(route);
            response.setRenderParameter(WebKeys.PARAM_ROUTEID, String.valueOf(updatedRoute.getIdRoute()));
            SessionMessages.add(request, WebKeys.MESSAGE_EDIT_ROUTE_ACTION_SUCCESS);
        } catch (UnableToUpdateException e) {
            _log.error("UnableToUpdateException while updateRoute for: " + route);
            SessionErrors.add(request, MESSAGE_ROUTE_UPDATE_ERROR);
        }
    }

    public void deleteRouteAction(ActionRequest request, ActionResponse response) {
        Long idRoute = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        try {
            RouteManager.deleteRoute(idRoute);
            response.setRenderParameter(WebKeys.PARAM_ROUTEID, "0");
            SessionMessages.add(request, WebKeys.MESSAGE_DELETE_ROUTE_ACTION_SUCCESS);
        } catch (UnableToDeleteException e) {
            _log.error("UnableToDeleteException when trying to delete Route " + idRoute);
            SessionErrors.add(request, MESSAGE_ROUTE_DELETE_ERROR);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

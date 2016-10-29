package es.eina.tfg.RouteViewer.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
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
import es.eina.tfg.RouteViewer.model.compare.RouteNameComparator;
import es.eina.tfg.RouteViewer.model.parser.RouteParserFactory;
import es.eina.tfg.RouteViewer.model.parser.RouteParserHandler;
import es.eina.tfg.RouteViewer.util.UserUtils;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;

import javax.portlet.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.*;
import static es.eina.tfg.RouteViewer.util.FileValidator.validateFileParamNotEmpty;

/**
 * Portlet controller class.
 * Handles all the actions called from JSP
 *
 * @author adelrioj.
 */
public class PortletController extends MVCPortlet{

    private static final String MESSAGE_ROUTEPOSITION_DELETE_ERROR = "Ha ocurrido un error al borrar la posición de la ruta";
    private static final String MESSAGE_ROUTE_DELETE_ERROR = "Ha ocurrido un error al borrar la ruta";
    public static final String MESSAGE_ROUTE_UPDATE_ERROR = "Ha ocurrido un error al actualizar la ruta con los datos proporcionados";
    public static final String MESSAGE_ROUTE_FILE_NOT_VALID = "Ha ocurrido un error al añadir la ruta con el archivo proporcionado";

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        renderSelectedOrModifiedRoute(request);
        renderRouteLocationMarker(request);
        super.render(request, response);
    }

    public void addRouteAction(ActionRequest request, ActionResponse response) {
        String routeName = ParamUtil.getString(request, WebKeys.PARAM_ROUTENAME);
        String routeDesc = ParamUtil.getString(request, WebKeys.PARAM_ROUTEDESC);
        String routeType = ParamUtil.getString(request, WebKeys.PARAM_ROUTETYPE);
        boolean isPublic = ParamUtil.getString(request, WebKeys.PARAM_ISPUBLIC).equalsIgnoreCase(StringPool.TRUE);

        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        Route route = null;
        try {
            validateFileParamNotEmpty(uploadPortletRequest, WebKeys.PARAM_ROUTE_IMPORT_FILE_NAME);
            File inputFile = uploadPortletRequest.getFile(WebKeys.PARAM_ROUTE_IMPORT_FILE_NAME, true);
            RouteParserHandler parserHandler = RouteParserFactory.getSAXHandler(inputFile.getName());
            try {
                route = parserHandler.addRouteFromLocationListFile(inputFile, routeName, routeDesc, isPublic, routeType,
                        UserUtils.getCurrentUserId(request), null);
                _log.info("Added route with id: " + route.getRouteId());
            } catch (Exception e) {
                _log.error("Error while parsing route from file: " + inputFile.getName());
            }
        } catch (SystemException e) {
            _log.error("SystemException while validateFileParamNotEmpty for file : " + WebKeys.PARAM_ROUTE_IMPORT_FILE_NAME);
            SessionErrors.add(request, MESSAGE_ROUTE_FILE_NOT_VALID);
        }

        request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT, route);

        SessionMessages.add(request, WebKeys.MESSAGE_ADD_ROUTE_ACTION_SUCCESS);
    }

    public void editRouteAction(ActionRequest request, ActionResponse response) {
        Long routeId = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        String routeName = ParamUtil.getString(request, WebKeys.PARAM_ROUTENAME);
        String routeDesc = ParamUtil.getString(request, WebKeys.PARAM_ROUTEDESC);
        String routeType = ParamUtil.getString(request, WebKeys.PARAM_ROUTETYPE);
        boolean isPublic = ParamUtil.getString(request, WebKeys.PARAM_ISPUBLIC).equalsIgnoreCase(StringPool.TRUE);

        Route route;
        route = getCurrentRoute(routeId);
        if (isNotNull(routeName)) route.setName(routeName);
        if (isNotNull(routeDesc)) route.setDescription(routeDesc);
        if (isNotNull(routeType)) route.setType(routeType);
        if (isNotNull(isPublic)) route.setIsPublic(isPublic);
        try {
            route = RouteLocalServiceUtil.updateRoute(route);
        } catch (SystemException e) {
            _log.error("SystemException while updating route: " + route);
            SessionErrors.add(request, MESSAGE_ROUTE_UPDATE_ERROR);
        }

        request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT, route);

        SessionMessages.add(request, WebKeys.MESSAGE_EDIT_ROUTE_ACTION_SUCCESS);
    }

    public void deleteRouteAction(ActionRequest request, ActionResponse response) {
        Long routeID = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        try {
            Route deletedRoute = RouteLocalServiceUtil.deleteRoute(routeID);
            if (isNotNull(deletedRoute)){
                response.setRenderParameter(WebKeys.PARAM_ROUTEID, "0");
                _log.info("Route " + routeID + " successfully deleted");
            }
        } catch (PortalException e) {
            _log.error("PortalException when trying to delete Route " + routeID);
            SessionErrors.add(request, MESSAGE_ROUTE_DELETE_ERROR);
        } catch (SystemException e) {
            _log.error("SystemException when trying to delete Route " + routeID);
            SessionErrors.add(request, MESSAGE_ROUTE_DELETE_ERROR);
        }

        SessionMessages.add(request, WebKeys.MESSAGE_DELETE_ROUTE_ACTION_SUCCESS);
    }

    public void deleteRoutePositionAction(ActionRequest request, ActionResponse response) {
        Long routePositionId = ParamUtil.getLong(request, WebKeys.PARAM_DELETEROUTELOCATIONID);
        try {
            RouteLocation deletedLocation = RouteLocationLocalServiceUtil.deleteRouteLocation(routePositionId);
            if (isNotNull(deletedLocation)){
                _log.info("RouteLocation " + routePositionId + " successfully deleted");
            }
        } catch (PortalException e) {
            _log.error("PortalException when trying to delete RouteLocation " + routePositionId);
            SessionErrors.add(request, MESSAGE_ROUTEPOSITION_DELETE_ERROR);
        } catch (SystemException e) {
            _log.error("SystemException when trying to delete RouteLocation " + routePositionId);
            SessionErrors.add(request, MESSAGE_ROUTEPOSITION_DELETE_ERROR);
        }

        SessionMessages.add(request, WebKeys.MESSAGE_DELETE_LOCATION_ACTION_SUCCESS);
    }

    private void renderRouteLocationMarker(RenderRequest request) {
        Long selectedRouteLocationId = ParamUtil.getLong(request, WebKeys.PARAM_SELECTEDROUTELOCATIONID);
        if (isNotNull(selectedRouteLocationId)){
            RouteLocation location;
            try {
                location = RouteLocationLocalServiceUtil.getRouteLocation(selectedRouteLocationId);
                request.setAttribute(WebKeys.PARAM_SELECTED_LOCATION, location);
            } catch (PortalException e) {
                _log.error("PortalException while finding route location for id: " + selectedRouteLocationId);
            } catch (SystemException e) {
                _log.error("SystemException while finding route location for id: " + selectedRouteLocationId);
            }
        }
    }

    private void renderSelectedOrModifiedRoute(RenderRequest request) {
        Long routeId = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        Route route;
        if (isNull(routeId) || routeId == 0){
            route = getFirstRouteOnList();
        } else {
            route = getCurrentRoute(routeId);
        }
        if (isNotNull(route)){
            List<RouteLocation> locationList = getRouteLocationList(route);
            request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT, route);
            request.setAttribute(WebKeys.PARAM_ROUTE_TO_EDIT_LOCATION_LIST, locationList);

        }
    }

    private Route getFirstRouteOnList() {
        Route route = null;
        try {
            List<Route> routes = RouteLocalServiceUtil.getRoutesByName("",0, 19, new RouteNameComparator());
            if (routes!= null && routes.size() >0){
                route = routes.get(0);
            }
        } catch (SystemException e) {
            _log.error("Cannot obtain first route of the list on start.");
        }
        return route;
    }

    private Route getCurrentRoute(Long routeId) {
        Route route = null;
        try {
            route = RouteLocalServiceUtil.getRoute(routeId);
        } catch (PortalException e) {
            _log.error("PortalException while searching for route with ID: " + routeId);
        } catch (SystemException e) {
            _log.error("SystemException while searching for route with ID: " + routeId);
        }
        return route;
    }

    private List<RouteLocation> getRouteLocationList(Route route) {
        List<RouteLocation> selectedRouteLocations = null;
        try {
            selectedRouteLocations = RouteLocationLocalServiceUtil.findByRouteId(route.getRouteId());
        } catch (SystemException e) {
            _log.error("SystemException while finding route locations for route: " + route);
        }
        return selectedRouteLocations;
    }



    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

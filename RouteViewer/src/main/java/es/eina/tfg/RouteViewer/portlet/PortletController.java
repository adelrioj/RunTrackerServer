package es.eina.tfg.RouteViewer.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.RouteViewer.model.compare.RouteNameComparator;
import es.eina.tfg.RouteViewer.model.parser.GenericRouteParserHandler;
import es.eina.tfg.RouteViewer.model.parser.RouteParserFactory;
import es.eina.tfg.RouteViewer.util.UserUtils;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import org.apache.commons.io.FileUtils;

import javax.portlet.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Portlet controller class.
 * Handles all the actions called from JSP
 *
 * Created by adelrioj on 28/08/2015.
 */
public class PortletController extends MVCPortlet{

    @Override
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        //VIEW action/first route details selection
        Long selectedRouteId = ParamUtil.getLong(request, WebKeys.PARAM_SELECTEDROUTEID);
        if (Validator.isNull(selectedRouteId) || selectedRouteId == 0){
            try {
                List<Route> routes = RouteLocalServiceUtil.getRoutesByName("",0, 19, new RouteNameComparator());
                selectedRouteId = routes.get(0).getRouteId();
            } catch (SystemException e) {
                _log.error("Cannot obtain first route of the list on start.");
            }
        }
        request.setAttribute(WebKeys.PARAM_SELECTEDROUTEID, selectedRouteId);

        //Edit action mode
        Long editRouteId = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        if (Validator.isNotNull(editRouteId)){
            request.setAttribute(WebKeys.PARAM_ROUTEID, editRouteId);
        }

        //VIEW action RouteLocation marker
        Long selectedRouteLocationId = ParamUtil.getLong(request, WebKeys.PARAM_SELECTEDROUTELOCATIONID);
        if (Validator.isNotNull(selectedRouteLocationId)){
            request.setAttribute(WebKeys.PARAM_SELECTEDROUTELOCATIONID, selectedRouteLocationId);
        }

        super.render(request, response);
    }

    public void editRouteAction(ActionRequest request, ActionResponse response) {
        Long routeId = ParamUtil.getLong(request, WebKeys.PARAM_ROUTEID);
        UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
        if (Validator.isNull(routeId) || routeId == 0){
            try {
                validateFileParamNotEmpty(uploadPortletRequest, "importFile");
                File inputFile = uploadPortletRequest.getFile("importFile", true);
                GenericRouteParserHandler handler = RouteParserFactory.getSAXHandler(inputFile.getName());

                String routeName = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ROUTENAME);
                String routeDesc = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ROUTEDESC);
                String routeType = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ROUTETYPE);
                boolean isPublic = ParamUtil.getString(uploadPortletRequest, WebKeys.PARAM_ISPUBLIC).equalsIgnoreCase(StringPool.TRUE);

                if (handler != null){
                    try {
                        Route addedRoute = handler.addRouteFromLocationListFile(inputFile, routeName, routeDesc, isPublic, routeType,
                                UserUtils.getCurrentUserId(request), null);
                        _log.info("Added route with id: " + addedRoute.getRouteId());
                    } catch (Exception e) {
                        _log.error("Error while parsing route from file: " + inputFile.getName());
                    }
                }
            } catch (SystemException e) {
                //validateFileParamNotEmpty() exception
                _log.error(e.getMessage());
            }
        } else {

        }
    }

    public void deleteRouteAction(ActionRequest request, ActionResponse response) {
        Long routeID = ParamUtil.getLong(request, WebKeys.PARAM_DELETEROUTEID);
        try {
            Route deletedRoute = RouteLocalServiceUtil.deleteRoute(routeID);
            if (Validator.isNotNull(deletedRoute)){
                _log.info("Route " + routeID + " successfully deleted");
            }
        } catch (PortalException e) {
            _log.error("PortalException when trying to delete Route " + routeID);
        } catch (SystemException e) {
            _log.error("SystemException when trying to delete Route " + routeID);
        }
    }

    public void deleteRoutePositionAction(ActionRequest request, ActionResponse response){
        Long routePositionId = ParamUtil.getLong(request, WebKeys.PARAM_DELETEROUTEPOSITIONID);
        try {
            RouteLocation deletedLocation = RouteLocationLocalServiceUtil.deleteRouteLocation(routePositionId);
            if (Validator.isNotNull(deletedLocation)){
                _log.info("RouteLocation " + routePositionId + " successfully deleted");
            }
        } catch (PortalException e) {
            _log.error("PortalException when trying to delete RouteLocation " + routePositionId);
        } catch (SystemException e) {
            _log.error("SystemException when trying to delete RouteLocation " + routePositionId);
        }
    }

    /**
     * check if the file was not too big so that is was completely ignored
     *
     * @param request Portlet request
     * @param paramName name of the file to check
     * @throws IllegalArgumentException
     * @throws SystemException
     */
    public void validateFileParamNotEmpty(UploadRequest request, String paramName)
            throws IllegalArgumentException, SystemException {
        File file = request.getFile(paramName, false);
        Long fileSize = request.getSize(paramName);
        if (file == null || fileSize == null || fileSize <= 0) {
            long companyId = PortalUtil.getCompanyId(request);
            String maxUploadFileSize = FileUtils.byteCountToDisplaySize(
                    PrefsPropsUtil.getLong(companyId, PropsKeys.UPLOAD_SERVLET_REQUEST_IMPL_MAX_SIZE));
            throw new IllegalArgumentException(
                    "Please provide mandatory parameter '" + paramName +
                            "' (file). Max upload size is set to " + maxUploadFileSize + " in this Liferay instance.");
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

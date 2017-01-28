package es.eina.tfg.DeviceManager.portlet;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.util.bridges.mvc.MVCPortlet;
import es.eina.tfg.DeviceManager.exception.UnableToDeleteDeviceException;
import es.eina.tfg.RunTrackerBL.entity.Device;
import es.eina.tfg.RunTrackerBL.util.UserUtils;

import javax.portlet.*;
import java.io.IOException;

/**
 * Portlet controller class.
 * Handles all the actions called from JSP
 *
 * @author adelrioj.
 */
public class PortletController extends MVCPortlet {

    @Override
    public void doView(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        Long idDevice = ParamUtil.getLong(request, WebKeys.PARAM_ID_DEVICE);

        Device device = DeviceManager.getRouteToRender(idDevice);
        if (Validator.isNotNull(device)){
            request.setAttribute(WebKeys.PARAM_SELECTED_DEVICE, device);
        }
        this.include(viewTemplate, request, response);
    }

    public void deleteDeviceAction(ActionRequest request, ActionResponse response) {
        Long idDevice = ParamUtil.getLong(request, WebKeys.PARAM_ID_DEVICE);
        try {
            DeviceManager.delete(idDevice);
            response.setRenderParameter(WebKeys.PARAM_ID_DEVICE, "0");
            SessionMessages.add(request, WebKeys.MESSAGE_DELETE_DEVICE_ACTION_SUCCESS);
        } catch (UnableToDeleteDeviceException e) {
            _log.error("UnableToDeleteException when trying to delete Route " + idDevice);
            SessionErrors.add(request, "No se ha podido borrar el dispositivo.");
        }
    }

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);
}

package es.eina.tfg.liveRouteTracker.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

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
    public void render(RenderRequest request, RenderResponse response)
            throws PortletException, IOException {
        super.render(request, response);
    }

    public void addRouteAction(ActionRequest request, ActionResponse response) {}

    private static Log _log = LogFactoryUtil.getLog(PortletController.class);

}

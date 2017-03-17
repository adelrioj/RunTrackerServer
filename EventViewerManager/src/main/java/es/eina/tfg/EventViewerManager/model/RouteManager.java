package es.eina.tfg.EventViewerManager.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.dao.RouteDAO;
import es.eina.tfg.RunTrackerBL.entity.Route;

import java.util.Collections;
import java.util.List;

public class RouteManager {

    public static List<Route> getUserSelectedRoutes(User user) {
        List<Route> routes = Collections.emptyList();
        try {
            routes = RouteDAO.getByIdUserAndName(user.getUserId(), "", 0,
                    (int) RouteDAO.getByIdUserAndNameCount(user.getUserId(), ""));
        } catch (SystemException e) {
            _log.error("SystemException while searching for RouteDAO.getByIdUserAndName", e);
        } catch (PortalException e) {
            _log.error("PortalException while searching for RouteDAO.getByIdUserAndName", e);
        }
        return routes;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteManager.class);
}

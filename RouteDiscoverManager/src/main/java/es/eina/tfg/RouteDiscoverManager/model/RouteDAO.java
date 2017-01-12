package es.eina.tfg.RouteDiscoverManager.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.RouteDiscoverManager.util.RouteUtils;
import es.eina.tfg.service.RouteLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RouteDAO {

    public static Route getFirstRoute(final Long idUser)
            throws SystemException, PortalException {
        es.eina.tfg.RouteDiscoverManager.model.Route resultRoute = null;
        List<es.eina.tfg.model.Route> routes = RouteLocalServiceUtil.getPublicRoutesNotSelectedByUser(idUser, "", 0, 19);
        if (routes!= null && routes.size() >0){
            es.eina.tfg.model.Route firstSBRoute = routes.get(0);
            resultRoute = toLocalRoute(firstSBRoute);
        }
        return resultRoute;
    }

    public static Route getByIdRoute(final Long idRoute)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route sbRoute = RouteLocalServiceUtil.getRoute(idRoute);
        return toLocalRoute(sbRoute);
    }

    public static List<Route> getPublicRoutesNotSelectedByUser(final long idUser,
                                                               final String name,
                                                               final int start,
                                                               final int end)
            throws SystemException, PortalException {
        List<Route> foundRoutes = new ArrayList<Route>();
        List<es.eina.tfg.model.Route> sbRoutes = RouteLocalServiceUtil.getPublicRoutesNotSelectedByUser(idUser, name, start, end);
        for (es.eina.tfg.model.Route sbRoute : sbRoutes) {
            foundRoutes.add(toLocalRoute(sbRoute));
        }
        return foundRoutes;
    }

    public static long getPublicRoutesNotSelectedByUserCount(final long idUser,
                                                             final String name)
            throws SystemException {
        return RouteLocalServiceUtil.getPublicRoutesNotSelectedByUserCount(idUser, name);
    }

    private static es.eina.tfg.RouteDiscoverManager.model.Route toLocalRoute(final es.eina.tfg.model.Route toConvert)
            throws PortalException, SystemException {
        try {
            es.eina.tfg.RouteDiscoverManager.model.Route localRoute = new es.eina.tfg.RouteDiscoverManager.model.Route();
            localRoute.setIdRoute(toConvert.getIdRoute());
            localRoute.setAuthor(UserLocalServiceUtil.getUser(toConvert.getIdAuthor()));
            localRoute.setType(toConvert.getType());
            localRoute.setName(toConvert.getName());
            localRoute.setDescription(toConvert.getDescription());
            localRoute.setPublic(toConvert.getIsPublic());

            List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(localRoute.getIdRoute());
            boolean locationsIsNotEmpty = locations != null && !locations.isEmpty();
            if (locationsIsNotEmpty){
                RouteUtils.setLocationBasedPRoperties(localRoute, locations);
            }

            return localRoute;
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRoute for route: " + toConvert);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getUser for route: " + toConvert, e);
            throw e;
        }
    }

    private static Log _log = LogFactoryUtil.getLog(RouteDAO.class);
}

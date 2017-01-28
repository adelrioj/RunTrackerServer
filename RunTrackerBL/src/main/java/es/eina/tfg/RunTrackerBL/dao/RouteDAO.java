package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.RunTrackerBL.converter.RouteConverter;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RouteDAO {

    public static Route insert(final Route route)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route toInsert = createSBRouteFromLocalRoute(route);
        es.eina.tfg.model.Route inserted = RouteLocalServiceUtil.addRoute(toInsert);
        UserAndRouteLocalServiceUtil.addUserAndRoute(inserted.getIdAuthor(), inserted.getIdRoute());

        Route routeToReturn;
        try{
            List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(inserted.getIdRoute());
            User author = UserLocalServiceUtil.getUser(inserted.getIdAuthor());
            routeToReturn = RouteConverter.toLocalRoute(inserted, author, locations);
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRoute for route: " + inserted);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getUser for route: " + inserted, e);
            throw e;
        }
        return routeToReturn;
    }

    public static Route update(final Route route)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route toUpdate = RouteLocalServiceUtil.getRoute(route.getIdRoute());
        toUpdate.setName(route.getName());
        toUpdate.setDescription(route.getDescription());
        toUpdate.setType(route.getType());
        es.eina.tfg.model.Route updated = RouteLocalServiceUtil.updateRoute(toUpdate);

        Route routeToReturn;
        try{
            List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(updated.getIdRoute());
            User author = UserLocalServiceUtil.getUser(updated.getIdAuthor());
            routeToReturn = RouteConverter.toLocalRoute(updated, author, locations);
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRoute for route: " + updated);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getUser for route: " + updated, e);
            throw e;
        }
        return routeToReturn;
    }

    public static Route delete(final Long idRoute)
            throws PortalException, SystemException {
        Route toDelete = getByIdRoute(idRoute);
        deleteUserAndRouteRelation(toDelete);
        if (!toDelete.isPublic()){
            RouteLocationDAO.deleteByIdRoute(toDelete.getIdRoute());
            RouteLocalServiceUtil.deleteRoute(toDelete.getIdRoute());
        }
        return toDelete;
    }

    private static void deleteUserAndRouteRelation(Route route)
            throws SystemException, PortalException {
        UserAndRouteLocalServiceUtil.deleteUserAndRoute(route.getAuthor().getUserId(), route.getIdRoute());
    }

    public static Route getByIdRoute(final Long idRoute)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route sbRoute;
        try {
            sbRoute = RouteLocalServiceUtil.getRoute(idRoute);
        } catch (SystemException e) {
            _log.error("SystemException while RouteLocalServiceUtil.getRoute for route: " + idRoute);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while RouteLocalServiceUtil.getRoute for route: " + idRoute, e);
            throw e;
        }

        Route routeToReturn;
        try{
            List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(sbRoute.getIdRoute());
            User author = UserLocalServiceUtil.getUser(sbRoute.getIdAuthor());
            routeToReturn = RouteConverter.toLocalRoute(sbRoute, author, locations);
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRoute for route: " + sbRoute);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getUser for route: " + sbRoute, e);
            throw e;
        }
        return routeToReturn;
    }

    public static List<Route> getByIdUserAndName(final long idUser,
                                                 final String name,
                                                 final int start,
                                                 final int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Route> sbRoutes = RouteLocalServiceUtil.getByIdUserAndName(idUser, name, start, end);

        List<Route> foundRoutes = new ArrayList<Route>();
        try {
            User author = UserLocalServiceUtil.getUser(idUser);
            for (es.eina.tfg.model.Route sbRoute : sbRoutes) {
                try {
                    List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(sbRoute.getIdRoute());
                    foundRoutes.add(RouteConverter.toLocalRoute(sbRoute, author, locations));
                } catch (SystemException e) {
                    _log.error("SystemException while getByIdRoute for route: " + sbRoute);
                    throw e;
                }
            }
        } catch (PortalException e) {
            _log.error("PortalException while getUser for idUser: " + idUser, e);
            throw e;
        }
        return foundRoutes;
    }

    public static long getByIdUserAndNameCount(final long idUser,
                                               final String name)
            throws SystemException {
        return RouteLocalServiceUtil.getByIdUserAndNameCount(idUser, name);
    }

    public static List<Route> getPublicRoutesNotSelectedByUser(final long idUser,
                                                               final String name,
                                                               final int start,
                                                               final int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Route> sbRoutes = RouteLocalServiceUtil.getPublicRoutesNotSelectedByUser(idUser, name, start, end);

        List<Route> foundRoutes = new ArrayList<Route>();
        try {
            User author = UserLocalServiceUtil.getUser(idUser);
            for (es.eina.tfg.model.Route sbRoute : sbRoutes) {
                try {
                    List<RouteLocation> locations = RouteLocationDAO.getByIdRoute(sbRoute.getIdRoute());
                    foundRoutes.add(RouteConverter.toLocalRoute(sbRoute, author, locations));
                } catch (SystemException e) {
                    _log.error("SystemException while getByIdRoute for route: " + sbRoute);
                    throw e;
                }
            }
        } catch (PortalException e) {
            _log.error("PortalException while getUser for idUser: " + idUser, e);
            throw e;
        }
        return foundRoutes;
    }

    public static long getPublicRoutesNotSelectedByUserCount(final long idUser,
                                                             final String name)
            throws SystemException {
        return RouteLocalServiceUtil.getPublicRoutesNotSelectedByUserCount(idUser, name);
    }

    private static es.eina.tfg.model.Route createSBRouteFromLocalRoute(
            final es.eina.tfg.RunTrackerBL.entity.Route localRoute)
            throws SystemException {
        Long idRoute = RouteLocalServiceUtil.generateNewIdRoute();
        es.eina.tfg.model.Route SBRoute = RouteLocalServiceUtil.createRoute(idRoute);
        SBRoute.setIdAuthor(localRoute.getAuthor().getUserId());
        SBRoute.setType(localRoute.getType());
        SBRoute.setName(localRoute.getName());
        SBRoute.setDescription(localRoute.getDescription());
        SBRoute.setIsPublic(localRoute.isPublic());
        return SBRoute;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteDAO.class);
}

package es.eina.tfg.RouteViewer.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;
import es.eina.tfg.service.persistence.UserAndRoutePK;

import java.util.ArrayList;
import java.util.List;

public class RouteDAO {

    public static Route insert(final Route route)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route toInsert = createSBRouteFromLocalRoute(route);
        es.eina.tfg.model.Route inserted = RouteLocalServiceUtil.addRoute(toInsert);
        addUserAndRouteRelation(inserted);
        return toLocalRoute(inserted);
    }

    private static void addUserAndRouteRelation(es.eina.tfg.model.Route inserted) throws SystemException {
        UserAndRoutePK userAndRoutePK = new UserAndRoutePK(inserted.getIdAuthor(), inserted.getIdRoute());
        UserAndRoute userAndRoute = UserAndRouteLocalServiceUtil.createUserAndRoute(userAndRoutePK);
        UserAndRouteLocalServiceUtil.addUserAndRoute(userAndRoute);
    }

    public static Route update(final Route route)
            throws SystemException, PortalException {
        es.eina.tfg.model.Route storedRoute = RouteLocalServiceUtil.getRoute(route.getIdRoute());

        storedRoute.setName(route.getName());
        storedRoute.setDescription(route.getDescription());
        storedRoute.setType(route.getType());

        return toLocalRoute(RouteLocalServiceUtil.updateRoute(storedRoute));
    }

    public static void delete(final Long idRoute)
            throws PortalException, SystemException {
        Route route = getByIdRoute(idRoute);
        deleteUserAndRouteRelation(route);

        if (!route.isPublic()){
            RouteLocalServiceUtil.deleteRoute(route.getIdRoute());
        }
    }

    private static void deleteUserAndRouteRelation(Route route)
            throws SystemException, PortalException {
        UserAndRoutePK userAndRoutePK = new UserAndRoutePK(route.getAuthor().getUserId(), route.getIdRoute());
        UserAndRouteLocalServiceUtil.deleteUserAndRoute(userAndRoutePK);
    }

    public static Route getFirstRoute(final Long idUser){
        es.eina.tfg.RouteViewer.model.Route resultRoute = null;
        es.eina.tfg.model.Route firstSBRoute = null;
        try {
            List<es.eina.tfg.model.Route> routes = RouteLocalServiceUtil.getByIdUserAndName(idUser, "", 0, 19);
            if (routes!= null && routes.size() >0){
                firstSBRoute = routes.get(0);
                resultRoute = toLocalRoute(firstSBRoute);
            }
        } catch (SystemException e) {
            _log.error("Cannot obtain first route of the list on start.");
        } catch (PortalException e) {
            _log.error("PortalException while toLocalRoute for: " + firstSBRoute);
        }
        return resultRoute;
    }

    public static Route getByIdRoute(final Long idRoute) {
        Route route = null;
        try {
            es.eina.tfg.model.Route sbRoute = RouteLocalServiceUtil.getRoute(idRoute);
            route = toLocalRoute(sbRoute);
        } catch (PortalException e) {
            _log.error("PortalException while searching for route with ID: " + idRoute);
        } catch (SystemException e) {
            _log.error("SystemException while searching for route with ID: " + idRoute);
        }
        return route;
    }

    public static List<Route> getByIdUserAndName(final long idUser,
                                                 final String name,
                                                 final int start,
                                                 final int end)
            throws SystemException, PortalException {
        List<Route> foundRoutes = new ArrayList<Route>();
        List<es.eina.tfg.model.Route> sbRoutes = RouteLocalServiceUtil.getByIdUserAndName(idUser, name, start, end);
        for (es.eina.tfg.model.Route sbRoute : sbRoutes) {
            foundRoutes.add(toLocalRoute(sbRoute));
        }
        return foundRoutes;
    }

    public static long getByIdUserAndNameCount(final long idUser,
                                               final String name)
            throws SystemException {
        return RouteLocalServiceUtil.getByIdUserAndNameCount(idUser, name);
    }

    private static es.eina.tfg.model.Route createSBRouteFromLocalRoute(final es.eina.tfg.RouteViewer.model.Route localRoute)
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

    private static es.eina.tfg.RouteViewer.model.Route toLocalRoute(final es.eina.tfg.model.Route toConvert)
            throws PortalException, SystemException {
        try {
            es.eina.tfg.RouteViewer.model.Route localRoute = new es.eina.tfg.RouteViewer.model.Route();
            localRoute.setIdRoute(toConvert.getIdRoute());
            localRoute.setAuthor(UserLocalServiceUtil.getUser(toConvert.getIdAuthor()));
            localRoute.setType(toConvert.getType());
            localRoute.setName(toConvert.getName());
            localRoute.setDescription(toConvert.getDescription());
            localRoute.setPublic(toConvert.getIsPublic());
            localRoute.setLocations(RouteLocationDAO.getByIdRoute(localRoute.getIdRoute()));
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

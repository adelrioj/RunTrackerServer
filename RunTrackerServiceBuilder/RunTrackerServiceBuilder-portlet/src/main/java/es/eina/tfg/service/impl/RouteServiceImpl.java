package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Route;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.base.RouteServiceBaseImpl;
import org.joda.time.DateTime;

import java.util.List;

/**
 * The implementation of the route remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RouteService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see RouteServiceBaseImpl
 * @see es.eina.tfg.service.RouteServiceUtil
 */
public class RouteServiceImpl extends RouteServiceBaseImpl {

    public Route add(String type, String name, String description, Long authorId, boolean isPublic)
            throws SystemException {
        Route route = RouteLocalServiceUtil.createRoute(RouteLocalServiceUtil.generateNewIdRoute());
        route.setType(type);
        route.setName(name);
        route.setDescription(description);
        route.setIdAuthor(authorId);
        route.setIsPublic(isPublic);
        route.setCreationTime(DateTime.now().toDate());

        return RouteLocalServiceUtil.addRoute(route);
    }

    public Route update( Long routeId, String type, String name, String description, boolean isPublic)
            throws SystemException, PortalException {
        Route route = RouteLocalServiceUtil.getRoute(routeId);
        route.setType(type);
        route.setName(name);
        route.setDescription(description);
        route.setIsPublic(isPublic);

        return RouteLocalServiceUtil.updateRoute(route);
    }

    public Route delete(Long routeId) throws SystemException, PortalException {
        return RouteLocalServiceUtil.deleteRoute(routeId);
    }

    public Route getRoute(Long routeId) throws SystemException, PortalException {
        return RouteLocalServiceUtil.getRoute(routeId);
    }

    public List<Route> getByAuthor(Long userId) throws SystemException {
        return RouteLocalServiceUtil.getByAuthor(userId);
    }

    public List<Route> getByisPublic(boolean isPublic) throws SystemException {
        return RouteLocalServiceUtil.getByisPublic(isPublic);
    }

    public List<Route> getPublicRoutes(boolean isPublic, int start, int end) throws SystemException {
        return RouteLocalServiceUtil.getByisPublic(isPublic, start, end);
    }
}

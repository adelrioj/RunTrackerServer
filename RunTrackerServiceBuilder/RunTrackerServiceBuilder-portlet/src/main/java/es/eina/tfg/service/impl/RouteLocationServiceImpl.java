package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingRouteException;
import es.eina.tfg.NonExistingRouteLocationException;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import es.eina.tfg.service.base.RouteLocationServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the route location remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RouteLocationService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocationServiceBaseImpl
 * @see es.eina.tfg.service.RouteLocationServiceUtil
 */
public class RouteLocationServiceImpl extends RouteLocationServiceBaseImpl {
    public RouteLocation add(Long routeId, Double latitude, Double longitude)
            throws SystemException, NonExistingRouteException {
        return RouteLocationLocalServiceUtil.add(routeId, latitude, longitude);
    }

    public RouteLocation update(Long routeLocationId, Long routeId, Double latitude, Double longitude)
            throws NonExistingRouteException, SystemException, NonExistingRouteLocationException {
        return RouteLocationLocalServiceUtil.update(routeLocationId, routeId, latitude, longitude);
    }

    public RouteLocation delete(Long routeLocationId) throws SystemException, PortalException {
        return RouteLocationLocalServiceUtil.deleteRouteLocation(routeLocationId);
    }

    public RouteLocation getRouteLocation(Long routeLocationId) throws SystemException, PortalException {
        return RouteLocationLocalServiceUtil.getRouteLocation(routeLocationId);
    }

    public List<RouteLocation> findByRouteId (Long routeId) throws SystemException {
        return RouteLocationLocalServiceUtil.findByRouteId(routeId);
    }
}
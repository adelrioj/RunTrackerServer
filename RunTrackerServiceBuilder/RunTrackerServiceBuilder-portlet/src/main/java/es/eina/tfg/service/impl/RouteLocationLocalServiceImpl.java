package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingRouteException;
import es.eina.tfg.NonExistingRouteLocationException;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.base.RouteLocationLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.RouteLocationUtil;

import java.util.List;

/**
 * The implementation of the route location local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RouteLocationLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocationLocalServiceBaseImpl
 * @see es.eina.tfg.service.RouteLocationLocalServiceUtil
 */
public class RouteLocationLocalServiceImpl extends RouteLocationLocalServiceBaseImpl {
    public RouteLocation add(Long routeId, Double latitude, Double longitude)
            throws SystemException, NonExistingRouteException {
        Long routePositionId = counterLocalService.increment();

        Route route = RouteLocalServiceUtil.fetchRoute(routeId);
        if (route == null){
            throw new NonExistingRouteException("Route: " + routeId + " does not exists on the database.");
        }

        RouteLocation routeLocation = createRouteLocation(routePositionId);
        routeLocation.setRouteId(routeId);
        routeLocation.setLatitude(latitude);
        routeLocation.setLongitude(longitude);

        return updateRouteLocation(routeLocation);
    }

    public RouteLocation update(Long routeLocationId, Long routeId, Double latitude, Double longitude)
            throws NonExistingRouteException, SystemException, NonExistingRouteLocationException {
        Route route = RouteLocalServiceUtil.fetchRoute(routeId);
        if (route == null){
            throw new NonExistingRouteException("Route: " + routeId + " does not exists on the database.");
        }
        RouteLocation routeLocation = fetchRouteLocation(routeLocationId);
        if (routeLocation == null){
            throw new NonExistingRouteLocationException(
                    "Route location: " + routeLocationId + " on route: " + routeId + " does not exists on the database.");
        }
        routeLocation.setRouteId(routeId);
        routeLocation.setLatitude(latitude);
        routeLocation.setLongitude(longitude);

        return updateRouteLocation(routeLocation);
    }

    public List<RouteLocation> findByRouteId (Long routeId) throws SystemException {
        return RouteLocationUtil.findByrouteId(routeId);
    }

    public List<RouteLocation> findByRouteId (long routeId, int start, int end) throws SystemException {
        return RouteLocationUtil.findByrouteId(routeId, start, end);
    }

    public int findByRouteIdCount (Long routeId) throws SystemException {
        return RouteLocationUtil.findByrouteId(routeId).size();
    }
}
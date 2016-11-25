package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import es.eina.tfg.service.base.RouteLocationServiceBaseImpl;
import es.eina.tfg.service.persistence.RouteLocationPK;

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

    public RouteLocation add(long routeId, Double latitude, Double longitude)
            throws SystemException {
        RouteLocation routeLocation = RouteLocationLocalServiceUtil.createRouteLocation(
                RouteLocationLocalServiceUtil.generateNewIdRouteLocation(routeId));
        routeLocation.setIdRoute(routeId);
        routeLocation.setLatitude(latitude);
        routeLocation.setLongitude(longitude);

        return RouteLocationLocalServiceUtil.addRouteLocation(routeLocation);
    }

    public RouteLocation update(long routeLocationId, long routeId, Double latitude, Double longitude)
            throws SystemException, PortalException {
        RouteLocationPK routeLocationPK = new RouteLocationPK(routeLocationId, routeId);
        RouteLocation routeLocation = RouteLocationLocalServiceUtil.getRouteLocation(routeLocationPK);
        routeLocation.setLatitude(latitude);
        routeLocation.setLongitude(longitude);

        return RouteLocationLocalServiceUtil.updateRouteLocation(routeLocation);
    }

    public RouteLocation delete(long idRouteLocation, long idRoute)
            throws SystemException, PortalException {
        RouteLocationPK routeLocationPK = new RouteLocationPK(idRouteLocation, idRoute);
        return RouteLocationLocalServiceUtil.deleteRouteLocation(routeLocationPK);
    }

    public List<RouteLocation> getByRouteId (long routeId)
            throws SystemException {
        return RouteLocationLocalServiceUtil.getByidRoute(routeId);
    }
}

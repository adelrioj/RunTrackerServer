package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.base.RouteLocationLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.RouteLocationPK;
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
public class RouteLocationLocalServiceImpl
    extends RouteLocationLocalServiceBaseImpl {

    public RouteLocationPK generateNewIdRouteLocation(long idRoute)
            throws SystemException {
        try {
            long idRouteLocation = counterLocalService.increment(RouteLocation.class.getName());
            return new RouteLocationPK(idRouteLocation, idRoute);
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + RouteLocation.class.getName());
            throw e;
        }
    }

    @Override
    public RouteLocation addRouteLocation(RouteLocation routeLocation)
            throws SystemException {
        checkMadatoryAttributes(routeLocation);
        return super.addRouteLocation(routeLocation);
    }

    @Override
    public RouteLocation updateRouteLocation(RouteLocation routeLocation)
            throws SystemException {
        checkMadatoryAttributes(routeLocation);
        return super.updateRouteLocation(routeLocation);
    }

    private void checkMadatoryAttributes(RouteLocation routeLocation)
            throws SystemException {
        Route route = RouteLocalServiceUtil.fetchRoute(routeLocation.getIdRoute());
        if (route == null){
            throw new SystemException("Route: "
                    + routeLocation.getIdRoute() + " does not exists on the database.");
        }
    }

    public List<RouteLocation> getByidRoute (Long idRoute)
            throws SystemException {
        return RouteLocationUtil.findByrouteId(idRoute);
    }

    public List<RouteLocation> getByidRoute(long idRoute, int start, int end)
            throws SystemException {
        return RouteLocationUtil.findByrouteId(idRoute, start, end);
    }

    public int getByidRouteCount (Long idRoute)
            throws SystemException {
        return RouteLocationUtil.findByrouteId(idRoute).size();
    }

    private static Log _log = LogFactoryUtil.getLog(RouteLocationLocalServiceImpl.class);
}

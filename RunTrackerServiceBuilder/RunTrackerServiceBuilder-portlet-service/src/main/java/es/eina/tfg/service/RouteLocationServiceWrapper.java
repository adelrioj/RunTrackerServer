package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RouteLocationService}.
 *
 * @author adelrioj
 * @see RouteLocationService
 * @generated
 */
public class RouteLocationServiceWrapper implements RouteLocationService,
    ServiceWrapper<RouteLocationService> {
    private RouteLocationService _routeLocationService;

    public RouteLocationServiceWrapper(
        RouteLocationService routeLocationService) {
        _routeLocationService = routeLocationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _routeLocationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _routeLocationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _routeLocationService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.RouteLocation add(long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationService.add(routeId, latitude, longitude);
    }

    @Override
    public es.eina.tfg.model.RouteLocation update(long routeLocationId,
        long routeId, java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationService.update(routeLocationId, routeId, latitude,
            longitude);
    }

    @Override
    public es.eina.tfg.model.RouteLocation delete(long idRouteLocation,
        long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationService.delete(idRouteLocation, idRoute);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> getByRouteId(
        long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationService.getByRouteId(routeId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RouteLocationService getWrappedRouteLocationService() {
        return _routeLocationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRouteLocationService(
        RouteLocationService routeLocationService) {
        _routeLocationService = routeLocationService;
    }

    @Override
    public RouteLocationService getWrappedService() {
        return _routeLocationService;
    }

    @Override
    public void setWrappedService(RouteLocationService routeLocationService) {
        _routeLocationService = routeLocationService;
    }
}

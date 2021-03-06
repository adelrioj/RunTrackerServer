package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RouteLocationLocalService}.
 *
 * @author adelrioj
 * @see RouteLocationLocalService
 * @generated
 */
public class RouteLocationLocalServiceWrapper
    implements RouteLocationLocalService,
        ServiceWrapper<RouteLocationLocalService> {
    private RouteLocationLocalService _routeLocationLocalService;

    public RouteLocationLocalServiceWrapper(
        RouteLocationLocalService routeLocationLocalService) {
        _routeLocationLocalService = routeLocationLocalService;
    }

    /**
    * Adds the route location to the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.RouteLocation addRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.addRouteLocation(routeLocation);
    }

    /**
    * Creates a new route location with the primary key. Does not add the route location to the database.
    *
    * @param routeLocationPK the primary key for the new route location
    * @return the new route location
    */
    @Override
    public es.eina.tfg.model.RouteLocation createRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK) {
        return _routeLocationLocalService.createRouteLocation(routeLocationPK);
    }

    /**
    * Deletes the route location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location that was removed
    * @throws PortalException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.RouteLocation deleteRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.deleteRouteLocation(routeLocationPK);
    }

    /**
    * Deletes the route location from the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.RouteLocation deleteRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.deleteRouteLocation(routeLocation);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _routeLocationLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.RouteLocation fetchRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.fetchRouteLocation(routeLocationPK);
    }

    /**
    * Returns the route location with the primary key.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location
    * @throws PortalException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.RouteLocation getRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getRouteLocation(routeLocationPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the route locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @return the range of route locations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> getRouteLocations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getRouteLocations(start, end);
    }

    /**
    * Returns the number of route locations.
    *
    * @return the number of route locations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRouteLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getRouteLocationsCount();
    }

    /**
    * Updates the route location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.RouteLocation updateRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.updateRouteLocation(routeLocation);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _routeLocationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _routeLocationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _routeLocationLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.service.persistence.RouteLocationPK generateNewIdRouteLocation(
        long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.generateNewIdRouteLocation(idRoute);
    }

    @Override
    public es.eina.tfg.model.RouteLocation createRouteLocation(long idRoute,
        long idRouteLocation) {
        return _routeLocationLocalService.createRouteLocation(idRoute,
            idRouteLocation);
    }

    @Override
    public void deleteByIdRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        _routeLocationLocalService.deleteByIdRoute(idRoute);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> getByidRoute(
        java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getByidRoute(idRoute);
    }

    @Override
    public java.util.List<es.eina.tfg.model.RouteLocation> getByidRoute(
        long idRoute, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getByidRoute(idRoute, start, end);
    }

    @Override
    public int getByidRouteCount(java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocationLocalService.getByidRouteCount(idRoute);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RouteLocationLocalService getWrappedRouteLocationLocalService() {
        return _routeLocationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRouteLocationLocalService(
        RouteLocationLocalService routeLocationLocalService) {
        _routeLocationLocalService = routeLocationLocalService;
    }

    @Override
    public RouteLocationLocalService getWrappedService() {
        return _routeLocationLocalService;
    }

    @Override
    public void setWrappedService(
        RouteLocationLocalService routeLocationLocalService) {
        _routeLocationLocalService = routeLocationLocalService;
    }
}

package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RouteLocalService}.
 *
 * @author adelrioj
 * @see RouteLocalService
 * @generated
 */
public class RouteLocalServiceWrapper implements RouteLocalService,
    ServiceWrapper<RouteLocalService> {
    private RouteLocalService _routeLocalService;

    public RouteLocalServiceWrapper(RouteLocalService routeLocalService) {
        _routeLocalService = routeLocalService;
    }

    /**
    * Adds the route to the database. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Route addRoute(es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.addRoute(route);
    }

    /**
    * Creates a new route with the primary key. Does not add the route to the database.
    *
    * @param idRoute the primary key for the new route
    * @return the new route
    */
    @Override
    public es.eina.tfg.model.Route createRoute(long idRoute) {
        return _routeLocalService.createRoute(idRoute);
    }

    /**
    * Deletes the route with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idRoute the primary key of the route
    * @return the route that was removed
    * @throws PortalException if a route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Route deleteRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.deleteRoute(idRoute);
    }

    /**
    * Deletes the route from the database. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Route deleteRoute(es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.deleteRoute(route);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _routeLocalService.dynamicQuery();
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
        return _routeLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _routeLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _routeLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _routeLocalService.dynamicQueryCount(dynamicQuery);
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
        return _routeLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.eina.tfg.model.Route fetchRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.fetchRoute(idRoute);
    }

    /**
    * Returns the route with the primary key.
    *
    * @param idRoute the primary key of the route
    * @return the route
    * @throws PortalException if a route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Route getRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getRoute(idRoute);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the routes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of routes
    * @param end the upper bound of the range of routes (not inclusive)
    * @return the range of routes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.Route> getRoutes(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getRoutes(start, end);
    }

    /**
    * Returns the number of routes.
    *
    * @return the number of routes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRoutesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getRoutesCount();
    }

    /**
    * Updates the route in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Route updateRoute(es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.updateRoute(route);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _routeLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _routeLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _routeLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.Long generateNewIdRoute()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.generateNewIdRoute();
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getByAuthor(
        java.lang.Long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByAuthor(idAuthor);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getByisPublic(
        boolean isPublic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByisPublic(isPublic);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getByisPublic(
        boolean isPublic, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByisPublic(isPublic, start, end);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByName(name, start, end, orderByComparator);
    }

    @Override
    public int getByNameCount(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByNameCount(name);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getByIdUserAndName(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByIdUserAndName(idUser, name, start, end);
    }

    @Override
    public long getByIdUserAndNameCount(long idUser, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getByIdUserAndNameCount(idUser, name);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Route> getPublicRoutesNotSelectedByUser(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getPublicRoutesNotSelectedByUser(idUser,
            name, start, end);
    }

    @Override
    public long getPublicRoutesNotSelectedByUserCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _routeLocalService.getPublicRoutesNotSelectedByUserCount(idUser,
            name);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RouteLocalService getWrappedRouteLocalService() {
        return _routeLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRouteLocalService(RouteLocalService routeLocalService) {
        _routeLocalService = routeLocalService;
    }

    @Override
    public RouteLocalService getWrappedService() {
        return _routeLocalService;
    }

    @Override
    public void setWrappedService(RouteLocalService routeLocalService) {
        _routeLocalService = routeLocalService;
    }
}

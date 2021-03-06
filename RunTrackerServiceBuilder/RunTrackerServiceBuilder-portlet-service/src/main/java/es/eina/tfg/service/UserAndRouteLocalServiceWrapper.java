package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserAndRouteLocalService}.
 *
 * @author adelrioj
 * @see UserAndRouteLocalService
 * @generated
 */
public class UserAndRouteLocalServiceWrapper implements UserAndRouteLocalService,
    ServiceWrapper<UserAndRouteLocalService> {
    private UserAndRouteLocalService _userAndRouteLocalService;

    public UserAndRouteLocalServiceWrapper(
        UserAndRouteLocalService userAndRouteLocalService) {
        _userAndRouteLocalService = userAndRouteLocalService;
    }

    /**
    * Adds the user and route to the database. Also notifies the appropriate model listeners.
    *
    * @param userAndRoute the user and route
    * @return the user and route that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndRoute addUserAndRoute(
        es.eina.tfg.model.UserAndRoute userAndRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.addUserAndRoute(userAndRoute);
    }

    /**
    * Creates a new user and route with the primary key. Does not add the user and route to the database.
    *
    * @param userAndRoutePK the primary key for the new user and route
    * @return the new user and route
    */
    @Override
    public es.eina.tfg.model.UserAndRoute createUserAndRoute(
        es.eina.tfg.service.persistence.UserAndRoutePK userAndRoutePK) {
        return _userAndRouteLocalService.createUserAndRoute(userAndRoutePK);
    }

    /**
    * Deletes the user and route with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route that was removed
    * @throws PortalException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndRoute deleteUserAndRoute(
        es.eina.tfg.service.persistence.UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.deleteUserAndRoute(userAndRoutePK);
    }

    /**
    * Deletes the user and route from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndRoute the user and route
    * @return the user and route that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndRoute deleteUserAndRoute(
        es.eina.tfg.model.UserAndRoute userAndRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.deleteUserAndRoute(userAndRoute);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _userAndRouteLocalService.dynamicQuery();
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
        return _userAndRouteLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userAndRouteLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userAndRouteLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _userAndRouteLocalService.dynamicQueryCount(dynamicQuery);
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
        return _userAndRouteLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.UserAndRoute fetchUserAndRoute(
        es.eina.tfg.service.persistence.UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.fetchUserAndRoute(userAndRoutePK);
    }

    /**
    * Returns the user and route with the primary key.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route
    * @throws PortalException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndRoute getUserAndRoute(
        es.eina.tfg.service.persistence.UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.getUserAndRoute(userAndRoutePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the user and routes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user and routes
    * @param end the upper bound of the range of user and routes (not inclusive)
    * @return the range of user and routes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.UserAndRoute> getUserAndRoutes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.getUserAndRoutes(start, end);
    }

    /**
    * Returns the number of user and routes.
    *
    * @return the number of user and routes
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUserAndRoutesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.getUserAndRoutesCount();
    }

    /**
    * Updates the user and route in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userAndRoute the user and route
    * @return the user and route that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndRoute updateUserAndRoute(
        es.eina.tfg.model.UserAndRoute userAndRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.updateUserAndRoute(userAndRoute);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userAndRouteLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userAndRouteLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userAndRouteLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.UserAndRoute addUserAndRoute(
        java.lang.Long idUser, java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.addUserAndRoute(idUser, idRoute);
    }

    @Override
    public es.eina.tfg.model.UserAndRoute deleteUserAndRoute(
        java.lang.Long idUser, java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.deleteUserAndRoute(idUser, idRoute);
    }

    @Override
    public java.util.List<es.eina.tfg.model.UserAndRoute> getByidUser(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndRouteLocalService.getByidUser(userId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserAndRouteLocalService getWrappedUserAndRouteLocalService() {
        return _userAndRouteLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserAndRouteLocalService(
        UserAndRouteLocalService userAndRouteLocalService) {
        _userAndRouteLocalService = userAndRouteLocalService;
    }

    @Override
    public UserAndRouteLocalService getWrappedService() {
        return _userAndRouteLocalService;
    }

    @Override
    public void setWrappedService(
        UserAndRouteLocalService userAndRouteLocalService) {
        _userAndRouteLocalService = userAndRouteLocalService;
    }
}

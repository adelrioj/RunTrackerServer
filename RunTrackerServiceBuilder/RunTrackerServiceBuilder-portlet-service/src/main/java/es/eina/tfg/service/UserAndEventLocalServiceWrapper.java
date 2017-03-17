package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserAndEventLocalService}.
 *
 * @author adelrioj
 * @see UserAndEventLocalService
 * @generated
 */
public class UserAndEventLocalServiceWrapper implements UserAndEventLocalService,
    ServiceWrapper<UserAndEventLocalService> {
    private UserAndEventLocalService _userAndEventLocalService;

    public UserAndEventLocalServiceWrapper(
        UserAndEventLocalService userAndEventLocalService) {
        _userAndEventLocalService = userAndEventLocalService;
    }

    /**
    * Adds the user and event to the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndEvent addUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.addUserAndEvent(userAndEvent);
    }

    /**
    * Creates a new user and event with the primary key. Does not add the user and event to the database.
    *
    * @param userAndEventPK the primary key for the new user and event
    * @return the new user and event
    */
    @Override
    public es.eina.tfg.model.UserAndEvent createUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK) {
        return _userAndEventLocalService.createUserAndEvent(userAndEventPK);
    }

    /**
    * Deletes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event that was removed
    * @throws PortalException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndEvent deleteUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.deleteUserAndEvent(userAndEventPK);
    }

    /**
    * Deletes the user and event from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndEvent deleteUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.deleteUserAndEvent(userAndEvent);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _userAndEventLocalService.dynamicQuery();
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
        return _userAndEventLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userAndEventLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _userAndEventLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _userAndEventLocalService.dynamicQueryCount(dynamicQuery);
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
        return _userAndEventLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.UserAndEvent fetchUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.fetchUserAndEvent(userAndEventPK);
    }

    /**
    * Returns the user and event with the primary key.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event
    * @throws PortalException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndEvent getUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getUserAndEvent(userAndEventPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the user and events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @return the range of user and events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.UserAndEvent> getUserAndEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getUserAndEvents(start, end);
    }

    /**
    * Returns the number of user and events.
    *
    * @return the number of user and events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUserAndEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getUserAndEventsCount();
    }

    /**
    * Updates the user and event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAndEvent updateUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.updateUserAndEvent(userAndEvent);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userAndEventLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userAndEventLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userAndEventLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.UserAndEvent addUserAndEvent(long idUser,
        long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.addUserAndEvent(idUser, idEvent);
    }

    @Override
    public es.eina.tfg.model.UserAndEvent deleteUserAndEvent(long idEvent,
        long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.deleteUserAndEvent(idEvent, idUser);
    }

    @Override
    public java.util.List<es.eina.tfg.model.UserAndEvent> getByidUser(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getByidUser(userId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.UserAndEvent> getByidEvent(
        long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getByidEvent(idEvent);
    }

    @Override
    public java.util.List<es.eina.tfg.model.UserAndEvent> getByRace(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAndEventLocalService.getByRace(idRace);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserAndEventLocalService getWrappedUserAndEventLocalService() {
        return _userAndEventLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserAndEventLocalService(
        UserAndEventLocalService userAndEventLocalService) {
        _userAndEventLocalService = userAndEventLocalService;
    }

    @Override
    public UserAndEventLocalService getWrappedService() {
        return _userAndEventLocalService;
    }

    @Override
    public void setWrappedService(
        UserAndEventLocalService userAndEventLocalService) {
        _userAndEventLocalService = userAndEventLocalService;
    }
}

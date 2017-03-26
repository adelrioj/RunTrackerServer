package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EventLocalService}.
 *
 * @author adelrioj
 * @see EventLocalService
 * @generated
 */
public class EventLocalServiceWrapper implements EventLocalService,
    ServiceWrapper<EventLocalService> {
    private EventLocalService _eventLocalService;

    public EventLocalServiceWrapper(EventLocalService eventLocalService) {
        _eventLocalService = eventLocalService;
    }

    /**
    * Adds the event to the database. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Event addEvent(es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.addEvent(event);
    }

    /**
    * Creates a new event with the primary key. Does not add the event to the database.
    *
    * @param idEvent the primary key for the new event
    * @return the new event
    */
    @Override
    public es.eina.tfg.model.Event createEvent(long idEvent) {
        return _eventLocalService.createEvent(idEvent);
    }

    /**
    * Deletes the event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idEvent the primary key of the event
    * @return the event that was removed
    * @throws PortalException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Event deleteEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.deleteEvent(idEvent);
    }

    /**
    * Deletes the event from the database. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Event deleteEvent(es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.deleteEvent(event);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _eventLocalService.dynamicQuery();
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
        return _eventLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _eventLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _eventLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _eventLocalService.dynamicQueryCount(dynamicQuery);
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
        return _eventLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.eina.tfg.model.Event fetchEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.fetchEvent(idEvent);
    }

    /**
    * Returns the event with the primary key.
    *
    * @param idEvent the primary key of the event
    * @return the event
    * @throws PortalException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Event getEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getEvent(idEvent);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @return the range of events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.Event> getEvents(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getEvents(start, end);
    }

    /**
    * Returns the number of events.
    *
    * @return the number of events
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getEventsCount();
    }

    /**
    * Updates the event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Event updateEvent(es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.updateEvent(event);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _eventLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _eventLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _eventLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.Long generateNewIdEvent()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.generateNewIdEvent();
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getByidAuthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getByidAuthor(idAuthor);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getByidRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getByidRoute(idRoute);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getByPlannedStartTime(
        java.util.Date plannedStartTime, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator comparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getByPlannedStartTime(plannedStartTime,
            start, end, comparator);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getByIdUserAndTimeRange(idUser,
            startPlannedStartingTime, endPlannedStartingTime, start, end);
    }

    @Override
    public es.eina.tfg.model.Event getLastEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getLastEvent(idUser);
    }

    @Override
    public es.eina.tfg.model.Event getLastUnselectedEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getLastUnselectedEvent(idUser);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getUnselectedEventsByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getUnselectedEventsByIdUserAndTimeRange(idUser,
            startPlannedStartingTime, endPlannedStartingTime, start, end);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Event> getLiveEvents(
        java.lang.String name, boolean isConjunction, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventLocalService.getLiveEvents(name, isConjunction, start,
            end, orderByComparator);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EventLocalService getWrappedEventLocalService() {
        return _eventLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEventLocalService(EventLocalService eventLocalService) {
        _eventLocalService = eventLocalService;
    }

    @Override
    public EventLocalService getWrappedService() {
        return _eventLocalService;
    }

    @Override
    public void setWrappedService(EventLocalService eventLocalService) {
        _eventLocalService = eventLocalService;
    }
}

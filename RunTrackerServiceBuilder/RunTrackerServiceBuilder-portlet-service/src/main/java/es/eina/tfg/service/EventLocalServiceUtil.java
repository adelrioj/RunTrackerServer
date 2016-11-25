package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Event. This utility wraps
 * {@link es.eina.tfg.service.impl.EventLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see EventLocalService
 * @see es.eina.tfg.service.base.EventLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.EventLocalServiceImpl
 * @generated
 */
public class EventLocalServiceUtil {
    private static EventLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.EventLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the event to the database. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event addEvent(
        es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEvent(event);
    }

    /**
    * Creates a new event with the primary key. Does not add the event to the database.
    *
    * @param idEvent the primary key for the new event
    * @return the new event
    */
    public static es.eina.tfg.model.Event createEvent(long idEvent) {
        return getService().createEvent(idEvent);
    }

    /**
    * Deletes the event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idEvent the primary key of the event
    * @return the event that was removed
    * @throws PortalException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event deleteEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEvent(idEvent);
    }

    /**
    * Deletes the event from the database. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event deleteEvent(
        es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEvent(event);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static es.eina.tfg.model.Event fetchEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEvent(idEvent);
    }

    /**
    * Returns the event with the primary key.
    *
    * @param idEvent the primary key of the event
    * @return the event
    * @throws PortalException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event getEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEvent(idEvent);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<es.eina.tfg.model.Event> getEvents(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEvents(start, end);
    }

    /**
    * Returns the number of events.
    *
    * @return the number of events
    * @throws SystemException if a system exception occurred
    */
    public static int getEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEventsCount();
    }

    /**
    * Updates the event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param event the event
    * @return the event that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event updateEvent(
        es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEvent(event);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.lang.Long generateNewIdEvent()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdEvent();
    }

    public static java.util.List<com.liferay.portal.model.User> getParticipants(
        long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getParticipants(idEvent);
    }

    public static java.util.List<es.eina.tfg.model.Event> getByidAuthor(
        long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidAuthor(idAuthor);
    }

    public static java.util.List<es.eina.tfg.model.Event> getByidRoute(
        long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidRoute(idRoute);
    }

    public static void clearService() {
        _service = null;
    }

    public static EventLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EventLocalService.class.getName());

            if (invokableLocalService instanceof EventLocalService) {
                _service = (EventLocalService) invokableLocalService;
            } else {
                _service = new EventLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EventLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EventLocalService service) {
    }
}

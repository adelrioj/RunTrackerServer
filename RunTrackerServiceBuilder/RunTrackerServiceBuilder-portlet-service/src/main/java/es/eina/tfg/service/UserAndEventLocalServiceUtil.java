package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UserAndEvent. This utility wraps
 * {@link es.eina.tfg.service.impl.UserAndEventLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see UserAndEventLocalService
 * @see es.eina.tfg.service.base.UserAndEventLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserAndEventLocalServiceImpl
 * @generated
 */
public class UserAndEventLocalServiceUtil {
    private static UserAndEventLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.UserAndEventLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the user and event to the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent addUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addUserAndEvent(userAndEvent);
    }

    /**
    * Creates a new user and event with the primary key. Does not add the user and event to the database.
    *
    * @param userAndEventPK the primary key for the new user and event
    * @return the new user and event
    */
    public static es.eina.tfg.model.UserAndEvent createUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK) {
        return getService().createUserAndEvent(userAndEventPK);
    }

    /**
    * Deletes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event that was removed
    * @throws PortalException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent deleteUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserAndEvent(userAndEventPK);
    }

    /**
    * Deletes the user and event from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent deleteUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserAndEvent(userAndEvent);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.UserAndEvent fetchUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchUserAndEvent(userAndEventPK);
    }

    /**
    * Returns the user and event with the primary key.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event
    * @throws PortalException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent getUserAndEvent(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAndEvent(userAndEventPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<es.eina.tfg.model.UserAndEvent> getUserAndEvents(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAndEvents(start, end);
    }

    /**
    * Returns the number of user and events.
    *
    * @return the number of user and events
    * @throws SystemException if a system exception occurred
    */
    public static int getUserAndEventsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAndEventsCount();
    }

    /**
    * Updates the user and event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userAndEvent the user and event
    * @return the user and event that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent updateUserAndEvent(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUserAndEvent(userAndEvent);
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

    public static es.eina.tfg.model.UserAndEvent addUserAndEvent(long idUser,
        long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addUserAndEvent(idUser, idEvent);
    }

    public static es.eina.tfg.model.UserAndEvent deleteUserAndEvent(
        long idEvent, long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserAndEvent(idEvent, idUser);
    }

    public static es.eina.tfg.model.UserAndEvent getById(long userId,
        long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getById(userId, idEvent);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByidUser(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidUser(userId);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByidEvent(
        long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidEvent(idEvent);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByRace(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByRace(idRace);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByIdEventAndName(idEvent, name);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByIdEventAndName(idEvent, name, start, end);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getByIdEventAndName(idEvent, name, start, end,
            orderByComparator);
    }

    public static void clearService() {
        _service = null;
    }

    public static UserAndEventLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UserAndEventLocalService.class.getName());

            if (invokableLocalService instanceof UserAndEventLocalService) {
                _service = (UserAndEventLocalService) invokableLocalService;
            } else {
                _service = new UserAndEventLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(UserAndEventLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UserAndEventLocalService service) {
    }
}

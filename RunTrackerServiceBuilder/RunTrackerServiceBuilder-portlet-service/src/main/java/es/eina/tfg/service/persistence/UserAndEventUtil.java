package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.UserAndEvent;

import java.util.List;

/**
 * The persistence utility for the user and event service. This utility wraps {@link UserAndEventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndEventPersistence
 * @see UserAndEventPersistenceImpl
 * @generated
 */
public class UserAndEventUtil {
    private static UserAndEventPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(UserAndEvent userAndEvent) {
        getPersistence().clearCache(userAndEvent);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<UserAndEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserAndEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserAndEvent> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserAndEvent update(UserAndEvent userAndEvent)
        throws SystemException {
        return getPersistence().update(userAndEvent);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserAndEvent update(UserAndEvent userAndEvent,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(userAndEvent, serviceContext);
    }

    /**
    * Returns all the user and events where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(idUser);
    }

    /**
    * Returns a range of all the user and events where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @return the range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(idUser, start, end);
    }

    /**
    * Returns an ordered range of all the user and events where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByuserId(idUser, start, end, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByuserId_First(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByuserId_First(idUser, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByuserId_First(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_First(idUser, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByuserId_Last(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByuserId_Last(idUser, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByuserId_Last(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_Last(idUser, orderByComparator);
    }

    /**
    * Returns the user and events before and after the current user and event in the ordered set where idUser = &#63;.
    *
    * @param userAndEventPK the primary key of the current user and event
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent[] findByuserId_PrevAndNext(
        UserAndEventPK userAndEventPK, long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByuserId_PrevAndNext(userAndEventPK, idUser,
            orderByComparator);
    }

    /**
    * Removes all the user and events where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public static void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByuserId(idUser);
    }

    /**
    * Returns the number of user and events where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByuserId(idUser);
    }

    /**
    * Returns all the user and events where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidEvent(idEvent);
    }

    /**
    * Returns a range of all the user and events where idEvent = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idEvent the id event
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @return the range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByidEvent(idEvent, start, end);
    }

    /**
    * Returns an ordered range of all the user and events where idEvent = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idEvent the id event
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByidEvent(idEvent, start, end, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByidEvent_First(
        long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByidEvent_First(idEvent, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByidEvent_First(
        long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByidEvent_First(idEvent, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByidEvent_Last(
        long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByidEvent_Last(idEvent, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByidEvent_Last(
        long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByidEvent_Last(idEvent, orderByComparator);
    }

    /**
    * Returns the user and events before and after the current user and event in the ordered set where idEvent = &#63;.
    *
    * @param userAndEventPK the primary key of the current user and event
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent[] findByidEvent_PrevAndNext(
        UserAndEventPK userAndEventPK, long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByidEvent_PrevAndNext(userAndEventPK, idEvent,
            orderByComparator);
    }

    /**
    * Removes all the user and events where idEvent = &#63; from the database.
    *
    * @param idEvent the id event
    * @throws SystemException if a system exception occurred
    */
    public static void removeByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByidEvent(idEvent);
    }

    /**
    * Returns the number of user and events where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static int countByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByidEvent(idEvent);
    }

    /**
    * Returns all the user and events where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByraceId(idRace);
    }

    /**
    * Returns a range of all the user and events where idRace = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRace the id race
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @return the range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByraceId(idRace, start, end);
    }

    /**
    * Returns an ordered range of all the user and events where idRace = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRace the id race
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByraceId(idRace, start, end, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByraceId_First(
        long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByraceId_First(idRace, orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByraceId_First(
        long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByraceId_First(idRace, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByraceId_Last(
        long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByraceId_Last(idRace, orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByraceId_Last(
        long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByraceId_Last(idRace, orderByComparator);
    }

    /**
    * Returns the user and events before and after the current user and event in the ordered set where idRace = &#63;.
    *
    * @param userAndEventPK the primary key of the current user and event
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent[] findByraceId_PrevAndNext(
        UserAndEventPK userAndEventPK, long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByraceId_PrevAndNext(userAndEventPK, idRace,
            orderByComparator);
    }

    /**
    * Removes all the user and events where idRace = &#63; from the database.
    *
    * @param idRace the id race
    * @throws SystemException if a system exception occurred
    */
    public static void removeByraceId(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByraceId(idRace);
    }

    /**
    * Returns the number of user and events where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static int countByraceId(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByraceId(idRace);
    }

    /**
    * Returns all the user and events where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByparticipationNumber(
        int participationNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByparticipationNumber(participationNumber);
    }

    /**
    * Returns a range of all the user and events where participationNumber = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param participationNumber the participation number
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @return the range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByparticipationNumber(
        int participationNumber, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByparticipationNumber(participationNumber, start, end);
    }

    /**
    * Returns an ordered range of all the user and events where participationNumber = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param participationNumber the participation number
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findByparticipationNumber(
        int participationNumber, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByparticipationNumber(participationNumber, start, end,
            orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByparticipationNumber_First(
        int participationNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByparticipationNumber_First(participationNumber,
            orderByComparator);
    }

    /**
    * Returns the first user and event in the ordered set where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByparticipationNumber_First(
        int participationNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByparticipationNumber_First(participationNumber,
            orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByparticipationNumber_Last(
        int participationNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByparticipationNumber_Last(participationNumber,
            orderByComparator);
    }

    /**
    * Returns the last user and event in the ordered set where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByparticipationNumber_Last(
        int participationNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByparticipationNumber_Last(participationNumber,
            orderByComparator);
    }

    /**
    * Returns the user and events before and after the current user and event in the ordered set where participationNumber = &#63;.
    *
    * @param userAndEventPK the primary key of the current user and event
    * @param participationNumber the participation number
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent[] findByparticipationNumber_PrevAndNext(
        UserAndEventPK userAndEventPK, int participationNumber,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence()
                   .findByparticipationNumber_PrevAndNext(userAndEventPK,
            participationNumber, orderByComparator);
    }

    /**
    * Removes all the user and events where participationNumber = &#63; from the database.
    *
    * @param participationNumber the participation number
    * @throws SystemException if a system exception occurred
    */
    public static void removeByparticipationNumber(int participationNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByparticipationNumber(participationNumber);
    }

    /**
    * Returns the number of user and events where participationNumber = &#63;.
    *
    * @param participationNumber the participation number
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public static int countByparticipationNumber(int participationNumber)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByparticipationNumber(participationNumber);
    }

    /**
    * Caches the user and event in the entity cache if it is enabled.
    *
    * @param userAndEvent the user and event
    */
    public static void cacheResult(es.eina.tfg.model.UserAndEvent userAndEvent) {
        getPersistence().cacheResult(userAndEvent);
    }

    /**
    * Caches the user and events in the entity cache if it is enabled.
    *
    * @param userAndEvents the user and events
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.UserAndEvent> userAndEvents) {
        getPersistence().cacheResult(userAndEvents);
    }

    /**
    * Creates a new user and event with the primary key. Does not add the user and event to the database.
    *
    * @param userAndEventPK the primary key for the new user and event
    * @return the new user and event
    */
    public static es.eina.tfg.model.UserAndEvent create(
        UserAndEventPK userAndEventPK) {
        return getPersistence().create(userAndEventPK);
    }

    /**
    * Removes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event that was removed
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent remove(
        UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().remove(userAndEventPK);
    }

    public static es.eina.tfg.model.UserAndEvent updateImpl(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userAndEvent);
    }

    /**
    * Returns the user and event with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndEventException} if it could not be found.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent findByPrimaryKey(
        UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException {
        return getPersistence().findByPrimaryKey(userAndEventPK);
    }

    /**
    * Returns the user and event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event, or <code>null</code> if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndEvent fetchByPrimaryKey(
        UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userAndEventPK);
    }

    /**
    * Returns all the user and events.
    *
    * @return the user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the user and events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndEventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user and events
    * @param end the upper bound of the range of user and events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of user and events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndEvent> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user and events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user and events.
    *
    * @return the number of user and events
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserAndEventPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserAndEventPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    UserAndEventPersistence.class.getName());

            ReferenceRegistry.registerReference(UserAndEventUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserAndEventPersistence persistence) {
    }
}

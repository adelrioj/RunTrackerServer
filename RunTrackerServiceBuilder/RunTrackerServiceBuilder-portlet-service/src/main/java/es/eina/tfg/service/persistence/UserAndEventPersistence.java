package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.UserAndEvent;

/**
 * The persistence interface for the user and event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndEventPersistenceImpl
 * @see UserAndEventUtil
 * @generated
 */
public interface UserAndEventPersistence extends BasePersistence<UserAndEvent> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserAndEventUtil} to access the user and event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the user and events where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByuserId(
        long idUser, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the first user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the last user and event in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.UserAndEvent[] findByuserId_PrevAndNext(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK,
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Removes all the user and events where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and events where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user and events where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByidEvent(
        long idEvent, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByidEvent_First(long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the first user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByidEvent_First(long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByidEvent_Last(long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the last user and event in the ordered set where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByidEvent_Last(long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.UserAndEvent[] findByidEvent_PrevAndNext(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK,
        long idEvent,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Removes all the user and events where idEvent = &#63; from the database.
    *
    * @param idEvent the id event
    * @throws SystemException if a system exception occurred
    */
    public void removeByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and events where idEvent = &#63;.
    *
    * @param idEvent the id event
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public int countByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user and events where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the matching user and events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findByraceId(
        long idRace, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByraceId_First(long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the first user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByraceId_First(long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByraceId_Last(long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the last user and event in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByraceId_Last(long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.UserAndEvent[] findByraceId_PrevAndNext(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK,
        long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Removes all the user and events where idRace = &#63; from the database.
    *
    * @param idRace the id race
    * @throws SystemException if a system exception occurred
    */
    public void removeByraceId(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and events where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the number of matching user and events
    * @throws SystemException if a system exception occurred
    */
    public int countByraceId(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the user and event in the entity cache if it is enabled.
    *
    * @param userAndEvent the user and event
    */
    public void cacheResult(es.eina.tfg.model.UserAndEvent userAndEvent);

    /**
    * Caches the user and events in the entity cache if it is enabled.
    *
    * @param userAndEvents the user and events
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.UserAndEvent> userAndEvents);

    /**
    * Creates a new user and event with the primary key. Does not add the user and event to the database.
    *
    * @param userAndEventPK the primary key for the new user and event
    * @return the new user and event
    */
    public es.eina.tfg.model.UserAndEvent create(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK);

    /**
    * Removes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event that was removed
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent remove(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    public es.eina.tfg.model.UserAndEvent updateImpl(
        es.eina.tfg.model.UserAndEvent userAndEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user and event with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndEventException} if it could not be found.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event
    * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent findByPrimaryKey(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndEventException;

    /**
    * Returns the user and event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userAndEventPK the primary key of the user and event
    * @return the user and event, or <code>null</code> if a user and event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndEvent fetchByPrimaryKey(
        es.eina.tfg.service.persistence.UserAndEventPK userAndEventPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user and events.
    *
    * @return the user and events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndEvent> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAndEvent> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user and events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and events.
    *
    * @return the number of user and events
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Event;

/**
 * The persistence interface for the event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see EventPersistenceImpl
 * @see EventUtil
 * @generated
 */
public interface EventPersistence extends BasePersistence<Event> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EventUtil} to access the event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the events where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByauthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the events where idAuthor = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idAuthor the id author
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @return the range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByauthor(long idAuthor,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the events where idAuthor = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idAuthor the id author
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByauthor(long idAuthor,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByauthor_First(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the first event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByauthor_First(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByauthor_Last(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the last event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByauthor_Last(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the events before and after the current event in the ordered set where idAuthor = &#63;.
    *
    * @param idEvent the primary key of the current event
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next event
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event[] findByauthor_PrevAndNext(long idEvent,
        long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Removes all the events where idAuthor = &#63; from the database.
    *
    * @param idAuthor the id author
    * @throws SystemException if a system exception occurred
    */
    public void removeByauthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of events where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public int countByauthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the events where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the events where idRoute = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRoute the id route
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @return the range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByrouteId(long idRoute,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the events where idRoute = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRoute the id route
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByrouteId(long idRoute,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the first event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the last event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the events before and after the current event in the ordered set where idRoute = &#63;.
    *
    * @param idEvent the primary key of the current event
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next event
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event[] findByrouteId_PrevAndNext(long idEvent,
        long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Removes all the events where idRoute = &#63; from the database.
    *
    * @param idRoute the id route
    * @throws SystemException if a system exception occurred
    */
    public void removeByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of events where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public int countByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the events where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the events where plannedStartingTime = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param plannedStartingTime the planned starting time
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @return the range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the events where plannedStartingTime = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param plannedStartingTime the planned starting time
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByplannedStartingTime_First(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the first event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByplannedStartingTime_First(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByplannedStartingTime_Last(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the last event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByplannedStartingTime_Last(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the events before and after the current event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param idEvent the primary key of the current event
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next event
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event[] findByplannedStartingTime_PrevAndNext(
        long idEvent, java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Removes all the events where plannedStartingTime = &#63; from the database.
    *
    * @param plannedStartingTime the planned starting time
    * @throws SystemException if a system exception occurred
    */
    public void removeByplannedStartingTime(java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of events where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public int countByplannedStartingTime(java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the event in the entity cache if it is enabled.
    *
    * @param event the event
    */
    public void cacheResult(es.eina.tfg.model.Event event);

    /**
    * Caches the events in the entity cache if it is enabled.
    *
    * @param events the events
    */
    public void cacheResult(java.util.List<es.eina.tfg.model.Event> events);

    /**
    * Creates a new event with the primary key. Does not add the event to the database.
    *
    * @param idEvent the primary key for the new event
    * @return the new event
    */
    public es.eina.tfg.model.Event create(long idEvent);

    /**
    * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idEvent the primary key of the event
    * @return the event that was removed
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event remove(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    public es.eina.tfg.model.Event updateImpl(es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the event with the primary key or throws a {@link es.eina.tfg.NoSuchEventException} if it could not be found.
    *
    * @param idEvent the primary key of the event
    * @return the event
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event findByPrimaryKey(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException;

    /**
    * Returns the event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idEvent the primary key of the event
    * @return the event, or <code>null</code> if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Event fetchByPrimaryKey(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the events.
    *
    * @return the events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Event> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the events.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.EventModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of events
    * @param end the upper bound of the range of events (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of events
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Event> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of events.
    *
    * @return the number of events
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.Event;

import java.util.List;

/**
 * The persistence utility for the event service. This utility wraps {@link EventPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see EventPersistence
 * @see EventPersistenceImpl
 * @generated
 */
public class EventUtil {
    private static EventPersistence _persistence;

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
    public static void clearCache(Event event) {
        getPersistence().clearCache(event);
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
    public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Event update(Event event) throws SystemException {
        return getPersistence().update(event);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Event update(Event event, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(event, serviceContext);
    }

    /**
    * Returns all the events where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Event> findByauthor(
        long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByauthor(idAuthor);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByauthor(
        long idAuthor, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByauthor(idAuthor, start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByauthor(
        long idAuthor, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByauthor(idAuthor, start, end, orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByauthor_First(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().findByauthor_First(idAuthor, orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByauthor_First(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByauthor_First(idAuthor, orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByauthor_Last(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().findByauthor_Last(idAuthor, orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByauthor_Last(long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByauthor_Last(idAuthor, orderByComparator);
    }

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
    public static es.eina.tfg.model.Event[] findByauthor_PrevAndNext(
        long idEvent, long idAuthor,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence()
                   .findByauthor_PrevAndNext(idEvent, idAuthor,
            orderByComparator);
    }

    /**
    * Removes all the events where idAuthor = &#63; from the database.
    *
    * @param idAuthor the id author
    * @throws SystemException if a system exception occurred
    */
    public static void removeByauthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByauthor(idAuthor);
    }

    /**
    * Returns the number of events where idAuthor = &#63;.
    *
    * @param idAuthor the id author
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public static int countByauthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByauthor(idAuthor);
    }

    /**
    * Returns all the events where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Event> findByrouteId(
        long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrouteId(idRoute);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByrouteId(
        long idRoute, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrouteId(idRoute, start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByrouteId(
        long idRoute, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByrouteId(idRoute, start, end, orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().findByrouteId_First(idRoute, orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrouteId_First(idRoute, orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().findByrouteId_Last(idRoute, orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrouteId_Last(idRoute, orderByComparator);
    }

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
    public static es.eina.tfg.model.Event[] findByrouteId_PrevAndNext(
        long idEvent, long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence()
                   .findByrouteId_PrevAndNext(idEvent, idRoute,
            orderByComparator);
    }

    /**
    * Removes all the events where idRoute = &#63; from the database.
    *
    * @param idRoute the id route
    * @throws SystemException if a system exception occurred
    */
    public static void removeByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByrouteId(idRoute);
    }

    /**
    * Returns the number of events where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public static int countByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByrouteId(idRoute);
    }

    /**
    * Returns all the events where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @return the matching events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByplannedStartingTime(plannedStartingTime);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByplannedStartingTime(plannedStartingTime, start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findByplannedStartingTime(
        java.util.Date plannedStartingTime, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByplannedStartingTime(plannedStartingTime, start, end,
            orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByplannedStartingTime_First(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence()
                   .findByplannedStartingTime_First(plannedStartingTime,
            orderByComparator);
    }

    /**
    * Returns the first event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByplannedStartingTime_First(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByplannedStartingTime_First(plannedStartingTime,
            orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event
    * @throws es.eina.tfg.NoSuchEventException if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByplannedStartingTime_Last(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence()
                   .findByplannedStartingTime_Last(plannedStartingTime,
            orderByComparator);
    }

    /**
    * Returns the last event in the ordered set where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching event, or <code>null</code> if a matching event could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByplannedStartingTime_Last(
        java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByplannedStartingTime_Last(plannedStartingTime,
            orderByComparator);
    }

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
    public static es.eina.tfg.model.Event[] findByplannedStartingTime_PrevAndNext(
        long idEvent, java.util.Date plannedStartingTime,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence()
                   .findByplannedStartingTime_PrevAndNext(idEvent,
            plannedStartingTime, orderByComparator);
    }

    /**
    * Removes all the events where plannedStartingTime = &#63; from the database.
    *
    * @param plannedStartingTime the planned starting time
    * @throws SystemException if a system exception occurred
    */
    public static void removeByplannedStartingTime(
        java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByplannedStartingTime(plannedStartingTime);
    }

    /**
    * Returns the number of events where plannedStartingTime = &#63;.
    *
    * @param plannedStartingTime the planned starting time
    * @return the number of matching events
    * @throws SystemException if a system exception occurred
    */
    public static int countByplannedStartingTime(
        java.util.Date plannedStartingTime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByplannedStartingTime(plannedStartingTime);
    }

    /**
    * Caches the event in the entity cache if it is enabled.
    *
    * @param event the event
    */
    public static void cacheResult(es.eina.tfg.model.Event event) {
        getPersistence().cacheResult(event);
    }

    /**
    * Caches the events in the entity cache if it is enabled.
    *
    * @param events the events
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.Event> events) {
        getPersistence().cacheResult(events);
    }

    /**
    * Creates a new event with the primary key. Does not add the event to the database.
    *
    * @param idEvent the primary key for the new event
    * @return the new event
    */
    public static es.eina.tfg.model.Event create(long idEvent) {
        return getPersistence().create(idEvent);
    }

    /**
    * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idEvent the primary key of the event
    * @return the event that was removed
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event remove(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().remove(idEvent);
    }

    public static es.eina.tfg.model.Event updateImpl(
        es.eina.tfg.model.Event event)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(event);
    }

    /**
    * Returns the event with the primary key or throws a {@link es.eina.tfg.NoSuchEventException} if it could not be found.
    *
    * @param idEvent the primary key of the event
    * @return the event
    * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event findByPrimaryKey(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchEventException {
        return getPersistence().findByPrimaryKey(idEvent);
    }

    /**
    * Returns the event with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idEvent the primary key of the event
    * @return the event, or <code>null</code> if a event with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Event fetchByPrimaryKey(long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idEvent);
    }

    /**
    * Returns all the events.
    *
    * @return the events
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Event> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.eina.tfg.model.Event> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.Event> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the events from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of events.
    *
    * @return the number of events
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EventPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EventPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    EventPersistence.class.getName());

            ReferenceRegistry.registerReference(EventUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EventPersistence persistence) {
    }
}

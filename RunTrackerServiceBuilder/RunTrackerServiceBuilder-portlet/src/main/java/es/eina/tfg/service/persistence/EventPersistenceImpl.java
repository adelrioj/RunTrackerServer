package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchEventException;
import es.eina.tfg.model.Event;
import es.eina.tfg.model.impl.EventImpl;
import es.eina.tfg.model.impl.EventModelImpl;
import es.eina.tfg.service.persistence.EventPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see EventPersistence
 * @see EventUtil
 * @generated
 */
public class EventPersistenceImpl extends BasePersistenceImpl<Event>
    implements EventPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EventUtil} to access the event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EventImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHOR = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByauthor",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR =
        new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByauthor",
            new String[] { Long.class.getName() },
            EventModelImpl.IDAUTHOR_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_AUTHOR = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByauthor",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_AUTHOR_IDAUTHOR_2 = "event.idAuthor = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ROUTEID = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByrouteId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID =
        new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByrouteId",
            new String[] { Long.class.getName() },
            EventModelImpl.IDROUTE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ROUTEID = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrouteId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ROUTEID_IDROUTE_2 = "event.idRoute = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME =
        new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByplannedStartingTime",
            new String[] {
                Date.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME =
        new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, EventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByplannedStartingTime", new String[] { Date.class.getName() },
            EventModelImpl.PLANNEDSTARTINGTIME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLANNEDSTARTINGTIME = new FinderPath(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByplannedStartingTime", new String[] { Date.class.getName() });
    private static final String _FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_1 =
        "event.plannedStartingTime IS NULL";
    private static final String _FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_2 =
        "event.plannedStartingTime = ?";
    private static final String _SQL_SELECT_EVENT = "SELECT event FROM Event event";
    private static final String _SQL_SELECT_EVENT_WHERE = "SELECT event FROM Event event WHERE ";
    private static final String _SQL_COUNT_EVENT = "SELECT COUNT(event) FROM Event event";
    private static final String _SQL_COUNT_EVENT_WHERE = "SELECT COUNT(event) FROM Event event WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "event.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Event exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Event exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EventPersistenceImpl.class);
    private static Event _nullEvent = new EventImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Event> toCacheModel() {
                return _nullEventCacheModel;
            }
        };

    private static CacheModel<Event> _nullEventCacheModel = new CacheModel<Event>() {
            @Override
            public Event toEntityModel() {
                return _nullEvent;
            }
        };

    public EventPersistenceImpl() {
        setModelClass(Event.class);
    }

    /**
     * Returns all the events where idAuthor = &#63;.
     *
     * @param idAuthor the id author
     * @return the matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Event> findByauthor(long idAuthor) throws SystemException {
        return findByauthor(idAuthor, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Event> findByauthor(long idAuthor, int start, int end)
        throws SystemException {
        return findByauthor(idAuthor, start, end, null);
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
    @Override
    public List<Event> findByauthor(long idAuthor, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR;
            finderArgs = new Object[] { idAuthor };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_AUTHOR;
            finderArgs = new Object[] { idAuthor, start, end, orderByComparator };
        }

        List<Event> list = (List<Event>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Event event : list) {
                if ((idAuthor != event.getIdAuthor())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EVENT_WHERE);

            query.append(_FINDER_COLUMN_AUTHOR_IDAUTHOR_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idAuthor);

                if (!pagination) {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Event>(list);
                } else {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Event findByauthor_First(long idAuthor,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByauthor_First(idAuthor, orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idAuthor=");
        msg.append(idAuthor);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the first event in the ordered set where idAuthor = &#63;.
     *
     * @param idAuthor the id author
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByauthor_First(long idAuthor,
        OrderByComparator orderByComparator) throws SystemException {
        List<Event> list = findByauthor(idAuthor, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event findByauthor_Last(long idAuthor,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByauthor_Last(idAuthor, orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idAuthor=");
        msg.append(idAuthor);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the last event in the ordered set where idAuthor = &#63;.
     *
     * @param idAuthor the id author
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByauthor_Last(long idAuthor,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByauthor(idAuthor);

        if (count == 0) {
            return null;
        }

        List<Event> list = findByauthor(idAuthor, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event[] findByauthor_PrevAndNext(long idEvent, long idAuthor,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = findByPrimaryKey(idEvent);

        Session session = null;

        try {
            session = openSession();

            Event[] array = new EventImpl[3];

            array[0] = getByauthor_PrevAndNext(session, event, idAuthor,
                    orderByComparator, true);

            array[1] = event;

            array[2] = getByauthor_PrevAndNext(session, event, idAuthor,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Event getByauthor_PrevAndNext(Session session, Event event,
        long idAuthor, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EVENT_WHERE);

        query.append(_FINDER_COLUMN_AUTHOR_IDAUTHOR_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idAuthor);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(event);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Event> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the events where idAuthor = &#63; from the database.
     *
     * @param idAuthor the id author
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByauthor(long idAuthor) throws SystemException {
        for (Event event : findByauthor(idAuthor, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(event);
        }
    }

    /**
     * Returns the number of events where idAuthor = &#63;.
     *
     * @param idAuthor the id author
     * @return the number of matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByauthor(long idAuthor) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_AUTHOR;

        Object[] finderArgs = new Object[] { idAuthor };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EVENT_WHERE);

            query.append(_FINDER_COLUMN_AUTHOR_IDAUTHOR_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idAuthor);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the events where idRoute = &#63;.
     *
     * @param idRoute the id route
     * @return the matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Event> findByrouteId(long idRoute) throws SystemException {
        return findByrouteId(idRoute, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Event> findByrouteId(long idRoute, int start, int end)
        throws SystemException {
        return findByrouteId(idRoute, start, end, null);
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
    @Override
    public List<Event> findByrouteId(long idRoute, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID;
            finderArgs = new Object[] { idRoute };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ROUTEID;
            finderArgs = new Object[] { idRoute, start, end, orderByComparator };
        }

        List<Event> list = (List<Event>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Event event : list) {
                if ((idRoute != event.getIdRoute())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EVENT_WHERE);

            query.append(_FINDER_COLUMN_ROUTEID_IDROUTE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idRoute);

                if (!pagination) {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Event>(list);
                } else {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Event findByrouteId_First(long idRoute,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByrouteId_First(idRoute, orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idRoute=");
        msg.append(idRoute);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the first event in the ordered set where idRoute = &#63;.
     *
     * @param idRoute the id route
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByrouteId_First(long idRoute,
        OrderByComparator orderByComparator) throws SystemException {
        List<Event> list = findByrouteId(idRoute, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event findByrouteId_Last(long idRoute,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByrouteId_Last(idRoute, orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idRoute=");
        msg.append(idRoute);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the last event in the ordered set where idRoute = &#63;.
     *
     * @param idRoute the id route
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByrouteId_Last(long idRoute,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByrouteId(idRoute);

        if (count == 0) {
            return null;
        }

        List<Event> list = findByrouteId(idRoute, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event[] findByrouteId_PrevAndNext(long idEvent, long idRoute,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = findByPrimaryKey(idEvent);

        Session session = null;

        try {
            session = openSession();

            Event[] array = new EventImpl[3];

            array[0] = getByrouteId_PrevAndNext(session, event, idRoute,
                    orderByComparator, true);

            array[1] = event;

            array[2] = getByrouteId_PrevAndNext(session, event, idRoute,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Event getByrouteId_PrevAndNext(Session session, Event event,
        long idRoute, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EVENT_WHERE);

        query.append(_FINDER_COLUMN_ROUTEID_IDROUTE_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idRoute);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(event);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Event> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the events where idRoute = &#63; from the database.
     *
     * @param idRoute the id route
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByrouteId(long idRoute) throws SystemException {
        for (Event event : findByrouteId(idRoute, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(event);
        }
    }

    /**
     * Returns the number of events where idRoute = &#63;.
     *
     * @param idRoute the id route
     * @return the number of matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByrouteId(long idRoute) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ROUTEID;

        Object[] finderArgs = new Object[] { idRoute };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EVENT_WHERE);

            query.append(_FINDER_COLUMN_ROUTEID_IDROUTE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idRoute);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the events where plannedStartingTime = &#63;.
     *
     * @param plannedStartingTime the planned starting time
     * @return the matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Event> findByplannedStartingTime(Date plannedStartingTime)
        throws SystemException {
        return findByplannedStartingTime(plannedStartingTime,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Event> findByplannedStartingTime(Date plannedStartingTime,
        int start, int end) throws SystemException {
        return findByplannedStartingTime(plannedStartingTime, start, end, null);
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
    @Override
    public List<Event> findByplannedStartingTime(Date plannedStartingTime,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME;
            finderArgs = new Object[] { plannedStartingTime };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME;
            finderArgs = new Object[] {
                    plannedStartingTime,
                    
                    start, end, orderByComparator
                };
        }

        List<Event> list = (List<Event>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Event event : list) {
                if (!Validator.equals(plannedStartingTime,
                            event.getPlannedStartingTime())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EVENT_WHERE);

            boolean bindPlannedStartingTime = false;

            if (plannedStartingTime == null) {
                query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_1);
            } else {
                bindPlannedStartingTime = true;

                query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPlannedStartingTime) {
                    qPos.add(CalendarUtil.getTimestamp(plannedStartingTime));
                }

                if (!pagination) {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Event>(list);
                } else {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Event findByplannedStartingTime_First(Date plannedStartingTime,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByplannedStartingTime_First(plannedStartingTime,
                orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("plannedStartingTime=");
        msg.append(plannedStartingTime);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the first event in the ordered set where plannedStartingTime = &#63;.
     *
     * @param plannedStartingTime the planned starting time
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByplannedStartingTime_First(Date plannedStartingTime,
        OrderByComparator orderByComparator) throws SystemException {
        List<Event> list = findByplannedStartingTime(plannedStartingTime, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event findByplannedStartingTime_Last(Date plannedStartingTime,
        OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = fetchByplannedStartingTime_Last(plannedStartingTime,
                orderByComparator);

        if (event != null) {
            return event;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("plannedStartingTime=");
        msg.append(plannedStartingTime);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEventException(msg.toString());
    }

    /**
     * Returns the last event in the ordered set where plannedStartingTime = &#63;.
     *
     * @param plannedStartingTime the planned starting time
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching event, or <code>null</code> if a matching event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByplannedStartingTime_Last(Date plannedStartingTime,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByplannedStartingTime(plannedStartingTime);

        if (count == 0) {
            return null;
        }

        List<Event> list = findByplannedStartingTime(plannedStartingTime,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Event[] findByplannedStartingTime_PrevAndNext(long idEvent,
        Date plannedStartingTime, OrderByComparator orderByComparator)
        throws NoSuchEventException, SystemException {
        Event event = findByPrimaryKey(idEvent);

        Session session = null;

        try {
            session = openSession();

            Event[] array = new EventImpl[3];

            array[0] = getByplannedStartingTime_PrevAndNext(session, event,
                    plannedStartingTime, orderByComparator, true);

            array[1] = event;

            array[2] = getByplannedStartingTime_PrevAndNext(session, event,
                    plannedStartingTime, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Event getByplannedStartingTime_PrevAndNext(Session session,
        Event event, Date plannedStartingTime,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EVENT_WHERE);

        boolean bindPlannedStartingTime = false;

        if (plannedStartingTime == null) {
            query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_1);
        } else {
            bindPlannedStartingTime = true;

            query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindPlannedStartingTime) {
            qPos.add(CalendarUtil.getTimestamp(plannedStartingTime));
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(event);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Event> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the events where plannedStartingTime = &#63; from the database.
     *
     * @param plannedStartingTime the planned starting time
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByplannedStartingTime(Date plannedStartingTime)
        throws SystemException {
        for (Event event : findByplannedStartingTime(plannedStartingTime,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(event);
        }
    }

    /**
     * Returns the number of events where plannedStartingTime = &#63;.
     *
     * @param plannedStartingTime the planned starting time
     * @return the number of matching events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByplannedStartingTime(Date plannedStartingTime)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PLANNEDSTARTINGTIME;

        Object[] finderArgs = new Object[] { plannedStartingTime };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EVENT_WHERE);

            boolean bindPlannedStartingTime = false;

            if (plannedStartingTime == null) {
                query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_1);
            } else {
                bindPlannedStartingTime = true;

                query.append(_FINDER_COLUMN_PLANNEDSTARTINGTIME_PLANNEDSTARTINGTIME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindPlannedStartingTime) {
                    qPos.add(CalendarUtil.getTimestamp(plannedStartingTime));
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the event in the entity cache if it is enabled.
     *
     * @param event the event
     */
    @Override
    public void cacheResult(Event event) {
        EntityCacheUtil.putResult(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventImpl.class, event.getPrimaryKey(), event);

        event.resetOriginalValues();
    }

    /**
     * Caches the events in the entity cache if it is enabled.
     *
     * @param events the events
     */
    @Override
    public void cacheResult(List<Event> events) {
        for (Event event : events) {
            if (EntityCacheUtil.getResult(EventModelImpl.ENTITY_CACHE_ENABLED,
                        EventImpl.class, event.getPrimaryKey()) == null) {
                cacheResult(event);
            } else {
                event.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all events.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EventImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EventImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the event.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Event event) {
        EntityCacheUtil.removeResult(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventImpl.class, event.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Event> events) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Event event : events) {
            EntityCacheUtil.removeResult(EventModelImpl.ENTITY_CACHE_ENABLED,
                EventImpl.class, event.getPrimaryKey());
        }
    }

    /**
     * Creates a new event with the primary key. Does not add the event to the database.
     *
     * @param idEvent the primary key for the new event
     * @return the new event
     */
    @Override
    public Event create(long idEvent) {
        Event event = new EventImpl();

        event.setNew(true);
        event.setPrimaryKey(idEvent);

        return event;
    }

    /**
     * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idEvent the primary key of the event
     * @return the event that was removed
     * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event remove(long idEvent)
        throws NoSuchEventException, SystemException {
        return remove((Serializable) idEvent);
    }

    /**
     * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the event
     * @return the event that was removed
     * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event remove(Serializable primaryKey)
        throws NoSuchEventException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Event event = (Event) session.get(EventImpl.class, primaryKey);

            if (event == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(event);
        } catch (NoSuchEventException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Event removeImpl(Event event) throws SystemException {
        event = toUnwrappedModel(event);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(event)) {
                event = (Event) session.get(EventImpl.class,
                        event.getPrimaryKeyObj());
            }

            if (event != null) {
                session.delete(event);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (event != null) {
            clearCache(event);
        }

        return event;
    }

    @Override
    public Event updateImpl(es.eina.tfg.model.Event event)
        throws SystemException {
        event = toUnwrappedModel(event);

        boolean isNew = event.isNew();

        EventModelImpl eventModelImpl = (EventModelImpl) event;

        Session session = null;

        try {
            session = openSession();

            if (event.isNew()) {
                session.save(event);

                event.setNew(false);
            } else {
                session.merge(event);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EventModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((eventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        eventModelImpl.getOriginalIdAuthor()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHOR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR,
                    args);

                args = new Object[] { eventModelImpl.getIdAuthor() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHOR, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_AUTHOR,
                    args);
            }

            if ((eventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { eventModelImpl.getOriginalIdRoute() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID,
                    args);

                args = new Object[] { eventModelImpl.getIdRoute() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID,
                    args);
            }

            if ((eventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        eventModelImpl.getOriginalPlannedStartingTime()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANNEDSTARTINGTIME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME,
                    args);

                args = new Object[] { eventModelImpl.getPlannedStartingTime() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANNEDSTARTINGTIME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANNEDSTARTINGTIME,
                    args);
            }
        }

        EntityCacheUtil.putResult(EventModelImpl.ENTITY_CACHE_ENABLED,
            EventImpl.class, event.getPrimaryKey(), event);

        return event;
    }

    protected Event toUnwrappedModel(Event event) {
        if (event instanceof EventImpl) {
            return event;
        }

        EventImpl eventImpl = new EventImpl();

        eventImpl.setNew(event.isNew());
        eventImpl.setPrimaryKey(event.getPrimaryKey());

        eventImpl.setIdEvent(event.getIdEvent());
        eventImpl.setIdRoute(event.getIdRoute());
        eventImpl.setIdAuthor(event.getIdAuthor());
        eventImpl.setName(event.getName());
        eventImpl.setPlannedStartingTime(event.getPlannedStartingTime());
        eventImpl.setPlannedFinishTime(event.getPlannedFinishTime());
        eventImpl.setRealStartingTime(event.getRealStartingTime());
        eventImpl.setRealFinishTime(event.getRealFinishTime());

        return eventImpl;
    }

    /**
     * Returns the event with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the event
     * @return the event
     * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEventException, SystemException {
        Event event = fetchByPrimaryKey(primaryKey);

        if (event == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return event;
    }

    /**
     * Returns the event with the primary key or throws a {@link es.eina.tfg.NoSuchEventException} if it could not be found.
     *
     * @param idEvent the primary key of the event
     * @return the event
     * @throws es.eina.tfg.NoSuchEventException if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event findByPrimaryKey(long idEvent)
        throws NoSuchEventException, SystemException {
        return findByPrimaryKey((Serializable) idEvent);
    }

    /**
     * Returns the event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the event
     * @return the event, or <code>null</code> if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Event event = (Event) EntityCacheUtil.getResult(EventModelImpl.ENTITY_CACHE_ENABLED,
                EventImpl.class, primaryKey);

        if (event == _nullEvent) {
            return null;
        }

        if (event == null) {
            Session session = null;

            try {
                session = openSession();

                event = (Event) session.get(EventImpl.class, primaryKey);

                if (event != null) {
                    cacheResult(event);
                } else {
                    EntityCacheUtil.putResult(EventModelImpl.ENTITY_CACHE_ENABLED,
                        EventImpl.class, primaryKey, _nullEvent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EventModelImpl.ENTITY_CACHE_ENABLED,
                    EventImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return event;
    }

    /**
     * Returns the event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idEvent the primary key of the event
     * @return the event, or <code>null</code> if a event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Event fetchByPrimaryKey(long idEvent) throws SystemException {
        return fetchByPrimaryKey((Serializable) idEvent);
    }

    /**
     * Returns all the events.
     *
     * @return the events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Event> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Event> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Event> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Event> list = (List<Event>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EVENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EVENT;

                if (pagination) {
                    sql = sql.concat(EventModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Event>(list);
                } else {
                    list = (List<Event>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the events from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Event event : findAll()) {
            remove(event);
        }
    }

    /**
     * Returns the number of events.
     *
     * @return the number of events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EVENT);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the event persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Event")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Event>> listenersList = new ArrayList<ModelListener<Event>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Event>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EventImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

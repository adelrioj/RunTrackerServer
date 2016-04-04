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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchRouteLocationException;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.model.impl.RouteLocationImpl;
import es.eina.tfg.model.impl.RouteLocationModelImpl;
import es.eina.tfg.service.persistence.RouteLocationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the route location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RouteLocationPersistence
 * @see RouteLocationUtil
 * @generated
 */
public class RouteLocationPersistenceImpl extends BasePersistenceImpl<RouteLocation>
    implements RouteLocationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RouteLocationUtil} to access the route location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RouteLocationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED,
            RouteLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED,
            RouteLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ROUTEID = new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED,
            RouteLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByrouteId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID =
        new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED,
            RouteLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByrouteId", new String[] { Long.class.getName() },
            RouteLocationModelImpl.ROUTEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ROUTEID = new FinderPath(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByrouteId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ROUTEID_ROUTEID_2 = "routeLocation.routeId = ?";
    private static final String _SQL_SELECT_ROUTELOCATION = "SELECT routeLocation FROM RouteLocation routeLocation";
    private static final String _SQL_SELECT_ROUTELOCATION_WHERE = "SELECT routeLocation FROM RouteLocation routeLocation WHERE ";
    private static final String _SQL_COUNT_ROUTELOCATION = "SELECT COUNT(routeLocation) FROM RouteLocation routeLocation";
    private static final String _SQL_COUNT_ROUTELOCATION_WHERE = "SELECT COUNT(routeLocation) FROM RouteLocation routeLocation WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "routeLocation.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RouteLocation exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RouteLocation exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RouteLocationPersistenceImpl.class);
    private static RouteLocation _nullRouteLocation = new RouteLocationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<RouteLocation> toCacheModel() {
                return _nullRouteLocationCacheModel;
            }
        };

    private static CacheModel<RouteLocation> _nullRouteLocationCacheModel = new CacheModel<RouteLocation>() {
            @Override
            public RouteLocation toEntityModel() {
                return _nullRouteLocation;
            }
        };

    public RouteLocationPersistenceImpl() {
        setModelClass(RouteLocation.class);
    }

    /**
     * Returns all the route locations where routeId = &#63;.
     *
     * @param routeId the route ID
     * @return the matching route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findByrouteId(long routeId)
        throws SystemException {
        return findByrouteId(routeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the route locations where routeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param routeId the route ID
     * @param start the lower bound of the range of route locations
     * @param end the upper bound of the range of route locations (not inclusive)
     * @return the range of matching route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findByrouteId(long routeId, int start, int end)
        throws SystemException {
        return findByrouteId(routeId, start, end, null);
    }

    /**
     * Returns an ordered range of all the route locations where routeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param routeId the route ID
     * @param start the lower bound of the range of route locations
     * @param end the upper bound of the range of route locations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findByrouteId(long routeId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID;
            finderArgs = new Object[] { routeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ROUTEID;
            finderArgs = new Object[] { routeId, start, end, orderByComparator };
        }

        List<RouteLocation> list = (List<RouteLocation>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (RouteLocation routeLocation : list) {
                if ((routeId != routeLocation.getRouteId())) {
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

            query.append(_SQL_SELECT_ROUTELOCATION_WHERE);

            query.append(_FINDER_COLUMN_ROUTEID_ROUTEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RouteLocationModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(routeId);

                if (!pagination) {
                    list = (List<RouteLocation>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RouteLocation>(list);
                } else {
                    list = (List<RouteLocation>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Returns the first route location in the ordered set where routeId = &#63;.
     *
     * @param routeId the route ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route location
     * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation findByrouteId_First(long routeId,
        OrderByComparator orderByComparator)
        throws NoSuchRouteLocationException, SystemException {
        RouteLocation routeLocation = fetchByrouteId_First(routeId,
                orderByComparator);

        if (routeLocation != null) {
            return routeLocation;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("routeId=");
        msg.append(routeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteLocationException(msg.toString());
    }

    /**
     * Returns the first route location in the ordered set where routeId = &#63;.
     *
     * @param routeId the route ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route location, or <code>null</code> if a matching route location could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation fetchByrouteId_First(long routeId,
        OrderByComparator orderByComparator) throws SystemException {
        List<RouteLocation> list = findByrouteId(routeId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last route location in the ordered set where routeId = &#63;.
     *
     * @param routeId the route ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route location
     * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation findByrouteId_Last(long routeId,
        OrderByComparator orderByComparator)
        throws NoSuchRouteLocationException, SystemException {
        RouteLocation routeLocation = fetchByrouteId_Last(routeId,
                orderByComparator);

        if (routeLocation != null) {
            return routeLocation;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("routeId=");
        msg.append(routeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteLocationException(msg.toString());
    }

    /**
     * Returns the last route location in the ordered set where routeId = &#63;.
     *
     * @param routeId the route ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route location, or <code>null</code> if a matching route location could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation fetchByrouteId_Last(long routeId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByrouteId(routeId);

        if (count == 0) {
            return null;
        }

        List<RouteLocation> list = findByrouteId(routeId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the route locations before and after the current route location in the ordered set where routeId = &#63;.
     *
     * @param routePositionId the primary key of the current route location
     * @param routeId the route ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next route location
     * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation[] findByrouteId_PrevAndNext(long routePositionId,
        long routeId, OrderByComparator orderByComparator)
        throws NoSuchRouteLocationException, SystemException {
        RouteLocation routeLocation = findByPrimaryKey(routePositionId);

        Session session = null;

        try {
            session = openSession();

            RouteLocation[] array = new RouteLocationImpl[3];

            array[0] = getByrouteId_PrevAndNext(session, routeLocation,
                    routeId, orderByComparator, true);

            array[1] = routeLocation;

            array[2] = getByrouteId_PrevAndNext(session, routeLocation,
                    routeId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected RouteLocation getByrouteId_PrevAndNext(Session session,
        RouteLocation routeLocation, long routeId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ROUTELOCATION_WHERE);

        query.append(_FINDER_COLUMN_ROUTEID_ROUTEID_2);

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
            query.append(RouteLocationModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(routeId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(routeLocation);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<RouteLocation> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the route locations where routeId = &#63; from the database.
     *
     * @param routeId the route ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByrouteId(long routeId) throws SystemException {
        for (RouteLocation routeLocation : findByrouteId(routeId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(routeLocation);
        }
    }

    /**
     * Returns the number of route locations where routeId = &#63;.
     *
     * @param routeId the route ID
     * @return the number of matching route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByrouteId(long routeId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ROUTEID;

        Object[] finderArgs = new Object[] { routeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ROUTELOCATION_WHERE);

            query.append(_FINDER_COLUMN_ROUTEID_ROUTEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(routeId);

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
     * Caches the route location in the entity cache if it is enabled.
     *
     * @param routeLocation the route location
     */
    @Override
    public void cacheResult(RouteLocation routeLocation) {
        EntityCacheUtil.putResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationImpl.class, routeLocation.getPrimaryKey(),
            routeLocation);

        routeLocation.resetOriginalValues();
    }

    /**
     * Caches the route locations in the entity cache if it is enabled.
     *
     * @param routeLocations the route locations
     */
    @Override
    public void cacheResult(List<RouteLocation> routeLocations) {
        for (RouteLocation routeLocation : routeLocations) {
            if (EntityCacheUtil.getResult(
                        RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
                        RouteLocationImpl.class, routeLocation.getPrimaryKey()) == null) {
                cacheResult(routeLocation);
            } else {
                routeLocation.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all route locations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RouteLocationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RouteLocationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the route location.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(RouteLocation routeLocation) {
        EntityCacheUtil.removeResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationImpl.class, routeLocation.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<RouteLocation> routeLocations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (RouteLocation routeLocation : routeLocations) {
            EntityCacheUtil.removeResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
                RouteLocationImpl.class, routeLocation.getPrimaryKey());
        }
    }

    /**
     * Creates a new route location with the primary key. Does not add the route location to the database.
     *
     * @param routePositionId the primary key for the new route location
     * @return the new route location
     */
    @Override
    public RouteLocation create(long routePositionId) {
        RouteLocation routeLocation = new RouteLocationImpl();

        routeLocation.setNew(true);
        routeLocation.setPrimaryKey(routePositionId);

        return routeLocation;
    }

    /**
     * Removes the route location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param routePositionId the primary key of the route location
     * @return the route location that was removed
     * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation remove(long routePositionId)
        throws NoSuchRouteLocationException, SystemException {
        return remove((Serializable) routePositionId);
    }

    /**
     * Removes the route location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the route location
     * @return the route location that was removed
     * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation remove(Serializable primaryKey)
        throws NoSuchRouteLocationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            RouteLocation routeLocation = (RouteLocation) session.get(RouteLocationImpl.class,
                    primaryKey);

            if (routeLocation == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRouteLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(routeLocation);
        } catch (NoSuchRouteLocationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected RouteLocation removeImpl(RouteLocation routeLocation)
        throws SystemException {
        routeLocation = toUnwrappedModel(routeLocation);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(routeLocation)) {
                routeLocation = (RouteLocation) session.get(RouteLocationImpl.class,
                        routeLocation.getPrimaryKeyObj());
            }

            if (routeLocation != null) {
                session.delete(routeLocation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (routeLocation != null) {
            clearCache(routeLocation);
        }

        return routeLocation;
    }

    @Override
    public RouteLocation updateImpl(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws SystemException {
        routeLocation = toUnwrappedModel(routeLocation);

        boolean isNew = routeLocation.isNew();

        RouteLocationModelImpl routeLocationModelImpl = (RouteLocationModelImpl) routeLocation;

        Session session = null;

        try {
            session = openSession();

            if (routeLocation.isNew()) {
                session.save(routeLocation);

                routeLocation.setNew(false);
            } else {
                session.merge(routeLocation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RouteLocationModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((routeLocationModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        routeLocationModelImpl.getOriginalRouteId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID,
                    args);

                args = new Object[] { routeLocationModelImpl.getRouteId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROUTEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROUTEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
            RouteLocationImpl.class, routeLocation.getPrimaryKey(),
            routeLocation);

        return routeLocation;
    }

    protected RouteLocation toUnwrappedModel(RouteLocation routeLocation) {
        if (routeLocation instanceof RouteLocationImpl) {
            return routeLocation;
        }

        RouteLocationImpl routeLocationImpl = new RouteLocationImpl();

        routeLocationImpl.setNew(routeLocation.isNew());
        routeLocationImpl.setPrimaryKey(routeLocation.getPrimaryKey());

        routeLocationImpl.setRoutePositionId(routeLocation.getRoutePositionId());
        routeLocationImpl.setRouteId(routeLocation.getRouteId());
        routeLocationImpl.setLatitude(routeLocation.getLatitude());
        routeLocationImpl.setLongitude(routeLocation.getLongitude());

        return routeLocationImpl;
    }

    /**
     * Returns the route location with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the route location
     * @return the route location
     * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRouteLocationException, SystemException {
        RouteLocation routeLocation = fetchByPrimaryKey(primaryKey);

        if (routeLocation == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRouteLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return routeLocation;
    }

    /**
     * Returns the route location with the primary key or throws a {@link es.eina.tfg.NoSuchRouteLocationException} if it could not be found.
     *
     * @param routePositionId the primary key of the route location
     * @return the route location
     * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation findByPrimaryKey(long routePositionId)
        throws NoSuchRouteLocationException, SystemException {
        return findByPrimaryKey((Serializable) routePositionId);
    }

    /**
     * Returns the route location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the route location
     * @return the route location, or <code>null</code> if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        RouteLocation routeLocation = (RouteLocation) EntityCacheUtil.getResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
                RouteLocationImpl.class, primaryKey);

        if (routeLocation == _nullRouteLocation) {
            return null;
        }

        if (routeLocation == null) {
            Session session = null;

            try {
                session = openSession();

                routeLocation = (RouteLocation) session.get(RouteLocationImpl.class,
                        primaryKey);

                if (routeLocation != null) {
                    cacheResult(routeLocation);
                } else {
                    EntityCacheUtil.putResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
                        RouteLocationImpl.class, primaryKey, _nullRouteLocation);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RouteLocationModelImpl.ENTITY_CACHE_ENABLED,
                    RouteLocationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return routeLocation;
    }

    /**
     * Returns the route location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param routePositionId the primary key of the route location
     * @return the route location, or <code>null</code> if a route location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public RouteLocation fetchByPrimaryKey(long routePositionId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) routePositionId);
    }

    /**
     * Returns all the route locations.
     *
     * @return the route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the route locations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of route locations
     * @param end the upper bound of the range of route locations (not inclusive)
     * @return the range of route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the route locations.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of route locations
     * @param end the upper bound of the range of route locations (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of route locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<RouteLocation> findAll(int start, int end,
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

        List<RouteLocation> list = (List<RouteLocation>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ROUTELOCATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ROUTELOCATION;

                if (pagination) {
                    sql = sql.concat(RouteLocationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<RouteLocation>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<RouteLocation>(list);
                } else {
                    list = (List<RouteLocation>) QueryUtil.list(q,
                            getDialect(), start, end);
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
     * Removes all the route locations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (RouteLocation routeLocation : findAll()) {
            remove(routeLocation);
        }
    }

    /**
     * Returns the number of route locations.
     *
     * @return the number of route locations
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

                Query q = session.createQuery(_SQL_COUNT_ROUTELOCATION);

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
     * Initializes the route location persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.RouteLocation")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<RouteLocation>> listenersList = new ArrayList<ModelListener<RouteLocation>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<RouteLocation>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RouteLocationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

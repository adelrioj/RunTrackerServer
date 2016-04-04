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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchRouteException;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.impl.RouteImpl;
import es.eina.tfg.model.impl.RouteModelImpl;
import es.eina.tfg.service.persistence.RoutePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the route service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RoutePersistence
 * @see RouteUtil
 * @generated
 */
public class RoutePersistenceImpl extends BasePersistenceImpl<Route>
    implements RoutePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RouteUtil} to access the route persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RouteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
            new String[] { Long.class.getName() },
            RouteModelImpl.AUTHORID_COLUMN_BITMASK |
            RouteModelImpl.CREATIONTIME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_AUTHORID_2 = "route.authorId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISPUBLIC = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByisPublic",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISPUBLIC =
        new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, RouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByisPublic",
            new String[] { Boolean.class.getName() },
            RouteModelImpl.ISPUBLIC_COLUMN_BITMASK |
            RouteModelImpl.CREATIONTIME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ISPUBLIC = new FinderPath(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByisPublic",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ISPUBLIC_ISPUBLIC_2 = "route.isPublic = ?";
    private static final String _SQL_SELECT_ROUTE = "SELECT route FROM Route route";
    private static final String _SQL_SELECT_ROUTE_WHERE = "SELECT route FROM Route route WHERE ";
    private static final String _SQL_COUNT_ROUTE = "SELECT COUNT(route) FROM Route route";
    private static final String _SQL_COUNT_ROUTE_WHERE = "SELECT COUNT(route) FROM Route route WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "route.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Route exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Route exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RoutePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Route _nullRoute = new RouteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Route> toCacheModel() {
                return _nullRouteCacheModel;
            }
        };

    private static CacheModel<Route> _nullRouteCacheModel = new CacheModel<Route>() {
            @Override
            public Route toEntityModel() {
                return _nullRoute;
            }
        };

    public RoutePersistenceImpl() {
        setModelClass(Route.class);
    }

    /**
     * Returns all the routes where authorId = &#63;.
     *
     * @param authorId the author ID
     * @return the matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByuserId(long authorId) throws SystemException {
        return findByuserId(authorId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the routes where authorId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param authorId the author ID
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @return the range of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByuserId(long authorId, int start, int end)
        throws SystemException {
        return findByuserId(authorId, start, end, null);
    }

    /**
     * Returns an ordered range of all the routes where authorId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param authorId the author ID
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByuserId(long authorId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { authorId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { authorId, start, end, orderByComparator };
        }

        List<Route> list = (List<Route>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Route route : list) {
                if ((authorId != route.getAuthorId())) {
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

            query.append(_SQL_SELECT_ROUTE_WHERE);

            query.append(_FINDER_COLUMN_USERID_AUTHORID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RouteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(authorId);

                if (!pagination) {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Route>(list);
                } else {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first route in the ordered set where authorId = &#63;.
     *
     * @param authorId the author ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route
     * @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByuserId_First(long authorId,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = fetchByuserId_First(authorId, orderByComparator);

        if (route != null) {
            return route;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("authorId=");
        msg.append(authorId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteException(msg.toString());
    }

    /**
     * Returns the first route in the ordered set where authorId = &#63;.
     *
     * @param authorId the author ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route, or <code>null</code> if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByuserId_First(long authorId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Route> list = findByuserId(authorId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last route in the ordered set where authorId = &#63;.
     *
     * @param authorId the author ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route
     * @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByuserId_Last(long authorId,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = fetchByuserId_Last(authorId, orderByComparator);

        if (route != null) {
            return route;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("authorId=");
        msg.append(authorId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteException(msg.toString());
    }

    /**
     * Returns the last route in the ordered set where authorId = &#63;.
     *
     * @param authorId the author ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route, or <code>null</code> if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByuserId_Last(long authorId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByuserId(authorId);

        if (count == 0) {
            return null;
        }

        List<Route> list = findByuserId(authorId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the routes before and after the current route in the ordered set where authorId = &#63;.
     *
     * @param routeId the primary key of the current route
     * @param authorId the author ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next route
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route[] findByuserId_PrevAndNext(long routeId, long authorId,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = findByPrimaryKey(routeId);

        Session session = null;

        try {
            session = openSession();

            Route[] array = new RouteImpl[3];

            array[0] = getByuserId_PrevAndNext(session, route, authorId,
                    orderByComparator, true);

            array[1] = route;

            array[2] = getByuserId_PrevAndNext(session, route, authorId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Route getByuserId_PrevAndNext(Session session, Route route,
        long authorId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ROUTE_WHERE);

        query.append(_FINDER_COLUMN_USERID_AUTHORID_2);

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
            query.append(RouteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(authorId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(route);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Route> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the routes where authorId = &#63; from the database.
     *
     * @param authorId the author ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByuserId(long authorId) throws SystemException {
        for (Route route : findByuserId(authorId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(route);
        }
    }

    /**
     * Returns the number of routes where authorId = &#63;.
     *
     * @param authorId the author ID
     * @return the number of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByuserId(long authorId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { authorId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ROUTE_WHERE);

            query.append(_FINDER_COLUMN_USERID_AUTHORID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(authorId);

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
     * Returns all the routes where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @return the matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByisPublic(boolean isPublic)
        throws SystemException {
        return findByisPublic(isPublic, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the routes where isPublic = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param isPublic the is public
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @return the range of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByisPublic(boolean isPublic, int start, int end)
        throws SystemException {
        return findByisPublic(isPublic, start, end, null);
    }

    /**
     * Returns an ordered range of all the routes where isPublic = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param isPublic the is public
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findByisPublic(boolean isPublic, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISPUBLIC;
            finderArgs = new Object[] { isPublic };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISPUBLIC;
            finderArgs = new Object[] { isPublic, start, end, orderByComparator };
        }

        List<Route> list = (List<Route>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Route route : list) {
                if ((isPublic != route.getIsPublic())) {
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

            query.append(_SQL_SELECT_ROUTE_WHERE);

            query.append(_FINDER_COLUMN_ISPUBLIC_ISPUBLIC_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RouteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(isPublic);

                if (!pagination) {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Route>(list);
                } else {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first route in the ordered set where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route
     * @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByisPublic_First(boolean isPublic,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = fetchByisPublic_First(isPublic, orderByComparator);

        if (route != null) {
            return route;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isPublic=");
        msg.append(isPublic);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteException(msg.toString());
    }

    /**
     * Returns the first route in the ordered set where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching route, or <code>null</code> if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByisPublic_First(boolean isPublic,
        OrderByComparator orderByComparator) throws SystemException {
        List<Route> list = findByisPublic(isPublic, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last route in the ordered set where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route
     * @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByisPublic_Last(boolean isPublic,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = fetchByisPublic_Last(isPublic, orderByComparator);

        if (route != null) {
            return route;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("isPublic=");
        msg.append(isPublic);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRouteException(msg.toString());
    }

    /**
     * Returns the last route in the ordered set where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching route, or <code>null</code> if a matching route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByisPublic_Last(boolean isPublic,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByisPublic(isPublic);

        if (count == 0) {
            return null;
        }

        List<Route> list = findByisPublic(isPublic, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the routes before and after the current route in the ordered set where isPublic = &#63;.
     *
     * @param routeId the primary key of the current route
     * @param isPublic the is public
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next route
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route[] findByisPublic_PrevAndNext(long routeId, boolean isPublic,
        OrderByComparator orderByComparator)
        throws NoSuchRouteException, SystemException {
        Route route = findByPrimaryKey(routeId);

        Session session = null;

        try {
            session = openSession();

            Route[] array = new RouteImpl[3];

            array[0] = getByisPublic_PrevAndNext(session, route, isPublic,
                    orderByComparator, true);

            array[1] = route;

            array[2] = getByisPublic_PrevAndNext(session, route, isPublic,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Route getByisPublic_PrevAndNext(Session session, Route route,
        boolean isPublic, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ROUTE_WHERE);

        query.append(_FINDER_COLUMN_ISPUBLIC_ISPUBLIC_2);

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
            query.append(RouteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(isPublic);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(route);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Route> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the routes where isPublic = &#63; from the database.
     *
     * @param isPublic the is public
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByisPublic(boolean isPublic) throws SystemException {
        for (Route route : findByisPublic(isPublic, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(route);
        }
    }

    /**
     * Returns the number of routes where isPublic = &#63;.
     *
     * @param isPublic the is public
     * @return the number of matching routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByisPublic(boolean isPublic) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ISPUBLIC;

        Object[] finderArgs = new Object[] { isPublic };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ROUTE_WHERE);

            query.append(_FINDER_COLUMN_ISPUBLIC_ISPUBLIC_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(isPublic);

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
     * Caches the route in the entity cache if it is enabled.
     *
     * @param route the route
     */
    @Override
    public void cacheResult(Route route) {
        EntityCacheUtil.putResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteImpl.class, route.getPrimaryKey(), route);

        route.resetOriginalValues();
    }

    /**
     * Caches the routes in the entity cache if it is enabled.
     *
     * @param routes the routes
     */
    @Override
    public void cacheResult(List<Route> routes) {
        for (Route route : routes) {
            if (EntityCacheUtil.getResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
                        RouteImpl.class, route.getPrimaryKey()) == null) {
                cacheResult(route);
            } else {
                route.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all routes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RouteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RouteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the route.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Route route) {
        EntityCacheUtil.removeResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteImpl.class, route.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Route> routes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Route route : routes) {
            EntityCacheUtil.removeResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
                RouteImpl.class, route.getPrimaryKey());
        }
    }

    /**
     * Creates a new route with the primary key. Does not add the route to the database.
     *
     * @param routeId the primary key for the new route
     * @return the new route
     */
    @Override
    public Route create(long routeId) {
        Route route = new RouteImpl();

        route.setNew(true);
        route.setPrimaryKey(routeId);

        return route;
    }

    /**
     * Removes the route with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param routeId the primary key of the route
     * @return the route that was removed
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route remove(long routeId)
        throws NoSuchRouteException, SystemException {
        return remove((Serializable) routeId);
    }

    /**
     * Removes the route with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the route
     * @return the route that was removed
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route remove(Serializable primaryKey)
        throws NoSuchRouteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Route route = (Route) session.get(RouteImpl.class, primaryKey);

            if (route == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRouteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(route);
        } catch (NoSuchRouteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Route removeImpl(Route route) throws SystemException {
        route = toUnwrappedModel(route);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(route)) {
                route = (Route) session.get(RouteImpl.class,
                        route.getPrimaryKeyObj());
            }

            if (route != null) {
                session.delete(route);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (route != null) {
            clearCache(route);
        }

        return route;
    }

    @Override
    public Route updateImpl(es.eina.tfg.model.Route route)
        throws SystemException {
        route = toUnwrappedModel(route);

        boolean isNew = route.isNew();

        RouteModelImpl routeModelImpl = (RouteModelImpl) route;

        Session session = null;

        try {
            session = openSession();

            if (route.isNew()) {
                session.save(route);

                route.setNew(false);
            } else {
                session.merge(route);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RouteModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((routeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        routeModelImpl.getOriginalAuthorId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { routeModelImpl.getAuthorId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }

            if ((routeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISPUBLIC.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        routeModelImpl.getOriginalIsPublic()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISPUBLIC, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISPUBLIC,
                    args);

                args = new Object[] { routeModelImpl.getIsPublic() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISPUBLIC, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISPUBLIC,
                    args);
            }
        }

        EntityCacheUtil.putResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
            RouteImpl.class, route.getPrimaryKey(), route);

        return route;
    }

    protected Route toUnwrappedModel(Route route) {
        if (route instanceof RouteImpl) {
            return route;
        }

        RouteImpl routeImpl = new RouteImpl();

        routeImpl.setNew(route.isNew());
        routeImpl.setPrimaryKey(route.getPrimaryKey());

        routeImpl.setRouteId(route.getRouteId());
        routeImpl.setType(route.getType());
        routeImpl.setName(route.getName());
        routeImpl.setDescription(route.getDescription());
        routeImpl.setAuthorId(route.getAuthorId());
        routeImpl.setIsPublic(route.isIsPublic());
        routeImpl.setStartingTime(route.getStartingTime());
        routeImpl.setCreationTime(route.getCreationTime());

        return routeImpl;
    }

    /**
     * Returns the route with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the route
     * @return the route
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRouteException, SystemException {
        Route route = fetchByPrimaryKey(primaryKey);

        if (route == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRouteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return route;
    }

    /**
     * Returns the route with the primary key or throws a {@link es.eina.tfg.NoSuchRouteException} if it could not be found.
     *
     * @param routeId the primary key of the route
     * @return the route
     * @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route findByPrimaryKey(long routeId)
        throws NoSuchRouteException, SystemException {
        return findByPrimaryKey((Serializable) routeId);
    }

    /**
     * Returns the route with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the route
     * @return the route, or <code>null</code> if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Route route = (Route) EntityCacheUtil.getResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
                RouteImpl.class, primaryKey);

        if (route == _nullRoute) {
            return null;
        }

        if (route == null) {
            Session session = null;

            try {
                session = openSession();

                route = (Route) session.get(RouteImpl.class, primaryKey);

                if (route != null) {
                    cacheResult(route);
                } else {
                    EntityCacheUtil.putResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
                        RouteImpl.class, primaryKey, _nullRoute);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RouteModelImpl.ENTITY_CACHE_ENABLED,
                    RouteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return route;
    }

    /**
     * Returns the route with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param routeId the primary key of the route
     * @return the route, or <code>null</code> if a route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Route fetchByPrimaryKey(long routeId) throws SystemException {
        return fetchByPrimaryKey((Serializable) routeId);
    }

    /**
     * Returns all the routes.
     *
     * @return the routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the routes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @return the range of routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the routes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of routes
     * @param end the upper bound of the range of routes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Route> findAll(int start, int end,
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

        List<Route> list = (List<Route>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ROUTE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ROUTE;

                if (pagination) {
                    sql = sql.concat(RouteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Route>(list);
                } else {
                    list = (List<Route>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the routes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Route route : findAll()) {
            remove(route);
        }
    }

    /**
     * Returns the number of routes.
     *
     * @return the number of routes
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

                Query q = session.createQuery(_SQL_COUNT_ROUTE);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the route persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Route")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Route>> listenersList = new ArrayList<ModelListener<Route>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Route>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RouteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

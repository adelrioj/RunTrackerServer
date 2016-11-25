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

import es.eina.tfg.NoSuchUserAndRouteException;
import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.model.impl.UserAndRouteImpl;
import es.eina.tfg.model.impl.UserAndRouteModelImpl;
import es.eina.tfg.service.persistence.UserAndRoutePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user and route service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndRoutePersistence
 * @see UserAndRouteUtil
 * @generated
 */
public class UserAndRoutePersistenceImpl extends BasePersistenceImpl<UserAndRoute>
    implements UserAndRoutePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UserAndRouteUtil} to access the user and route persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UserAndRouteImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, UserAndRouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, UserAndRouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, UserAndRouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, UserAndRouteImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
            new String[] { Long.class.getName() },
            UserAndRouteModelImpl.IDUSER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_IDUSER_2 = "userAndRoute.id.idUser = ?";
    private static final String _SQL_SELECT_USERANDROUTE = "SELECT userAndRoute FROM UserAndRoute userAndRoute";
    private static final String _SQL_SELECT_USERANDROUTE_WHERE = "SELECT userAndRoute FROM UserAndRoute userAndRoute WHERE ";
    private static final String _SQL_COUNT_USERANDROUTE = "SELECT COUNT(userAndRoute) FROM UserAndRoute userAndRoute";
    private static final String _SQL_COUNT_USERANDROUTE_WHERE = "SELECT COUNT(userAndRoute) FROM UserAndRoute userAndRoute WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "userAndRoute.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAndRoute exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserAndRoute exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UserAndRoutePersistenceImpl.class);
    private static UserAndRoute _nullUserAndRoute = new UserAndRouteImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UserAndRoute> toCacheModel() {
                return _nullUserAndRouteCacheModel;
            }
        };

    private static CacheModel<UserAndRoute> _nullUserAndRouteCacheModel = new CacheModel<UserAndRoute>() {
            @Override
            public UserAndRoute toEntityModel() {
                return _nullUserAndRoute;
            }
        };

    public UserAndRoutePersistenceImpl() {
        setModelClass(UserAndRoute.class);
    }

    /**
     * Returns all the user and routes where idUser = &#63;.
     *
     * @param idUser the id user
     * @return the matching user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findByuserId(long idUser)
        throws SystemException {
        return findByuserId(idUser, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user and routes where idUser = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idUser the id user
     * @param start the lower bound of the range of user and routes
     * @param end the upper bound of the range of user and routes (not inclusive)
     * @return the range of matching user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findByuserId(long idUser, int start, int end)
        throws SystemException {
        return findByuserId(idUser, start, end, null);
    }

    /**
     * Returns an ordered range of all the user and routes where idUser = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idUser the id user
     * @param start the lower bound of the range of user and routes
     * @param end the upper bound of the range of user and routes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findByuserId(long idUser, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { idUser };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { idUser, start, end, orderByComparator };
        }

        List<UserAndRoute> list = (List<UserAndRoute>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserAndRoute userAndRoute : list) {
                if ((idUser != userAndRoute.getIdUser())) {
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

            query.append(_SQL_SELECT_USERANDROUTE_WHERE);

            query.append(_FINDER_COLUMN_USERID_IDUSER_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserAndRouteModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idUser);

                if (!pagination) {
                    list = (List<UserAndRoute>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndRoute>(list);
                } else {
                    list = (List<UserAndRoute>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first user and route in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and route
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute findByuserId_First(long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndRouteException, SystemException {
        UserAndRoute userAndRoute = fetchByuserId_First(idUser,
                orderByComparator);

        if (userAndRoute != null) {
            return userAndRoute;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idUser=");
        msg.append(idUser);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndRouteException(msg.toString());
    }

    /**
     * Returns the first user and route in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and route, or <code>null</code> if a matching user and route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute fetchByuserId_First(long idUser,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserAndRoute> list = findByuserId(idUser, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last user and route in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and route
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute findByuserId_Last(long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndRouteException, SystemException {
        UserAndRoute userAndRoute = fetchByuserId_Last(idUser, orderByComparator);

        if (userAndRoute != null) {
            return userAndRoute;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idUser=");
        msg.append(idUser);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndRouteException(msg.toString());
    }

    /**
     * Returns the last user and route in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and route, or <code>null</code> if a matching user and route could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute fetchByuserId_Last(long idUser,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByuserId(idUser);

        if (count == 0) {
            return null;
        }

        List<UserAndRoute> list = findByuserId(idUser, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the user and routes before and after the current user and route in the ordered set where idUser = &#63;.
     *
     * @param userAndRoutePK the primary key of the current user and route
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next user and route
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute[] findByuserId_PrevAndNext(
        UserAndRoutePK userAndRoutePK, long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndRouteException, SystemException {
        UserAndRoute userAndRoute = findByPrimaryKey(userAndRoutePK);

        Session session = null;

        try {
            session = openSession();

            UserAndRoute[] array = new UserAndRouteImpl[3];

            array[0] = getByuserId_PrevAndNext(session, userAndRoute, idUser,
                    orderByComparator, true);

            array[1] = userAndRoute;

            array[2] = getByuserId_PrevAndNext(session, userAndRoute, idUser,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserAndRoute getByuserId_PrevAndNext(Session session,
        UserAndRoute userAndRoute, long idUser,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERANDROUTE_WHERE);

        query.append(_FINDER_COLUMN_USERID_IDUSER_2);

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
            query.append(UserAndRouteModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idUser);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userAndRoute);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserAndRoute> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user and routes where idUser = &#63; from the database.
     *
     * @param idUser the id user
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByuserId(long idUser) throws SystemException {
        for (UserAndRoute userAndRoute : findByuserId(idUser,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userAndRoute);
        }
    }

    /**
     * Returns the number of user and routes where idUser = &#63;.
     *
     * @param idUser the id user
     * @return the number of matching user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByuserId(long idUser) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { idUser };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERANDROUTE_WHERE);

            query.append(_FINDER_COLUMN_USERID_IDUSER_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idUser);

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
     * Caches the user and route in the entity cache if it is enabled.
     *
     * @param userAndRoute the user and route
     */
    @Override
    public void cacheResult(UserAndRoute userAndRoute) {
        EntityCacheUtil.putResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteImpl.class, userAndRoute.getPrimaryKey(), userAndRoute);

        userAndRoute.resetOriginalValues();
    }

    /**
     * Caches the user and routes in the entity cache if it is enabled.
     *
     * @param userAndRoutes the user and routes
     */
    @Override
    public void cacheResult(List<UserAndRoute> userAndRoutes) {
        for (UserAndRoute userAndRoute : userAndRoutes) {
            if (EntityCacheUtil.getResult(
                        UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
                        UserAndRouteImpl.class, userAndRoute.getPrimaryKey()) == null) {
                cacheResult(userAndRoute);
            } else {
                userAndRoute.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all user and routes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UserAndRouteImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UserAndRouteImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the user and route.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UserAndRoute userAndRoute) {
        EntityCacheUtil.removeResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteImpl.class, userAndRoute.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UserAndRoute> userAndRoutes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UserAndRoute userAndRoute : userAndRoutes) {
            EntityCacheUtil.removeResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
                UserAndRouteImpl.class, userAndRoute.getPrimaryKey());
        }
    }

    /**
     * Creates a new user and route with the primary key. Does not add the user and route to the database.
     *
     * @param userAndRoutePK the primary key for the new user and route
     * @return the new user and route
     */
    @Override
    public UserAndRoute create(UserAndRoutePK userAndRoutePK) {
        UserAndRoute userAndRoute = new UserAndRouteImpl();

        userAndRoute.setNew(true);
        userAndRoute.setPrimaryKey(userAndRoutePK);

        return userAndRoute;
    }

    /**
     * Removes the user and route with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userAndRoutePK the primary key of the user and route
     * @return the user and route that was removed
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute remove(UserAndRoutePK userAndRoutePK)
        throws NoSuchUserAndRouteException, SystemException {
        return remove((Serializable) userAndRoutePK);
    }

    /**
     * Removes the user and route with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the user and route
     * @return the user and route that was removed
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute remove(Serializable primaryKey)
        throws NoSuchUserAndRouteException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UserAndRoute userAndRoute = (UserAndRoute) session.get(UserAndRouteImpl.class,
                    primaryKey);

            if (userAndRoute == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUserAndRouteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(userAndRoute);
        } catch (NoSuchUserAndRouteException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UserAndRoute removeImpl(UserAndRoute userAndRoute)
        throws SystemException {
        userAndRoute = toUnwrappedModel(userAndRoute);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(userAndRoute)) {
                userAndRoute = (UserAndRoute) session.get(UserAndRouteImpl.class,
                        userAndRoute.getPrimaryKeyObj());
            }

            if (userAndRoute != null) {
                session.delete(userAndRoute);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (userAndRoute != null) {
            clearCache(userAndRoute);
        }

        return userAndRoute;
    }

    @Override
    public UserAndRoute updateImpl(es.eina.tfg.model.UserAndRoute userAndRoute)
        throws SystemException {
        userAndRoute = toUnwrappedModel(userAndRoute);

        boolean isNew = userAndRoute.isNew();

        UserAndRouteModelImpl userAndRouteModelImpl = (UserAndRouteModelImpl) userAndRoute;

        Session session = null;

        try {
            session = openSession();

            if (userAndRoute.isNew()) {
                session.save(userAndRoute);

                userAndRoute.setNew(false);
            } else {
                session.merge(userAndRoute);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !UserAndRouteModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((userAndRouteModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userAndRouteModelImpl.getOriginalIdUser()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { userAndRouteModelImpl.getIdUser() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
            UserAndRouteImpl.class, userAndRoute.getPrimaryKey(), userAndRoute);

        return userAndRoute;
    }

    protected UserAndRoute toUnwrappedModel(UserAndRoute userAndRoute) {
        if (userAndRoute instanceof UserAndRouteImpl) {
            return userAndRoute;
        }

        UserAndRouteImpl userAndRouteImpl = new UserAndRouteImpl();

        userAndRouteImpl.setNew(userAndRoute.isNew());
        userAndRouteImpl.setPrimaryKey(userAndRoute.getPrimaryKey());

        userAndRouteImpl.setIdUser(userAndRoute.getIdUser());
        userAndRouteImpl.setIdRoute(userAndRoute.getIdRoute());

        return userAndRouteImpl;
    }

    /**
     * Returns the user and route with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the user and route
     * @return the user and route
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUserAndRouteException, SystemException {
        UserAndRoute userAndRoute = fetchByPrimaryKey(primaryKey);

        if (userAndRoute == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUserAndRouteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return userAndRoute;
    }

    /**
     * Returns the user and route with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndRouteException} if it could not be found.
     *
     * @param userAndRoutePK the primary key of the user and route
     * @return the user and route
     * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute findByPrimaryKey(UserAndRoutePK userAndRoutePK)
        throws NoSuchUserAndRouteException, SystemException {
        return findByPrimaryKey((Serializable) userAndRoutePK);
    }

    /**
     * Returns the user and route with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the user and route
     * @return the user and route, or <code>null</code> if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UserAndRoute userAndRoute = (UserAndRoute) EntityCacheUtil.getResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
                UserAndRouteImpl.class, primaryKey);

        if (userAndRoute == _nullUserAndRoute) {
            return null;
        }

        if (userAndRoute == null) {
            Session session = null;

            try {
                session = openSession();

                userAndRoute = (UserAndRoute) session.get(UserAndRouteImpl.class,
                        primaryKey);

                if (userAndRoute != null) {
                    cacheResult(userAndRoute);
                } else {
                    EntityCacheUtil.putResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
                        UserAndRouteImpl.class, primaryKey, _nullUserAndRoute);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UserAndRouteModelImpl.ENTITY_CACHE_ENABLED,
                    UserAndRouteImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return userAndRoute;
    }

    /**
     * Returns the user and route with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userAndRoutePK the primary key of the user and route
     * @return the user and route, or <code>null</code> if a user and route with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndRoute fetchByPrimaryKey(UserAndRoutePK userAndRoutePK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) userAndRoutePK);
    }

    /**
     * Returns all the user and routes.
     *
     * @return the user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the user and routes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user and routes
     * @param end the upper bound of the range of user and routes (not inclusive)
     * @return the range of user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the user and routes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of user and routes
     * @param end the upper bound of the range of user and routes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of user and routes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndRoute> findAll(int start, int end,
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

        List<UserAndRoute> list = (List<UserAndRoute>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERANDROUTE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERANDROUTE;

                if (pagination) {
                    sql = sql.concat(UserAndRouteModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UserAndRoute>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndRoute>(list);
                } else {
                    list = (List<UserAndRoute>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the user and routes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UserAndRoute userAndRoute : findAll()) {
            remove(userAndRoute);
        }
    }

    /**
     * Returns the number of user and routes.
     *
     * @return the number of user and routes
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

                Query q = session.createQuery(_SQL_COUNT_USERANDROUTE);

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
     * Initializes the user and route persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.UserAndRoute")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UserAndRoute>> listenersList = new ArrayList<ModelListener<UserAndRoute>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UserAndRoute>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UserAndRouteImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

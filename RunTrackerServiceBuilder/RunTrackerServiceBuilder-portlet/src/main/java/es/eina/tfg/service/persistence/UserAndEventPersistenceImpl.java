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

import es.eina.tfg.NoSuchUserAndEventException;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.model.impl.UserAndEventImpl;
import es.eina.tfg.model.impl.UserAndEventModelImpl;
import es.eina.tfg.service.persistence.UserAndEventPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user and event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndEventPersistence
 * @see UserAndEventUtil
 * @generated
 */
public class UserAndEventPersistenceImpl extends BasePersistenceImpl<UserAndEvent>
    implements UserAndEventPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UserAndEventUtil} to access the user and event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UserAndEventImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
            new String[] { Long.class.getName() },
            UserAndEventModelImpl.IDUSER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_IDUSER_2 = "userAndEvent.id.idUser = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDEVENT = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByidEvent",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDEVENT =
        new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByidEvent",
            new String[] { Long.class.getName() },
            UserAndEventModelImpl.IDEVENT_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_IDEVENT = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByidEvent",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_IDEVENT_IDEVENT_2 = "userAndEvent.id.idEvent = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RACEID = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByraceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID =
        new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByraceId",
            new String[] { Long.class.getName() },
            UserAndEventModelImpl.IDRACE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RACEID = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByraceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_RACEID_IDRACE_2 = "userAndEvent.idRace = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PARTICIPATIONNUMBER =
        new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByparticipationNumber",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTICIPATIONNUMBER =
        new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, UserAndEventImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByparticipationNumber",
            new String[] { Integer.class.getName() },
            UserAndEventModelImpl.PARTICIPATIONNUMBER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PARTICIPATIONNUMBER = new FinderPath(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByparticipationNumber",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_PARTICIPATIONNUMBER_PARTICIPATIONNUMBER_2 =
        "userAndEvent.participationNumber = ?";
    private static final String _SQL_SELECT_USERANDEVENT = "SELECT userAndEvent FROM UserAndEvent userAndEvent";
    private static final String _SQL_SELECT_USERANDEVENT_WHERE = "SELECT userAndEvent FROM UserAndEvent userAndEvent WHERE ";
    private static final String _SQL_COUNT_USERANDEVENT = "SELECT COUNT(userAndEvent) FROM UserAndEvent userAndEvent";
    private static final String _SQL_COUNT_USERANDEVENT_WHERE = "SELECT COUNT(userAndEvent) FROM UserAndEvent userAndEvent WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "userAndEvent.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAndEvent exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserAndEvent exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UserAndEventPersistenceImpl.class);
    private static UserAndEvent _nullUserAndEvent = new UserAndEventImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UserAndEvent> toCacheModel() {
                return _nullUserAndEventCacheModel;
            }
        };

    private static CacheModel<UserAndEvent> _nullUserAndEventCacheModel = new CacheModel<UserAndEvent>() {
            @Override
            public UserAndEvent toEntityModel() {
                return _nullUserAndEvent;
            }
        };

    public UserAndEventPersistenceImpl() {
        setModelClass(UserAndEvent.class);
    }

    /**
     * Returns all the user and events where idUser = &#63;.
     *
     * @param idUser the id user
     * @return the matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndEvent> findByuserId(long idUser)
        throws SystemException {
        return findByuserId(idUser, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<UserAndEvent> findByuserId(long idUser, int start, int end)
        throws SystemException {
        return findByuserId(idUser, start, end, null);
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
    @Override
    public List<UserAndEvent> findByuserId(long idUser, int start, int end,
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

        List<UserAndEvent> list = (List<UserAndEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserAndEvent userAndEvent : list) {
                if ((idUser != userAndEvent.getIdUser())) {
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

            query.append(_SQL_SELECT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_USERID_IDUSER_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idUser);

                if (!pagination) {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndEvent>(list);
                } else {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
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
     * Returns the first user and event in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByuserId_First(long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByuserId_First(idUser,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idUser=");
        msg.append(idUser);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the first user and event in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByuserId_First(long idUser,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserAndEvent> list = findByuserId(idUser, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent findByuserId_Last(long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByuserId_Last(idUser, orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idUser=");
        msg.append(idUser);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the last user and event in the ordered set where idUser = &#63;.
     *
     * @param idUser the id user
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByuserId_Last(long idUser,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByuserId(idUser);

        if (count == 0) {
            return null;
        }

        List<UserAndEvent> list = findByuserId(idUser, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent[] findByuserId_PrevAndNext(
        UserAndEventPK userAndEventPK, long idUser,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = findByPrimaryKey(userAndEventPK);

        Session session = null;

        try {
            session = openSession();

            UserAndEvent[] array = new UserAndEventImpl[3];

            array[0] = getByuserId_PrevAndNext(session, userAndEvent, idUser,
                    orderByComparator, true);

            array[1] = userAndEvent;

            array[2] = getByuserId_PrevAndNext(session, userAndEvent, idUser,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserAndEvent getByuserId_PrevAndNext(Session session,
        UserAndEvent userAndEvent, long idUser,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERANDEVENT_WHERE);

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
            query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idUser);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userAndEvent);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserAndEvent> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user and events where idUser = &#63; from the database.
     *
     * @param idUser the id user
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByuserId(long idUser) throws SystemException {
        for (UserAndEvent userAndEvent : findByuserId(idUser,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userAndEvent);
        }
    }

    /**
     * Returns the number of user and events where idUser = &#63;.
     *
     * @param idUser the id user
     * @return the number of matching user and events
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

            query.append(_SQL_COUNT_USERANDEVENT_WHERE);

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
     * Returns all the user and events where idEvent = &#63;.
     *
     * @param idEvent the id event
     * @return the matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndEvent> findByidEvent(long idEvent)
        throws SystemException {
        return findByidEvent(idEvent, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<UserAndEvent> findByidEvent(long idEvent, int start, int end)
        throws SystemException {
        return findByidEvent(idEvent, start, end, null);
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
    @Override
    public List<UserAndEvent> findByidEvent(long idEvent, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDEVENT;
            finderArgs = new Object[] { idEvent };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDEVENT;
            finderArgs = new Object[] { idEvent, start, end, orderByComparator };
        }

        List<UserAndEvent> list = (List<UserAndEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserAndEvent userAndEvent : list) {
                if ((idEvent != userAndEvent.getIdEvent())) {
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

            query.append(_SQL_SELECT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_IDEVENT_IDEVENT_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idEvent);

                if (!pagination) {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndEvent>(list);
                } else {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
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
     * Returns the first user and event in the ordered set where idEvent = &#63;.
     *
     * @param idEvent the id event
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByidEvent_First(long idEvent,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByidEvent_First(idEvent,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idEvent=");
        msg.append(idEvent);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the first user and event in the ordered set where idEvent = &#63;.
     *
     * @param idEvent the id event
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByidEvent_First(long idEvent,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserAndEvent> list = findByidEvent(idEvent, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent findByidEvent_Last(long idEvent,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByidEvent_Last(idEvent,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idEvent=");
        msg.append(idEvent);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the last user and event in the ordered set where idEvent = &#63;.
     *
     * @param idEvent the id event
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByidEvent_Last(long idEvent,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByidEvent(idEvent);

        if (count == 0) {
            return null;
        }

        List<UserAndEvent> list = findByidEvent(idEvent, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent[] findByidEvent_PrevAndNext(
        UserAndEventPK userAndEventPK, long idEvent,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = findByPrimaryKey(userAndEventPK);

        Session session = null;

        try {
            session = openSession();

            UserAndEvent[] array = new UserAndEventImpl[3];

            array[0] = getByidEvent_PrevAndNext(session, userAndEvent, idEvent,
                    orderByComparator, true);

            array[1] = userAndEvent;

            array[2] = getByidEvent_PrevAndNext(session, userAndEvent, idEvent,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserAndEvent getByidEvent_PrevAndNext(Session session,
        UserAndEvent userAndEvent, long idEvent,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERANDEVENT_WHERE);

        query.append(_FINDER_COLUMN_IDEVENT_IDEVENT_2);

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
            query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idEvent);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userAndEvent);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserAndEvent> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user and events where idEvent = &#63; from the database.
     *
     * @param idEvent the id event
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByidEvent(long idEvent) throws SystemException {
        for (UserAndEvent userAndEvent : findByidEvent(idEvent,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userAndEvent);
        }
    }

    /**
     * Returns the number of user and events where idEvent = &#63;.
     *
     * @param idEvent the id event
     * @return the number of matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByidEvent(long idEvent) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_IDEVENT;

        Object[] finderArgs = new Object[] { idEvent };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_IDEVENT_IDEVENT_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idEvent);

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
     * Returns all the user and events where idRace = &#63;.
     *
     * @param idRace the id race
     * @return the matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndEvent> findByraceId(long idRace)
        throws SystemException {
        return findByraceId(idRace, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<UserAndEvent> findByraceId(long idRace, int start, int end)
        throws SystemException {
        return findByraceId(idRace, start, end, null);
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
    @Override
    public List<UserAndEvent> findByraceId(long idRace, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID;
            finderArgs = new Object[] { idRace };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RACEID;
            finderArgs = new Object[] { idRace, start, end, orderByComparator };
        }

        List<UserAndEvent> list = (List<UserAndEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserAndEvent userAndEvent : list) {
                if ((idRace != userAndEvent.getIdRace())) {
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

            query.append(_SQL_SELECT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_RACEID_IDRACE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idRace);

                if (!pagination) {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndEvent>(list);
                } else {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
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
     * Returns the first user and event in the ordered set where idRace = &#63;.
     *
     * @param idRace the id race
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByraceId_First(long idRace,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByraceId_First(idRace,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idRace=");
        msg.append(idRace);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the first user and event in the ordered set where idRace = &#63;.
     *
     * @param idRace the id race
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByraceId_First(long idRace,
        OrderByComparator orderByComparator) throws SystemException {
        List<UserAndEvent> list = findByraceId(idRace, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent findByraceId_Last(long idRace,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByraceId_Last(idRace, orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idRace=");
        msg.append(idRace);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the last user and event in the ordered set where idRace = &#63;.
     *
     * @param idRace the id race
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByraceId_Last(long idRace,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByraceId(idRace);

        if (count == 0) {
            return null;
        }

        List<UserAndEvent> list = findByraceId(idRace, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent[] findByraceId_PrevAndNext(
        UserAndEventPK userAndEventPK, long idRace,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = findByPrimaryKey(userAndEventPK);

        Session session = null;

        try {
            session = openSession();

            UserAndEvent[] array = new UserAndEventImpl[3];

            array[0] = getByraceId_PrevAndNext(session, userAndEvent, idRace,
                    orderByComparator, true);

            array[1] = userAndEvent;

            array[2] = getByraceId_PrevAndNext(session, userAndEvent, idRace,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserAndEvent getByraceId_PrevAndNext(Session session,
        UserAndEvent userAndEvent, long idRace,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERANDEVENT_WHERE);

        query.append(_FINDER_COLUMN_RACEID_IDRACE_2);

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
            query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idRace);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userAndEvent);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserAndEvent> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user and events where idRace = &#63; from the database.
     *
     * @param idRace the id race
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByraceId(long idRace) throws SystemException {
        for (UserAndEvent userAndEvent : findByraceId(idRace,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userAndEvent);
        }
    }

    /**
     * Returns the number of user and events where idRace = &#63;.
     *
     * @param idRace the id race
     * @return the number of matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByraceId(long idRace) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RACEID;

        Object[] finderArgs = new Object[] { idRace };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_RACEID_IDRACE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idRace);

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
     * Returns all the user and events where participationNumber = &#63;.
     *
     * @param participationNumber the participation number
     * @return the matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndEvent> findByparticipationNumber(int participationNumber)
        throws SystemException {
        return findByparticipationNumber(participationNumber,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<UserAndEvent> findByparticipationNumber(
        int participationNumber, int start, int end) throws SystemException {
        return findByparticipationNumber(participationNumber, start, end, null);
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
    @Override
    public List<UserAndEvent> findByparticipationNumber(
        int participationNumber, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTICIPATIONNUMBER;
            finderArgs = new Object[] { participationNumber };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PARTICIPATIONNUMBER;
            finderArgs = new Object[] {
                    participationNumber,
                    
                    start, end, orderByComparator
                };
        }

        List<UserAndEvent> list = (List<UserAndEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (UserAndEvent userAndEvent : list) {
                if ((participationNumber != userAndEvent.getParticipationNumber())) {
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

            query.append(_SQL_SELECT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_PARTICIPATIONNUMBER_PARTICIPATIONNUMBER_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(participationNumber);

                if (!pagination) {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndEvent>(list);
                } else {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
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
     * Returns the first user and event in the ordered set where participationNumber = &#63;.
     *
     * @param participationNumber the participation number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByparticipationNumber_First(
        int participationNumber, OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByparticipationNumber_First(participationNumber,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("participationNumber=");
        msg.append(participationNumber);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the first user and event in the ordered set where participationNumber = &#63;.
     *
     * @param participationNumber the participation number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByparticipationNumber_First(
        int participationNumber, OrderByComparator orderByComparator)
        throws SystemException {
        List<UserAndEvent> list = findByparticipationNumber(participationNumber,
                0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent findByparticipationNumber_Last(
        int participationNumber, OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByparticipationNumber_Last(participationNumber,
                orderByComparator);

        if (userAndEvent != null) {
            return userAndEvent;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("participationNumber=");
        msg.append(participationNumber);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchUserAndEventException(msg.toString());
    }

    /**
     * Returns the last user and event in the ordered set where participationNumber = &#63;.
     *
     * @param participationNumber the participation number
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching user and event, or <code>null</code> if a matching user and event could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByparticipationNumber_Last(
        int participationNumber, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByparticipationNumber(participationNumber);

        if (count == 0) {
            return null;
        }

        List<UserAndEvent> list = findByparticipationNumber(participationNumber,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public UserAndEvent[] findByparticipationNumber_PrevAndNext(
        UserAndEventPK userAndEventPK, int participationNumber,
        OrderByComparator orderByComparator)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = findByPrimaryKey(userAndEventPK);

        Session session = null;

        try {
            session = openSession();

            UserAndEvent[] array = new UserAndEventImpl[3];

            array[0] = getByparticipationNumber_PrevAndNext(session,
                    userAndEvent, participationNumber, orderByComparator, true);

            array[1] = userAndEvent;

            array[2] = getByparticipationNumber_PrevAndNext(session,
                    userAndEvent, participationNumber, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected UserAndEvent getByparticipationNumber_PrevAndNext(
        Session session, UserAndEvent userAndEvent, int participationNumber,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_USERANDEVENT_WHERE);

        query.append(_FINDER_COLUMN_PARTICIPATIONNUMBER_PARTICIPATIONNUMBER_2);

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
            query.append(UserAndEventModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(participationNumber);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(userAndEvent);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<UserAndEvent> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the user and events where participationNumber = &#63; from the database.
     *
     * @param participationNumber the participation number
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByparticipationNumber(int participationNumber)
        throws SystemException {
        for (UserAndEvent userAndEvent : findByparticipationNumber(
                participationNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(userAndEvent);
        }
    }

    /**
     * Returns the number of user and events where participationNumber = &#63;.
     *
     * @param participationNumber the participation number
     * @return the number of matching user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByparticipationNumber(int participationNumber)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_PARTICIPATIONNUMBER;

        Object[] finderArgs = new Object[] { participationNumber };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_USERANDEVENT_WHERE);

            query.append(_FINDER_COLUMN_PARTICIPATIONNUMBER_PARTICIPATIONNUMBER_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(participationNumber);

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
     * Caches the user and event in the entity cache if it is enabled.
     *
     * @param userAndEvent the user and event
     */
    @Override
    public void cacheResult(UserAndEvent userAndEvent) {
        EntityCacheUtil.putResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventImpl.class, userAndEvent.getPrimaryKey(), userAndEvent);

        userAndEvent.resetOriginalValues();
    }

    /**
     * Caches the user and events in the entity cache if it is enabled.
     *
     * @param userAndEvents the user and events
     */
    @Override
    public void cacheResult(List<UserAndEvent> userAndEvents) {
        for (UserAndEvent userAndEvent : userAndEvents) {
            if (EntityCacheUtil.getResult(
                        UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
                        UserAndEventImpl.class, userAndEvent.getPrimaryKey()) == null) {
                cacheResult(userAndEvent);
            } else {
                userAndEvent.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all user and events.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UserAndEventImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UserAndEventImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the user and event.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UserAndEvent userAndEvent) {
        EntityCacheUtil.removeResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventImpl.class, userAndEvent.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UserAndEvent> userAndEvents) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UserAndEvent userAndEvent : userAndEvents) {
            EntityCacheUtil.removeResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
                UserAndEventImpl.class, userAndEvent.getPrimaryKey());
        }
    }

    /**
     * Creates a new user and event with the primary key. Does not add the user and event to the database.
     *
     * @param userAndEventPK the primary key for the new user and event
     * @return the new user and event
     */
    @Override
    public UserAndEvent create(UserAndEventPK userAndEventPK) {
        UserAndEvent userAndEvent = new UserAndEventImpl();

        userAndEvent.setNew(true);
        userAndEvent.setPrimaryKey(userAndEventPK);

        return userAndEvent;
    }

    /**
     * Removes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userAndEventPK the primary key of the user and event
     * @return the user and event that was removed
     * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent remove(UserAndEventPK userAndEventPK)
        throws NoSuchUserAndEventException, SystemException {
        return remove((Serializable) userAndEventPK);
    }

    /**
     * Removes the user and event with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the user and event
     * @return the user and event that was removed
     * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent remove(Serializable primaryKey)
        throws NoSuchUserAndEventException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UserAndEvent userAndEvent = (UserAndEvent) session.get(UserAndEventImpl.class,
                    primaryKey);

            if (userAndEvent == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUserAndEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(userAndEvent);
        } catch (NoSuchUserAndEventException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UserAndEvent removeImpl(UserAndEvent userAndEvent)
        throws SystemException {
        userAndEvent = toUnwrappedModel(userAndEvent);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(userAndEvent)) {
                userAndEvent = (UserAndEvent) session.get(UserAndEventImpl.class,
                        userAndEvent.getPrimaryKeyObj());
            }

            if (userAndEvent != null) {
                session.delete(userAndEvent);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (userAndEvent != null) {
            clearCache(userAndEvent);
        }

        return userAndEvent;
    }

    @Override
    public UserAndEvent updateImpl(es.eina.tfg.model.UserAndEvent userAndEvent)
        throws SystemException {
        userAndEvent = toUnwrappedModel(userAndEvent);

        boolean isNew = userAndEvent.isNew();

        UserAndEventModelImpl userAndEventModelImpl = (UserAndEventModelImpl) userAndEvent;

        Session session = null;

        try {
            session = openSession();

            if (userAndEvent.isNew()) {
                session.save(userAndEvent);

                userAndEvent.setNew(false);
            } else {
                session.merge(userAndEvent);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !UserAndEventModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((userAndEventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userAndEventModelImpl.getOriginalIdUser()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { userAndEventModelImpl.getIdUser() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }

            if ((userAndEventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDEVENT.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userAndEventModelImpl.getOriginalIdEvent()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDEVENT, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDEVENT,
                    args);

                args = new Object[] { userAndEventModelImpl.getIdEvent() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDEVENT, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDEVENT,
                    args);
            }

            if ((userAndEventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userAndEventModelImpl.getOriginalIdRace()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RACEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID,
                    args);

                args = new Object[] { userAndEventModelImpl.getIdRace() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RACEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID,
                    args);
            }

            if ((userAndEventModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTICIPATIONNUMBER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        userAndEventModelImpl.getOriginalParticipationNumber()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTICIPATIONNUMBER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTICIPATIONNUMBER,
                    args);

                args = new Object[] {
                        userAndEventModelImpl.getParticipationNumber()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PARTICIPATIONNUMBER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PARTICIPATIONNUMBER,
                    args);
            }
        }

        EntityCacheUtil.putResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
            UserAndEventImpl.class, userAndEvent.getPrimaryKey(), userAndEvent);

        return userAndEvent;
    }

    protected UserAndEvent toUnwrappedModel(UserAndEvent userAndEvent) {
        if (userAndEvent instanceof UserAndEventImpl) {
            return userAndEvent;
        }

        UserAndEventImpl userAndEventImpl = new UserAndEventImpl();

        userAndEventImpl.setNew(userAndEvent.isNew());
        userAndEventImpl.setPrimaryKey(userAndEvent.getPrimaryKey());

        userAndEventImpl.setIdUser(userAndEvent.getIdUser());
        userAndEventImpl.setIdEvent(userAndEvent.getIdEvent());
        userAndEventImpl.setIdRace(userAndEvent.getIdRace());
        userAndEventImpl.setParticipationNumber(userAndEvent.getParticipationNumber());

        return userAndEventImpl;
    }

    /**
     * Returns the user and event with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the user and event
     * @return the user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUserAndEventException, SystemException {
        UserAndEvent userAndEvent = fetchByPrimaryKey(primaryKey);

        if (userAndEvent == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUserAndEventException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return userAndEvent;
    }

    /**
     * Returns the user and event with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndEventException} if it could not be found.
     *
     * @param userAndEventPK the primary key of the user and event
     * @return the user and event
     * @throws es.eina.tfg.NoSuchUserAndEventException if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent findByPrimaryKey(UserAndEventPK userAndEventPK)
        throws NoSuchUserAndEventException, SystemException {
        return findByPrimaryKey((Serializable) userAndEventPK);
    }

    /**
     * Returns the user and event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the user and event
     * @return the user and event, or <code>null</code> if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UserAndEvent userAndEvent = (UserAndEvent) EntityCacheUtil.getResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
                UserAndEventImpl.class, primaryKey);

        if (userAndEvent == _nullUserAndEvent) {
            return null;
        }

        if (userAndEvent == null) {
            Session session = null;

            try {
                session = openSession();

                userAndEvent = (UserAndEvent) session.get(UserAndEventImpl.class,
                        primaryKey);

                if (userAndEvent != null) {
                    cacheResult(userAndEvent);
                } else {
                    EntityCacheUtil.putResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
                        UserAndEventImpl.class, primaryKey, _nullUserAndEvent);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UserAndEventModelImpl.ENTITY_CACHE_ENABLED,
                    UserAndEventImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return userAndEvent;
    }

    /**
     * Returns the user and event with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userAndEventPK the primary key of the user and event
     * @return the user and event, or <code>null</code> if a user and event with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UserAndEvent fetchByPrimaryKey(UserAndEventPK userAndEventPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) userAndEventPK);
    }

    /**
     * Returns all the user and events.
     *
     * @return the user and events
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UserAndEvent> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<UserAndEvent> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<UserAndEvent> findAll(int start, int end,
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

        List<UserAndEvent> list = (List<UserAndEvent>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERANDEVENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERANDEVENT;

                if (pagination) {
                    sql = sql.concat(UserAndEventModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UserAndEvent>(list);
                } else {
                    list = (List<UserAndEvent>) QueryUtil.list(q, getDialect(),
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
     * Removes all the user and events from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UserAndEvent userAndEvent : findAll()) {
            remove(userAndEvent);
        }
    }

    /**
     * Returns the number of user and events.
     *
     * @return the number of user and events
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

                Query q = session.createQuery(_SQL_COUNT_USERANDEVENT);

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
     * Initializes the user and event persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.UserAndEvent")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UserAndEvent>> listenersList = new ArrayList<ModelListener<UserAndEvent>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UserAndEvent>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UserAndEventImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

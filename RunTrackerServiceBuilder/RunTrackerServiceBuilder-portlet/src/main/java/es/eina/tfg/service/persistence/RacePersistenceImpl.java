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

import es.eina.tfg.NoSuchRaceException;
import es.eina.tfg.model.Race;
import es.eina.tfg.model.impl.RaceImpl;
import es.eina.tfg.model.impl.RaceModelImpl;
import es.eina.tfg.service.persistence.RacePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the race service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RacePersistence
 * @see RaceUtil
 * @generated
 */
public class RacePersistenceImpl extends BasePersistenceImpl<Race>
    implements RacePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RaceUtil} to access the race persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RaceImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, RaceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, RaceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, RaceImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
        new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, RaceImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
            new String[] { Long.class.getName() },
            RaceModelImpl.USERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USERID_USERID_2 = "race.userId = ?";
    private static final String _SQL_SELECT_RACE = "SELECT race FROM Race race";
    private static final String _SQL_SELECT_RACE_WHERE = "SELECT race FROM Race race WHERE ";
    private static final String _SQL_COUNT_RACE = "SELECT COUNT(race) FROM Race race";
    private static final String _SQL_COUNT_RACE_WHERE = "SELECT COUNT(race) FROM Race race WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "race.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Race exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Race exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RacePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Race _nullRace = new RaceImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Race> toCacheModel() {
                return _nullRaceCacheModel;
            }
        };

    private static CacheModel<Race> _nullRaceCacheModel = new CacheModel<Race>() {
            @Override
            public Race toEntityModel() {
                return _nullRace;
            }
        };

    public RacePersistenceImpl() {
        setModelClass(Race.class);
    }

    /**
     * Returns all the races where userId = &#63;.
     *
     * @param userId the user ID
     * @return the matching races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findByuserId(long userId) throws SystemException {
        return findByuserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the races where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of races
     * @param end the upper bound of the range of races (not inclusive)
     * @return the range of matching races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findByuserId(long userId, int start, int end)
        throws SystemException {
        return findByuserId(userId, start, end, null);
    }

    /**
     * Returns an ordered range of all the races where userId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param userId the user ID
     * @param start the lower bound of the range of races
     * @param end the upper bound of the range of races (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findByuserId(long userId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
            finderArgs = new Object[] { userId, start, end, orderByComparator };
        }

        List<Race> list = (List<Race>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Race race : list) {
                if ((userId != race.getUserId())) {
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

            query.append(_SQL_SELECT_RACE_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(RaceModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

                if (!pagination) {
                    list = (List<Race>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Race>(list);
                } else {
                    list = (List<Race>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first race in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching race
     * @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race findByuserId_First(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchRaceException, SystemException {
        Race race = fetchByuserId_First(userId, orderByComparator);

        if (race != null) {
            return race;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRaceException(msg.toString());
    }

    /**
     * Returns the first race in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching race, or <code>null</code> if a matching race could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race fetchByuserId_First(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Race> list = findByuserId(userId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last race in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching race
     * @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race findByuserId_Last(long userId,
        OrderByComparator orderByComparator)
        throws NoSuchRaceException, SystemException {
        Race race = fetchByuserId_Last(userId, orderByComparator);

        if (race != null) {
            return race;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("userId=");
        msg.append(userId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchRaceException(msg.toString());
    }

    /**
     * Returns the last race in the ordered set where userId = &#63;.
     *
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching race, or <code>null</code> if a matching race could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race fetchByuserId_Last(long userId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByuserId(userId);

        if (count == 0) {
            return null;
        }

        List<Race> list = findByuserId(userId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the races before and after the current race in the ordered set where userId = &#63;.
     *
     * @param raceId the primary key of the current race
     * @param userId the user ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next race
     * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race[] findByuserId_PrevAndNext(long raceId, long userId,
        OrderByComparator orderByComparator)
        throws NoSuchRaceException, SystemException {
        Race race = findByPrimaryKey(raceId);

        Session session = null;

        try {
            session = openSession();

            Race[] array = new RaceImpl[3];

            array[0] = getByuserId_PrevAndNext(session, race, userId,
                    orderByComparator, true);

            array[1] = race;

            array[2] = getByuserId_PrevAndNext(session, race, userId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Race getByuserId_PrevAndNext(Session session, Race race,
        long userId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_RACE_WHERE);

        query.append(_FINDER_COLUMN_USERID_USERID_2);

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
            query.append(RaceModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(userId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(race);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Race> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the races where userId = &#63; from the database.
     *
     * @param userId the user ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByuserId(long userId) throws SystemException {
        for (Race race : findByuserId(userId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(race);
        }
    }

    /**
     * Returns the number of races where userId = &#63;.
     *
     * @param userId the user ID
     * @return the number of matching races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByuserId(long userId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

        Object[] finderArgs = new Object[] { userId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_RACE_WHERE);

            query.append(_FINDER_COLUMN_USERID_USERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(userId);

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
     * Caches the race in the entity cache if it is enabled.
     *
     * @param race the race
     */
    @Override
    public void cacheResult(Race race) {
        EntityCacheUtil.putResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceImpl.class, race.getPrimaryKey(), race);

        race.resetOriginalValues();
    }

    /**
     * Caches the races in the entity cache if it is enabled.
     *
     * @param races the races
     */
    @Override
    public void cacheResult(List<Race> races) {
        for (Race race : races) {
            if (EntityCacheUtil.getResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
                        RaceImpl.class, race.getPrimaryKey()) == null) {
                cacheResult(race);
            } else {
                race.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all races.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RaceImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RaceImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the race.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Race race) {
        EntityCacheUtil.removeResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceImpl.class, race.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Race> races) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Race race : races) {
            EntityCacheUtil.removeResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
                RaceImpl.class, race.getPrimaryKey());
        }
    }

    /**
     * Creates a new race with the primary key. Does not add the race to the database.
     *
     * @param raceId the primary key for the new race
     * @return the new race
     */
    @Override
    public Race create(long raceId) {
        Race race = new RaceImpl();

        race.setNew(true);
        race.setPrimaryKey(raceId);

        return race;
    }

    /**
     * Removes the race with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param raceId the primary key of the race
     * @return the race that was removed
     * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race remove(long raceId) throws NoSuchRaceException, SystemException {
        return remove((Serializable) raceId);
    }

    /**
     * Removes the race with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the race
     * @return the race that was removed
     * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race remove(Serializable primaryKey)
        throws NoSuchRaceException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Race race = (Race) session.get(RaceImpl.class, primaryKey);

            if (race == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRaceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(race);
        } catch (NoSuchRaceException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Race removeImpl(Race race) throws SystemException {
        race = toUnwrappedModel(race);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(race)) {
                race = (Race) session.get(RaceImpl.class,
                        race.getPrimaryKeyObj());
            }

            if (race != null) {
                session.delete(race);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (race != null) {
            clearCache(race);
        }

        return race;
    }

    @Override
    public Race updateImpl(es.eina.tfg.model.Race race)
        throws SystemException {
        race = toUnwrappedModel(race);

        boolean isNew = race.isNew();

        RaceModelImpl raceModelImpl = (RaceModelImpl) race;

        Session session = null;

        try {
            session = openSession();

            if (race.isNew()) {
                session.save(race);

                race.setNew(false);
            } else {
                session.merge(race);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !RaceModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((raceModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { raceModelImpl.getOriginalUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);

                args = new Object[] { raceModelImpl.getUserId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
                    args);
            }
        }

        EntityCacheUtil.putResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
            RaceImpl.class, race.getPrimaryKey(), race);

        return race;
    }

    protected Race toUnwrappedModel(Race race) {
        if (race instanceof RaceImpl) {
            return race;
        }

        RaceImpl raceImpl = new RaceImpl();

        raceImpl.setNew(race.isNew());
        raceImpl.setPrimaryKey(race.getPrimaryKey());

        raceImpl.setRaceId(race.getRaceId());
        raceImpl.setUserId(race.getUserId());
        raceImpl.setRouteId(race.getRouteId());
        raceImpl.setType(race.getType());
        raceImpl.setUserHeight(race.getUserHeight());
        raceImpl.setUserWeight(race.getUserWeight());

        return raceImpl;
    }

    /**
     * Returns the race with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the race
     * @return the race
     * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRaceException, SystemException {
        Race race = fetchByPrimaryKey(primaryKey);

        if (race == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRaceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return race;
    }

    /**
     * Returns the race with the primary key or throws a {@link es.eina.tfg.NoSuchRaceException} if it could not be found.
     *
     * @param raceId the primary key of the race
     * @return the race
     * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race findByPrimaryKey(long raceId)
        throws NoSuchRaceException, SystemException {
        return findByPrimaryKey((Serializable) raceId);
    }

    /**
     * Returns the race with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the race
     * @return the race, or <code>null</code> if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Race race = (Race) EntityCacheUtil.getResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
                RaceImpl.class, primaryKey);

        if (race == _nullRace) {
            return null;
        }

        if (race == null) {
            Session session = null;

            try {
                session = openSession();

                race = (Race) session.get(RaceImpl.class, primaryKey);

                if (race != null) {
                    cacheResult(race);
                } else {
                    EntityCacheUtil.putResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
                        RaceImpl.class, primaryKey, _nullRace);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RaceModelImpl.ENTITY_CACHE_ENABLED,
                    RaceImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return race;
    }

    /**
     * Returns the race with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param raceId the primary key of the race
     * @return the race, or <code>null</code> if a race with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Race fetchByPrimaryKey(long raceId) throws SystemException {
        return fetchByPrimaryKey((Serializable) raceId);
    }

    /**
     * Returns all the races.
     *
     * @return the races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the races.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of races
     * @param end the upper bound of the range of races (not inclusive)
     * @return the range of races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the races.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of races
     * @param end the upper bound of the range of races (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of races
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Race> findAll(int start, int end,
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

        List<Race> list = (List<Race>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RACE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RACE;

                if (pagination) {
                    sql = sql.concat(RaceModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Race>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Race>(list);
                } else {
                    list = (List<Race>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the races from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Race race : findAll()) {
            remove(race);
        }
    }

    /**
     * Returns the number of races.
     *
     * @return the number of races
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

                Query q = session.createQuery(_SQL_COUNT_RACE);

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
     * Initializes the race persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Race")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Race>> listenersList = new ArrayList<ModelListener<Race>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Race>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RaceImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

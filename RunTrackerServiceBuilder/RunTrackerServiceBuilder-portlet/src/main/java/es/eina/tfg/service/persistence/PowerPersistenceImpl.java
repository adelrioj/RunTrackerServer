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

import es.eina.tfg.NoSuchPowerException;
import es.eina.tfg.model.Power;
import es.eina.tfg.model.impl.PowerImpl;
import es.eina.tfg.model.impl.PowerModelImpl;
import es.eina.tfg.service.persistence.PowerPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the power service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see PowerPersistence
 * @see PowerUtil
 * @generated
 */
public class PowerPersistenceImpl extends BasePersistenceImpl<Power>
    implements PowerPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PowerUtil} to access the power persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PowerImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, PowerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, PowerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RACEID = new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, PowerImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByraceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID =
        new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, PowerImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByraceId",
            new String[] { Long.class.getName() },
            PowerModelImpl.RACEID_COLUMN_BITMASK |
            PowerModelImpl.TIME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_RACEID = new FinderPath(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByraceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_RACEID_RACEID_2 = "power.raceId = ?";
    private static final String _SQL_SELECT_POWER = "SELECT power FROM Power power";
    private static final String _SQL_SELECT_POWER_WHERE = "SELECT power FROM Power power WHERE ";
    private static final String _SQL_COUNT_POWER = "SELECT COUNT(power) FROM Power power";
    private static final String _SQL_COUNT_POWER_WHERE = "SELECT COUNT(power) FROM Power power WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "power.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Power exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Power exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PowerPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "time"
            });
    private static Power _nullPower = new PowerImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Power> toCacheModel() {
                return _nullPowerCacheModel;
            }
        };

    private static CacheModel<Power> _nullPowerCacheModel = new CacheModel<Power>() {
            @Override
            public Power toEntityModel() {
                return _nullPower;
            }
        };

    public PowerPersistenceImpl() {
        setModelClass(Power.class);
    }

    /**
     * Returns all the powers where raceId = &#63;.
     *
     * @param raceId the race ID
     * @return the matching powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findByraceId(long raceId) throws SystemException {
        return findByraceId(raceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the powers where raceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param raceId the race ID
     * @param start the lower bound of the range of powers
     * @param end the upper bound of the range of powers (not inclusive)
     * @return the range of matching powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findByraceId(long raceId, int start, int end)
        throws SystemException {
        return findByraceId(raceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the powers where raceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param raceId the race ID
     * @param start the lower bound of the range of powers
     * @param end the upper bound of the range of powers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findByraceId(long raceId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID;
            finderArgs = new Object[] { raceId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RACEID;
            finderArgs = new Object[] { raceId, start, end, orderByComparator };
        }

        List<Power> list = (List<Power>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Power power : list) {
                if ((raceId != power.getRaceId())) {
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

            query.append(_SQL_SELECT_POWER_WHERE);

            query.append(_FINDER_COLUMN_RACEID_RACEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PowerModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(raceId);

                if (!pagination) {
                    list = (List<Power>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Power>(list);
                } else {
                    list = (List<Power>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first power in the ordered set where raceId = &#63;.
     *
     * @param raceId the race ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching power
     * @throws es.eina.tfg.NoSuchPowerException if a matching power could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power findByraceId_First(long raceId,
        OrderByComparator orderByComparator)
        throws NoSuchPowerException, SystemException {
        Power power = fetchByraceId_First(raceId, orderByComparator);

        if (power != null) {
            return power;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("raceId=");
        msg.append(raceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPowerException(msg.toString());
    }

    /**
     * Returns the first power in the ordered set where raceId = &#63;.
     *
     * @param raceId the race ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching power, or <code>null</code> if a matching power could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power fetchByraceId_First(long raceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Power> list = findByraceId(raceId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last power in the ordered set where raceId = &#63;.
     *
     * @param raceId the race ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching power
     * @throws es.eina.tfg.NoSuchPowerException if a matching power could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power findByraceId_Last(long raceId,
        OrderByComparator orderByComparator)
        throws NoSuchPowerException, SystemException {
        Power power = fetchByraceId_Last(raceId, orderByComparator);

        if (power != null) {
            return power;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("raceId=");
        msg.append(raceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPowerException(msg.toString());
    }

    /**
     * Returns the last power in the ordered set where raceId = &#63;.
     *
     * @param raceId the race ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching power, or <code>null</code> if a matching power could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power fetchByraceId_Last(long raceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByraceId(raceId);

        if (count == 0) {
            return null;
        }

        List<Power> list = findByraceId(raceId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the powers before and after the current power in the ordered set where raceId = &#63;.
     *
     * @param measurementId the primary key of the current power
     * @param raceId the race ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next power
     * @throws es.eina.tfg.NoSuchPowerException if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power[] findByraceId_PrevAndNext(long measurementId, long raceId,
        OrderByComparator orderByComparator)
        throws NoSuchPowerException, SystemException {
        Power power = findByPrimaryKey(measurementId);

        Session session = null;

        try {
            session = openSession();

            Power[] array = new PowerImpl[3];

            array[0] = getByraceId_PrevAndNext(session, power, raceId,
                    orderByComparator, true);

            array[1] = power;

            array[2] = getByraceId_PrevAndNext(session, power, raceId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Power getByraceId_PrevAndNext(Session session, Power power,
        long raceId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POWER_WHERE);

        query.append(_FINDER_COLUMN_RACEID_RACEID_2);

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
            query.append(PowerModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(raceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(power);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Power> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the powers where raceId = &#63; from the database.
     *
     * @param raceId the race ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByraceId(long raceId) throws SystemException {
        for (Power power : findByraceId(raceId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(power);
        }
    }

    /**
     * Returns the number of powers where raceId = &#63;.
     *
     * @param raceId the race ID
     * @return the number of matching powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByraceId(long raceId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_RACEID;

        Object[] finderArgs = new Object[] { raceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_POWER_WHERE);

            query.append(_FINDER_COLUMN_RACEID_RACEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(raceId);

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
     * Caches the power in the entity cache if it is enabled.
     *
     * @param power the power
     */
    @Override
    public void cacheResult(Power power) {
        EntityCacheUtil.putResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerImpl.class, power.getPrimaryKey(), power);

        power.resetOriginalValues();
    }

    /**
     * Caches the powers in the entity cache if it is enabled.
     *
     * @param powers the powers
     */
    @Override
    public void cacheResult(List<Power> powers) {
        for (Power power : powers) {
            if (EntityCacheUtil.getResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
                        PowerImpl.class, power.getPrimaryKey()) == null) {
                cacheResult(power);
            } else {
                power.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all powers.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PowerImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PowerImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the power.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Power power) {
        EntityCacheUtil.removeResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerImpl.class, power.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Power> powers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Power power : powers) {
            EntityCacheUtil.removeResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
                PowerImpl.class, power.getPrimaryKey());
        }
    }

    /**
     * Creates a new power with the primary key. Does not add the power to the database.
     *
     * @param measurementId the primary key for the new power
     * @return the new power
     */
    @Override
    public Power create(long measurementId) {
        Power power = new PowerImpl();

        power.setNew(true);
        power.setPrimaryKey(measurementId);

        return power;
    }

    /**
     * Removes the power with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param measurementId the primary key of the power
     * @return the power that was removed
     * @throws es.eina.tfg.NoSuchPowerException if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power remove(long measurementId)
        throws NoSuchPowerException, SystemException {
        return remove((Serializable) measurementId);
    }

    /**
     * Removes the power with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the power
     * @return the power that was removed
     * @throws es.eina.tfg.NoSuchPowerException if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power remove(Serializable primaryKey)
        throws NoSuchPowerException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Power power = (Power) session.get(PowerImpl.class, primaryKey);

            if (power == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPowerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(power);
        } catch (NoSuchPowerException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Power removeImpl(Power power) throws SystemException {
        power = toUnwrappedModel(power);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(power)) {
                power = (Power) session.get(PowerImpl.class,
                        power.getPrimaryKeyObj());
            }

            if (power != null) {
                session.delete(power);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (power != null) {
            clearCache(power);
        }

        return power;
    }

    @Override
    public Power updateImpl(es.eina.tfg.model.Power power)
        throws SystemException {
        power = toUnwrappedModel(power);

        boolean isNew = power.isNew();

        PowerModelImpl powerModelImpl = (PowerModelImpl) power;

        Session session = null;

        try {
            session = openSession();

            if (power.isNew()) {
                session.save(power);

                power.setNew(false);
            } else {
                session.merge(power);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PowerModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((powerModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { powerModelImpl.getOriginalRaceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RACEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID,
                    args);

                args = new Object[] { powerModelImpl.getRaceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RACEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RACEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
            PowerImpl.class, power.getPrimaryKey(), power);

        return power;
    }

    protected Power toUnwrappedModel(Power power) {
        if (power instanceof PowerImpl) {
            return power;
        }

        PowerImpl powerImpl = new PowerImpl();

        powerImpl.setNew(power.isNew());
        powerImpl.setPrimaryKey(power.getPrimaryKey());

        powerImpl.setMeasurementId(power.getMeasurementId());
        powerImpl.setRaceId(power.getRaceId());
        powerImpl.setUserId(power.getUserId());
        powerImpl.setDeviceId(power.getDeviceId());
        powerImpl.setSensorId(power.getSensorId());
        powerImpl.setTime(power.getTime());
        powerImpl.setSensorMode(power.getSensorMode());
        powerImpl.setLevel(power.getLevel());

        return powerImpl;
    }

    /**
     * Returns the power with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the power
     * @return the power
     * @throws es.eina.tfg.NoSuchPowerException if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPowerException, SystemException {
        Power power = fetchByPrimaryKey(primaryKey);

        if (power == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPowerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return power;
    }

    /**
     * Returns the power with the primary key or throws a {@link es.eina.tfg.NoSuchPowerException} if it could not be found.
     *
     * @param measurementId the primary key of the power
     * @return the power
     * @throws es.eina.tfg.NoSuchPowerException if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power findByPrimaryKey(long measurementId)
        throws NoSuchPowerException, SystemException {
        return findByPrimaryKey((Serializable) measurementId);
    }

    /**
     * Returns the power with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the power
     * @return the power, or <code>null</code> if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Power power = (Power) EntityCacheUtil.getResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
                PowerImpl.class, primaryKey);

        if (power == _nullPower) {
            return null;
        }

        if (power == null) {
            Session session = null;

            try {
                session = openSession();

                power = (Power) session.get(PowerImpl.class, primaryKey);

                if (power != null) {
                    cacheResult(power);
                } else {
                    EntityCacheUtil.putResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
                        PowerImpl.class, primaryKey, _nullPower);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PowerModelImpl.ENTITY_CACHE_ENABLED,
                    PowerImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return power;
    }

    /**
     * Returns the power with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param measurementId the primary key of the power
     * @return the power, or <code>null</code> if a power with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Power fetchByPrimaryKey(long measurementId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) measurementId);
    }

    /**
     * Returns all the powers.
     *
     * @return the powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the powers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of powers
     * @param end the upper bound of the range of powers (not inclusive)
     * @return the range of powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the powers.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of powers
     * @param end the upper bound of the range of powers (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of powers
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Power> findAll(int start, int end,
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

        List<Power> list = (List<Power>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POWER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POWER;

                if (pagination) {
                    sql = sql.concat(PowerModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Power>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Power>(list);
                } else {
                    list = (List<Power>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the powers from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Power power : findAll()) {
            remove(power);
        }
    }

    /**
     * Returns the number of powers.
     *
     * @return the number of powers
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

                Query q = session.createQuery(_SQL_COUNT_POWER);

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
     * Initializes the power persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Power")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Power>> listenersList = new ArrayList<ModelListener<Power>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Power>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PowerImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

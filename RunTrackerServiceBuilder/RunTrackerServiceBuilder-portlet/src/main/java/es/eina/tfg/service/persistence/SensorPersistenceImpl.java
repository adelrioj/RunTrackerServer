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

import es.eina.tfg.NoSuchSensorException;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.model.impl.SensorImpl;
import es.eina.tfg.model.impl.SensorModelImpl;
import es.eina.tfg.service.persistence.SensorPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see SensorPersistence
 * @see SensorUtil
 * @generated
 */
public class SensorPersistenceImpl extends BasePersistenceImpl<Sensor>
    implements SensorPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SensorUtil} to access the sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SensorImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, SensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, SensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, SensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytype",
            new String[] {
                Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, SensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytype",
            new String[] { Integer.class.getName() },
            SensorModelImpl.TYPE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytype",
            new String[] { Integer.class.getName() });
    private static final String _FINDER_COLUMN_TYPE_TYPE_2 = "sensor.type = ?";
    private static final String _SQL_SELECT_SENSOR = "SELECT sensor FROM Sensor sensor";
    private static final String _SQL_SELECT_SENSOR_WHERE = "SELECT sensor FROM Sensor sensor WHERE ";
    private static final String _SQL_COUNT_SENSOR = "SELECT COUNT(sensor) FROM Sensor sensor";
    private static final String _SQL_COUNT_SENSOR_WHERE = "SELECT COUNT(sensor) FROM Sensor sensor WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sensor.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sensor exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Sensor exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SensorPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "type"
            });
    private static Sensor _nullSensor = new SensorImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sensor> toCacheModel() {
                return _nullSensorCacheModel;
            }
        };

    private static CacheModel<Sensor> _nullSensorCacheModel = new CacheModel<Sensor>() {
            @Override
            public Sensor toEntityModel() {
                return _nullSensor;
            }
        };

    public SensorPersistenceImpl() {
        setModelClass(Sensor.class);
    }

    /**
     * Returns all the sensors where type = &#63;.
     *
     * @param type the type
     * @return the matching sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findBytype(int type) throws SystemException {
        return findBytype(type, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sensors where type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param type the type
     * @param start the lower bound of the range of sensors
     * @param end the upper bound of the range of sensors (not inclusive)
     * @return the range of matching sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findBytype(int type, int start, int end)
        throws SystemException {
        return findBytype(type, start, end, null);
    }

    /**
     * Returns an ordered range of all the sensors where type = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param type the type
     * @param start the lower bound of the range of sensors
     * @param end the upper bound of the range of sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findBytype(int type, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
            finderArgs = new Object[] { type };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
            finderArgs = new Object[] { type, start, end, orderByComparator };
        }

        List<Sensor> list = (List<Sensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Sensor sensor : list) {
                if ((type != sensor.getType())) {
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

            query.append(_SQL_SELECT_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_TYPE_TYPE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SensorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(type);

                if (!pagination) {
                    list = (List<Sensor>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sensor>(list);
                } else {
                    list = (List<Sensor>) QueryUtil.list(q, getDialect(),
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
     * Returns the first sensor in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching sensor
     * @throws es.eina.tfg.NoSuchSensorException if a matching sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor findBytype_First(int type, OrderByComparator orderByComparator)
        throws NoSuchSensorException, SystemException {
        Sensor sensor = fetchBytype_First(type, orderByComparator);

        if (sensor != null) {
            return sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("type=");
        msg.append(type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSensorException(msg.toString());
    }

    /**
     * Returns the first sensor in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching sensor, or <code>null</code> if a matching sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor fetchBytype_First(int type,
        OrderByComparator orderByComparator) throws SystemException {
        List<Sensor> list = findBytype(type, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last sensor in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching sensor
     * @throws es.eina.tfg.NoSuchSensorException if a matching sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor findBytype_Last(int type, OrderByComparator orderByComparator)
        throws NoSuchSensorException, SystemException {
        Sensor sensor = fetchBytype_Last(type, orderByComparator);

        if (sensor != null) {
            return sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("type=");
        msg.append(type);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSensorException(msg.toString());
    }

    /**
     * Returns the last sensor in the ordered set where type = &#63;.
     *
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching sensor, or <code>null</code> if a matching sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor fetchBytype_Last(int type, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countBytype(type);

        if (count == 0) {
            return null;
        }

        List<Sensor> list = findBytype(type, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the sensors before and after the current sensor in the ordered set where type = &#63;.
     *
     * @param sensorId the primary key of the current sensor
     * @param type the type
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next sensor
     * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor[] findBytype_PrevAndNext(long sensorId, int type,
        OrderByComparator orderByComparator)
        throws NoSuchSensorException, SystemException {
        Sensor sensor = findByPrimaryKey(sensorId);

        Session session = null;

        try {
            session = openSession();

            Sensor[] array = new SensorImpl[3];

            array[0] = getBytype_PrevAndNext(session, sensor, type,
                    orderByComparator, true);

            array[1] = sensor;

            array[2] = getBytype_PrevAndNext(session, sensor, type,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Sensor getBytype_PrevAndNext(Session session, Sensor sensor,
        int type, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SENSOR_WHERE);

        query.append(_FINDER_COLUMN_TYPE_TYPE_2);

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
            query.append(SensorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(type);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(sensor);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Sensor> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the sensors where type = &#63; from the database.
     *
     * @param type the type
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBytype(int type) throws SystemException {
        for (Sensor sensor : findBytype(type, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(sensor);
        }
    }

    /**
     * Returns the number of sensors where type = &#63;.
     *
     * @param type the type
     * @return the number of matching sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBytype(int type) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

        Object[] finderArgs = new Object[] { type };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_TYPE_TYPE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(type);

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
     * Caches the sensor in the entity cache if it is enabled.
     *
     * @param sensor the sensor
     */
    @Override
    public void cacheResult(Sensor sensor) {
        EntityCacheUtil.putResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorImpl.class, sensor.getPrimaryKey(), sensor);

        sensor.resetOriginalValues();
    }

    /**
     * Caches the sensors in the entity cache if it is enabled.
     *
     * @param sensors the sensors
     */
    @Override
    public void cacheResult(List<Sensor> sensors) {
        for (Sensor sensor : sensors) {
            if (EntityCacheUtil.getResult(
                        SensorModelImpl.ENTITY_CACHE_ENABLED, SensorImpl.class,
                        sensor.getPrimaryKey()) == null) {
                cacheResult(sensor);
            } else {
                sensor.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sensors.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SensorImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SensorImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sensor.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sensor sensor) {
        EntityCacheUtil.removeResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorImpl.class, sensor.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Sensor> sensors) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sensor sensor : sensors) {
            EntityCacheUtil.removeResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
                SensorImpl.class, sensor.getPrimaryKey());
        }
    }

    /**
     * Creates a new sensor with the primary key. Does not add the sensor to the database.
     *
     * @param sensorId the primary key for the new sensor
     * @return the new sensor
     */
    @Override
    public Sensor create(long sensorId) {
        Sensor sensor = new SensorImpl();

        sensor.setNew(true);
        sensor.setPrimaryKey(sensorId);

        return sensor;
    }

    /**
     * Removes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param sensorId the primary key of the sensor
     * @return the sensor that was removed
     * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor remove(long sensorId)
        throws NoSuchSensorException, SystemException {
        return remove((Serializable) sensorId);
    }

    /**
     * Removes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sensor
     * @return the sensor that was removed
     * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor remove(Serializable primaryKey)
        throws NoSuchSensorException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sensor sensor = (Sensor) session.get(SensorImpl.class, primaryKey);

            if (sensor == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sensor);
        } catch (NoSuchSensorException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sensor removeImpl(Sensor sensor) throws SystemException {
        sensor = toUnwrappedModel(sensor);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sensor)) {
                sensor = (Sensor) session.get(SensorImpl.class,
                        sensor.getPrimaryKeyObj());
            }

            if (sensor != null) {
                session.delete(sensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sensor != null) {
            clearCache(sensor);
        }

        return sensor;
    }

    @Override
    public Sensor updateImpl(es.eina.tfg.model.Sensor sensor)
        throws SystemException {
        sensor = toUnwrappedModel(sensor);

        boolean isNew = sensor.isNew();

        SensorModelImpl sensorModelImpl = (SensorModelImpl) sensor;

        Session session = null;

        try {
            session = openSession();

            if (sensor.isNew()) {
                session.save(sensor);

                sensor.setNew(false);
            } else {
                session.merge(sensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SensorModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((sensorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { sensorModelImpl.getOriginalType() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
                    args);

                args = new Object[] { sensorModelImpl.getType() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
                    args);
            }
        }

        EntityCacheUtil.putResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
            SensorImpl.class, sensor.getPrimaryKey(), sensor);

        return sensor;
    }

    protected Sensor toUnwrappedModel(Sensor sensor) {
        if (sensor instanceof SensorImpl) {
            return sensor;
        }

        SensorImpl sensorImpl = new SensorImpl();

        sensorImpl.setNew(sensor.isNew());
        sensorImpl.setPrimaryKey(sensor.getPrimaryKey());

        sensorImpl.setSensorId(sensor.getSensorId());
        sensorImpl.setType(sensor.getType());
        sensorImpl.setDescription(sensor.getDescription());
        sensorImpl.setDataUnits(sensor.getDataUnits());
        sensorImpl.setDataType(sensor.getDataType());
        sensorImpl.setDataUncertainity(sensor.getDataUncertainity());
        sensorImpl.setDataLowerRange(sensor.getDataLowerRange());
        sensorImpl.setDataUpperRange(sensor.getDataUpperRange());
        sensorImpl.setDataPacketFormat(sensor.getDataPacketFormat());

        return sensorImpl;
    }

    /**
     * Returns the sensor with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sensor
     * @return the sensor
     * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSensorException, SystemException {
        Sensor sensor = fetchByPrimaryKey(primaryKey);

        if (sensor == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sensor;
    }

    /**
     * Returns the sensor with the primary key or throws a {@link es.eina.tfg.NoSuchSensorException} if it could not be found.
     *
     * @param sensorId the primary key of the sensor
     * @return the sensor
     * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor findByPrimaryKey(long sensorId)
        throws NoSuchSensorException, SystemException {
        return findByPrimaryKey((Serializable) sensorId);
    }

    /**
     * Returns the sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sensor
     * @return the sensor, or <code>null</code> if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sensor sensor = (Sensor) EntityCacheUtil.getResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
                SensorImpl.class, primaryKey);

        if (sensor == _nullSensor) {
            return null;
        }

        if (sensor == null) {
            Session session = null;

            try {
                session = openSession();

                sensor = (Sensor) session.get(SensorImpl.class, primaryKey);

                if (sensor != null) {
                    cacheResult(sensor);
                } else {
                    EntityCacheUtil.putResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
                        SensorImpl.class, primaryKey, _nullSensor);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SensorModelImpl.ENTITY_CACHE_ENABLED,
                    SensorImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sensor;
    }

    /**
     * Returns the sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param sensorId the primary key of the sensor
     * @return the sensor, or <code>null</code> if a sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sensor fetchByPrimaryKey(long sensorId) throws SystemException {
        return fetchByPrimaryKey((Serializable) sensorId);
    }

    /**
     * Returns all the sensors.
     *
     * @return the sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sensors
     * @param end the upper bound of the range of sensors (not inclusive)
     * @return the range of sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of sensors
     * @param end the upper bound of the range of sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sensor> findAll(int start, int end,
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

        List<Sensor> list = (List<Sensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SENSOR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SENSOR;

                if (pagination) {
                    sql = sql.concat(SensorModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sensor>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sensor>(list);
                } else {
                    list = (List<Sensor>) QueryUtil.list(q, getDialect(),
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
     * Removes all the sensors from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sensor sensor : findAll()) {
            remove(sensor);
        }
    }

    /**
     * Returns the number of sensors.
     *
     * @return the number of sensors
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

                Query q = session.createQuery(_SQL_COUNT_SENSOR);

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
     * Initializes the sensor persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Sensor")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sensor>> listenersList = new ArrayList<ModelListener<Sensor>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sensor>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SensorImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

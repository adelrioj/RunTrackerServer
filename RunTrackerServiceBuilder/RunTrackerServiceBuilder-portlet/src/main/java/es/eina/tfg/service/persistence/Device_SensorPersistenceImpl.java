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

import es.eina.tfg.NoSuchDevice_SensorException;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.model.impl.Device_SensorImpl;
import es.eina.tfg.model.impl.Device_SensorModelImpl;
import es.eina.tfg.service.persistence.Device_SensorPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the device_ sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see Device_SensorPersistence
 * @see Device_SensorUtil
 * @generated
 */
public class Device_SensorPersistenceImpl extends BasePersistenceImpl<Device_Sensor>
    implements Device_SensorPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link Device_SensorUtil} to access the device_ sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = Device_SensorImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBydeviceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID =
        new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findBydeviceId", new String[] { Long.class.getName() },
            Device_SensorModelImpl.DEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydeviceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEID_DEVICEID_2 = "device_Sensor.id.deviceId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESENSORS =
        new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByactiveSensors",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS =
        new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED,
            Device_SensorImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByactiveSensors", new String[] { Long.class.getName() },
            Device_SensorModelImpl.DEVICEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVESENSORS = new FinderPath(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByactiveSensors",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ACTIVESENSORS_DEVICEID_2 = "device_Sensor.id.deviceId = ? AND device_Sensor.status = true";
    private static final String _SQL_SELECT_DEVICE_SENSOR = "SELECT device_Sensor FROM Device_Sensor device_Sensor";
    private static final String _SQL_SELECT_DEVICE_SENSOR_WHERE = "SELECT device_Sensor FROM Device_Sensor device_Sensor WHERE ";
    private static final String _SQL_COUNT_DEVICE_SENSOR = "SELECT COUNT(device_Sensor) FROM Device_Sensor device_Sensor";
    private static final String _SQL_COUNT_DEVICE_SENSOR_WHERE = "SELECT COUNT(device_Sensor) FROM Device_Sensor device_Sensor WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "device_Sensor.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Device_Sensor exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Device_Sensor exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(Device_SensorPersistenceImpl.class);
    private static Device_Sensor _nullDevice_Sensor = new Device_SensorImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Device_Sensor> toCacheModel() {
                return _nullDevice_SensorCacheModel;
            }
        };

    private static CacheModel<Device_Sensor> _nullDevice_SensorCacheModel = new CacheModel<Device_Sensor>() {
            @Override
            public Device_Sensor toEntityModel() {
                return _nullDevice_Sensor;
            }
        };

    public Device_SensorPersistenceImpl() {
        setModelClass(Device_Sensor.class);
    }

    /**
     * Returns all the device_ sensors where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findBydeviceId(long deviceId)
        throws SystemException {
        return findBydeviceId(deviceId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the device_ sensors where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @return the range of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findBydeviceId(long deviceId, int start, int end)
        throws SystemException {
        return findBydeviceId(deviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device_ sensors where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findBydeviceId(long deviceId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { deviceId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { deviceId, start, end, orderByComparator };
        }

        List<Device_Sensor> list = (List<Device_Sensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Device_Sensor device_Sensor : list) {
                if ((deviceId != device_Sensor.getDeviceId())) {
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

            query.append(_SQL_SELECT_DEVICE_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Device_SensorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

                if (!pagination) {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device_Sensor>(list);
                } else {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
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
     * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findBydeviceId_First(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = fetchBydeviceId_First(deviceId,
                orderByComparator);

        if (device_Sensor != null) {
            return device_Sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDevice_SensorException(msg.toString());
    }

    /**
     * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchBydeviceId_First(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Device_Sensor> list = findBydeviceId(deviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findBydeviceId_Last(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = fetchBydeviceId_Last(deviceId,
                orderByComparator);

        if (device_Sensor != null) {
            return device_Sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDevice_SensorException(msg.toString());
    }

    /**
     * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchBydeviceId_Last(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBydeviceId(deviceId);

        if (count == 0) {
            return null;
        }

        List<Device_Sensor> list = findBydeviceId(deviceId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device_ sensors before and after the current device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param device_SensorPK the primary key of the current device_ sensor
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor[] findBydeviceId_PrevAndNext(
        Device_SensorPK device_SensorPK, long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = findByPrimaryKey(device_SensorPK);

        Session session = null;

        try {
            session = openSession();

            Device_Sensor[] array = new Device_SensorImpl[3];

            array[0] = getBydeviceId_PrevAndNext(session, device_Sensor,
                    deviceId, orderByComparator, true);

            array[1] = device_Sensor;

            array[2] = getBydeviceId_PrevAndNext(session, device_Sensor,
                    deviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Device_Sensor getBydeviceId_PrevAndNext(Session session,
        Device_Sensor device_Sensor, long deviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICE_SENSOR_WHERE);

        query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

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
            query.append(Device_SensorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(deviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(device_Sensor);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Device_Sensor> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device_ sensors where deviceId = &#63; from the database.
     *
     * @param deviceId the device ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBydeviceId(long deviceId) throws SystemException {
        for (Device_Sensor device_Sensor : findBydeviceId(deviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(device_Sensor);
        }
    }

    /**
     * Returns the number of device_ sensors where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the number of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBydeviceId(long deviceId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEID;

        Object[] finderArgs = new Object[] { deviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_DEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

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
     * Returns all the device_ sensors where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findByactiveSensors(long deviceId)
        throws SystemException {
        return findByactiveSensors(deviceId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device_ sensors where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @return the range of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findByactiveSensors(long deviceId, int start,
        int end) throws SystemException {
        return findByactiveSensors(deviceId, start, end, null);
    }

    /**
     * Returns an ordered range of all the device_ sensors where deviceId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param deviceId the device ID
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findByactiveSensors(long deviceId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS;
            finderArgs = new Object[] { deviceId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESENSORS;
            finderArgs = new Object[] { deviceId, start, end, orderByComparator };
        }

        List<Device_Sensor> list = (List<Device_Sensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Device_Sensor device_Sensor : list) {
                if ((deviceId != device_Sensor.getDeviceId())) {
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

            query.append(_SQL_SELECT_DEVICE_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_ACTIVESENSORS_DEVICEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(Device_SensorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

                if (!pagination) {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device_Sensor>(list);
                } else {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
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
     * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findByactiveSensors_First(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = fetchByactiveSensors_First(deviceId,
                orderByComparator);

        if (device_Sensor != null) {
            return device_Sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDevice_SensorException(msg.toString());
    }

    /**
     * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchByactiveSensors_First(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Device_Sensor> list = findByactiveSensors(deviceId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findByactiveSensors_Last(long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = fetchByactiveSensors_Last(deviceId,
                orderByComparator);

        if (device_Sensor != null) {
            return device_Sensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("deviceId=");
        msg.append(deviceId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDevice_SensorException(msg.toString());
    }

    /**
     * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchByactiveSensors_Last(long deviceId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByactiveSensors(deviceId);

        if (count == 0) {
            return null;
        }

        List<Device_Sensor> list = findByactiveSensors(deviceId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device_ sensors before and after the current device_ sensor in the ordered set where deviceId = &#63;.
     *
     * @param device_SensorPK the primary key of the current device_ sensor
     * @param deviceId the device ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor[] findByactiveSensors_PrevAndNext(
        Device_SensorPK device_SensorPK, long deviceId,
        OrderByComparator orderByComparator)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = findByPrimaryKey(device_SensorPK);

        Session session = null;

        try {
            session = openSession();

            Device_Sensor[] array = new Device_SensorImpl[3];

            array[0] = getByactiveSensors_PrevAndNext(session, device_Sensor,
                    deviceId, orderByComparator, true);

            array[1] = device_Sensor;

            array[2] = getByactiveSensors_PrevAndNext(session, device_Sensor,
                    deviceId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Device_Sensor getByactiveSensors_PrevAndNext(Session session,
        Device_Sensor device_Sensor, long deviceId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICE_SENSOR_WHERE);

        query.append(_FINDER_COLUMN_ACTIVESENSORS_DEVICEID_2);

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
            query.append(Device_SensorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(deviceId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(device_Sensor);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Device_Sensor> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device_ sensors where deviceId = &#63; from the database.
     *
     * @param deviceId the device ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByactiveSensors(long deviceId) throws SystemException {
        for (Device_Sensor device_Sensor : findByactiveSensors(deviceId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(device_Sensor);
        }
    }

    /**
     * Returns the number of device_ sensors where deviceId = &#63;.
     *
     * @param deviceId the device ID
     * @return the number of matching device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByactiveSensors(long deviceId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVESENSORS;

        Object[] finderArgs = new Object[] { deviceId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICE_SENSOR_WHERE);

            query.append(_FINDER_COLUMN_ACTIVESENSORS_DEVICEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(deviceId);

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
     * Caches the device_ sensor in the entity cache if it is enabled.
     *
     * @param device_Sensor the device_ sensor
     */
    @Override
    public void cacheResult(Device_Sensor device_Sensor) {
        EntityCacheUtil.putResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorImpl.class, device_Sensor.getPrimaryKey(),
            device_Sensor);

        device_Sensor.resetOriginalValues();
    }

    /**
     * Caches the device_ sensors in the entity cache if it is enabled.
     *
     * @param device_Sensors the device_ sensors
     */
    @Override
    public void cacheResult(List<Device_Sensor> device_Sensors) {
        for (Device_Sensor device_Sensor : device_Sensors) {
            if (EntityCacheUtil.getResult(
                        Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
                        Device_SensorImpl.class, device_Sensor.getPrimaryKey()) == null) {
                cacheResult(device_Sensor);
            } else {
                device_Sensor.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device_ sensors.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(Device_SensorImpl.class.getName());
        }

        EntityCacheUtil.clearCache(Device_SensorImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device_ sensor.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Device_Sensor device_Sensor) {
        EntityCacheUtil.removeResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorImpl.class, device_Sensor.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Device_Sensor> device_Sensors) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Device_Sensor device_Sensor : device_Sensors) {
            EntityCacheUtil.removeResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
                Device_SensorImpl.class, device_Sensor.getPrimaryKey());
        }
    }

    /**
     * Creates a new device_ sensor with the primary key. Does not add the device_ sensor to the database.
     *
     * @param device_SensorPK the primary key for the new device_ sensor
     * @return the new device_ sensor
     */
    @Override
    public Device_Sensor create(Device_SensorPK device_SensorPK) {
        Device_Sensor device_Sensor = new Device_SensorImpl();

        device_Sensor.setNew(true);
        device_Sensor.setPrimaryKey(device_SensorPK);

        return device_Sensor;
    }

    /**
     * Removes the device_ sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param device_SensorPK the primary key of the device_ sensor
     * @return the device_ sensor that was removed
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor remove(Device_SensorPK device_SensorPK)
        throws NoSuchDevice_SensorException, SystemException {
        return remove((Serializable) device_SensorPK);
    }

    /**
     * Removes the device_ sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device_ sensor
     * @return the device_ sensor that was removed
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor remove(Serializable primaryKey)
        throws NoSuchDevice_SensorException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Device_Sensor device_Sensor = (Device_Sensor) session.get(Device_SensorImpl.class,
                    primaryKey);

            if (device_Sensor == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDevice_SensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(device_Sensor);
        } catch (NoSuchDevice_SensorException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Device_Sensor removeImpl(Device_Sensor device_Sensor)
        throws SystemException {
        device_Sensor = toUnwrappedModel(device_Sensor);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(device_Sensor)) {
                device_Sensor = (Device_Sensor) session.get(Device_SensorImpl.class,
                        device_Sensor.getPrimaryKeyObj());
            }

            if (device_Sensor != null) {
                session.delete(device_Sensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (device_Sensor != null) {
            clearCache(device_Sensor);
        }

        return device_Sensor;
    }

    @Override
    public Device_Sensor updateImpl(
        es.eina.tfg.model.Device_Sensor device_Sensor)
        throws SystemException {
        device_Sensor = toUnwrappedModel(device_Sensor);

        boolean isNew = device_Sensor.isNew();

        Device_SensorModelImpl device_SensorModelImpl = (Device_SensorModelImpl) device_Sensor;

        Session session = null;

        try {
            session = openSession();

            if (device_Sensor.isNew()) {
                session.save(device_Sensor);

                device_Sensor.setNew(false);
            } else {
                session.merge(device_Sensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !Device_SensorModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((device_SensorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        device_SensorModelImpl.getOriginalDeviceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);

                args = new Object[] { device_SensorModelImpl.getDeviceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);
            }

            if ((device_SensorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        device_SensorModelImpl.getOriginalDeviceId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESENSORS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS,
                    args);

                args = new Object[] { device_SensorModelImpl.getDeviceId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESENSORS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS,
                    args);
            }
        }

        EntityCacheUtil.putResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
            Device_SensorImpl.class, device_Sensor.getPrimaryKey(),
            device_Sensor);

        return device_Sensor;
    }

    protected Device_Sensor toUnwrappedModel(Device_Sensor device_Sensor) {
        if (device_Sensor instanceof Device_SensorImpl) {
            return device_Sensor;
        }

        Device_SensorImpl device_SensorImpl = new Device_SensorImpl();

        device_SensorImpl.setNew(device_Sensor.isNew());
        device_SensorImpl.setPrimaryKey(device_Sensor.getPrimaryKey());

        device_SensorImpl.setDeviceId(device_Sensor.getDeviceId());
        device_SensorImpl.setSensorId(device_Sensor.getSensorId());
        device_SensorImpl.setStatus(device_Sensor.isStatus());

        return device_SensorImpl;
    }

    /**
     * Returns the device_ sensor with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device_ sensor
     * @return the device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDevice_SensorException, SystemException {
        Device_Sensor device_Sensor = fetchByPrimaryKey(primaryKey);

        if (device_Sensor == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDevice_SensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return device_Sensor;
    }

    /**
     * Returns the device_ sensor with the primary key or throws a {@link es.eina.tfg.NoSuchDevice_SensorException} if it could not be found.
     *
     * @param device_SensorPK the primary key of the device_ sensor
     * @return the device_ sensor
     * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor findByPrimaryKey(Device_SensorPK device_SensorPK)
        throws NoSuchDevice_SensorException, SystemException {
        return findByPrimaryKey((Serializable) device_SensorPK);
    }

    /**
     * Returns the device_ sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device_ sensor
     * @return the device_ sensor, or <code>null</code> if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Device_Sensor device_Sensor = (Device_Sensor) EntityCacheUtil.getResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
                Device_SensorImpl.class, primaryKey);

        if (device_Sensor == _nullDevice_Sensor) {
            return null;
        }

        if (device_Sensor == null) {
            Session session = null;

            try {
                session = openSession();

                device_Sensor = (Device_Sensor) session.get(Device_SensorImpl.class,
                        primaryKey);

                if (device_Sensor != null) {
                    cacheResult(device_Sensor);
                } else {
                    EntityCacheUtil.putResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
                        Device_SensorImpl.class, primaryKey, _nullDevice_Sensor);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(Device_SensorModelImpl.ENTITY_CACHE_ENABLED,
                    Device_SensorImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return device_Sensor;
    }

    /**
     * Returns the device_ sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param device_SensorPK the primary key of the device_ sensor
     * @return the device_ sensor, or <code>null</code> if a device_ sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Device_Sensor fetchByPrimaryKey(Device_SensorPK device_SensorPK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) device_SensorPK);
    }

    /**
     * Returns all the device_ sensors.
     *
     * @return the device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device_ sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @return the range of device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device_ sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device_ sensors
     * @param end the upper bound of the range of device_ sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device_ sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Device_Sensor> findAll(int start, int end,
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

        List<Device_Sensor> list = (List<Device_Sensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICE_SENSOR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICE_SENSOR;

                if (pagination) {
                    sql = sql.concat(Device_SensorModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Device_Sensor>(list);
                } else {
                    list = (List<Device_Sensor>) QueryUtil.list(q,
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
     * Removes all the device_ sensors from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Device_Sensor device_Sensor : findAll()) {
            remove(device_Sensor);
        }
    }

    /**
     * Returns the number of device_ sensors.
     *
     * @return the number of device_ sensors
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

                Query q = session.createQuery(_SQL_COUNT_DEVICE_SENSOR);

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
     * Initializes the device_ sensor persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.Device_Sensor")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Device_Sensor>> listenersList = new ArrayList<ModelListener<Device_Sensor>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Device_Sensor>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(Device_SensorImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

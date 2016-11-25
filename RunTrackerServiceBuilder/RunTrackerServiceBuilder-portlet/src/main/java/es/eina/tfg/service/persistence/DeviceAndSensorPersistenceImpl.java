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

import es.eina.tfg.NoSuchDeviceAndSensorException;
import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.model.impl.DeviceAndSensorImpl;
import es.eina.tfg.model.impl.DeviceAndSensorModelImpl;
import es.eina.tfg.service.persistence.DeviceAndSensorPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the device and sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DeviceAndSensorPersistence
 * @see DeviceAndSensorUtil
 * @generated
 */
public class DeviceAndSensorPersistenceImpl extends BasePersistenceImpl<DeviceAndSensor>
    implements DeviceAndSensorPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DeviceAndSensorUtil} to access the device and sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DeviceAndSensorImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findBydeviceId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID =
        new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydeviceId",
            new String[] { Long.class.getName() },
            DeviceAndSensorModelImpl.IDDEVICE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEID = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydeviceId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_DEVICEID_IDDEVICE_2 = "deviceAndSensor.id.idDevice = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESENSORS =
        new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByactiveSensors",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS =
        new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED,
            DeviceAndSensorImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByactiveSensors",
            new String[] { Long.class.getName() },
            DeviceAndSensorModelImpl.IDDEVICE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ACTIVESENSORS = new FinderPath(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByactiveSensors",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_ACTIVESENSORS_IDDEVICE_2 = "deviceAndSensor.id.idDevice = ? AND deviceAndSensor.status = true";
    private static final String _SQL_SELECT_DEVICEANDSENSOR = "SELECT deviceAndSensor FROM DeviceAndSensor deviceAndSensor";
    private static final String _SQL_SELECT_DEVICEANDSENSOR_WHERE = "SELECT deviceAndSensor FROM DeviceAndSensor deviceAndSensor WHERE ";
    private static final String _SQL_COUNT_DEVICEANDSENSOR = "SELECT COUNT(deviceAndSensor) FROM DeviceAndSensor deviceAndSensor";
    private static final String _SQL_COUNT_DEVICEANDSENSOR_WHERE = "SELECT COUNT(deviceAndSensor) FROM DeviceAndSensor deviceAndSensor WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "deviceAndSensor.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DeviceAndSensor exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DeviceAndSensor exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DeviceAndSensorPersistenceImpl.class);
    private static DeviceAndSensor _nullDeviceAndSensor = new DeviceAndSensorImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<DeviceAndSensor> toCacheModel() {
                return _nullDeviceAndSensorCacheModel;
            }
        };

    private static CacheModel<DeviceAndSensor> _nullDeviceAndSensorCacheModel = new CacheModel<DeviceAndSensor>() {
            @Override
            public DeviceAndSensor toEntityModel() {
                return _nullDeviceAndSensor;
            }
        };

    public DeviceAndSensorPersistenceImpl() {
        setModelClass(DeviceAndSensor.class);
    }

    /**
     * Returns all the device and sensors where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @return the matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findBydeviceId(long idDevice)
        throws SystemException {
        return findBydeviceId(idDevice, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the device and sensors where idDevice = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idDevice the id device
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @return the range of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findBydeviceId(long idDevice, int start,
        int end) throws SystemException {
        return findBydeviceId(idDevice, start, end, null);
    }

    /**
     * Returns an ordered range of all the device and sensors where idDevice = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idDevice the id device
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findBydeviceId(long idDevice, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { idDevice };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEVICEID;
            finderArgs = new Object[] { idDevice, start, end, orderByComparator };
        }

        List<DeviceAndSensor> list = (List<DeviceAndSensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceAndSensor deviceAndSensor : list) {
                if ((idDevice != deviceAndSensor.getIdDevice())) {
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

            query.append(_SQL_SELECT_DEVICEANDSENSOR_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_IDDEVICE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceAndSensorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idDevice);

                if (!pagination) {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceAndSensor>(list);
                } else {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
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
     * Returns the first device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findBydeviceId_First(long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = fetchBydeviceId_First(idDevice,
                orderByComparator);

        if (deviceAndSensor != null) {
            return deviceAndSensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idDevice=");
        msg.append(idDevice);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceAndSensorException(msg.toString());
    }

    /**
     * Returns the first device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchBydeviceId_First(long idDevice,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceAndSensor> list = findBydeviceId(idDevice, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findBydeviceId_Last(long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = fetchBydeviceId_Last(idDevice,
                orderByComparator);

        if (deviceAndSensor != null) {
            return deviceAndSensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idDevice=");
        msg.append(idDevice);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceAndSensorException(msg.toString());
    }

    /**
     * Returns the last device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchBydeviceId_Last(long idDevice,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countBydeviceId(idDevice);

        if (count == 0) {
            return null;
        }

        List<DeviceAndSensor> list = findBydeviceId(idDevice, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device and sensors before and after the current device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param deviceAndSensorPK the primary key of the current device and sensor
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor[] findBydeviceId_PrevAndNext(
        DeviceAndSensorPK deviceAndSensorPK, long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = findByPrimaryKey(deviceAndSensorPK);

        Session session = null;

        try {
            session = openSession();

            DeviceAndSensor[] array = new DeviceAndSensorImpl[3];

            array[0] = getBydeviceId_PrevAndNext(session, deviceAndSensor,
                    idDevice, orderByComparator, true);

            array[1] = deviceAndSensor;

            array[2] = getBydeviceId_PrevAndNext(session, deviceAndSensor,
                    idDevice, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceAndSensor getBydeviceId_PrevAndNext(Session session,
        DeviceAndSensor deviceAndSensor, long idDevice,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEANDSENSOR_WHERE);

        query.append(_FINDER_COLUMN_DEVICEID_IDDEVICE_2);

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
            query.append(DeviceAndSensorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idDevice);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceAndSensor);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceAndSensor> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device and sensors where idDevice = &#63; from the database.
     *
     * @param idDevice the id device
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeBydeviceId(long idDevice) throws SystemException {
        for (DeviceAndSensor deviceAndSensor : findBydeviceId(idDevice,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceAndSensor);
        }
    }

    /**
     * Returns the number of device and sensors where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @return the number of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countBydeviceId(long idDevice) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEID;

        Object[] finderArgs = new Object[] { idDevice };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICEANDSENSOR_WHERE);

            query.append(_FINDER_COLUMN_DEVICEID_IDDEVICE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idDevice);

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
     * Returns all the device and sensors where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @return the matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findByactiveSensors(long idDevice)
        throws SystemException {
        return findByactiveSensors(idDevice, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device and sensors where idDevice = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idDevice the id device
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @return the range of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findByactiveSensors(long idDevice, int start,
        int end) throws SystemException {
        return findByactiveSensors(idDevice, start, end, null);
    }

    /**
     * Returns an ordered range of all the device and sensors where idDevice = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param idDevice the id device
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findByactiveSensors(long idDevice, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS;
            finderArgs = new Object[] { idDevice };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ACTIVESENSORS;
            finderArgs = new Object[] { idDevice, start, end, orderByComparator };
        }

        List<DeviceAndSensor> list = (List<DeviceAndSensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (DeviceAndSensor deviceAndSensor : list) {
                if ((idDevice != deviceAndSensor.getIdDevice())) {
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

            query.append(_SQL_SELECT_DEVICEANDSENSOR_WHERE);

            query.append(_FINDER_COLUMN_ACTIVESENSORS_IDDEVICE_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(DeviceAndSensorModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idDevice);

                if (!pagination) {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceAndSensor>(list);
                } else {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
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
     * Returns the first device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findByactiveSensors_First(long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = fetchByactiveSensors_First(idDevice,
                orderByComparator);

        if (deviceAndSensor != null) {
            return deviceAndSensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idDevice=");
        msg.append(idDevice);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceAndSensorException(msg.toString());
    }

    /**
     * Returns the first device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchByactiveSensors_First(long idDevice,
        OrderByComparator orderByComparator) throws SystemException {
        List<DeviceAndSensor> list = findByactiveSensors(idDevice, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findByactiveSensors_Last(long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = fetchByactiveSensors_Last(idDevice,
                orderByComparator);

        if (deviceAndSensor != null) {
            return deviceAndSensor;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("idDevice=");
        msg.append(idDevice);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDeviceAndSensorException(msg.toString());
    }

    /**
     * Returns the last device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchByactiveSensors_Last(long idDevice,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByactiveSensors(idDevice);

        if (count == 0) {
            return null;
        }

        List<DeviceAndSensor> list = findByactiveSensors(idDevice, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the device and sensors before and after the current device and sensor in the ordered set where idDevice = &#63;.
     *
     * @param deviceAndSensorPK the primary key of the current device and sensor
     * @param idDevice the id device
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor[] findByactiveSensors_PrevAndNext(
        DeviceAndSensorPK deviceAndSensorPK, long idDevice,
        OrderByComparator orderByComparator)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = findByPrimaryKey(deviceAndSensorPK);

        Session session = null;

        try {
            session = openSession();

            DeviceAndSensor[] array = new DeviceAndSensorImpl[3];

            array[0] = getByactiveSensors_PrevAndNext(session, deviceAndSensor,
                    idDevice, orderByComparator, true);

            array[1] = deviceAndSensor;

            array[2] = getByactiveSensors_PrevAndNext(session, deviceAndSensor,
                    idDevice, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected DeviceAndSensor getByactiveSensors_PrevAndNext(Session session,
        DeviceAndSensor deviceAndSensor, long idDevice,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DEVICEANDSENSOR_WHERE);

        query.append(_FINDER_COLUMN_ACTIVESENSORS_IDDEVICE_2);

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
            query.append(DeviceAndSensorModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(idDevice);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(deviceAndSensor);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<DeviceAndSensor> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the device and sensors where idDevice = &#63; from the database.
     *
     * @param idDevice the id device
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByactiveSensors(long idDevice) throws SystemException {
        for (DeviceAndSensor deviceAndSensor : findByactiveSensors(idDevice,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(deviceAndSensor);
        }
    }

    /**
     * Returns the number of device and sensors where idDevice = &#63;.
     *
     * @param idDevice the id device
     * @return the number of matching device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByactiveSensors(long idDevice) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ACTIVESENSORS;

        Object[] finderArgs = new Object[] { idDevice };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DEVICEANDSENSOR_WHERE);

            query.append(_FINDER_COLUMN_ACTIVESENSORS_IDDEVICE_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(idDevice);

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
     * Caches the device and sensor in the entity cache if it is enabled.
     *
     * @param deviceAndSensor the device and sensor
     */
    @Override
    public void cacheResult(DeviceAndSensor deviceAndSensor) {
        EntityCacheUtil.putResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorImpl.class, deviceAndSensor.getPrimaryKey(),
            deviceAndSensor);

        deviceAndSensor.resetOriginalValues();
    }

    /**
     * Caches the device and sensors in the entity cache if it is enabled.
     *
     * @param deviceAndSensors the device and sensors
     */
    @Override
    public void cacheResult(List<DeviceAndSensor> deviceAndSensors) {
        for (DeviceAndSensor deviceAndSensor : deviceAndSensors) {
            if (EntityCacheUtil.getResult(
                        DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceAndSensorImpl.class,
                        deviceAndSensor.getPrimaryKey()) == null) {
                cacheResult(deviceAndSensor);
            } else {
                deviceAndSensor.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all device and sensors.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DeviceAndSensorImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DeviceAndSensorImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the device and sensor.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(DeviceAndSensor deviceAndSensor) {
        EntityCacheUtil.removeResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorImpl.class, deviceAndSensor.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<DeviceAndSensor> deviceAndSensors) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (DeviceAndSensor deviceAndSensor : deviceAndSensors) {
            EntityCacheUtil.removeResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
                DeviceAndSensorImpl.class, deviceAndSensor.getPrimaryKey());
        }
    }

    /**
     * Creates a new device and sensor with the primary key. Does not add the device and sensor to the database.
     *
     * @param deviceAndSensorPK the primary key for the new device and sensor
     * @return the new device and sensor
     */
    @Override
    public DeviceAndSensor create(DeviceAndSensorPK deviceAndSensorPK) {
        DeviceAndSensor deviceAndSensor = new DeviceAndSensorImpl();

        deviceAndSensor.setNew(true);
        deviceAndSensor.setPrimaryKey(deviceAndSensorPK);

        return deviceAndSensor;
    }

    /**
     * Removes the device and sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param deviceAndSensorPK the primary key of the device and sensor
     * @return the device and sensor that was removed
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor remove(DeviceAndSensorPK deviceAndSensorPK)
        throws NoSuchDeviceAndSensorException, SystemException {
        return remove((Serializable) deviceAndSensorPK);
    }

    /**
     * Removes the device and sensor with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the device and sensor
     * @return the device and sensor that was removed
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor remove(Serializable primaryKey)
        throws NoSuchDeviceAndSensorException, SystemException {
        Session session = null;

        try {
            session = openSession();

            DeviceAndSensor deviceAndSensor = (DeviceAndSensor) session.get(DeviceAndSensorImpl.class,
                    primaryKey);

            if (deviceAndSensor == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDeviceAndSensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(deviceAndSensor);
        } catch (NoSuchDeviceAndSensorException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected DeviceAndSensor removeImpl(DeviceAndSensor deviceAndSensor)
        throws SystemException {
        deviceAndSensor = toUnwrappedModel(deviceAndSensor);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(deviceAndSensor)) {
                deviceAndSensor = (DeviceAndSensor) session.get(DeviceAndSensorImpl.class,
                        deviceAndSensor.getPrimaryKeyObj());
            }

            if (deviceAndSensor != null) {
                session.delete(deviceAndSensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (deviceAndSensor != null) {
            clearCache(deviceAndSensor);
        }

        return deviceAndSensor;
    }

    @Override
    public DeviceAndSensor updateImpl(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws SystemException {
        deviceAndSensor = toUnwrappedModel(deviceAndSensor);

        boolean isNew = deviceAndSensor.isNew();

        DeviceAndSensorModelImpl deviceAndSensorModelImpl = (DeviceAndSensorModelImpl) deviceAndSensor;

        Session session = null;

        try {
            session = openSession();

            if (deviceAndSensor.isNew()) {
                session.save(deviceAndSensor);

                deviceAndSensor.setNew(false);
            } else {
                session.merge(deviceAndSensor);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DeviceAndSensorModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((deviceAndSensorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceAndSensorModelImpl.getOriginalIdDevice()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);

                args = new Object[] { deviceAndSensorModelImpl.getIdDevice() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEVICEID,
                    args);
            }

            if ((deviceAndSensorModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        deviceAndSensorModelImpl.getOriginalIdDevice()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESENSORS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS,
                    args);

                args = new Object[] { deviceAndSensorModelImpl.getIdDevice() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ACTIVESENSORS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ACTIVESENSORS,
                    args);
            }
        }

        EntityCacheUtil.putResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
            DeviceAndSensorImpl.class, deviceAndSensor.getPrimaryKey(),
            deviceAndSensor);

        return deviceAndSensor;
    }

    protected DeviceAndSensor toUnwrappedModel(DeviceAndSensor deviceAndSensor) {
        if (deviceAndSensor instanceof DeviceAndSensorImpl) {
            return deviceAndSensor;
        }

        DeviceAndSensorImpl deviceAndSensorImpl = new DeviceAndSensorImpl();

        deviceAndSensorImpl.setNew(deviceAndSensor.isNew());
        deviceAndSensorImpl.setPrimaryKey(deviceAndSensor.getPrimaryKey());

        deviceAndSensorImpl.setIdDevice(deviceAndSensor.getIdDevice());
        deviceAndSensorImpl.setIdSensor(deviceAndSensor.getIdSensor());
        deviceAndSensorImpl.setStatus(deviceAndSensor.isStatus());

        return deviceAndSensorImpl;
    }

    /**
     * Returns the device and sensor with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the device and sensor
     * @return the device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findByPrimaryKey(Serializable primaryKey)
        throws NoSuchDeviceAndSensorException, SystemException {
        DeviceAndSensor deviceAndSensor = fetchByPrimaryKey(primaryKey);

        if (deviceAndSensor == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchDeviceAndSensorException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return deviceAndSensor;
    }

    /**
     * Returns the device and sensor with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceAndSensorException} if it could not be found.
     *
     * @param deviceAndSensorPK the primary key of the device and sensor
     * @return the device and sensor
     * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor findByPrimaryKey(DeviceAndSensorPK deviceAndSensorPK)
        throws NoSuchDeviceAndSensorException, SystemException {
        return findByPrimaryKey((Serializable) deviceAndSensorPK);
    }

    /**
     * Returns the device and sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the device and sensor
     * @return the device and sensor, or <code>null</code> if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        DeviceAndSensor deviceAndSensor = (DeviceAndSensor) EntityCacheUtil.getResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
                DeviceAndSensorImpl.class, primaryKey);

        if (deviceAndSensor == _nullDeviceAndSensor) {
            return null;
        }

        if (deviceAndSensor == null) {
            Session session = null;

            try {
                session = openSession();

                deviceAndSensor = (DeviceAndSensor) session.get(DeviceAndSensorImpl.class,
                        primaryKey);

                if (deviceAndSensor != null) {
                    cacheResult(deviceAndSensor);
                } else {
                    EntityCacheUtil.putResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
                        DeviceAndSensorImpl.class, primaryKey,
                        _nullDeviceAndSensor);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(DeviceAndSensorModelImpl.ENTITY_CACHE_ENABLED,
                    DeviceAndSensorImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return deviceAndSensor;
    }

    /**
     * Returns the device and sensor with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param deviceAndSensorPK the primary key of the device and sensor
     * @return the device and sensor, or <code>null</code> if a device and sensor with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public DeviceAndSensor fetchByPrimaryKey(
        DeviceAndSensorPK deviceAndSensorPK) throws SystemException {
        return fetchByPrimaryKey((Serializable) deviceAndSensorPK);
    }

    /**
     * Returns all the device and sensors.
     *
     * @return the device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the device and sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @return the range of device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the device and sensors.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of device and sensors
     * @param end the upper bound of the range of device and sensors (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of device and sensors
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<DeviceAndSensor> findAll(int start, int end,
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

        List<DeviceAndSensor> list = (List<DeviceAndSensor>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DEVICEANDSENSOR);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DEVICEANDSENSOR;

                if (pagination) {
                    sql = sql.concat(DeviceAndSensorModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<DeviceAndSensor>(list);
                } else {
                    list = (List<DeviceAndSensor>) QueryUtil.list(q,
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
     * Removes all the device and sensors from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (DeviceAndSensor deviceAndSensor : findAll()) {
            remove(deviceAndSensor);
        }
    }

    /**
     * Returns the number of device and sensors.
     *
     * @return the number of device and sensors
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

                Query q = session.createQuery(_SQL_COUNT_DEVICEANDSENSOR);

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
     * Initializes the device and sensor persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.es.eina.tfg.model.DeviceAndSensor")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<DeviceAndSensor>> listenersList = new ArrayList<ModelListener<DeviceAndSensor>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<DeviceAndSensor>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DeviceAndSensorImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

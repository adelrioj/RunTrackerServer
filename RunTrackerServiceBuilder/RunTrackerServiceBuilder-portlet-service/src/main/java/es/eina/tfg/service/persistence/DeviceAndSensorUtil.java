package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.DeviceAndSensor;

import java.util.List;

/**
 * The persistence utility for the device and sensor service. This utility wraps {@link DeviceAndSensorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DeviceAndSensorPersistence
 * @see DeviceAndSensorPersistenceImpl
 * @generated
 */
public class DeviceAndSensorUtil {
    private static DeviceAndSensorPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(DeviceAndSensor deviceAndSensor) {
        getPersistence().clearCache(deviceAndSensor);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<DeviceAndSensor> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<DeviceAndSensor> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<DeviceAndSensor> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static DeviceAndSensor update(DeviceAndSensor deviceAndSensor)
        throws SystemException {
        return getPersistence().update(deviceAndSensor);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static DeviceAndSensor update(DeviceAndSensor deviceAndSensor,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(deviceAndSensor, serviceContext);
    }

    /**
    * Returns all the device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBydeviceId(idDevice);
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBydeviceId(idDevice, start, end);
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBydeviceId(idDevice, start, end, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor findBydeviceId_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence().findBydeviceId_First(idDevice, orderByComparator);
    }

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor fetchBydeviceId_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBydeviceId_First(idDevice, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor findBydeviceId_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence().findBydeviceId_Last(idDevice, orderByComparator);
    }

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor fetchBydeviceId_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBydeviceId_Last(idDevice, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor[] findBydeviceId_PrevAndNext(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK,
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence()
                   .findBydeviceId_PrevAndNext(deviceAndSensorPK, idDevice,
            orderByComparator);
    }

    /**
    * Removes all the device and sensors where idDevice = &#63; from the database.
    *
    * @param idDevice the id device
    * @throws SystemException if a system exception occurred
    */
    public static void removeBydeviceId(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBydeviceId(idDevice);
    }

    /**
    * Returns the number of device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the number of matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static int countBydeviceId(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBydeviceId(idDevice);
    }

    /**
    * Returns all the device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByactiveSensors(idDevice);
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByactiveSensors(idDevice, start, end);
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByactiveSensors(idDevice, start, end, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor findByactiveSensors_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence()
                   .findByactiveSensors_First(idDevice, orderByComparator);
    }

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor fetchByactiveSensors_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByactiveSensors_First(idDevice, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor findByactiveSensors_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence()
                   .findByactiveSensors_Last(idDevice, orderByComparator);
    }

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor fetchByactiveSensors_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByactiveSensors_Last(idDevice, orderByComparator);
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
    public static es.eina.tfg.model.DeviceAndSensor[] findByactiveSensors_PrevAndNext(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK,
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence()
                   .findByactiveSensors_PrevAndNext(deviceAndSensorPK,
            idDevice, orderByComparator);
    }

    /**
    * Removes all the device and sensors where idDevice = &#63; from the database.
    *
    * @param idDevice the id device
    * @throws SystemException if a system exception occurred
    */
    public static void removeByactiveSensors(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByactiveSensors(idDevice);
    }

    /**
    * Returns the number of device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the number of matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static int countByactiveSensors(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByactiveSensors(idDevice);
    }

    /**
    * Caches the device and sensor in the entity cache if it is enabled.
    *
    * @param deviceAndSensor the device and sensor
    */
    public static void cacheResult(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor) {
        getPersistence().cacheResult(deviceAndSensor);
    }

    /**
    * Caches the device and sensors in the entity cache if it is enabled.
    *
    * @param deviceAndSensors the device and sensors
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.DeviceAndSensor> deviceAndSensors) {
        getPersistence().cacheResult(deviceAndSensors);
    }

    /**
    * Creates a new device and sensor with the primary key. Does not add the device and sensor to the database.
    *
    * @param deviceAndSensorPK the primary key for the new device and sensor
    * @return the new device and sensor
    */
    public static es.eina.tfg.model.DeviceAndSensor create(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK) {
        return getPersistence().create(deviceAndSensorPK);
    }

    /**
    * Removes the device and sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor that was removed
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor remove(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence().remove(deviceAndSensorPK);
    }

    public static es.eina.tfg.model.DeviceAndSensor updateImpl(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(deviceAndSensor);
    }

    /**
    * Returns the device and sensor with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceAndSensorException} if it could not be found.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor findByPrimaryKey(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException {
        return getPersistence().findByPrimaryKey(deviceAndSensorPK);
    }

    /**
    * Returns the device and sensor with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor, or <code>null</code> if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.DeviceAndSensor fetchByPrimaryKey(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(deviceAndSensorPK);
    }

    /**
    * Returns all the device and sensors.
    *
    * @return the device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the device and sensors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of device and sensors.
    *
    * @return the number of device and sensors
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DeviceAndSensorPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DeviceAndSensorPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    DeviceAndSensorPersistence.class.getName());

            ReferenceRegistry.registerReference(DeviceAndSensorUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(DeviceAndSensorPersistence persistence) {
    }
}

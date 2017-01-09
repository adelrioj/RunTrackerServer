package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.DeviceAndSensor;

/**
 * The persistence interface for the device and sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DeviceAndSensorPersistenceImpl
 * @see DeviceAndSensorUtil
 * @generated
 */
public interface DeviceAndSensorPersistence extends BasePersistence<DeviceAndSensor> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceAndSensorUtil} to access the device and sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findBydeviceId(
        long idDevice, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor findBydeviceId_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor fetchBydeviceId_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor findBydeviceId_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor fetchBydeviceId_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.DeviceAndSensor[] findBydeviceId_PrevAndNext(
        DeviceAndSensorPK deviceAndSensorPK, long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Removes all the device and sensors where idDevice = &#63; from the database.
    *
    * @param idDevice the id device
    * @throws SystemException if a system exception occurred
    */
    public void removeBydeviceId(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the number of matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public int countBydeviceId(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findByactiveSensors(
        long idDevice, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor findByactiveSensors_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Returns the first device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor fetchByactiveSensors_First(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor findByactiveSensors_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Returns the last device and sensor in the ordered set where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device and sensor, or <code>null</code> if a matching device and sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor fetchByactiveSensors_Last(
        long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.DeviceAndSensor[] findByactiveSensors_PrevAndNext(
        DeviceAndSensorPK deviceAndSensorPK, long idDevice,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Removes all the device and sensors where idDevice = &#63; from the database.
    *
    * @param idDevice the id device
    * @throws SystemException if a system exception occurred
    */
    public void removeByactiveSensors(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device and sensors where idDevice = &#63;.
    *
    * @param idDevice the id device
    * @return the number of matching device and sensors
    * @throws SystemException if a system exception occurred
    */
    public int countByactiveSensors(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device and sensor in the entity cache if it is enabled.
    *
    * @param deviceAndSensor the device and sensor
    */
    public void cacheResult(es.eina.tfg.model.DeviceAndSensor deviceAndSensor);

    /**
    * Caches the device and sensors in the entity cache if it is enabled.
    *
    * @param deviceAndSensors the device and sensors
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.DeviceAndSensor> deviceAndSensors);

    /**
    * Creates a new device and sensor with the primary key. Does not add the device and sensor to the database.
    *
    * @param deviceAndSensorPK the primary key for the new device and sensor
    * @return the new device and sensor
    */
    public es.eina.tfg.model.DeviceAndSensor create(
        DeviceAndSensorPK deviceAndSensorPK);

    /**
    * Removes the device and sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor that was removed
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor remove(
        DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    public es.eina.tfg.model.DeviceAndSensor updateImpl(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device and sensor with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceAndSensorException} if it could not be found.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor
    * @throws es.eina.tfg.NoSuchDeviceAndSensorException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor findByPrimaryKey(
        DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceAndSensorException;

    /**
    * Returns the device and sensor with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor, or <code>null</code> if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.DeviceAndSensor fetchByPrimaryKey(
        DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device and sensors.
    *
    * @return the device and sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device and sensors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device and sensors.
    *
    * @return the number of device and sensors
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

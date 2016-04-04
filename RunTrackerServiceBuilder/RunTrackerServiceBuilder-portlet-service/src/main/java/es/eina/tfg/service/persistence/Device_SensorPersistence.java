package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Device_Sensor;

/**
 * The persistence interface for the device_ sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see Device_SensorPersistenceImpl
 * @see Device_SensorUtil
 * @generated
 */
public interface Device_SensorPersistence extends BasePersistence<Device_Sensor> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Device_SensorUtil} to access the device_ sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the device_ sensors where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the matching device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device_Sensor> findBydeviceId(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findBydeviceId(
        long deviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findBydeviceId(
        long deviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device_ sensor
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor findBydeviceId_First(long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor fetchBydeviceId_First(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device_ sensor
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor findBydeviceId_Last(long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor fetchBydeviceId_Last(long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.Device_Sensor[] findBydeviceId_PrevAndNext(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK,
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Removes all the device_ sensors where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBydeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device_ sensors where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public int countBydeviceId(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device_ sensors where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the matching device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device_Sensor> findByactiveSensors(
        long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findByactiveSensors(
        long deviceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findByactiveSensors(
        long deviceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device_ sensor
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor findByactiveSensors_First(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Returns the first device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor fetchByactiveSensors_First(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device_ sensor
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor findByactiveSensors_Last(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Returns the last device_ sensor in the ordered set where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device_ sensor, or <code>null</code> if a matching device_ sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor fetchByactiveSensors_Last(
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.Device_Sensor[] findByactiveSensors_PrevAndNext(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK,
        long deviceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Removes all the device_ sensors where deviceId = &#63; from the database.
    *
    * @param deviceId the device ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByactiveSensors(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device_ sensors where deviceId = &#63;.
    *
    * @param deviceId the device ID
    * @return the number of matching device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public int countByactiveSensors(long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device_ sensor in the entity cache if it is enabled.
    *
    * @param device_Sensor the device_ sensor
    */
    public void cacheResult(es.eina.tfg.model.Device_Sensor device_Sensor);

    /**
    * Caches the device_ sensors in the entity cache if it is enabled.
    *
    * @param device_Sensors the device_ sensors
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.Device_Sensor> device_Sensors);

    /**
    * Creates a new device_ sensor with the primary key. Does not add the device_ sensor to the database.
    *
    * @param device_SensorPK the primary key for the new device_ sensor
    * @return the new device_ sensor
    */
    public es.eina.tfg.model.Device_Sensor create(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK);

    /**
    * Removes the device_ sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param device_SensorPK the primary key of the device_ sensor
    * @return the device_ sensor that was removed
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor remove(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    public es.eina.tfg.model.Device_Sensor updateImpl(
        es.eina.tfg.model.Device_Sensor device_Sensor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device_ sensor with the primary key or throws a {@link es.eina.tfg.NoSuchDevice_SensorException} if it could not be found.
    *
    * @param device_SensorPK the primary key of the device_ sensor
    * @return the device_ sensor
    * @throws es.eina.tfg.NoSuchDevice_SensorException if a device_ sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor findByPrimaryKey(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDevice_SensorException;

    /**
    * Returns the device_ sensor with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param device_SensorPK the primary key of the device_ sensor
    * @return the device_ sensor, or <code>null</code> if a device_ sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device_Sensor fetchByPrimaryKey(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the device_ sensors.
    *
    * @return the device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device_Sensor> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device_Sensor> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the device_ sensors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of device_ sensors.
    *
    * @return the number of device_ sensors
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

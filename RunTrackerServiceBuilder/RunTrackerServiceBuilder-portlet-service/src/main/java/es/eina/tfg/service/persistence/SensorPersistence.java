package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Sensor;

/**
 * The persistence interface for the sensor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see SensorPersistenceImpl
 * @see SensorUtil
 * @generated
 */
public interface SensorPersistence extends BasePersistence<Sensor> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SensorUtil} to access the sensor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the sensors where type = &#63;.
    *
    * @param type the type
    * @return the matching sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Sensor> findBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Sensor> findBytype(int type,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Sensor> findBytype(int type,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sensor
    * @throws es.eina.tfg.NoSuchSensorException if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor findBytype_First(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException;

    /**
    * Returns the first sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sensor, or <code>null</code> if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor fetchBytype_First(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sensor
    * @throws es.eina.tfg.NoSuchSensorException if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor findBytype_Last(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException;

    /**
    * Returns the last sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sensor, or <code>null</code> if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor fetchBytype_Last(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.Sensor[] findBytype_PrevAndNext(long sensorId,
        int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException;

    /**
    * Removes all the sensors where type = &#63; from the database.
    *
    * @param type the type
    * @throws SystemException if a system exception occurred
    */
    public void removeBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sensors where type = &#63;.
    *
    * @param type the type
    * @return the number of matching sensors
    * @throws SystemException if a system exception occurred
    */
    public int countBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the sensor in the entity cache if it is enabled.
    *
    * @param sensor the sensor
    */
    public void cacheResult(es.eina.tfg.model.Sensor sensor);

    /**
    * Caches the sensors in the entity cache if it is enabled.
    *
    * @param sensors the sensors
    */
    public void cacheResult(java.util.List<es.eina.tfg.model.Sensor> sensors);

    /**
    * Creates a new sensor with the primary key. Does not add the sensor to the database.
    *
    * @param sensorId the primary key for the new sensor
    * @return the new sensor
    */
    public es.eina.tfg.model.Sensor create(long sensorId);

    /**
    * Removes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param sensorId the primary key of the sensor
    * @return the sensor that was removed
    * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor remove(long sensorId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException;

    public es.eina.tfg.model.Sensor updateImpl(es.eina.tfg.model.Sensor sensor)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sensor with the primary key or throws a {@link es.eina.tfg.NoSuchSensorException} if it could not be found.
    *
    * @param sensorId the primary key of the sensor
    * @return the sensor
    * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor findByPrimaryKey(long sensorId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException;

    /**
    * Returns the sensor with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param sensorId the primary key of the sensor
    * @return the sensor, or <code>null</code> if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Sensor fetchByPrimaryKey(long sensorId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sensors.
    *
    * @return the sensors
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Sensor> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Sensor> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Sensor> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the sensors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sensors.
    *
    * @return the number of sensors
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

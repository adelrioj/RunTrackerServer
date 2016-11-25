package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.Sensor;

import java.util.List;

/**
 * The persistence utility for the sensor service. This utility wraps {@link SensorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see SensorPersistence
 * @see SensorPersistenceImpl
 * @generated
 */
public class SensorUtil {
    private static SensorPersistence _persistence;

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
    public static void clearCache(Sensor sensor) {
        getPersistence().clearCache(sensor);
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
    public static List<Sensor> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Sensor> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Sensor> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Sensor update(Sensor sensor) throws SystemException {
        return getPersistence().update(sensor);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Sensor update(Sensor sensor, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(sensor, serviceContext);
    }

    /**
    * Returns all the sensors where type = &#63;.
    *
    * @param type the type
    * @return the matching sensors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Sensor> findBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytype(type);
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
    public static java.util.List<es.eina.tfg.model.Sensor> findBytype(
        int type, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytype(type, start, end);
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
    public static java.util.List<es.eina.tfg.model.Sensor> findBytype(
        int type, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBytype(type, start, end, orderByComparator);
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
    public static es.eina.tfg.model.Sensor findBytype_First(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException {
        return getPersistence().findBytype_First(type, orderByComparator);
    }

    /**
    * Returns the first sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sensor, or <code>null</code> if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor fetchBytype_First(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytype_First(type, orderByComparator);
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
    public static es.eina.tfg.model.Sensor findBytype_Last(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException {
        return getPersistence().findBytype_Last(type, orderByComparator);
    }

    /**
    * Returns the last sensor in the ordered set where type = &#63;.
    *
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sensor, or <code>null</code> if a matching sensor could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor fetchBytype_Last(int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBytype_Last(type, orderByComparator);
    }

    /**
    * Returns the sensors before and after the current sensor in the ordered set where type = &#63;.
    *
    * @param idSensor the primary key of the current sensor
    * @param type the type
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next sensor
    * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor[] findBytype_PrevAndNext(
        long idSensor, int type,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException {
        return getPersistence()
                   .findBytype_PrevAndNext(idSensor, type, orderByComparator);
    }

    /**
    * Removes all the sensors where type = &#63; from the database.
    *
    * @param type the type
    * @throws SystemException if a system exception occurred
    */
    public static void removeBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBytype(type);
    }

    /**
    * Returns the number of sensors where type = &#63;.
    *
    * @param type the type
    * @return the number of matching sensors
    * @throws SystemException if a system exception occurred
    */
    public static int countBytype(int type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBytype(type);
    }

    /**
    * Caches the sensor in the entity cache if it is enabled.
    *
    * @param sensor the sensor
    */
    public static void cacheResult(es.eina.tfg.model.Sensor sensor) {
        getPersistence().cacheResult(sensor);
    }

    /**
    * Caches the sensors in the entity cache if it is enabled.
    *
    * @param sensors the sensors
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.Sensor> sensors) {
        getPersistence().cacheResult(sensors);
    }

    /**
    * Creates a new sensor with the primary key. Does not add the sensor to the database.
    *
    * @param idSensor the primary key for the new sensor
    * @return the new sensor
    */
    public static es.eina.tfg.model.Sensor create(long idSensor) {
        return getPersistence().create(idSensor);
    }

    /**
    * Removes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idSensor the primary key of the sensor
    * @return the sensor that was removed
    * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor remove(long idSensor)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException {
        return getPersistence().remove(idSensor);
    }

    public static es.eina.tfg.model.Sensor updateImpl(
        es.eina.tfg.model.Sensor sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(sensor);
    }

    /**
    * Returns the sensor with the primary key or throws a {@link es.eina.tfg.NoSuchSensorException} if it could not be found.
    *
    * @param idSensor the primary key of the sensor
    * @return the sensor
    * @throws es.eina.tfg.NoSuchSensorException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor findByPrimaryKey(long idSensor)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchSensorException {
        return getPersistence().findByPrimaryKey(idSensor);
    }

    /**
    * Returns the sensor with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idSensor the primary key of the sensor
    * @return the sensor, or <code>null</code> if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor fetchByPrimaryKey(long idSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idSensor);
    }

    /**
    * Returns all the sensors.
    *
    * @return the sensors
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Sensor> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.eina.tfg.model.Sensor> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<es.eina.tfg.model.Sensor> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the sensors from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of sensors.
    *
    * @return the number of sensors
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SensorPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SensorPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    SensorPersistence.class.getName());

            ReferenceRegistry.registerReference(SensorUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SensorPersistence persistence) {
    }
}

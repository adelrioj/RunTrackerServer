package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Sensor. This utility wraps
 * {@link es.eina.tfg.service.impl.SensorLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see SensorLocalService
 * @see es.eina.tfg.service.base.SensorLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.SensorLocalServiceImpl
 * @generated
 */
public class SensorLocalServiceUtil {
    private static SensorLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.SensorLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the sensor to the database. Also notifies the appropriate model listeners.
    *
    * @param sensor the sensor
    * @return the sensor that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor addSensor(
        es.eina.tfg.model.Sensor sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSensor(sensor);
    }

    /**
    * Creates a new sensor with the primary key. Does not add the sensor to the database.
    *
    * @param idSensor the primary key for the new sensor
    * @return the new sensor
    */
    public static es.eina.tfg.model.Sensor createSensor(long idSensor) {
        return getService().createSensor(idSensor);
    }

    /**
    * Deletes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idSensor the primary key of the sensor
    * @return the sensor that was removed
    * @throws PortalException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor deleteSensor(long idSensor)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSensor(idSensor);
    }

    /**
    * Deletes the sensor from the database. Also notifies the appropriate model listeners.
    *
    * @param sensor the sensor
    * @return the sensor that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor deleteSensor(
        es.eina.tfg.model.Sensor sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSensor(sensor);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static es.eina.tfg.model.Sensor fetchSensor(long idSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSensor(idSensor);
    }

    /**
    * Returns the sensor with the primary key.
    *
    * @param idSensor the primary key of the sensor
    * @return the sensor
    * @throws PortalException if a sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor getSensor(long idSensor)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSensor(idSensor);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<es.eina.tfg.model.Sensor> getSensors(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSensors(start, end);
    }

    /**
    * Returns the number of sensors.
    *
    * @return the number of sensors
    * @throws SystemException if a system exception occurred
    */
    public static int getSensorsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSensorsCount();
    }

    /**
    * Updates the sensor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sensor the sensor
    * @return the sensor that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Sensor updateSensor(
        es.eina.tfg.model.Sensor sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSensor(sensor);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.lang.Long generateNewIdSensor()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdSensor();
    }

    public static void clearService() {
        _service = null;
    }

    public static SensorLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    SensorLocalService.class.getName());

            if (invokableLocalService instanceof SensorLocalService) {
                _service = (SensorLocalService) invokableLocalService;
            } else {
                _service = new SensorLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(SensorLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SensorLocalService service) {
    }
}

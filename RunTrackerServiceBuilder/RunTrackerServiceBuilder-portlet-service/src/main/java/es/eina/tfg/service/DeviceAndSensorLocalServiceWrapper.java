package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceAndSensorLocalService}.
 *
 * @author adelrioj
 * @see DeviceAndSensorLocalService
 * @generated
 */
public class DeviceAndSensorLocalServiceWrapper
    implements DeviceAndSensorLocalService,
        ServiceWrapper<DeviceAndSensorLocalService> {
    private DeviceAndSensorLocalService _deviceAndSensorLocalService;

    public DeviceAndSensorLocalServiceWrapper(
        DeviceAndSensorLocalService deviceAndSensorLocalService) {
        _deviceAndSensorLocalService = deviceAndSensorLocalService;
    }

    /**
    * Adds the device and sensor to the database. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensor the device and sensor
    * @return the device and sensor that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor addDeviceAndSensor(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.addDeviceAndSensor(deviceAndSensor);
    }

    /**
    * Creates a new device and sensor with the primary key. Does not add the device and sensor to the database.
    *
    * @param deviceAndSensorPK the primary key for the new device and sensor
    * @return the new device and sensor
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor createDeviceAndSensor(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK) {
        return _deviceAndSensorLocalService.createDeviceAndSensor(deviceAndSensorPK);
    }

    /**
    * Deletes the device and sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor that was removed
    * @throws PortalException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor deleteDeviceAndSensor(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.deleteDeviceAndSensor(deviceAndSensorPK);
    }

    /**
    * Deletes the device and sensor from the database. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensor the device and sensor
    * @return the device and sensor that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor deleteDeviceAndSensor(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.deleteDeviceAndSensor(deviceAndSensor);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _deviceAndSensorLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceAndSensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.DeviceAndSensor fetchDeviceAndSensor(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.fetchDeviceAndSensor(deviceAndSensorPK);
    }

    /**
    * Returns the device and sensor with the primary key.
    *
    * @param deviceAndSensorPK the primary key of the device and sensor
    * @return the device and sensor
    * @throws PortalException if a device and sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor getDeviceAndSensor(
        es.eina.tfg.service.persistence.DeviceAndSensorPK deviceAndSensorPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getDeviceAndSensor(deviceAndSensorPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> getDeviceAndSensors(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getDeviceAndSensors(start, end);
    }

    /**
    * Returns the number of device and sensors.
    *
    * @return the number of device and sensors
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDeviceAndSensorsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getDeviceAndSensorsCount();
    }

    /**
    * Updates the device and sensor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param deviceAndSensor the device and sensor
    * @return the device and sensor that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.DeviceAndSensor updateDeviceAndSensor(
        es.eina.tfg.model.DeviceAndSensor deviceAndSensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.updateDeviceAndSensor(deviceAndSensor);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _deviceAndSensorLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _deviceAndSensorLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _deviceAndSensorLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.DeviceAndSensor delete(long idDevice, long idSensor)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.delete(idDevice, idSensor);
    }

    @Override
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> getSensorsByDevice(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getSensorsByDevice(deviceId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.DeviceAndSensor> getActiveSensorsByDevice(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _deviceAndSensorLocalService.getActiveSensorsByDevice(deviceId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DeviceAndSensorLocalService getWrappedDeviceAndSensorLocalService() {
        return _deviceAndSensorLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDeviceAndSensorLocalService(
        DeviceAndSensorLocalService deviceAndSensorLocalService) {
        _deviceAndSensorLocalService = deviceAndSensorLocalService;
    }

    @Override
    public DeviceAndSensorLocalService getWrappedService() {
        return _deviceAndSensorLocalService;
    }

    @Override
    public void setWrappedService(
        DeviceAndSensorLocalService deviceAndSensorLocalService) {
        _deviceAndSensorLocalService = deviceAndSensorLocalService;
    }
}

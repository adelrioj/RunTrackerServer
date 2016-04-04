package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Device_SensorLocalService}.
 *
 * @author adelrioj
 * @see Device_SensorLocalService
 * @generated
 */
public class Device_SensorLocalServiceWrapper
    implements Device_SensorLocalService,
        ServiceWrapper<Device_SensorLocalService> {
    private Device_SensorLocalService _device_SensorLocalService;

    public Device_SensorLocalServiceWrapper(
        Device_SensorLocalService device_SensorLocalService) {
        _device_SensorLocalService = device_SensorLocalService;
    }

    /**
    * Adds the device_ sensor to the database. Also notifies the appropriate model listeners.
    *
    * @param device_Sensor the device_ sensor
    * @return the device_ sensor that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Device_Sensor addDevice_Sensor(
        es.eina.tfg.model.Device_Sensor device_Sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.addDevice_Sensor(device_Sensor);
    }

    /**
    * Creates a new device_ sensor with the primary key. Does not add the device_ sensor to the database.
    *
    * @param device_SensorPK the primary key for the new device_ sensor
    * @return the new device_ sensor
    */
    @Override
    public es.eina.tfg.model.Device_Sensor createDevice_Sensor(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK) {
        return _device_SensorLocalService.createDevice_Sensor(device_SensorPK);
    }

    /**
    * Deletes the device_ sensor with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param device_SensorPK the primary key of the device_ sensor
    * @return the device_ sensor that was removed
    * @throws PortalException if a device_ sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Device_Sensor deleteDevice_Sensor(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.deleteDevice_Sensor(device_SensorPK);
    }

    /**
    * Deletes the device_ sensor from the database. Also notifies the appropriate model listeners.
    *
    * @param device_Sensor the device_ sensor
    * @return the device_ sensor that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Device_Sensor deleteDevice_Sensor(
        es.eina.tfg.model.Device_Sensor device_Sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.deleteDevice_Sensor(device_Sensor);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _device_SensorLocalService.dynamicQuery();
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
        return _device_SensorLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _device_SensorLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.Device_SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _device_SensorLocalService.dynamicQuery(dynamicQuery, start,
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
        return _device_SensorLocalService.dynamicQueryCount(dynamicQuery);
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
        return _device_SensorLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.Device_Sensor fetchDevice_Sensor(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.fetchDevice_Sensor(device_SensorPK);
    }

    /**
    * Returns the device_ sensor with the primary key.
    *
    * @param device_SensorPK the primary key of the device_ sensor
    * @return the device_ sensor
    * @throws PortalException if a device_ sensor with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Device_Sensor getDevice_Sensor(
        es.eina.tfg.service.persistence.Device_SensorPK device_SensorPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.getDevice_Sensor(device_SensorPK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<es.eina.tfg.model.Device_Sensor> getDevice_Sensors(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.getDevice_Sensors(start, end);
    }

    /**
    * Returns the number of device_ sensors.
    *
    * @return the number of device_ sensors
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getDevice_SensorsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.getDevice_SensorsCount();
    }

    /**
    * Updates the device_ sensor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param device_Sensor the device_ sensor
    * @return the device_ sensor that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Device_Sensor updateDevice_Sensor(
        es.eina.tfg.model.Device_Sensor device_Sensor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.updateDevice_Sensor(device_Sensor);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _device_SensorLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _device_SensorLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _device_SensorLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.Device_Sensor add(java.lang.Long deviceId,
        java.lang.Long sensorId, boolean status)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingDeviceException,
            es.eina.tfg.NonExistingSensorException {
        return _device_SensorLocalService.add(deviceId, sensorId, status);
    }

    @Override
    public es.eina.tfg.model.Device_Sensor update(java.lang.Long deviceId,
        java.lang.Long sensorId, boolean status)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.update(deviceId, sensorId, status);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Device_Sensor> findByDeviceId(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.findByDeviceId(deviceId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Device_Sensor> findActiveSensors(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _device_SensorLocalService.findActiveSensors(deviceId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Device_SensorLocalService getWrappedDevice_SensorLocalService() {
        return _device_SensorLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDevice_SensorLocalService(
        Device_SensorLocalService device_SensorLocalService) {
        _device_SensorLocalService = device_SensorLocalService;
    }

    @Override
    public Device_SensorLocalService getWrappedService() {
        return _device_SensorLocalService;
    }

    @Override
    public void setWrappedService(
        Device_SensorLocalService device_SensorLocalService) {
        _device_SensorLocalService = device_SensorLocalService;
    }
}

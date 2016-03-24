/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceLocalService}.
 *
 * @author adelrioj
 * @see DeviceLocalService
 * @generated
 */
public class DeviceLocalServiceWrapper implements DeviceLocalService,
	ServiceWrapper<DeviceLocalService> {
	public DeviceLocalServiceWrapper(DeviceLocalService deviceLocalService) {
		_deviceLocalService = deviceLocalService;
	}

	/**
	* Adds the device to the database. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Device addDevice(es.eina.tfg.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.addDevice(device);
	}

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param deviceId the primary key for the new device
	* @return the new device
	*/
	@Override
	public es.eina.tfg.model.Device createDevice(long deviceId) {
		return _deviceLocalService.createDevice(deviceId);
	}

	/**
	* Deletes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the device
	* @return the device that was removed
	* @throws PortalException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Device deleteDevice(long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.deleteDevice(deviceId);
	}

	/**
	* Deletes the device from the database. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Device deleteDevice(
		es.eina.tfg.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.deleteDevice(device);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deviceLocalService.dynamicQuery();
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
		return _deviceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _deviceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _deviceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _deviceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _deviceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.eina.tfg.model.Device fetchDevice(long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.fetchDevice(deviceId);
	}

	/**
	* Returns the device with the primary key.
	*
	* @param deviceId the primary key of the device
	* @return the device
	* @throws PortalException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Device getDevice(long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getDevice(deviceId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of devices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.eina.tfg.model.Device> getDevices(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getDevices(start, end);
	}

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDevicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getDevicesCount();
	}

	/**
	* Updates the device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Device updateDevice(
		es.eina.tfg.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.updateDevice(device);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _deviceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_deviceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _deviceLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Device add(java.lang.String deviceUUID,
		java.lang.Long userId, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return _deviceLocalService.add(deviceUUID, userId, description, status,
			phoneNumber, serverPhoneNumber, smsPollTime, smsTransmitPeriod,
			cloudId, serverIp, httpTransmitPeriod);
	}

	@Override
	public es.eina.tfg.model.Device update(java.lang.Long deviceId,
		java.lang.String deviceUUID, java.lang.Long userId,
		java.lang.String description, java.lang.String status,
		java.lang.String phoneNumber, java.lang.String serverPhoneNumber,
		java.lang.String smsPollTime, java.lang.String smsTransmitPeriod,
		java.lang.String cloudId, java.lang.String serverIp,
		java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingUserException {
		return _deviceLocalService.update(deviceId, deviceUUID, userId,
			description, status, phoneNumber, serverPhoneNumber, smsPollTime,
			smsTransmitPeriod, cloudId, serverIp, httpTransmitPeriod);
	}

	@Override
	public es.eina.tfg.model.Device getDeviceByPhoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return _deviceLocalService.getDeviceByPhoneNumber(phoneNumber);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getSensors(deviceId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.getActiveSensors(deviceId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.findByUserId(userId);
	}

	@Override
	public es.eina.tfg.model.Device findBydeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return _deviceLocalService.findBydeviceUUID(deviceUUID);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.findByStatus(status);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceLocalService.findByStatus(status, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DeviceLocalService getWrappedDeviceLocalService() {
		return _deviceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDeviceLocalService(
		DeviceLocalService deviceLocalService) {
		_deviceLocalService = deviceLocalService;
	}

	@Override
	public DeviceLocalService getWrappedService() {
		return _deviceLocalService;
	}

	@Override
	public void setWrappedService(DeviceLocalService deviceLocalService) {
		_deviceLocalService = deviceLocalService;
	}

	private DeviceLocalService _deviceLocalService;
}
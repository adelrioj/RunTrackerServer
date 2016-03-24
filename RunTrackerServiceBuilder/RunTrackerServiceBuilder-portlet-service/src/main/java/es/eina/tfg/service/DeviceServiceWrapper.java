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
 * Provides a wrapper for {@link DeviceService}.
 *
 * @author adelrioj
 * @see DeviceService
 * @generated
 */
public class DeviceServiceWrapper implements DeviceService,
	ServiceWrapper<DeviceService> {
	public DeviceServiceWrapper(DeviceService deviceService) {
		_deviceService = deviceService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _deviceService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_deviceService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _deviceService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Device add(java.lang.Long userId,
		java.lang.String deviceUUID, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return _deviceService.add(userId, deviceUUID, description, status,
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
		return _deviceService.update(deviceId, deviceUUID, userId, description,
			status, phoneNumber, serverPhoneNumber, smsPollTime,
			smsTransmitPeriod, cloudId, serverIp, httpTransmitPeriod);
	}

	@Override
	public es.eina.tfg.model.Device delete(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.delete(deviceId);
	}

	@Override
	public es.eina.tfg.model.Device getDevice(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.getDevice(deviceId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.getSensors(deviceId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.getActiveSensors(deviceId);
	}

	@Override
	public es.eina.tfg.model.Device getDeviceByPhoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return _deviceService.getDeviceByPhoneNumber(phoneNumber);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.findByUserId(userId);
	}

	@Override
	public es.eina.tfg.model.Device findByDeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return _deviceService.findByDeviceUUID(deviceUUID);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.findByStatus(status);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _deviceService.findByStatus(status, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DeviceService getWrappedDeviceService() {
		return _deviceService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDeviceService(DeviceService deviceService) {
		_deviceService = deviceService;
	}

	@Override
	public DeviceService getWrappedService() {
		return _deviceService;
	}

	@Override
	public void setWrappedService(DeviceService deviceService) {
		_deviceService = deviceService;
	}

	private DeviceService _deviceService;
}
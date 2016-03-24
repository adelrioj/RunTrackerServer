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
 * Provides a wrapper for {@link Device_SensorService}.
 *
 * @author adelrioj
 * @see Device_SensorService
 * @generated
 */
public class Device_SensorServiceWrapper implements Device_SensorService,
	ServiceWrapper<Device_SensorService> {
	public Device_SensorServiceWrapper(
		Device_SensorService device_SensorService) {
		_device_SensorService = device_SensorService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _device_SensorService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_device_SensorService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _device_SensorService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public es.eina.tfg.model.Device_Sensor add(java.lang.Long deviceId,
		java.lang.Long sensorId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingSensorException {
		return _device_SensorService.add(deviceId, sensorId, status);
	}

	@Override
	public es.eina.tfg.model.Device_Sensor update(java.lang.Long deviceId,
		java.lang.Long sensorId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _device_SensorService.update(deviceId, sensorId, status);
	}

	@Override
	public es.eina.tfg.model.Device_Sensor delete(java.lang.Long deviceId,
		java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _device_SensorService.delete(deviceId, sensorId);
	}

	@Override
	public es.eina.tfg.model.Device_Sensor getDeviceSensor(
		java.lang.Long deviceId, java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _device_SensorService.getDeviceSensor(deviceId, sensorId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device_Sensor> findByDeviceId(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _device_SensorService.findByDeviceId(deviceId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device_Sensor> findActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _device_SensorService.findActiveSensors(deviceId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Device_SensorService getWrappedDevice_SensorService() {
		return _device_SensorService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDevice_SensorService(
		Device_SensorService device_SensorService) {
		_device_SensorService = device_SensorService;
	}

	@Override
	public Device_SensorService getWrappedService() {
		return _device_SensorService;
	}

	@Override
	public void setWrappedService(Device_SensorService device_SensorService) {
		_device_SensorService = device_SensorService;
	}

	private Device_SensorService _device_SensorService;
}
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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Device_Sensor. This utility wraps
 * {@link es.eina.tfg.service.impl.Device_SensorServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see Device_SensorService
 * @see es.eina.tfg.service.base.Device_SensorServiceBaseImpl
 * @see es.eina.tfg.service.impl.Device_SensorServiceImpl
 * @generated
 */
public class Device_SensorServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.Device_SensorServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

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

	public static es.eina.tfg.model.Device_Sensor add(java.lang.Long deviceId,
		java.lang.Long sensorId, boolean status)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingSensorException {
		return getService().add(deviceId, sensorId, status);
	}

	public static es.eina.tfg.model.Device_Sensor update(
		java.lang.Long deviceId, java.lang.Long sensorId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().update(deviceId, sensorId, status);
	}

	public static es.eina.tfg.model.Device_Sensor delete(
		java.lang.Long deviceId, java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(deviceId, sensorId);
	}

	public static es.eina.tfg.model.Device_Sensor getDeviceSensor(
		java.lang.Long deviceId, java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDeviceSensor(deviceId, sensorId);
	}

	public static java.util.List<es.eina.tfg.model.Device_Sensor> findByDeviceId(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDeviceId(deviceId);
	}

	public static java.util.List<es.eina.tfg.model.Device_Sensor> findActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findActiveSensors(deviceId);
	}

	public static void clearService() {
		_service = null;
	}

	public static Device_SensorService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					Device_SensorService.class.getName());

			if (invokableService instanceof Device_SensorService) {
				_service = (Device_SensorService)invokableService;
			}
			else {
				_service = new Device_SensorServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(Device_SensorServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(Device_SensorService service) {
	}

	private static Device_SensorService _service;
}
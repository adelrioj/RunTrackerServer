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
 * Provides the remote service utility for Device. This utility wraps
 * {@link es.eina.tfg.service.impl.DeviceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see DeviceService
 * @see es.eina.tfg.service.base.DeviceServiceBaseImpl
 * @see es.eina.tfg.service.impl.DeviceServiceImpl
 * @generated
 */
public class DeviceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.DeviceServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static es.eina.tfg.model.Device add(java.lang.Long userId,
		java.lang.String deviceUUID, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .add(userId, deviceUUID, description, status, phoneNumber,
			serverPhoneNumber, smsPollTime, smsTransmitPeriod, cloudId,
			serverIp, httpTransmitPeriod);
	}

	public static es.eina.tfg.model.Device update(java.lang.Long deviceId,
		java.lang.String deviceUUID, java.lang.Long userId,
		java.lang.String description, java.lang.String status,
		java.lang.String phoneNumber, java.lang.String serverPhoneNumber,
		java.lang.String smsPollTime, java.lang.String smsTransmitPeriod,
		java.lang.String cloudId, java.lang.String serverIp,
		java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .update(deviceId, deviceUUID, userId, description, status,
			phoneNumber, serverPhoneNumber, smsPollTime, smsTransmitPeriod,
			cloudId, serverIp, httpTransmitPeriod);
	}

	public static es.eina.tfg.model.Device delete(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(deviceId);
	}

	public static es.eina.tfg.model.Device getDevice(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDevice(deviceId);
	}

	public static java.util.List<es.eina.tfg.model.Sensor> getSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSensors(deviceId);
	}

	public static java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getActiveSensors(deviceId);
	}

	public static es.eina.tfg.model.Device getDeviceByPhoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getService().getDeviceByPhoneNumber(phoneNumber);
	}

	public static java.util.List<es.eina.tfg.model.Device> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUserId(userId);
	}

	public static es.eina.tfg.model.Device findByDeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getService().findByDeviceUUID(deviceUUID);
	}

	public static java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(status);
	}

	public static java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByStatus(status, start, end);
	}

	public static void clearService() {
		_service = null;
	}

	public static DeviceService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DeviceService.class.getName());

			if (invokableService instanceof DeviceService) {
				_service = (DeviceService)invokableService;
			}
			else {
				_service = new DeviceServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(DeviceServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DeviceService service) {
	}

	private static DeviceService _service;
}
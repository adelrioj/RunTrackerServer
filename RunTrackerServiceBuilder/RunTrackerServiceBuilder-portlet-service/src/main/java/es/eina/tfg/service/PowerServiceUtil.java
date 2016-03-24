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
 * Provides the remote service utility for Power. This utility wraps
 * {@link es.eina.tfg.service.impl.PowerServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see PowerService
 * @see es.eina.tfg.service.base.PowerServiceBaseImpl
 * @see es.eina.tfg.service.impl.PowerServiceImpl
 * @generated
 */
public class PowerServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.PowerServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static es.eina.tfg.model.Power add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .add(raceId, userId, deviceId, sensorId, time, sensorMode,
			level);
	}

	public static es.eina.tfg.model.Power update(java.lang.Long measurementId,
		java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingMeasurementException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .update(measurementId, raceId, userId, deviceId, sensorId,
			time, sensorMode, level);
	}

	public static es.eina.tfg.model.Power delete(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(measurementId);
	}

	public static es.eina.tfg.model.Power getPower(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPower(measurementId);
	}

	public static void clearService() {
		_service = null;
	}

	public static PowerService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PowerService.class.getName());

			if (invokableService instanceof PowerService) {
				_service = (PowerService)invokableService;
			}
			else {
				_service = new PowerServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(PowerServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PowerService service) {
	}

	private static PowerService _service;
}
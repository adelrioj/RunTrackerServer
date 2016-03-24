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
 * Provides the remote service utility for Sensor. This utility wraps
 * {@link es.eina.tfg.service.impl.SensorServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see SensorService
 * @see es.eina.tfg.service.base.SensorServiceBaseImpl
 * @see es.eina.tfg.service.impl.SensorServiceImpl
 * @generated
 */
public class SensorServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.SensorServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static es.eina.tfg.model.Sensor add(java.lang.Integer type,
		java.lang.String description, java.lang.String dataUnits,
		java.lang.String dataType, java.lang.String dataUncertainity,
		java.lang.String dataLowerRange, java.lang.String dataUpperRange,
		java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .add(type, description, dataUnits, dataType,
			dataUncertainity, dataLowerRange, dataUpperRange, dataPacketFormat);
	}

	public static es.eina.tfg.model.Sensor update(java.lang.Long sensorId,
		java.lang.Integer type, java.lang.String description,
		java.lang.String dataUnits, java.lang.String dataType,
		java.lang.String dataUncertainity, java.lang.String dataLowerRange,
		java.lang.String dataUpperRange, java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingSensorException {
		return getService()
				   .update(sensorId, type, description, dataUnits, dataType,
			dataUncertainity, dataLowerRange, dataUpperRange, dataPacketFormat);
	}

	public static es.eina.tfg.model.Sensor delete(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(sensorId);
	}

	public static es.eina.tfg.model.Sensor getSensor(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSensor(sensorId);
	}

	public static void clearService() {
		_service = null;
	}

	public static SensorService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SensorService.class.getName());

			if (invokableService instanceof SensorService) {
				_service = (SensorService)invokableService;
			}
			else {
				_service = new SensorServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(SensorServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SensorService service) {
	}

	private static SensorService _service;
}
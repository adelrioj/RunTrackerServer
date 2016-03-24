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
 * Provides a wrapper for {@link SensorService}.
 *
 * @author adelrioj
 * @see SensorService
 * @generated
 */
public class SensorServiceWrapper implements SensorService,
	ServiceWrapper<SensorService> {
	public SensorServiceWrapper(SensorService sensorService) {
		_sensorService = sensorService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sensorService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sensorService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sensorService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Sensor add(java.lang.Integer type,
		java.lang.String description, java.lang.String dataUnits,
		java.lang.String dataType, java.lang.String dataUncertainity,
		java.lang.String dataLowerRange, java.lang.String dataUpperRange,
		java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorService.add(type, description, dataUnits, dataType,
			dataUncertainity, dataLowerRange, dataUpperRange, dataPacketFormat);
	}

	@Override
	public es.eina.tfg.model.Sensor update(java.lang.Long sensorId,
		java.lang.Integer type, java.lang.String description,
		java.lang.String dataUnits, java.lang.String dataType,
		java.lang.String dataUncertainity, java.lang.String dataLowerRange,
		java.lang.String dataUpperRange, java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingSensorException {
		return _sensorService.update(sensorId, type, description, dataUnits,
			dataType, dataUncertainity, dataLowerRange, dataUpperRange,
			dataPacketFormat);
	}

	@Override
	public es.eina.tfg.model.Sensor delete(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sensorService.delete(sensorId);
	}

	@Override
	public es.eina.tfg.model.Sensor getSensor(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sensorService.getSensor(sensorId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SensorService getWrappedSensorService() {
		return _sensorService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSensorService(SensorService sensorService) {
		_sensorService = sensorService;
	}

	@Override
	public SensorService getWrappedService() {
		return _sensorService;
	}

	@Override
	public void setWrappedService(SensorService sensorService) {
		_sensorService = sensorService;
	}

	private SensorService _sensorService;
}
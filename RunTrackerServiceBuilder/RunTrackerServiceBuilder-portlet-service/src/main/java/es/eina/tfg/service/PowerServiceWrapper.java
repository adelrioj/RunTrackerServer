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
 * Provides a wrapper for {@link PowerService}.
 *
 * @author adelrioj
 * @see PowerService
 * @generated
 */
public class PowerServiceWrapper implements PowerService,
	ServiceWrapper<PowerService> {
	public PowerServiceWrapper(PowerService powerService) {
		_powerService = powerService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _powerService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_powerService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _powerService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Power add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return _powerService.add(raceId, userId, deviceId, sensorId, time,
			sensorMode, level);
	}

	@Override
	public es.eina.tfg.model.Power update(java.lang.Long measurementId,
		java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingMeasurementException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return _powerService.update(measurementId, raceId, userId, deviceId,
			sensorId, time, sensorMode, level);
	}

	@Override
	public es.eina.tfg.model.Power delete(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _powerService.delete(measurementId);
	}

	@Override
	public es.eina.tfg.model.Power getPower(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _powerService.getPower(measurementId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PowerService getWrappedPowerService() {
		return _powerService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPowerService(PowerService powerService) {
		_powerService = powerService;
	}

	@Override
	public PowerService getWrappedService() {
		return _powerService;
	}

	@Override
	public void setWrappedService(PowerService powerService) {
		_powerService = powerService;
	}

	private PowerService _powerService;
}
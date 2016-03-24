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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Location. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see LocationServiceUtil
 * @see es.eina.tfg.service.base.LocationServiceBaseImpl
 * @see es.eina.tfg.service.impl.LocationServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface LocationService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LocationServiceUtil} to access the location remote service. Add custom service methods to {@link es.eina.tfg.service.impl.LocationServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public es.eina.tfg.model.Location add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, int sysRef, double latitude,
		double longitude, double speed, double distance, double altitude)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException;

	public es.eina.tfg.model.Location update(java.lang.Long measurementId,
		java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, int sysRef, double latitude,
		double longitude, double speed, double distance, double altitude)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingMeasurementException;

	public es.eina.tfg.model.Location delete(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.eina.tfg.model.Location getLocation(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<es.eina.tfg.model.Location> findByRaceId(
		java.lang.Long raceId)
		throws com.liferay.portal.kernel.exception.SystemException;
}
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
 * Provides the remote service interface for Sensor. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see SensorServiceUtil
 * @see es.eina.tfg.service.base.SensorServiceBaseImpl
 * @see es.eina.tfg.service.impl.SensorServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface SensorService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SensorServiceUtil} to access the sensor remote service. Add custom service methods to {@link es.eina.tfg.service.impl.SensorServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public es.eina.tfg.model.Sensor add(java.lang.Integer type,
		java.lang.String description, java.lang.String dataUnits,
		java.lang.String dataType, java.lang.String dataUncertainity,
		java.lang.String dataLowerRange, java.lang.String dataUpperRange,
		java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException;

	public es.eina.tfg.model.Sensor update(java.lang.Long sensorId,
		java.lang.Integer type, java.lang.String description,
		java.lang.String dataUnits, java.lang.String dataType,
		java.lang.String dataUncertainity, java.lang.String dataLowerRange,
		java.lang.String dataUpperRange, java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingSensorException;

	public es.eina.tfg.model.Sensor delete(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.eina.tfg.model.Sensor getSensor(java.lang.Long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;
}
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
 * Provides the remote service interface for Device. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see DeviceServiceUtil
 * @see es.eina.tfg.service.base.DeviceServiceBaseImpl
 * @see es.eina.tfg.service.impl.DeviceServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DeviceService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DeviceServiceUtil} to access the device remote service. Add custom service methods to {@link es.eina.tfg.service.impl.DeviceServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public es.eina.tfg.model.Device add(java.lang.Long userId,
		java.lang.String deviceUUID, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException;

	public es.eina.tfg.model.Device update(java.lang.Long deviceId,
		java.lang.String deviceUUID, java.lang.Long userId,
		java.lang.String description, java.lang.String status,
		java.lang.String phoneNumber, java.lang.String serverPhoneNumber,
		java.lang.String smsPollTime, java.lang.String smsTransmitPeriod,
		java.lang.String cloudId, java.lang.String serverIp,
		java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingUserException;

	public es.eina.tfg.model.Device delete(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.eina.tfg.model.Device getDevice(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.eina.tfg.model.Sensor> getSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public es.eina.tfg.model.Device getDeviceByPhoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException;

	public java.util.List<es.eina.tfg.model.Device> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public es.eina.tfg.model.Device findByDeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException;

	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
}
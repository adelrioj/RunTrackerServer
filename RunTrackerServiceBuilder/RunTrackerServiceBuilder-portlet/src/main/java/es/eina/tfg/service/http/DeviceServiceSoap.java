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

package es.eina.tfg.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.eina.tfg.service.DeviceServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.DeviceServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.DeviceSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.Device}, that is translated to a
 * {@link es.eina.tfg.model.DeviceSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author adelrioj
 * @see DeviceServiceHttp
 * @see es.eina.tfg.model.DeviceSoap
 * @see es.eina.tfg.service.DeviceServiceUtil
 * @generated
 */
public class DeviceServiceSoap {
	public static es.eina.tfg.model.DeviceSoap add(java.lang.Long userId,
		java.lang.String deviceUUID, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.add(userId,
					deviceUUID, description, status, phoneNumber,
					serverPhoneNumber, smsPollTime, smsTransmitPeriod, cloudId,
					serverIp, httpTransmitPeriod);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap update(java.lang.Long deviceId,
		java.lang.String deviceUUID, java.lang.Long userId,
		java.lang.String description, java.lang.String status,
		java.lang.String phoneNumber, java.lang.String serverPhoneNumber,
		java.lang.String smsPollTime, java.lang.String smsTransmitPeriod,
		java.lang.String cloudId, java.lang.String serverIp,
		java.lang.String httpTransmitPeriod) throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.update(deviceId,
					deviceUUID, userId, description, status, phoneNumber,
					serverPhoneNumber, smsPollTime, smsTransmitPeriod, cloudId,
					serverIp, httpTransmitPeriod);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap delete(java.lang.Long deviceId)
		throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.delete(deviceId);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap getDevice(
		java.lang.Long deviceId) throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.getDevice(deviceId);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.SensorSoap[] getSensors(
		java.lang.Long deviceId) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Sensor> returnValue = DeviceServiceUtil.getSensors(deviceId);

			return es.eina.tfg.model.SensorSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.SensorSoap[] getActiveSensors(
		java.lang.Long deviceId) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Sensor> returnValue = DeviceServiceUtil.getActiveSensors(deviceId);

			return es.eina.tfg.model.SensorSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap getDeviceByPhoneNumber(
		java.lang.String phoneNumber) throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.getDeviceByPhoneNumber(phoneNumber);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap[] findByUserId(
		java.lang.Long userId) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Device> returnValue = DeviceServiceUtil.findByUserId(userId);

			return es.eina.tfg.model.DeviceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap findByDeviceUUID(
		java.lang.String deviceUUID) throws RemoteException {
		try {
			es.eina.tfg.model.Device returnValue = DeviceServiceUtil.findByDeviceUUID(deviceUUID);

			return es.eina.tfg.model.DeviceSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap[] findByStatus(
		java.lang.String status) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Device> returnValue = DeviceServiceUtil.findByStatus(status);

			return es.eina.tfg.model.DeviceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.DeviceSoap[] findByStatus(
		java.lang.String status, int start, int end) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Device> returnValue = DeviceServiceUtil.findByStatus(status,
					start, end);

			return es.eina.tfg.model.DeviceSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DeviceServiceSoap.class);
}
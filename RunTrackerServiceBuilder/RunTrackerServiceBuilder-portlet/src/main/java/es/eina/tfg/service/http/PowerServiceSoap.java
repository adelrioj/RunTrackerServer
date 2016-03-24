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

import es.eina.tfg.service.PowerServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.PowerServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.PowerSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.Power}, that is translated to a
 * {@link es.eina.tfg.model.PowerSoap}. Methods that SOAP cannot
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
 * @see PowerServiceHttp
 * @see es.eina.tfg.model.PowerSoap
 * @see es.eina.tfg.service.PowerServiceUtil
 * @generated
 */
public class PowerServiceSoap {
	public static es.eina.tfg.model.PowerSoap add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws RemoteException {
		try {
			es.eina.tfg.model.Power returnValue = PowerServiceUtil.add(raceId,
					userId, deviceId, sensorId, time, sensorMode, level);

			return es.eina.tfg.model.PowerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.PowerSoap update(
		java.lang.Long measurementId, java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws RemoteException {
		try {
			es.eina.tfg.model.Power returnValue = PowerServiceUtil.update(measurementId,
					raceId, userId, deviceId, sensorId, time, sensorMode, level);

			return es.eina.tfg.model.PowerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.PowerSoap delete(
		java.lang.Long measurementId) throws RemoteException {
		try {
			es.eina.tfg.model.Power returnValue = PowerServiceUtil.delete(measurementId);

			return es.eina.tfg.model.PowerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.PowerSoap getPower(
		java.lang.Long measurementId) throws RemoteException {
		try {
			es.eina.tfg.model.Power returnValue = PowerServiceUtil.getPower(measurementId);

			return es.eina.tfg.model.PowerSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PowerServiceSoap.class);
}
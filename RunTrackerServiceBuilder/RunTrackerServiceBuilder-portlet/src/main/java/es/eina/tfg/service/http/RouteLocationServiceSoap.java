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

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.RouteLocationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.RouteLocationSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.RouteLocation}, that is translated to a
 * {@link es.eina.tfg.model.RouteLocationSoap}. Methods that SOAP cannot
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
 * @see RouteLocationServiceHttp
 * @see es.eina.tfg.model.RouteLocationSoap
 * @see es.eina.tfg.service.RouteLocationServiceUtil
 * @generated
 */
public class RouteLocationServiceSoap {
	public static es.eina.tfg.model.RouteLocationSoap add(
		java.lang.Long routeId, java.lang.Double latitude,
		java.lang.Double longitude) throws RemoteException {
		try {
			es.eina.tfg.model.RouteLocation returnValue = RouteLocationServiceUtil.add(routeId,
					latitude, longitude);

			return es.eina.tfg.model.RouteLocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteLocationSoap update(
		java.lang.Long routeLocationId, java.lang.Long routeId,
		java.lang.Double latitude, java.lang.Double longitude)
		throws RemoteException {
		try {
			es.eina.tfg.model.RouteLocation returnValue = RouteLocationServiceUtil.update(routeLocationId,
					routeId, latitude, longitude);

			return es.eina.tfg.model.RouteLocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteLocationSoap delete(
		java.lang.Long routeLocationId) throws RemoteException {
		try {
			es.eina.tfg.model.RouteLocation returnValue = RouteLocationServiceUtil.delete(routeLocationId);

			return es.eina.tfg.model.RouteLocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteLocationSoap getRouteLocation(
		java.lang.Long routeLocationId) throws RemoteException {
		try {
			es.eina.tfg.model.RouteLocation returnValue = RouteLocationServiceUtil.getRouteLocation(routeLocationId);

			return es.eina.tfg.model.RouteLocationSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteLocationSoap[] findByRouteId(
		java.lang.Long routeId) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.RouteLocation> returnValue = RouteLocationServiceUtil.findByRouteId(routeId);

			return es.eina.tfg.model.RouteLocationSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RouteLocationServiceSoap.class);
}
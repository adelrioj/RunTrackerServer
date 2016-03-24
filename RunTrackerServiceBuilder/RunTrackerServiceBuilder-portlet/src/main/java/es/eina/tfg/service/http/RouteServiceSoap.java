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

import es.eina.tfg.service.RouteServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.RouteServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.RouteSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.Route}, that is translated to a
 * {@link es.eina.tfg.model.RouteSoap}. Methods that SOAP cannot
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
 * @see RouteServiceHttp
 * @see es.eina.tfg.model.RouteSoap
 * @see es.eina.tfg.service.RouteServiceUtil
 * @generated
 */
public class RouteServiceSoap {
	public static es.eina.tfg.model.RouteSoap add(java.lang.String type,
		java.lang.String name, java.lang.String description,
		java.lang.Long authorId, boolean isPublic, java.util.Date startingTime)
		throws RemoteException {
		try {
			es.eina.tfg.model.Route returnValue = RouteServiceUtil.add(type,
					name, description, authorId, isPublic, startingTime);

			return es.eina.tfg.model.RouteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap update(java.lang.Long routeId,
		java.lang.String type, java.lang.String name,
		java.lang.String description, java.lang.Long authorId,
		boolean isPublic, java.util.Date startingTime,
		java.util.Date creationTime) throws RemoteException {
		try {
			es.eina.tfg.model.Route returnValue = RouteServiceUtil.update(routeId,
					type, name, description, authorId, isPublic, startingTime,
					creationTime);

			return es.eina.tfg.model.RouteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap delete(java.lang.Long routeId)
		throws RemoteException {
		try {
			es.eina.tfg.model.Route returnValue = RouteServiceUtil.delete(routeId);

			return es.eina.tfg.model.RouteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap getRoute(java.lang.Long routeId)
		throws RemoteException {
		try {
			es.eina.tfg.model.Route returnValue = RouteServiceUtil.getRoute(routeId);

			return es.eina.tfg.model.RouteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap[] findByAuthor(
		java.lang.Long userId) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Route> returnValue = RouteServiceUtil.findByAuthor(userId);

			return es.eina.tfg.model.RouteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap[] getPublicRoutes()
		throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Route> returnValue = RouteServiceUtil.getPublicRoutes();

			return es.eina.tfg.model.RouteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static es.eina.tfg.model.RouteSoap[] getPublicRoutes(int start,
		int end) throws RemoteException {
		try {
			java.util.List<es.eina.tfg.model.Route> returnValue = RouteServiceUtil.getPublicRoutes(start,
					end);

			return es.eina.tfg.model.RouteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RouteServiceSoap.class);
}
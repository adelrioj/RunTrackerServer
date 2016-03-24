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
 * Provides a wrapper for {@link RouteService}.
 *
 * @author adelrioj
 * @see RouteService
 * @generated
 */
public class RouteServiceWrapper implements RouteService,
	ServiceWrapper<RouteService> {
	public RouteServiceWrapper(RouteService routeService) {
		_routeService = routeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _routeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_routeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _routeService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Route add(java.lang.String type,
		java.lang.String name, java.lang.String description,
		java.lang.Long authorId, boolean isPublic, java.util.Date startingTime)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeService.add(type, name, description, authorId, isPublic,
			startingTime);
	}

	@Override
	public es.eina.tfg.model.Route update(java.lang.Long routeId,
		java.lang.String type, java.lang.String name,
		java.lang.String description, java.lang.Long authorId,
		boolean isPublic, java.util.Date startingTime,
		java.util.Date creationTime)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingRouteException {
		return _routeService.update(routeId, type, name, description, authorId,
			isPublic, startingTime, creationTime);
	}

	@Override
	public es.eina.tfg.model.Route delete(java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _routeService.delete(routeId);
	}

	@Override
	public es.eina.tfg.model.Route getRoute(java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _routeService.getRoute(routeId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Route> findByAuthor(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeService.findByAuthor(userId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Route> getPublicRoutes()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeService.getPublicRoutes();
	}

	@Override
	public java.util.List<es.eina.tfg.model.Route> getPublicRoutes(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _routeService.getPublicRoutes(start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RouteService getWrappedRouteService() {
		return _routeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRouteService(RouteService routeService) {
		_routeService = routeService;
	}

	@Override
	public RouteService getWrappedService() {
		return _routeService;
	}

	@Override
	public void setWrappedService(RouteService routeService) {
		_routeService = routeService;
	}

	private RouteService _routeService;
}
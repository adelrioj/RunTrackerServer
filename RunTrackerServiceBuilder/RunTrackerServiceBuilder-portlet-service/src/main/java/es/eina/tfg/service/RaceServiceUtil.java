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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Race. This utility wraps
 * {@link es.eina.tfg.service.impl.RaceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see RaceService
 * @see es.eina.tfg.service.base.RaceServiceBaseImpl
 * @see es.eina.tfg.service.impl.RaceServiceImpl
 * @generated
 */
public class RaceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RaceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static es.eina.tfg.model.Race add(java.lang.Long userId,
		java.lang.Long routeId, java.lang.String type,
		java.lang.Integer userHeight, java.lang.Integer userWeight)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return getService().add(userId, routeId, type, userHeight, userWeight);
	}

	public static es.eina.tfg.model.Race update(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long routeId, java.lang.String type,
		java.lang.Integer userHeight, java.lang.Integer userWeight)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .update(raceId, userId, routeId, type, userHeight, userWeight);
	}

	public static es.eina.tfg.model.Race delete(java.lang.Long raceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(raceId);
	}

	public static es.eina.tfg.model.Race getRace(java.lang.Long raceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRace(raceId);
	}

	public static java.util.List<es.eina.tfg.model.Race> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUserId(userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static RaceService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RaceService.class.getName());

			if (invokableService instanceof RaceService) {
				_service = (RaceService)invokableService;
			}
			else {
				_service = new RaceServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(RaceServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(RaceService service) {
	}

	private static RaceService _service;
}
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
 * Provides the remote service utility for UserAdditionalData. This utility wraps
 * {@link es.eina.tfg.service.impl.UserAdditionalDataServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see UserAdditionalDataService
 * @see es.eina.tfg.service.base.UserAdditionalDataServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserAdditionalDataServiceImpl
 * @generated
 */
public class UserAdditionalDataServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.UserAdditionalDataServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static es.eina.tfg.model.UserAdditionalData add(
		java.lang.Long userId, java.lang.Integer weight,
		java.lang.Integer height, java.lang.String registerType)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return getService().add(userId, weight, height, registerType);
	}

	public static es.eina.tfg.model.UserAdditionalData update(
		java.lang.Long userId, java.lang.Integer weight,
		java.lang.Integer height, java.lang.String registerType,
		java.lang.Long smsCount)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return getService()
				   .update(userId, weight, height, registerType, smsCount);
	}

	public static es.eina.tfg.model.UserAdditionalData delete(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(userId);
	}

	public static es.eina.tfg.model.UserAdditionalData getUserAdditionalData(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserAdditionalData(userId);
	}

	public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> getUserSelectedRoutes(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSelectedRoutes(userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserAdditionalDataService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserAdditionalDataService.class.getName());

			if (invokableService instanceof UserAdditionalDataService) {
				_service = (UserAdditionalDataService)invokableService;
			}
			else {
				_service = new UserAdditionalDataServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(UserAdditionalDataServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserAdditionalDataService service) {
	}

	private static UserAdditionalDataService _service;
}
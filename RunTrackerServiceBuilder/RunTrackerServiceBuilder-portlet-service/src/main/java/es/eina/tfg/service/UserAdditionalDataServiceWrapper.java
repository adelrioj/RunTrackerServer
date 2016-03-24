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
 * Provides a wrapper for {@link UserAdditionalDataService}.
 *
 * @author adelrioj
 * @see UserAdditionalDataService
 * @generated
 */
public class UserAdditionalDataServiceWrapper
	implements UserAdditionalDataService,
		ServiceWrapper<UserAdditionalDataService> {
	public UserAdditionalDataServiceWrapper(
		UserAdditionalDataService userAdditionalDataService) {
		_userAdditionalDataService = userAdditionalDataService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userAdditionalDataService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userAdditionalDataService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userAdditionalDataService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData add(java.lang.Long userId,
		java.lang.Integer weight, java.lang.Integer height,
		java.lang.String registerType)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return _userAdditionalDataService.add(userId, weight, height,
			registerType);
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData update(java.lang.Long userId,
		java.lang.Integer weight, java.lang.Integer height,
		java.lang.String registerType, java.lang.Long smsCount)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		return _userAdditionalDataService.update(userId, weight, height,
			registerType, smsCount);
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData delete(java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAdditionalDataService.delete(userId);
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData getUserAdditionalData(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userAdditionalDataService.getUserAdditionalData(userId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> getUserSelectedRoutes(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAdditionalDataService.getUserSelectedRoutes(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserAdditionalDataService getWrappedUserAdditionalDataService() {
		return _userAdditionalDataService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserAdditionalDataService(
		UserAdditionalDataService userAdditionalDataService) {
		_userAdditionalDataService = userAdditionalDataService;
	}

	@Override
	public UserAdditionalDataService getWrappedService() {
		return _userAdditionalDataService;
	}

	@Override
	public void setWrappedService(
		UserAdditionalDataService userAdditionalDataService) {
		_userAdditionalDataService = userAdditionalDataService;
	}

	private UserAdditionalDataService _userAdditionalDataService;
}
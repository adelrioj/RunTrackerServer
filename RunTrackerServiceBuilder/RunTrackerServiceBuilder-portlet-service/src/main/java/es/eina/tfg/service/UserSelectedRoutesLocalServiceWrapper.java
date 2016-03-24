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
 * Provides a wrapper for {@link UserSelectedRoutesLocalService}.
 *
 * @author adelrioj
 * @see UserSelectedRoutesLocalService
 * @generated
 */
public class UserSelectedRoutesLocalServiceWrapper
	implements UserSelectedRoutesLocalService,
		ServiceWrapper<UserSelectedRoutesLocalService> {
	public UserSelectedRoutesLocalServiceWrapper(
		UserSelectedRoutesLocalService userSelectedRoutesLocalService) {
		_userSelectedRoutesLocalService = userSelectedRoutesLocalService;
	}

	/**
	* Adds the user selected routes to the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes addUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.addUserSelectedRoutes(userSelectedRoutes);
	}

	/**
	* Creates a new user selected routes with the primary key. Does not add the user selected routes to the database.
	*
	* @param userSelectedRoutesPK the primary key for the new user selected routes
	* @return the new user selected routes
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes createUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK) {
		return _userSelectedRoutesLocalService.createUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Deletes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes that was removed
	* @throws PortalException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes deleteUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.deleteUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Deletes the user selected routes from the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes deleteUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.deleteUserSelectedRoutes(userSelectedRoutes);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userSelectedRoutesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.eina.tfg.model.UserSelectedRoutes fetchUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.fetchUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Returns the user selected routes with the primary key.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes
	* @throws PortalException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes getUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.getUserSelectedRoutes(userSelectedRoutesPK);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the user selected routeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of user selected routeses
	* @param end the upper bound of the range of user selected routeses (not inclusive)
	* @return the range of user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> getUserSelectedRouteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.getUserSelectedRouteses(start,
			end);
	}

	/**
	* Returns the number of user selected routeses.
	*
	* @return the number of user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUserSelectedRoutesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.getUserSelectedRoutesesCount();
	}

	/**
	* Updates the user selected routes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.UserSelectedRoutes updateUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.updateUserSelectedRoutes(userSelectedRoutes);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _userSelectedRoutesLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_userSelectedRoutesLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _userSelectedRoutesLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.UserSelectedRoutes add(java.lang.Long userId,
		java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException,
			es.eina.tfg.RouteAlreadySelectedByUserException {
		return _userSelectedRoutesLocalService.add(userId, routeId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByUser(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutesLocalService.findByUser(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UserSelectedRoutesLocalService getWrappedUserSelectedRoutesLocalService() {
		return _userSelectedRoutesLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUserSelectedRoutesLocalService(
		UserSelectedRoutesLocalService userSelectedRoutesLocalService) {
		_userSelectedRoutesLocalService = userSelectedRoutesLocalService;
	}

	@Override
	public UserSelectedRoutesLocalService getWrappedService() {
		return _userSelectedRoutesLocalService;
	}

	@Override
	public void setWrappedService(
		UserSelectedRoutesLocalService userSelectedRoutesLocalService) {
		_userSelectedRoutesLocalService = userSelectedRoutesLocalService;
	}

	private UserSelectedRoutesLocalService _userSelectedRoutesLocalService;
}
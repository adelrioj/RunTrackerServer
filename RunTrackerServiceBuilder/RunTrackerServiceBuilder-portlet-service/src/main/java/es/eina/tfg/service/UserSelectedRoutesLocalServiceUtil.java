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
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UserSelectedRoutes. This utility wraps
 * {@link es.eina.tfg.service.impl.UserSelectedRoutesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see UserSelectedRoutesLocalService
 * @see es.eina.tfg.service.base.UserSelectedRoutesLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserSelectedRoutesLocalServiceImpl
 * @generated
 */
public class UserSelectedRoutesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.UserSelectedRoutesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the user selected routes to the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was added
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.UserSelectedRoutes addUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addUserSelectedRoutes(userSelectedRoutes);
	}

	/**
	* Creates a new user selected routes with the primary key. Does not add the user selected routes to the database.
	*
	* @param userSelectedRoutesPK the primary key for the new user selected routes
	* @return the new user selected routes
	*/
	public static es.eina.tfg.model.UserSelectedRoutes createUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK) {
		return getService().createUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Deletes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes that was removed
	* @throws PortalException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.UserSelectedRoutes deleteUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Deletes the user selected routes from the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.UserSelectedRoutes deleteUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteUserSelectedRoutes(userSelectedRoutes);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static es.eina.tfg.model.UserSelectedRoutes fetchUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchUserSelectedRoutes(userSelectedRoutesPK);
	}

	/**
	* Returns the user selected routes with the primary key.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes
	* @throws PortalException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.UserSelectedRoutes getUserSelectedRoutes(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSelectedRoutes(userSelectedRoutesPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> getUserSelectedRouteses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSelectedRouteses(start, end);
	}

	/**
	* Returns the number of user selected routeses.
	*
	* @return the number of user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	public static int getUserSelectedRoutesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getUserSelectedRoutesesCount();
	}

	/**
	* Updates the user selected routes in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutes the user selected routes
	* @return the user selected routes that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.UserSelectedRoutes updateUserSelectedRoutes(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateUserSelectedRoutes(userSelectedRoutes);
	}

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

	public static es.eina.tfg.model.UserSelectedRoutes add(
		java.lang.Long userId, java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException,
			es.eina.tfg.RouteAlreadySelectedByUserException {
		return getService().add(userId, routeId);
	}

	public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByUser(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUser(userId);
	}

	public static void clearService() {
		_service = null;
	}

	public static UserSelectedRoutesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					UserSelectedRoutesLocalService.class.getName());

			if (invokableLocalService instanceof UserSelectedRoutesLocalService) {
				_service = (UserSelectedRoutesLocalService)invokableLocalService;
			}
			else {
				_service = new UserSelectedRoutesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(UserSelectedRoutesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(UserSelectedRoutesLocalService service) {
	}

	private static UserSelectedRoutesLocalService _service;
}
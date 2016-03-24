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
 * Provides a wrapper for {@link RouteLocationLocalService}.
 *
 * @author adelrioj
 * @see RouteLocationLocalService
 * @generated
 */
public class RouteLocationLocalServiceWrapper
	implements RouteLocationLocalService,
		ServiceWrapper<RouteLocationLocalService> {
	public RouteLocationLocalServiceWrapper(
		RouteLocationLocalService routeLocationLocalService) {
		_routeLocationLocalService = routeLocationLocalService;
	}

	/**
	* Adds the route location to the database. Also notifies the appropriate model listeners.
	*
	* @param routeLocation the route location
	* @return the route location that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.RouteLocation addRouteLocation(
		es.eina.tfg.model.RouteLocation routeLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.addRouteLocation(routeLocation);
	}

	/**
	* Creates a new route location with the primary key. Does not add the route location to the database.
	*
	* @param routePositionId the primary key for the new route location
	* @return the new route location
	*/
	@Override
	public es.eina.tfg.model.RouteLocation createRouteLocation(
		long routePositionId) {
		return _routeLocationLocalService.createRouteLocation(routePositionId);
	}

	/**
	* Deletes the route location with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param routePositionId the primary key of the route location
	* @return the route location that was removed
	* @throws PortalException if a route location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.RouteLocation deleteRouteLocation(
		long routePositionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.deleteRouteLocation(routePositionId);
	}

	/**
	* Deletes the route location from the database. Also notifies the appropriate model listeners.
	*
	* @param routeLocation the route location
	* @return the route location that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.RouteLocation deleteRouteLocation(
		es.eina.tfg.model.RouteLocation routeLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.deleteRouteLocation(routeLocation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _routeLocationLocalService.dynamicQuery();
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
		return _routeLocationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _routeLocationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _routeLocationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _routeLocationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _routeLocationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public es.eina.tfg.model.RouteLocation fetchRouteLocation(
		long routePositionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.fetchRouteLocation(routePositionId);
	}

	/**
	* Returns the route location with the primary key.
	*
	* @param routePositionId the primary key of the route location
	* @return the route location
	* @throws PortalException if a route location with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.RouteLocation getRouteLocation(
		long routePositionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.getRouteLocation(routePositionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the route locations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of route locations
	* @param end the upper bound of the range of route locations (not inclusive)
	* @return the range of route locations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.eina.tfg.model.RouteLocation> getRouteLocations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.getRouteLocations(start, end);
	}

	/**
	* Returns the number of route locations.
	*
	* @return the number of route locations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRouteLocationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.getRouteLocationsCount();
	}

	/**
	* Updates the route location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param routeLocation the route location
	* @return the route location that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.RouteLocation updateRouteLocation(
		es.eina.tfg.model.RouteLocation routeLocation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.updateRouteLocation(routeLocation);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _routeLocationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_routeLocationLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _routeLocationLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public es.eina.tfg.model.RouteLocation add(java.lang.Long routeId,
		java.lang.Double latitude, java.lang.Double longitude)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingRouteException {
		return _routeLocationLocalService.add(routeId, latitude, longitude);
	}

	@Override
	public es.eina.tfg.model.RouteLocation update(
		java.lang.Long routeLocationId, java.lang.Long routeId,
		java.lang.Double latitude, java.lang.Double longitude)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingRouteException,
			es.eina.tfg.NonExistingRouteLocationException {
		return _routeLocationLocalService.update(routeLocationId, routeId,
			latitude, longitude);
	}

	@Override
	public java.util.List<es.eina.tfg.model.RouteLocation> findByRouteId(
		java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.findByRouteId(routeId);
	}

	@Override
	public java.util.List<es.eina.tfg.model.RouteLocation> findByRouteId(
		long routeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.findByRouteId(routeId, start, end);
	}

	@Override
	public int findByRouteIdCount(java.lang.Long routeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _routeLocationLocalService.findByRouteIdCount(routeId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RouteLocationLocalService getWrappedRouteLocationLocalService() {
		return _routeLocationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRouteLocationLocalService(
		RouteLocationLocalService routeLocationLocalService) {
		_routeLocationLocalService = routeLocationLocalService;
	}

	@Override
	public RouteLocationLocalService getWrappedService() {
		return _routeLocationLocalService;
	}

	@Override
	public void setWrappedService(
		RouteLocationLocalService routeLocationLocalService) {
		_routeLocationLocalService = routeLocationLocalService;
	}

	private RouteLocationLocalService _routeLocationLocalService;
}
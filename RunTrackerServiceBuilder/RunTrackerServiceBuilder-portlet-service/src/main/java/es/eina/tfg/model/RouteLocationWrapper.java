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

package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RouteLocation}.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocation
 * @generated
 */
public class RouteLocationWrapper implements RouteLocation,
	ModelWrapper<RouteLocation> {
	public RouteLocationWrapper(RouteLocation routeLocation) {
		_routeLocation = routeLocation;
	}

	@Override
	public Class<?> getModelClass() {
		return RouteLocation.class;
	}

	@Override
	public String getModelClassName() {
		return RouteLocation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("routePositionId", getRoutePositionId());
		attributes.put("routeId", getRouteId());
		attributes.put("latitude", getLatitude());
		attributes.put("longitude", getLongitude());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long routePositionId = (Long)attributes.get("routePositionId");

		if (routePositionId != null) {
			setRoutePositionId(routePositionId);
		}

		Long routeId = (Long)attributes.get("routeId");

		if (routeId != null) {
			setRouteId(routeId);
		}

		Double latitude = (Double)attributes.get("latitude");

		if (latitude != null) {
			setLatitude(latitude);
		}

		Double longitude = (Double)attributes.get("longitude");

		if (longitude != null) {
			setLongitude(longitude);
		}
	}

	/**
	* Returns the primary key of this route location.
	*
	* @return the primary key of this route location
	*/
	@Override
	public long getPrimaryKey() {
		return _routeLocation.getPrimaryKey();
	}

	/**
	* Sets the primary key of this route location.
	*
	* @param primaryKey the primary key of this route location
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_routeLocation.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the route position ID of this route location.
	*
	* @return the route position ID of this route location
	*/
	@Override
	public long getRoutePositionId() {
		return _routeLocation.getRoutePositionId();
	}

	/**
	* Sets the route position ID of this route location.
	*
	* @param routePositionId the route position ID of this route location
	*/
	@Override
	public void setRoutePositionId(long routePositionId) {
		_routeLocation.setRoutePositionId(routePositionId);
	}

	/**
	* Returns the route ID of this route location.
	*
	* @return the route ID of this route location
	*/
	@Override
	public long getRouteId() {
		return _routeLocation.getRouteId();
	}

	/**
	* Sets the route ID of this route location.
	*
	* @param routeId the route ID of this route location
	*/
	@Override
	public void setRouteId(long routeId) {
		_routeLocation.setRouteId(routeId);
	}

	/**
	* Returns the latitude of this route location.
	*
	* @return the latitude of this route location
	*/
	@Override
	public double getLatitude() {
		return _routeLocation.getLatitude();
	}

	/**
	* Sets the latitude of this route location.
	*
	* @param latitude the latitude of this route location
	*/
	@Override
	public void setLatitude(double latitude) {
		_routeLocation.setLatitude(latitude);
	}

	/**
	* Returns the longitude of this route location.
	*
	* @return the longitude of this route location
	*/
	@Override
	public double getLongitude() {
		return _routeLocation.getLongitude();
	}

	/**
	* Sets the longitude of this route location.
	*
	* @param longitude the longitude of this route location
	*/
	@Override
	public void setLongitude(double longitude) {
		_routeLocation.setLongitude(longitude);
	}

	@Override
	public boolean isNew() {
		return _routeLocation.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_routeLocation.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _routeLocation.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_routeLocation.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _routeLocation.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _routeLocation.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_routeLocation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _routeLocation.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_routeLocation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_routeLocation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_routeLocation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RouteLocationWrapper((RouteLocation)_routeLocation.clone());
	}

	@Override
	public int compareTo(es.eina.tfg.model.RouteLocation routeLocation) {
		return _routeLocation.compareTo(routeLocation);
	}

	@Override
	public int hashCode() {
		return _routeLocation.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.RouteLocation> toCacheModel() {
		return _routeLocation.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.RouteLocation toEscapedModel() {
		return new RouteLocationWrapper(_routeLocation.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.RouteLocation toUnescapedModel() {
		return new RouteLocationWrapper(_routeLocation.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _routeLocation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _routeLocation.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_routeLocation.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RouteLocationWrapper)) {
			return false;
		}

		RouteLocationWrapper routeLocationWrapper = (RouteLocationWrapper)obj;

		if (Validator.equals(_routeLocation, routeLocationWrapper._routeLocation)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public RouteLocation getWrappedRouteLocation() {
		return _routeLocation;
	}

	@Override
	public RouteLocation getWrappedModel() {
		return _routeLocation;
	}

	@Override
	public void resetOriginalValues() {
		_routeLocation.resetOriginalValues();
	}

	private RouteLocation _routeLocation;
}
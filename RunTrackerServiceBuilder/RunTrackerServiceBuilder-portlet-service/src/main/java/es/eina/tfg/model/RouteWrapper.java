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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Route}.
 * </p>
 *
 * @author adelrioj
 * @see Route
 * @generated
 */
public class RouteWrapper implements Route, ModelWrapper<Route> {
	public RouteWrapper(Route route) {
		_route = route;
	}

	@Override
	public Class<?> getModelClass() {
		return Route.class;
	}

	@Override
	public String getModelClassName() {
		return Route.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("routeId", getRouteId());
		attributes.put("type", getType());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("authorId", getAuthorId());
		attributes.put("isPublic", getIsPublic());
		attributes.put("startingTime", getStartingTime());
		attributes.put("creationTime", getCreationTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long routeId = (Long)attributes.get("routeId");

		if (routeId != null) {
			setRouteId(routeId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		Boolean isPublic = (Boolean)attributes.get("isPublic");

		if (isPublic != null) {
			setIsPublic(isPublic);
		}

		Date startingTime = (Date)attributes.get("startingTime");

		if (startingTime != null) {
			setStartingTime(startingTime);
		}

		Date creationTime = (Date)attributes.get("creationTime");

		if (creationTime != null) {
			setCreationTime(creationTime);
		}
	}

	/**
	* Returns the primary key of this route.
	*
	* @return the primary key of this route
	*/
	@Override
	public long getPrimaryKey() {
		return _route.getPrimaryKey();
	}

	/**
	* Sets the primary key of this route.
	*
	* @param primaryKey the primary key of this route
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_route.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the route ID of this route.
	*
	* @return the route ID of this route
	*/
	@Override
	public long getRouteId() {
		return _route.getRouteId();
	}

	/**
	* Sets the route ID of this route.
	*
	* @param routeId the route ID of this route
	*/
	@Override
	public void setRouteId(long routeId) {
		_route.setRouteId(routeId);
	}

	/**
	* Returns the type of this route.
	*
	* @return the type of this route
	*/
	@Override
	public java.lang.String getType() {
		return _route.getType();
	}

	/**
	* Sets the type of this route.
	*
	* @param type the type of this route
	*/
	@Override
	public void setType(java.lang.String type) {
		_route.setType(type);
	}

	/**
	* Returns the name of this route.
	*
	* @return the name of this route
	*/
	@Override
	public java.lang.String getName() {
		return _route.getName();
	}

	/**
	* Sets the name of this route.
	*
	* @param name the name of this route
	*/
	@Override
	public void setName(java.lang.String name) {
		_route.setName(name);
	}

	/**
	* Returns the description of this route.
	*
	* @return the description of this route
	*/
	@Override
	public java.lang.String getDescription() {
		return _route.getDescription();
	}

	/**
	* Sets the description of this route.
	*
	* @param description the description of this route
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_route.setDescription(description);
	}

	/**
	* Returns the author ID of this route.
	*
	* @return the author ID of this route
	*/
	@Override
	public long getAuthorId() {
		return _route.getAuthorId();
	}

	/**
	* Sets the author ID of this route.
	*
	* @param authorId the author ID of this route
	*/
	@Override
	public void setAuthorId(long authorId) {
		_route.setAuthorId(authorId);
	}

	/**
	* Returns the is public of this route.
	*
	* @return the is public of this route
	*/
	@Override
	public boolean getIsPublic() {
		return _route.getIsPublic();
	}

	/**
	* Returns <code>true</code> if this route is is public.
	*
	* @return <code>true</code> if this route is is public; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsPublic() {
		return _route.isIsPublic();
	}

	/**
	* Sets whether this route is is public.
	*
	* @param isPublic the is public of this route
	*/
	@Override
	public void setIsPublic(boolean isPublic) {
		_route.setIsPublic(isPublic);
	}

	/**
	* Returns the starting time of this route.
	*
	* @return the starting time of this route
	*/
	@Override
	public java.util.Date getStartingTime() {
		return _route.getStartingTime();
	}

	/**
	* Sets the starting time of this route.
	*
	* @param startingTime the starting time of this route
	*/
	@Override
	public void setStartingTime(java.util.Date startingTime) {
		_route.setStartingTime(startingTime);
	}

	/**
	* Returns the creation time of this route.
	*
	* @return the creation time of this route
	*/
	@Override
	public java.util.Date getCreationTime() {
		return _route.getCreationTime();
	}

	/**
	* Sets the creation time of this route.
	*
	* @param creationTime the creation time of this route
	*/
	@Override
	public void setCreationTime(java.util.Date creationTime) {
		_route.setCreationTime(creationTime);
	}

	@Override
	public boolean isNew() {
		return _route.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_route.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _route.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_route.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _route.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _route.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_route.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _route.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_route.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_route.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_route.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RouteWrapper((Route)_route.clone());
	}

	@Override
	public int compareTo(es.eina.tfg.model.Route route) {
		return _route.compareTo(route);
	}

	@Override
	public int hashCode() {
		return _route.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Route> toCacheModel() {
		return _route.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.Route toEscapedModel() {
		return new RouteWrapper(_route.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.Route toUnescapedModel() {
		return new RouteWrapper(_route.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _route.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _route.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_route.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RouteWrapper)) {
			return false;
		}

		RouteWrapper routeWrapper = (RouteWrapper)obj;

		if (Validator.equals(_route, routeWrapper._route)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Route getWrappedRoute() {
		return _route;
	}

	@Override
	public Route getWrappedModel() {
		return _route;
	}

	@Override
	public void resetOriginalValues() {
		_route.resetOriginalValues();
	}

	private Route _route;
}
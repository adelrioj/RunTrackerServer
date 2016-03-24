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
 * This class is a wrapper for {@link UserSelectedRoutes}.
 * </p>
 *
 * @author adelrioj
 * @see UserSelectedRoutes
 * @generated
 */
public class UserSelectedRoutesWrapper implements UserSelectedRoutes,
	ModelWrapper<UserSelectedRoutes> {
	public UserSelectedRoutesWrapper(UserSelectedRoutes userSelectedRoutes) {
		_userSelectedRoutes = userSelectedRoutes;
	}

	@Override
	public Class<?> getModelClass() {
		return UserSelectedRoutes.class;
	}

	@Override
	public String getModelClassName() {
		return UserSelectedRoutes.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("routeId", getRouteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long routeId = (Long)attributes.get("routeId");

		if (routeId != null) {
			setRouteId(routeId);
		}
	}

	/**
	* Returns the primary key of this user selected routes.
	*
	* @return the primary key of this user selected routes
	*/
	@Override
	public es.eina.tfg.service.persistence.UserSelectedRoutesPK getPrimaryKey() {
		return _userSelectedRoutes.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user selected routes.
	*
	* @param primaryKey the primary key of this user selected routes
	*/
	@Override
	public void setPrimaryKey(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK primaryKey) {
		_userSelectedRoutes.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this user selected routes.
	*
	* @return the user ID of this user selected routes
	*/
	@Override
	public long getUserId() {
		return _userSelectedRoutes.getUserId();
	}

	/**
	* Sets the user ID of this user selected routes.
	*
	* @param userId the user ID of this user selected routes
	*/
	@Override
	public void setUserId(long userId) {
		_userSelectedRoutes.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user selected routes.
	*
	* @return the user uuid of this user selected routes
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userSelectedRoutes.getUserUuid();
	}

	/**
	* Sets the user uuid of this user selected routes.
	*
	* @param userUuid the user uuid of this user selected routes
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userSelectedRoutes.setUserUuid(userUuid);
	}

	/**
	* Returns the route ID of this user selected routes.
	*
	* @return the route ID of this user selected routes
	*/
	@Override
	public long getRouteId() {
		return _userSelectedRoutes.getRouteId();
	}

	/**
	* Sets the route ID of this user selected routes.
	*
	* @param routeId the route ID of this user selected routes
	*/
	@Override
	public void setRouteId(long routeId) {
		_userSelectedRoutes.setRouteId(routeId);
	}

	@Override
	public boolean isNew() {
		return _userSelectedRoutes.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userSelectedRoutes.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userSelectedRoutes.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userSelectedRoutes.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userSelectedRoutes.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userSelectedRoutes.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userSelectedRoutes.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userSelectedRoutes.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userSelectedRoutes.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userSelectedRoutes.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userSelectedRoutes.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserSelectedRoutesWrapper((UserSelectedRoutes)_userSelectedRoutes.clone());
	}

	@Override
	public int compareTo(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes) {
		return _userSelectedRoutes.compareTo(userSelectedRoutes);
	}

	@Override
	public int hashCode() {
		return _userSelectedRoutes.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.UserSelectedRoutes> toCacheModel() {
		return _userSelectedRoutes.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.UserSelectedRoutes toEscapedModel() {
		return new UserSelectedRoutesWrapper(_userSelectedRoutes.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.UserSelectedRoutes toUnescapedModel() {
		return new UserSelectedRoutesWrapper(_userSelectedRoutes.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userSelectedRoutes.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userSelectedRoutes.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userSelectedRoutes.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserSelectedRoutesWrapper)) {
			return false;
		}

		UserSelectedRoutesWrapper userSelectedRoutesWrapper = (UserSelectedRoutesWrapper)obj;

		if (Validator.equals(_userSelectedRoutes,
					userSelectedRoutesWrapper._userSelectedRoutes)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserSelectedRoutes getWrappedUserSelectedRoutes() {
		return _userSelectedRoutes;
	}

	@Override
	public UserSelectedRoutes getWrappedModel() {
		return _userSelectedRoutes;
	}

	@Override
	public void resetOriginalValues() {
		_userSelectedRoutes.resetOriginalValues();
	}

	private UserSelectedRoutes _userSelectedRoutes;
}
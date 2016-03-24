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
 * This class is a wrapper for {@link UserAdditionalData}.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalData
 * @generated
 */
public class UserAdditionalDataWrapper implements UserAdditionalData,
	ModelWrapper<UserAdditionalData> {
	public UserAdditionalDataWrapper(UserAdditionalData userAdditionalData) {
		_userAdditionalData = userAdditionalData;
	}

	@Override
	public Class<?> getModelClass() {
		return UserAdditionalData.class;
	}

	@Override
	public String getModelClassName() {
		return UserAdditionalData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());
		attributes.put("registerType", getRegisterType());
		attributes.put("weight", getWeight());
		attributes.put("height", getHeight());
		attributes.put("smsCounter", getSmsCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String registerType = (String)attributes.get("registerType");

		if (registerType != null) {
			setRegisterType(registerType);
		}

		Integer weight = (Integer)attributes.get("weight");

		if (weight != null) {
			setWeight(weight);
		}

		Integer height = (Integer)attributes.get("height");

		if (height != null) {
			setHeight(height);
		}

		Long smsCounter = (Long)attributes.get("smsCounter");

		if (smsCounter != null) {
			setSmsCounter(smsCounter);
		}
	}

	/**
	* Returns the primary key of this user additional data.
	*
	* @return the primary key of this user additional data
	*/
	@Override
	public long getPrimaryKey() {
		return _userAdditionalData.getPrimaryKey();
	}

	/**
	* Sets the primary key of this user additional data.
	*
	* @param primaryKey the primary key of this user additional data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_userAdditionalData.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user ID of this user additional data.
	*
	* @return the user ID of this user additional data
	*/
	@Override
	public long getUserId() {
		return _userAdditionalData.getUserId();
	}

	/**
	* Sets the user ID of this user additional data.
	*
	* @param userId the user ID of this user additional data
	*/
	@Override
	public void setUserId(long userId) {
		_userAdditionalData.setUserId(userId);
	}

	/**
	* Returns the user uuid of this user additional data.
	*
	* @return the user uuid of this user additional data
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _userAdditionalData.getUserUuid();
	}

	/**
	* Sets the user uuid of this user additional data.
	*
	* @param userUuid the user uuid of this user additional data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_userAdditionalData.setUserUuid(userUuid);
	}

	/**
	* Returns the register type of this user additional data.
	*
	* @return the register type of this user additional data
	*/
	@Override
	public java.lang.String getRegisterType() {
		return _userAdditionalData.getRegisterType();
	}

	/**
	* Sets the register type of this user additional data.
	*
	* @param registerType the register type of this user additional data
	*/
	@Override
	public void setRegisterType(java.lang.String registerType) {
		_userAdditionalData.setRegisterType(registerType);
	}

	/**
	* Returns the weight of this user additional data.
	*
	* @return the weight of this user additional data
	*/
	@Override
	public int getWeight() {
		return _userAdditionalData.getWeight();
	}

	/**
	* Sets the weight of this user additional data.
	*
	* @param weight the weight of this user additional data
	*/
	@Override
	public void setWeight(int weight) {
		_userAdditionalData.setWeight(weight);
	}

	/**
	* Returns the height of this user additional data.
	*
	* @return the height of this user additional data
	*/
	@Override
	public int getHeight() {
		return _userAdditionalData.getHeight();
	}

	/**
	* Sets the height of this user additional data.
	*
	* @param height the height of this user additional data
	*/
	@Override
	public void setHeight(int height) {
		_userAdditionalData.setHeight(height);
	}

	/**
	* Returns the sms counter of this user additional data.
	*
	* @return the sms counter of this user additional data
	*/
	@Override
	public long getSmsCounter() {
		return _userAdditionalData.getSmsCounter();
	}

	/**
	* Sets the sms counter of this user additional data.
	*
	* @param smsCounter the sms counter of this user additional data
	*/
	@Override
	public void setSmsCounter(long smsCounter) {
		_userAdditionalData.setSmsCounter(smsCounter);
	}

	@Override
	public boolean isNew() {
		return _userAdditionalData.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_userAdditionalData.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _userAdditionalData.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_userAdditionalData.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _userAdditionalData.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _userAdditionalData.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_userAdditionalData.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _userAdditionalData.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_userAdditionalData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_userAdditionalData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_userAdditionalData.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UserAdditionalDataWrapper((UserAdditionalData)_userAdditionalData.clone());
	}

	@Override
	public int compareTo(
		es.eina.tfg.model.UserAdditionalData userAdditionalData) {
		return _userAdditionalData.compareTo(userAdditionalData);
	}

	@Override
	public int hashCode() {
		return _userAdditionalData.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.UserAdditionalData> toCacheModel() {
		return _userAdditionalData.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData toEscapedModel() {
		return new UserAdditionalDataWrapper(_userAdditionalData.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.UserAdditionalData toUnescapedModel() {
		return new UserAdditionalDataWrapper(_userAdditionalData.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _userAdditionalData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _userAdditionalData.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_userAdditionalData.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserAdditionalDataWrapper)) {
			return false;
		}

		UserAdditionalDataWrapper userAdditionalDataWrapper = (UserAdditionalDataWrapper)obj;

		if (Validator.equals(_userAdditionalData,
					userAdditionalDataWrapper._userAdditionalData)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public UserAdditionalData getWrappedUserAdditionalData() {
		return _userAdditionalData;
	}

	@Override
	public UserAdditionalData getWrappedModel() {
		return _userAdditionalData;
	}

	@Override
	public void resetOriginalValues() {
		_userAdditionalData.resetOriginalValues();
	}

	private UserAdditionalData _userAdditionalData;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;
import es.eina.tfg.service.persistence.UserSelectedRoutesPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adelrioj
 */
public class UserSelectedRoutesClp extends BaseModelImpl<UserSelectedRoutes>
	implements UserSelectedRoutes {
	public UserSelectedRoutesClp() {
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
	public UserSelectedRoutesPK getPrimaryKey() {
		return new UserSelectedRoutesPK(_userId, _routeId);
	}

	@Override
	public void setPrimaryKey(UserSelectedRoutesPK primaryKey) {
		setUserId(primaryKey.userId);
		setRouteId(primaryKey.routeId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new UserSelectedRoutesPK(_userId, _routeId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((UserSelectedRoutesPK)primaryKeyObj);
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

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_userSelectedRoutesRemoteModel != null) {
			try {
				Class<?> clazz = _userSelectedRoutesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_userSelectedRoutesRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getRouteId() {
		return _routeId;
	}

	@Override
	public void setRouteId(long routeId) {
		_routeId = routeId;

		if (_userSelectedRoutesRemoteModel != null) {
			try {
				Class<?> clazz = _userSelectedRoutesRemoteModel.getClass();

				Method method = clazz.getMethod("setRouteId", long.class);

				method.invoke(_userSelectedRoutesRemoteModel, routeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUserSelectedRoutesRemoteModel() {
		return _userSelectedRoutesRemoteModel;
	}

	public void setUserSelectedRoutesRemoteModel(
		BaseModel<?> userSelectedRoutesRemoteModel) {
		_userSelectedRoutesRemoteModel = userSelectedRoutesRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _userSelectedRoutesRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_userSelectedRoutesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UserSelectedRoutesLocalServiceUtil.addUserSelectedRoutes(this);
		}
		else {
			UserSelectedRoutesLocalServiceUtil.updateUserSelectedRoutes(this);
		}
	}

	@Override
	public UserSelectedRoutes toEscapedModel() {
		return (UserSelectedRoutes)ProxyUtil.newProxyInstance(UserSelectedRoutes.class.getClassLoader(),
			new Class[] { UserSelectedRoutes.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UserSelectedRoutesClp clone = new UserSelectedRoutesClp();

		clone.setUserId(getUserId());
		clone.setRouteId(getRouteId());

		return clone;
	}

	@Override
	public int compareTo(UserSelectedRoutes userSelectedRoutes) {
		int value = 0;

		if (getUserId() < userSelectedRoutes.getUserId()) {
			value = -1;
		}
		else if (getUserId() > userSelectedRoutes.getUserId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UserSelectedRoutesClp)) {
			return false;
		}

		UserSelectedRoutesClp userSelectedRoutes = (UserSelectedRoutesClp)obj;

		UserSelectedRoutesPK primaryKey = userSelectedRoutes.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", routeId=");
		sb.append(getRouteId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("es.eina.tfg.model.UserSelectedRoutes");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>routeId</column-name><column-value><![CDATA[");
		sb.append(getRouteId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _userId;
	private String _userUuid;
	private long _routeId;
	private BaseModel<?> _userSelectedRoutesRemoteModel;
	private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;
}
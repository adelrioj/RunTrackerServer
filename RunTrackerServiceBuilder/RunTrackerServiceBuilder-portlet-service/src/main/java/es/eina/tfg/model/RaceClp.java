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
import es.eina.tfg.service.RaceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adelrioj
 */
public class RaceClp extends BaseModelImpl<Race> implements Race {
	public RaceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Race.class;
	}

	@Override
	public String getModelClassName() {
		return Race.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _raceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRaceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _raceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("raceId", getRaceId());
		attributes.put("userId", getUserId());
		attributes.put("routeId", getRouteId());
		attributes.put("type", getType());
		attributes.put("userHeight", getUserHeight());
		attributes.put("userWeight", getUserWeight());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long raceId = (Long)attributes.get("raceId");

		if (raceId != null) {
			setRaceId(raceId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long routeId = (Long)attributes.get("routeId");

		if (routeId != null) {
			setRouteId(routeId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Integer userHeight = (Integer)attributes.get("userHeight");

		if (userHeight != null) {
			setUserHeight(userHeight);
		}

		Integer userWeight = (Integer)attributes.get("userWeight");

		if (userWeight != null) {
			setUserWeight(userWeight);
		}
	}

	@Override
	public long getRaceId() {
		return _raceId;
	}

	@Override
	public void setRaceId(long raceId) {
		_raceId = raceId;

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setRaceId", long.class);

				method.invoke(_raceRemoteModel, raceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_raceRemoteModel, userId);
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

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setRouteId", long.class);

				method.invoke(_raceRemoteModel, routeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_raceRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUserHeight() {
		return _userHeight;
	}

	@Override
	public void setUserHeight(int userHeight) {
		_userHeight = userHeight;

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserHeight", int.class);

				method.invoke(_raceRemoteModel, userHeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUserWeight() {
		return _userWeight;
	}

	@Override
	public void setUserWeight(int userWeight) {
		_userWeight = userWeight;

		if (_raceRemoteModel != null) {
			try {
				Class<?> clazz = _raceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserWeight", int.class);

				method.invoke(_raceRemoteModel, userWeight);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRaceRemoteModel() {
		return _raceRemoteModel;
	}

	public void setRaceRemoteModel(BaseModel<?> raceRemoteModel) {
		_raceRemoteModel = raceRemoteModel;
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

		Class<?> remoteModelClass = _raceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_raceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RaceLocalServiceUtil.addRace(this);
		}
		else {
			RaceLocalServiceUtil.updateRace(this);
		}
	}

	@Override
	public Race toEscapedModel() {
		return (Race)ProxyUtil.newProxyInstance(Race.class.getClassLoader(),
			new Class[] { Race.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RaceClp clone = new RaceClp();

		clone.setRaceId(getRaceId());
		clone.setUserId(getUserId());
		clone.setRouteId(getRouteId());
		clone.setType(getType());
		clone.setUserHeight(getUserHeight());
		clone.setUserWeight(getUserWeight());

		return clone;
	}

	@Override
	public int compareTo(Race race) {
		int value = 0;

		if (getUserId() < race.getUserId()) {
			value = -1;
		}
		else if (getUserId() > race.getUserId()) {
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

		if (!(obj instanceof RaceClp)) {
			return false;
		}

		RaceClp race = (RaceClp)obj;

		long primaryKey = race.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
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
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{raceId=");
		sb.append(getRaceId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", routeId=");
		sb.append(getRouteId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", userHeight=");
		sb.append(getUserHeight());
		sb.append(", userWeight=");
		sb.append(getUserWeight());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("es.eina.tfg.model.Race");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>raceId</column-name><column-value><![CDATA[");
		sb.append(getRaceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>routeId</column-name><column-value><![CDATA[");
		sb.append(getRouteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userHeight</column-name><column-value><![CDATA[");
		sb.append(getUserHeight());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userWeight</column-name><column-value><![CDATA[");
		sb.append(getUserWeight());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _raceId;
	private long _userId;
	private String _userUuid;
	private long _routeId;
	private String _type;
	private int _userHeight;
	private int _userWeight;
	private BaseModel<?> _raceRemoteModel;
	private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;
}
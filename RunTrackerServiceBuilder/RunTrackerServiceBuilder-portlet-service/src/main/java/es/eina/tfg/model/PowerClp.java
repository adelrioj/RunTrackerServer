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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.PowerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author adelrioj
 */
public class PowerClp extends BaseModelImpl<Power> implements Power {
	public PowerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Power.class;
	}

	@Override
	public String getModelClassName() {
		return Power.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _measurementId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMeasurementId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _measurementId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("measurementId", getMeasurementId());
		attributes.put("raceId", getRaceId());
		attributes.put("userId", getUserId());
		attributes.put("deviceId", getDeviceId());
		attributes.put("sensorId", getSensorId());
		attributes.put("time", getTime());
		attributes.put("sensorMode", getSensorMode());
		attributes.put("level", getLevel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long measurementId = (Long)attributes.get("measurementId");

		if (measurementId != null) {
			setMeasurementId(measurementId);
		}

		Long raceId = (Long)attributes.get("raceId");

		if (raceId != null) {
			setRaceId(raceId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Long sensorId = (Long)attributes.get("sensorId");

		if (sensorId != null) {
			setSensorId(sensorId);
		}

		Date time = (Date)attributes.get("time");

		if (time != null) {
			setTime(time);
		}

		String sensorMode = (String)attributes.get("sensorMode");

		if (sensorMode != null) {
			setSensorMode(sensorMode);
		}

		Integer level = (Integer)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}
	}

	@Override
	public long getMeasurementId() {
		return _measurementId;
	}

	@Override
	public void setMeasurementId(long measurementId) {
		_measurementId = measurementId;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setMeasurementId", long.class);

				method.invoke(_powerRemoteModel, measurementId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRaceId() {
		return _raceId;
	}

	@Override
	public void setRaceId(long raceId) {
		_raceId = raceId;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setRaceId", long.class);

				method.invoke(_powerRemoteModel, raceId);
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

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_powerRemoteModel, userId);
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
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setDeviceId", long.class);

				method.invoke(_powerRemoteModel, deviceId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSensorId() {
		return _sensorId;
	}

	@Override
	public void setSensorId(long sensorId) {
		_sensorId = sensorId;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setSensorId", long.class);

				method.invoke(_powerRemoteModel, sensorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTime() {
		return _time;
	}

	@Override
	public void setTime(Date time) {
		_time = time;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setTime", Date.class);

				method.invoke(_powerRemoteModel, time);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSensorMode() {
		return _sensorMode;
	}

	@Override
	public void setSensorMode(String sensorMode) {
		_sensorMode = sensorMode;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setSensorMode", String.class);

				method.invoke(_powerRemoteModel, sensorMode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLevel() {
		return _level;
	}

	@Override
	public void setLevel(int level) {
		_level = level;

		if (_powerRemoteModel != null) {
			try {
				Class<?> clazz = _powerRemoteModel.getClass();

				Method method = clazz.getMethod("setLevel", int.class);

				method.invoke(_powerRemoteModel, level);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPowerRemoteModel() {
		return _powerRemoteModel;
	}

	public void setPowerRemoteModel(BaseModel<?> powerRemoteModel) {
		_powerRemoteModel = powerRemoteModel;
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

		Class<?> remoteModelClass = _powerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_powerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PowerLocalServiceUtil.addPower(this);
		}
		else {
			PowerLocalServiceUtil.updatePower(this);
		}
	}

	@Override
	public Power toEscapedModel() {
		return (Power)ProxyUtil.newProxyInstance(Power.class.getClassLoader(),
			new Class[] { Power.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PowerClp clone = new PowerClp();

		clone.setMeasurementId(getMeasurementId());
		clone.setRaceId(getRaceId());
		clone.setUserId(getUserId());
		clone.setDeviceId(getDeviceId());
		clone.setSensorId(getSensorId());
		clone.setTime(getTime());
		clone.setSensorMode(getSensorMode());
		clone.setLevel(getLevel());

		return clone;
	}

	@Override
	public int compareTo(Power power) {
		int value = 0;

		value = DateUtil.compareTo(getTime(), power.getTime());

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

		if (!(obj instanceof PowerClp)) {
			return false;
		}

		PowerClp power = (PowerClp)obj;

		long primaryKey = power.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{measurementId=");
		sb.append(getMeasurementId());
		sb.append(", raceId=");
		sb.append(getRaceId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", deviceId=");
		sb.append(getDeviceId());
		sb.append(", sensorId=");
		sb.append(getSensorId());
		sb.append(", time=");
		sb.append(getTime());
		sb.append(", sensorMode=");
		sb.append(getSensorMode());
		sb.append(", level=");
		sb.append(getLevel());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("es.eina.tfg.model.Power");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>measurementId</column-name><column-value><![CDATA[");
		sb.append(getMeasurementId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>raceId</column-name><column-value><![CDATA[");
		sb.append(getRaceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceId</column-name><column-value><![CDATA[");
		sb.append(getDeviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sensorId</column-name><column-value><![CDATA[");
		sb.append(getSensorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>time</column-name><column-value><![CDATA[");
		sb.append(getTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sensorMode</column-name><column-value><![CDATA[");
		sb.append(getSensorMode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>level</column-name><column-value><![CDATA[");
		sb.append(getLevel());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _measurementId;
	private long _raceId;
	private long _userId;
	private String _userUuid;
	private long _deviceId;
	private long _sensorId;
	private Date _time;
	private String _sensorMode;
	private int _level;
	private BaseModel<?> _powerRemoteModel;
	private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;
}
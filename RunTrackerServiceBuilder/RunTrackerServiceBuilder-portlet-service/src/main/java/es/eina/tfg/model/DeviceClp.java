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
import es.eina.tfg.service.DeviceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author adelrioj
 */
public class DeviceClp extends BaseModelImpl<Device> implements Device {
	public DeviceClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Device.class;
	}

	@Override
	public String getModelClassName() {
		return Device.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _deviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDeviceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _deviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("deviceId", getDeviceId());
		attributes.put("userId", getUserId());
		attributes.put("deviceUUID", getDeviceUUID());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("serverPhoneNumber", getServerPhoneNumber());
		attributes.put("smsPollTime", getSmsPollTime());
		attributes.put("smsTransmitPeriod", getSmsTransmitPeriod());
		attributes.put("cloudId", getCloudId());
		attributes.put("serverIp", getServerIp());
		attributes.put("httpTransmitPeriod", getHttpTransmitPeriod());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String deviceUUID = (String)attributes.get("deviceUUID");

		if (deviceUUID != null) {
			setDeviceUUID(deviceUUID);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String serverPhoneNumber = (String)attributes.get("serverPhoneNumber");

		if (serverPhoneNumber != null) {
			setServerPhoneNumber(serverPhoneNumber);
		}

		String smsPollTime = (String)attributes.get("smsPollTime");

		if (smsPollTime != null) {
			setSmsPollTime(smsPollTime);
		}

		String smsTransmitPeriod = (String)attributes.get("smsTransmitPeriod");

		if (smsTransmitPeriod != null) {
			setSmsTransmitPeriod(smsTransmitPeriod);
		}

		String cloudId = (String)attributes.get("cloudId");

		if (cloudId != null) {
			setCloudId(cloudId);
		}

		String serverIp = (String)attributes.get("serverIp");

		if (serverIp != null) {
			setServerIp(serverIp);
		}

		String httpTransmitPeriod = (String)attributes.get("httpTransmitPeriod");

		if (httpTransmitPeriod != null) {
			setHttpTransmitPeriod(httpTransmitPeriod);
		}
	}

	@Override
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDeviceId", long.class);

				method.invoke(_deviceRemoteModel, deviceId);
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

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_deviceRemoteModel, userId);
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
	public String getDeviceUUID() {
		return _deviceUUID;
	}

	@Override
	public void setDeviceUUID(String deviceUUID) {
		_deviceUUID = deviceUUID;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDeviceUUID", String.class);

				method.invoke(_deviceRemoteModel, deviceUUID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_deviceRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_deviceRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhoneNumber() {
		return _phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneNumber", String.class);

				method.invoke(_deviceRemoteModel, phoneNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServerPhoneNumber() {
		return _serverPhoneNumber;
	}

	@Override
	public void setServerPhoneNumber(String serverPhoneNumber) {
		_serverPhoneNumber = serverPhoneNumber;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServerPhoneNumber",
						String.class);

				method.invoke(_deviceRemoteModel, serverPhoneNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSmsPollTime() {
		return _smsPollTime;
	}

	@Override
	public void setSmsPollTime(String smsPollTime) {
		_smsPollTime = smsPollTime;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setSmsPollTime", String.class);

				method.invoke(_deviceRemoteModel, smsPollTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSmsTransmitPeriod() {
		return _smsTransmitPeriod;
	}

	@Override
	public void setSmsTransmitPeriod(String smsTransmitPeriod) {
		_smsTransmitPeriod = smsTransmitPeriod;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setSmsTransmitPeriod",
						String.class);

				method.invoke(_deviceRemoteModel, smsTransmitPeriod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCloudId() {
		return _cloudId;
	}

	@Override
	public void setCloudId(String cloudId) {
		_cloudId = cloudId;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setCloudId", String.class);

				method.invoke(_deviceRemoteModel, cloudId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServerIp() {
		return _serverIp;
	}

	@Override
	public void setServerIp(String serverIp) {
		_serverIp = serverIp;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setServerIp", String.class);

				method.invoke(_deviceRemoteModel, serverIp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHttpTransmitPeriod() {
		return _httpTransmitPeriod;
	}

	@Override
	public void setHttpTransmitPeriod(String httpTransmitPeriod) {
		_httpTransmitPeriod = httpTransmitPeriod;

		if (_deviceRemoteModel != null) {
			try {
				Class<?> clazz = _deviceRemoteModel.getClass();

				Method method = clazz.getMethod("setHttpTransmitPeriod",
						String.class);

				method.invoke(_deviceRemoteModel, httpTransmitPeriod);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDeviceRemoteModel() {
		return _deviceRemoteModel;
	}

	public void setDeviceRemoteModel(BaseModel<?> deviceRemoteModel) {
		_deviceRemoteModel = deviceRemoteModel;
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

		Class<?> remoteModelClass = _deviceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_deviceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DeviceLocalServiceUtil.addDevice(this);
		}
		else {
			DeviceLocalServiceUtil.updateDevice(this);
		}
	}

	@Override
	public Device toEscapedModel() {
		return (Device)ProxyUtil.newProxyInstance(Device.class.getClassLoader(),
			new Class[] { Device.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DeviceClp clone = new DeviceClp();

		clone.setDeviceId(getDeviceId());
		clone.setUserId(getUserId());
		clone.setDeviceUUID(getDeviceUUID());
		clone.setDescription(getDescription());
		clone.setStatus(getStatus());
		clone.setPhoneNumber(getPhoneNumber());
		clone.setServerPhoneNumber(getServerPhoneNumber());
		clone.setSmsPollTime(getSmsPollTime());
		clone.setSmsTransmitPeriod(getSmsTransmitPeriod());
		clone.setCloudId(getCloudId());
		clone.setServerIp(getServerIp());
		clone.setHttpTransmitPeriod(getHttpTransmitPeriod());

		return clone;
	}

	@Override
	public int compareTo(Device device) {
		int value = 0;

		if (getUserId() < device.getUserId()) {
			value = -1;
		}
		else if (getUserId() > device.getUserId()) {
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

		if (!(obj instanceof DeviceClp)) {
			return false;
		}

		DeviceClp device = (DeviceClp)obj;

		long primaryKey = device.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{deviceId=");
		sb.append(getDeviceId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", deviceUUID=");
		sb.append(getDeviceUUID());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", serverPhoneNumber=");
		sb.append(getServerPhoneNumber());
		sb.append(", smsPollTime=");
		sb.append(getSmsPollTime());
		sb.append(", smsTransmitPeriod=");
		sb.append(getSmsTransmitPeriod());
		sb.append(", cloudId=");
		sb.append(getCloudId());
		sb.append(", serverIp=");
		sb.append(getServerIp());
		sb.append(", httpTransmitPeriod=");
		sb.append(getHttpTransmitPeriod());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("es.eina.tfg.model.Device");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>deviceId</column-name><column-value><![CDATA[");
		sb.append(getDeviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceUUID</column-name><column-value><![CDATA[");
		sb.append(getDeviceUUID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serverPhoneNumber</column-name><column-value><![CDATA[");
		sb.append(getServerPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>smsPollTime</column-name><column-value><![CDATA[");
		sb.append(getSmsPollTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>smsTransmitPeriod</column-name><column-value><![CDATA[");
		sb.append(getSmsTransmitPeriod());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cloudId</column-name><column-value><![CDATA[");
		sb.append(getCloudId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serverIp</column-name><column-value><![CDATA[");
		sb.append(getServerIp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>httpTransmitPeriod</column-name><column-value><![CDATA[");
		sb.append(getHttpTransmitPeriod());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _deviceId;
	private long _userId;
	private String _userUuid;
	private String _deviceUUID;
	private String _description;
	private String _status;
	private String _phoneNumber;
	private String _serverPhoneNumber;
	private String _smsPollTime;
	private String _smsTransmitPeriod;
	private String _cloudId;
	private String _serverIp;
	private String _httpTransmitPeriod;
	private BaseModel<?> _deviceRemoteModel;
	private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;
}
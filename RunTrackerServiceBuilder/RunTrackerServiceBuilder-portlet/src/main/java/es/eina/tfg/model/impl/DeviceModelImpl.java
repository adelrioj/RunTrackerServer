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

package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import es.eina.tfg.model.Device;
import es.eina.tfg.model.DeviceModel;
import es.eina.tfg.model.DeviceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Device service. Represents a row in the &quot;GL_Device&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link es.eina.tfg.model.DeviceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceImpl}.
 * </p>
 *
 * @author adelrioj
 * @see DeviceImpl
 * @see es.eina.tfg.model.Device
 * @see es.eina.tfg.model.DeviceModel
 * @generated
 */
@JSON(strict = true)
public class DeviceModelImpl extends BaseModelImpl<Device>
	implements DeviceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a device model instance should use the {@link es.eina.tfg.model.Device} interface instead.
	 */
	public static final String TABLE_NAME = "GL_Device";
	public static final Object[][] TABLE_COLUMNS = {
			{ "deviceId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "deviceUUID", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "phoneNumber", Types.VARCHAR },
			{ "serverPhoneNumber", Types.VARCHAR },
			{ "smsPollTime", Types.VARCHAR },
			{ "smsTransmitPeriod", Types.VARCHAR },
			{ "cloudId", Types.VARCHAR },
			{ "serverIp", Types.VARCHAR },
			{ "httpTransmitPeriod", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table GL_Device (deviceId LONG not null primary key,userId LONG,deviceUUID VARCHAR(75) null,description VARCHAR(75) null,status VARCHAR(75) null,phoneNumber VARCHAR(75) null,serverPhoneNumber VARCHAR(75) null,smsPollTime VARCHAR(75) null,smsTransmitPeriod VARCHAR(75) null,cloudId VARCHAR(75) null,serverIp VARCHAR(75) null,httpTransmitPeriod VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table GL_Device";
	public static final String ORDER_BY_JPQL = " ORDER BY device.userId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY GL_Device.userId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.es.eina.tfg.model.Device"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.es.eina.tfg.model.Device"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.es.eina.tfg.model.Device"),
			true);
	public static long DEVICEUUID_COLUMN_BITMASK = 1L;
	public static long PHONENUMBER_COLUMN_BITMASK = 2L;
	public static long STATUS_COLUMN_BITMASK = 4L;
	public static long USERID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Device toModel(DeviceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Device model = new DeviceImpl();

		model.setDeviceId(soapModel.getDeviceId());
		model.setUserId(soapModel.getUserId());
		model.setDeviceUUID(soapModel.getDeviceUUID());
		model.setDescription(soapModel.getDescription());
		model.setStatus(soapModel.getStatus());
		model.setPhoneNumber(soapModel.getPhoneNumber());
		model.setServerPhoneNumber(soapModel.getServerPhoneNumber());
		model.setSmsPollTime(soapModel.getSmsPollTime());
		model.setSmsTransmitPeriod(soapModel.getSmsTransmitPeriod());
		model.setCloudId(soapModel.getCloudId());
		model.setServerIp(soapModel.getServerIp());
		model.setHttpTransmitPeriod(soapModel.getHttpTransmitPeriod());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Device> toModels(DeviceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Device> models = new ArrayList<Device>(soapModels.length);

		for (DeviceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.es.eina.tfg.model.Device"));

	public DeviceModelImpl() {
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
	public Class<?> getModelClass() {
		return Device.class;
	}

	@Override
	public String getModelClassName() {
		return Device.class.getName();
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

	@JSON
	@Override
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_deviceId = deviceId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask = -1L;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getDeviceUUID() {
		if (_deviceUUID == null) {
			return StringPool.BLANK;
		}
		else {
			return _deviceUUID;
		}
	}

	@Override
	public void setDeviceUUID(String deviceUUID) {
		_columnBitmask |= DEVICEUUID_COLUMN_BITMASK;

		if (_originalDeviceUUID == null) {
			_originalDeviceUUID = _deviceUUID;
		}

		_deviceUUID = deviceUUID;
	}

	public String getOriginalDeviceUUID() {
		return GetterUtil.getString(_originalDeviceUUID);
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (_originalStatus == null) {
			_originalStatus = _status;
		}

		_status = status;
	}

	public String getOriginalStatus() {
		return GetterUtil.getString(_originalStatus);
	}

	@JSON
	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_columnBitmask |= PHONENUMBER_COLUMN_BITMASK;

		if (_originalPhoneNumber == null) {
			_originalPhoneNumber = _phoneNumber;
		}

		_phoneNumber = phoneNumber;
	}

	public String getOriginalPhoneNumber() {
		return GetterUtil.getString(_originalPhoneNumber);
	}

	@JSON
	@Override
	public String getServerPhoneNumber() {
		if (_serverPhoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _serverPhoneNumber;
		}
	}

	@Override
	public void setServerPhoneNumber(String serverPhoneNumber) {
		_serverPhoneNumber = serverPhoneNumber;
	}

	@JSON
	@Override
	public String getSmsPollTime() {
		if (_smsPollTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _smsPollTime;
		}
	}

	@Override
	public void setSmsPollTime(String smsPollTime) {
		_smsPollTime = smsPollTime;
	}

	@JSON
	@Override
	public String getSmsTransmitPeriod() {
		if (_smsTransmitPeriod == null) {
			return StringPool.BLANK;
		}
		else {
			return _smsTransmitPeriod;
		}
	}

	@Override
	public void setSmsTransmitPeriod(String smsTransmitPeriod) {
		_smsTransmitPeriod = smsTransmitPeriod;
	}

	@JSON
	@Override
	public String getCloudId() {
		if (_cloudId == null) {
			return StringPool.BLANK;
		}
		else {
			return _cloudId;
		}
	}

	@Override
	public void setCloudId(String cloudId) {
		_cloudId = cloudId;
	}

	@JSON
	@Override
	public String getServerIp() {
		if (_serverIp == null) {
			return StringPool.BLANK;
		}
		else {
			return _serverIp;
		}
	}

	@Override
	public void setServerIp(String serverIp) {
		_serverIp = serverIp;
	}

	@JSON
	@Override
	public String getHttpTransmitPeriod() {
		if (_httpTransmitPeriod == null) {
			return StringPool.BLANK;
		}
		else {
			return _httpTransmitPeriod;
		}
	}

	@Override
	public void setHttpTransmitPeriod(String httpTransmitPeriod) {
		_httpTransmitPeriod = httpTransmitPeriod;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Device.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Device toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Device)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DeviceImpl deviceImpl = new DeviceImpl();

		deviceImpl.setDeviceId(getDeviceId());
		deviceImpl.setUserId(getUserId());
		deviceImpl.setDeviceUUID(getDeviceUUID());
		deviceImpl.setDescription(getDescription());
		deviceImpl.setStatus(getStatus());
		deviceImpl.setPhoneNumber(getPhoneNumber());
		deviceImpl.setServerPhoneNumber(getServerPhoneNumber());
		deviceImpl.setSmsPollTime(getSmsPollTime());
		deviceImpl.setSmsTransmitPeriod(getSmsTransmitPeriod());
		deviceImpl.setCloudId(getCloudId());
		deviceImpl.setServerIp(getServerIp());
		deviceImpl.setHttpTransmitPeriod(getHttpTransmitPeriod());

		deviceImpl.resetOriginalValues();

		return deviceImpl;
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

		if (!(obj instanceof Device)) {
			return false;
		}

		Device device = (Device)obj;

		long primaryKey = device.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		DeviceModelImpl deviceModelImpl = this;

		deviceModelImpl._originalUserId = deviceModelImpl._userId;

		deviceModelImpl._setOriginalUserId = false;

		deviceModelImpl._originalDeviceUUID = deviceModelImpl._deviceUUID;

		deviceModelImpl._originalStatus = deviceModelImpl._status;

		deviceModelImpl._originalPhoneNumber = deviceModelImpl._phoneNumber;

		deviceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Device> toCacheModel() {
		DeviceCacheModel deviceCacheModel = new DeviceCacheModel();

		deviceCacheModel.deviceId = getDeviceId();

		deviceCacheModel.userId = getUserId();

		deviceCacheModel.deviceUUID = getDeviceUUID();

		String deviceUUID = deviceCacheModel.deviceUUID;

		if ((deviceUUID != null) && (deviceUUID.length() == 0)) {
			deviceCacheModel.deviceUUID = null;
		}

		deviceCacheModel.description = getDescription();

		String description = deviceCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			deviceCacheModel.description = null;
		}

		deviceCacheModel.status = getStatus();

		String status = deviceCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			deviceCacheModel.status = null;
		}

		deviceCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = deviceCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			deviceCacheModel.phoneNumber = null;
		}

		deviceCacheModel.serverPhoneNumber = getServerPhoneNumber();

		String serverPhoneNumber = deviceCacheModel.serverPhoneNumber;

		if ((serverPhoneNumber != null) && (serverPhoneNumber.length() == 0)) {
			deviceCacheModel.serverPhoneNumber = null;
		}

		deviceCacheModel.smsPollTime = getSmsPollTime();

		String smsPollTime = deviceCacheModel.smsPollTime;

		if ((smsPollTime != null) && (smsPollTime.length() == 0)) {
			deviceCacheModel.smsPollTime = null;
		}

		deviceCacheModel.smsTransmitPeriod = getSmsTransmitPeriod();

		String smsTransmitPeriod = deviceCacheModel.smsTransmitPeriod;

		if ((smsTransmitPeriod != null) && (smsTransmitPeriod.length() == 0)) {
			deviceCacheModel.smsTransmitPeriod = null;
		}

		deviceCacheModel.cloudId = getCloudId();

		String cloudId = deviceCacheModel.cloudId;

		if ((cloudId != null) && (cloudId.length() == 0)) {
			deviceCacheModel.cloudId = null;
		}

		deviceCacheModel.serverIp = getServerIp();

		String serverIp = deviceCacheModel.serverIp;

		if ((serverIp != null) && (serverIp.length() == 0)) {
			deviceCacheModel.serverIp = null;
		}

		deviceCacheModel.httpTransmitPeriod = getHttpTransmitPeriod();

		String httpTransmitPeriod = deviceCacheModel.httpTransmitPeriod;

		if ((httpTransmitPeriod != null) && (httpTransmitPeriod.length() == 0)) {
			deviceCacheModel.httpTransmitPeriod = null;
		}

		return deviceCacheModel;
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

	private static ClassLoader _classLoader = Device.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Device.class };
	private long _deviceId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _deviceUUID;
	private String _originalDeviceUUID;
	private String _description;
	private String _status;
	private String _originalStatus;
	private String _phoneNumber;
	private String _originalPhoneNumber;
	private String _serverPhoneNumber;
	private String _smsPollTime;
	private String _smsTransmitPeriod;
	private String _cloudId;
	private String _serverIp;
	private String _httpTransmitPeriod;
	private long _columnBitmask;
	private Device _escapedModel;
}
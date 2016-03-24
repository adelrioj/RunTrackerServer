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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Device service. Represents a row in the &quot;GL_Device&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link es.eina.tfg.model.impl.DeviceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link es.eina.tfg.model.impl.DeviceImpl}.
 * </p>
 *
 * @author adelrioj
 * @see Device
 * @see es.eina.tfg.model.impl.DeviceImpl
 * @see es.eina.tfg.model.impl.DeviceModelImpl
 * @generated
 */
public interface DeviceModel extends BaseModel<Device> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a device model instance should use the {@link Device} interface instead.
	 */

	/**
	 * Returns the primary key of this device.
	 *
	 * @return the primary key of this device
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this device.
	 *
	 * @param primaryKey the primary key of this device
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the device ID of this device.
	 *
	 * @return the device ID of this device
	 */
	public long getDeviceId();

	/**
	 * Sets the device ID of this device.
	 *
	 * @param deviceId the device ID of this device
	 */
	public void setDeviceId(long deviceId);

	/**
	 * Returns the user ID of this device.
	 *
	 * @return the user ID of this device
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this device.
	 *
	 * @param userId the user ID of this device
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this device.
	 *
	 * @return the user uuid of this device
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this device.
	 *
	 * @param userUuid the user uuid of this device
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the device u u i d of this device.
	 *
	 * @return the device u u i d of this device
	 */
	@AutoEscape
	public String getDeviceUUID();

	/**
	 * Sets the device u u i d of this device.
	 *
	 * @param deviceUUID the device u u i d of this device
	 */
	public void setDeviceUUID(String deviceUUID);

	/**
	 * Returns the description of this device.
	 *
	 * @return the description of this device
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this device.
	 *
	 * @param description the description of this device
	 */
	public void setDescription(String description);

	/**
	 * Returns the status of this device.
	 *
	 * @return the status of this device
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this device.
	 *
	 * @param status the status of this device
	 */
	public void setStatus(String status);

	/**
	 * Returns the phone number of this device.
	 *
	 * @return the phone number of this device
	 */
	@AutoEscape
	public String getPhoneNumber();

	/**
	 * Sets the phone number of this device.
	 *
	 * @param phoneNumber the phone number of this device
	 */
	public void setPhoneNumber(String phoneNumber);

	/**
	 * Returns the server phone number of this device.
	 *
	 * @return the server phone number of this device
	 */
	@AutoEscape
	public String getServerPhoneNumber();

	/**
	 * Sets the server phone number of this device.
	 *
	 * @param serverPhoneNumber the server phone number of this device
	 */
	public void setServerPhoneNumber(String serverPhoneNumber);

	/**
	 * Returns the sms poll time of this device.
	 *
	 * @return the sms poll time of this device
	 */
	@AutoEscape
	public String getSmsPollTime();

	/**
	 * Sets the sms poll time of this device.
	 *
	 * @param smsPollTime the sms poll time of this device
	 */
	public void setSmsPollTime(String smsPollTime);

	/**
	 * Returns the sms transmit period of this device.
	 *
	 * @return the sms transmit period of this device
	 */
	@AutoEscape
	public String getSmsTransmitPeriod();

	/**
	 * Sets the sms transmit period of this device.
	 *
	 * @param smsTransmitPeriod the sms transmit period of this device
	 */
	public void setSmsTransmitPeriod(String smsTransmitPeriod);

	/**
	 * Returns the cloud ID of this device.
	 *
	 * @return the cloud ID of this device
	 */
	@AutoEscape
	public String getCloudId();

	/**
	 * Sets the cloud ID of this device.
	 *
	 * @param cloudId the cloud ID of this device
	 */
	public void setCloudId(String cloudId);

	/**
	 * Returns the server ip of this device.
	 *
	 * @return the server ip of this device
	 */
	@AutoEscape
	public String getServerIp();

	/**
	 * Sets the server ip of this device.
	 *
	 * @param serverIp the server ip of this device
	 */
	public void setServerIp(String serverIp);

	/**
	 * Returns the http transmit period of this device.
	 *
	 * @return the http transmit period of this device
	 */
	@AutoEscape
	public String getHttpTransmitPeriod();

	/**
	 * Sets the http transmit period of this device.
	 *
	 * @param httpTransmitPeriod the http transmit period of this device
	 */
	public void setHttpTransmitPeriod(String httpTransmitPeriod);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(es.eina.tfg.model.Device device);

	@Override
	public int hashCode();

	@Override
	public CacheModel<es.eina.tfg.model.Device> toCacheModel();

	@Override
	public es.eina.tfg.model.Device toEscapedModel();

	@Override
	public es.eina.tfg.model.Device toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
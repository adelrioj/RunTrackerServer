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
 * This class is a wrapper for {@link Device_Sensor}.
 * </p>
 *
 * @author adelrioj
 * @see Device_Sensor
 * @generated
 */
public class Device_SensorWrapper implements Device_Sensor,
	ModelWrapper<Device_Sensor> {
	public Device_SensorWrapper(Device_Sensor device_Sensor) {
		_device_Sensor = device_Sensor;
	}

	@Override
	public Class<?> getModelClass() {
		return Device_Sensor.class;
	}

	@Override
	public String getModelClassName() {
		return Device_Sensor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("deviceId", getDeviceId());
		attributes.put("sensorId", getSensorId());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Long sensorId = (Long)attributes.get("sensorId");

		if (sensorId != null) {
			setSensorId(sensorId);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this device_ sensor.
	*
	* @return the primary key of this device_ sensor
	*/
	@Override
	public es.eina.tfg.service.persistence.Device_SensorPK getPrimaryKey() {
		return _device_Sensor.getPrimaryKey();
	}

	/**
	* Sets the primary key of this device_ sensor.
	*
	* @param primaryKey the primary key of this device_ sensor
	*/
	@Override
	public void setPrimaryKey(
		es.eina.tfg.service.persistence.Device_SensorPK primaryKey) {
		_device_Sensor.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the device ID of this device_ sensor.
	*
	* @return the device ID of this device_ sensor
	*/
	@Override
	public long getDeviceId() {
		return _device_Sensor.getDeviceId();
	}

	/**
	* Sets the device ID of this device_ sensor.
	*
	* @param deviceId the device ID of this device_ sensor
	*/
	@Override
	public void setDeviceId(long deviceId) {
		_device_Sensor.setDeviceId(deviceId);
	}

	/**
	* Returns the sensor ID of this device_ sensor.
	*
	* @return the sensor ID of this device_ sensor
	*/
	@Override
	public long getSensorId() {
		return _device_Sensor.getSensorId();
	}

	/**
	* Sets the sensor ID of this device_ sensor.
	*
	* @param sensorId the sensor ID of this device_ sensor
	*/
	@Override
	public void setSensorId(long sensorId) {
		_device_Sensor.setSensorId(sensorId);
	}

	/**
	* Returns the status of this device_ sensor.
	*
	* @return the status of this device_ sensor
	*/
	@Override
	public boolean getStatus() {
		return _device_Sensor.getStatus();
	}

	/**
	* Returns <code>true</code> if this device_ sensor is status.
	*
	* @return <code>true</code> if this device_ sensor is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _device_Sensor.isStatus();
	}

	/**
	* Sets whether this device_ sensor is status.
	*
	* @param status the status of this device_ sensor
	*/
	@Override
	public void setStatus(boolean status) {
		_device_Sensor.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _device_Sensor.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_device_Sensor.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _device_Sensor.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_device_Sensor.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _device_Sensor.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _device_Sensor.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_device_Sensor.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _device_Sensor.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_device_Sensor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_device_Sensor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_device_Sensor.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new Device_SensorWrapper((Device_Sensor)_device_Sensor.clone());
	}

	@Override
	public int compareTo(es.eina.tfg.model.Device_Sensor device_Sensor) {
		return _device_Sensor.compareTo(device_Sensor);
	}

	@Override
	public int hashCode() {
		return _device_Sensor.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Device_Sensor> toCacheModel() {
		return _device_Sensor.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.Device_Sensor toEscapedModel() {
		return new Device_SensorWrapper(_device_Sensor.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.Device_Sensor toUnescapedModel() {
		return new Device_SensorWrapper(_device_Sensor.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _device_Sensor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _device_Sensor.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_device_Sensor.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Device_SensorWrapper)) {
			return false;
		}

		Device_SensorWrapper device_SensorWrapper = (Device_SensorWrapper)obj;

		if (Validator.equals(_device_Sensor, device_SensorWrapper._device_Sensor)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Device_Sensor getWrappedDevice_Sensor() {
		return _device_Sensor;
	}

	@Override
	public Device_Sensor getWrappedModel() {
		return _device_Sensor;
	}

	@Override
	public void resetOriginalValues() {
		_device_Sensor.resetOriginalValues();
	}

	private Device_Sensor _device_Sensor;
}
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
 * This class is a wrapper for {@link Sensor}.
 * </p>
 *
 * @author adelrioj
 * @see Sensor
 * @generated
 */
public class SensorWrapper implements Sensor, ModelWrapper<Sensor> {
	public SensorWrapper(Sensor sensor) {
		_sensor = sensor;
	}

	@Override
	public Class<?> getModelClass() {
		return Sensor.class;
	}

	@Override
	public String getModelClassName() {
		return Sensor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sensorId", getSensorId());
		attributes.put("type", getType());
		attributes.put("description", getDescription());
		attributes.put("dataUnits", getDataUnits());
		attributes.put("dataType", getDataType());
		attributes.put("dataUncertainity", getDataUncertainity());
		attributes.put("dataLowerRange", getDataLowerRange());
		attributes.put("dataUpperRange", getDataUpperRange());
		attributes.put("dataPacketFormat", getDataPacketFormat());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sensorId = (Long)attributes.get("sensorId");

		if (sensorId != null) {
			setSensorId(sensorId);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String dataUnits = (String)attributes.get("dataUnits");

		if (dataUnits != null) {
			setDataUnits(dataUnits);
		}

		String dataType = (String)attributes.get("dataType");

		if (dataType != null) {
			setDataType(dataType);
		}

		String dataUncertainity = (String)attributes.get("dataUncertainity");

		if (dataUncertainity != null) {
			setDataUncertainity(dataUncertainity);
		}

		String dataLowerRange = (String)attributes.get("dataLowerRange");

		if (dataLowerRange != null) {
			setDataLowerRange(dataLowerRange);
		}

		String dataUpperRange = (String)attributes.get("dataUpperRange");

		if (dataUpperRange != null) {
			setDataUpperRange(dataUpperRange);
		}

		String dataPacketFormat = (String)attributes.get("dataPacketFormat");

		if (dataPacketFormat != null) {
			setDataPacketFormat(dataPacketFormat);
		}
	}

	/**
	* Returns the primary key of this sensor.
	*
	* @return the primary key of this sensor
	*/
	@Override
	public long getPrimaryKey() {
		return _sensor.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sensor.
	*
	* @param primaryKey the primary key of this sensor
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sensor.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sensor ID of this sensor.
	*
	* @return the sensor ID of this sensor
	*/
	@Override
	public long getSensorId() {
		return _sensor.getSensorId();
	}

	/**
	* Sets the sensor ID of this sensor.
	*
	* @param sensorId the sensor ID of this sensor
	*/
	@Override
	public void setSensorId(long sensorId) {
		_sensor.setSensorId(sensorId);
	}

	/**
	* Returns the type of this sensor.
	*
	* @return the type of this sensor
	*/
	@Override
	public int getType() {
		return _sensor.getType();
	}

	/**
	* Sets the type of this sensor.
	*
	* @param type the type of this sensor
	*/
	@Override
	public void setType(int type) {
		_sensor.setType(type);
	}

	/**
	* Returns the description of this sensor.
	*
	* @return the description of this sensor
	*/
	@Override
	public java.lang.String getDescription() {
		return _sensor.getDescription();
	}

	/**
	* Sets the description of this sensor.
	*
	* @param description the description of this sensor
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_sensor.setDescription(description);
	}

	/**
	* Returns the data units of this sensor.
	*
	* @return the data units of this sensor
	*/
	@Override
	public java.lang.String getDataUnits() {
		return _sensor.getDataUnits();
	}

	/**
	* Sets the data units of this sensor.
	*
	* @param dataUnits the data units of this sensor
	*/
	@Override
	public void setDataUnits(java.lang.String dataUnits) {
		_sensor.setDataUnits(dataUnits);
	}

	/**
	* Returns the data type of this sensor.
	*
	* @return the data type of this sensor
	*/
	@Override
	public java.lang.String getDataType() {
		return _sensor.getDataType();
	}

	/**
	* Sets the data type of this sensor.
	*
	* @param dataType the data type of this sensor
	*/
	@Override
	public void setDataType(java.lang.String dataType) {
		_sensor.setDataType(dataType);
	}

	/**
	* Returns the data uncertainity of this sensor.
	*
	* @return the data uncertainity of this sensor
	*/
	@Override
	public java.lang.String getDataUncertainity() {
		return _sensor.getDataUncertainity();
	}

	/**
	* Sets the data uncertainity of this sensor.
	*
	* @param dataUncertainity the data uncertainity of this sensor
	*/
	@Override
	public void setDataUncertainity(java.lang.String dataUncertainity) {
		_sensor.setDataUncertainity(dataUncertainity);
	}

	/**
	* Returns the data lower range of this sensor.
	*
	* @return the data lower range of this sensor
	*/
	@Override
	public java.lang.String getDataLowerRange() {
		return _sensor.getDataLowerRange();
	}

	/**
	* Sets the data lower range of this sensor.
	*
	* @param dataLowerRange the data lower range of this sensor
	*/
	@Override
	public void setDataLowerRange(java.lang.String dataLowerRange) {
		_sensor.setDataLowerRange(dataLowerRange);
	}

	/**
	* Returns the data upper range of this sensor.
	*
	* @return the data upper range of this sensor
	*/
	@Override
	public java.lang.String getDataUpperRange() {
		return _sensor.getDataUpperRange();
	}

	/**
	* Sets the data upper range of this sensor.
	*
	* @param dataUpperRange the data upper range of this sensor
	*/
	@Override
	public void setDataUpperRange(java.lang.String dataUpperRange) {
		_sensor.setDataUpperRange(dataUpperRange);
	}

	/**
	* Returns the data packet format of this sensor.
	*
	* @return the data packet format of this sensor
	*/
	@Override
	public java.lang.String getDataPacketFormat() {
		return _sensor.getDataPacketFormat();
	}

	/**
	* Sets the data packet format of this sensor.
	*
	* @param dataPacketFormat the data packet format of this sensor
	*/
	@Override
	public void setDataPacketFormat(java.lang.String dataPacketFormat) {
		_sensor.setDataPacketFormat(dataPacketFormat);
	}

	@Override
	public boolean isNew() {
		return _sensor.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sensor.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sensor.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sensor.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sensor.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sensor.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sensor.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sensor.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sensor.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sensor.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sensor.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SensorWrapper((Sensor)_sensor.clone());
	}

	@Override
	public int compareTo(es.eina.tfg.model.Sensor sensor) {
		return _sensor.compareTo(sensor);
	}

	@Override
	public int hashCode() {
		return _sensor.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Sensor> toCacheModel() {
		return _sensor.toCacheModel();
	}

	@Override
	public es.eina.tfg.model.Sensor toEscapedModel() {
		return new SensorWrapper(_sensor.toEscapedModel());
	}

	@Override
	public es.eina.tfg.model.Sensor toUnescapedModel() {
		return new SensorWrapper(_sensor.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sensor.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sensor.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sensor.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SensorWrapper)) {
			return false;
		}

		SensorWrapper sensorWrapper = (SensorWrapper)obj;

		if (Validator.equals(_sensor, sensorWrapper._sensor)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sensor getWrappedSensor() {
		return _sensor;
	}

	@Override
	public Sensor getWrappedModel() {
		return _sensor;
	}

	@Override
	public void resetOriginalValues() {
		_sensor.resetOriginalValues();
	}

	private Sensor _sensor;
}
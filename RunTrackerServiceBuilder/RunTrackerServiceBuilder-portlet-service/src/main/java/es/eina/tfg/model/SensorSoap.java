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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.SensorServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.SensorServiceSoap
 * @generated
 */
public class SensorSoap implements Serializable {
	public static SensorSoap toSoapModel(Sensor model) {
		SensorSoap soapModel = new SensorSoap();

		soapModel.setSensorId(model.getSensorId());
		soapModel.setType(model.getType());
		soapModel.setDescription(model.getDescription());
		soapModel.setDataUnits(model.getDataUnits());
		soapModel.setDataType(model.getDataType());
		soapModel.setDataUncertainity(model.getDataUncertainity());
		soapModel.setDataLowerRange(model.getDataLowerRange());
		soapModel.setDataUpperRange(model.getDataUpperRange());
		soapModel.setDataPacketFormat(model.getDataPacketFormat());

		return soapModel;
	}

	public static SensorSoap[] toSoapModels(Sensor[] models) {
		SensorSoap[] soapModels = new SensorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SensorSoap[][] toSoapModels(Sensor[][] models) {
		SensorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SensorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SensorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SensorSoap[] toSoapModels(List<Sensor> models) {
		List<SensorSoap> soapModels = new ArrayList<SensorSoap>(models.size());

		for (Sensor model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SensorSoap[soapModels.size()]);
	}

	public SensorSoap() {
	}

	public long getPrimaryKey() {
		return _sensorId;
	}

	public void setPrimaryKey(long pk) {
		setSensorId(pk);
	}

	public long getSensorId() {
		return _sensorId;
	}

	public void setSensorId(long sensorId) {
		_sensorId = sensorId;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getDataUnits() {
		return _dataUnits;
	}

	public void setDataUnits(String dataUnits) {
		_dataUnits = dataUnits;
	}

	public String getDataType() {
		return _dataType;
	}

	public void setDataType(String dataType) {
		_dataType = dataType;
	}

	public String getDataUncertainity() {
		return _dataUncertainity;
	}

	public void setDataUncertainity(String dataUncertainity) {
		_dataUncertainity = dataUncertainity;
	}

	public String getDataLowerRange() {
		return _dataLowerRange;
	}

	public void setDataLowerRange(String dataLowerRange) {
		_dataLowerRange = dataLowerRange;
	}

	public String getDataUpperRange() {
		return _dataUpperRange;
	}

	public void setDataUpperRange(String dataUpperRange) {
		_dataUpperRange = dataUpperRange;
	}

	public String getDataPacketFormat() {
		return _dataPacketFormat;
	}

	public void setDataPacketFormat(String dataPacketFormat) {
		_dataPacketFormat = dataPacketFormat;
	}

	private long _sensorId;
	private int _type;
	private String _description;
	private String _dataUnits;
	private String _dataType;
	private String _dataUncertainity;
	private String _dataLowerRange;
	private String _dataUpperRange;
	private String _dataPacketFormat;
}
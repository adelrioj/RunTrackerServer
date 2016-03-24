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
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.UserAdditionalDataServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.UserAdditionalDataServiceSoap
 * @generated
 */
public class UserAdditionalDataSoap implements Serializable {
	public static UserAdditionalDataSoap toSoapModel(UserAdditionalData model) {
		UserAdditionalDataSoap soapModel = new UserAdditionalDataSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setRegisterType(model.getRegisterType());
		soapModel.setWeight(model.getWeight());
		soapModel.setHeight(model.getHeight());
		soapModel.setSmsCounter(model.getSmsCounter());

		return soapModel;
	}

	public static UserAdditionalDataSoap[] toSoapModels(
		UserAdditionalData[] models) {
		UserAdditionalDataSoap[] soapModels = new UserAdditionalDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserAdditionalDataSoap[][] toSoapModels(
		UserAdditionalData[][] models) {
		UserAdditionalDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserAdditionalDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserAdditionalDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserAdditionalDataSoap[] toSoapModels(
		List<UserAdditionalData> models) {
		List<UserAdditionalDataSoap> soapModels = new ArrayList<UserAdditionalDataSoap>(models.size());

		for (UserAdditionalData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserAdditionalDataSoap[soapModels.size()]);
	}

	public UserAdditionalDataSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getRegisterType() {
		return _registerType;
	}

	public void setRegisterType(String registerType) {
		_registerType = registerType;
	}

	public int getWeight() {
		return _weight;
	}

	public void setWeight(int weight) {
		_weight = weight;
	}

	public int getHeight() {
		return _height;
	}

	public void setHeight(int height) {
		_height = height;
	}

	public long getSmsCounter() {
		return _smsCounter;
	}

	public void setSmsCounter(long smsCounter) {
		_smsCounter = smsCounter;
	}

	private long _userId;
	private String _registerType;
	private int _weight;
	private int _height;
	private long _smsCounter;
}
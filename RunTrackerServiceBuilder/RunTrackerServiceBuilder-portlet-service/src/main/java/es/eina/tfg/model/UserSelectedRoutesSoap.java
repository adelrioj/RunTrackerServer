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

import es.eina.tfg.service.persistence.UserSelectedRoutesPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.UserSelectedRoutesServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.UserSelectedRoutesServiceSoap
 * @generated
 */
public class UserSelectedRoutesSoap implements Serializable {
	public static UserSelectedRoutesSoap toSoapModel(UserSelectedRoutes model) {
		UserSelectedRoutesSoap soapModel = new UserSelectedRoutesSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setRouteId(model.getRouteId());

		return soapModel;
	}

	public static UserSelectedRoutesSoap[] toSoapModels(
		UserSelectedRoutes[] models) {
		UserSelectedRoutesSoap[] soapModels = new UserSelectedRoutesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserSelectedRoutesSoap[][] toSoapModels(
		UserSelectedRoutes[][] models) {
		UserSelectedRoutesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserSelectedRoutesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserSelectedRoutesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserSelectedRoutesSoap[] toSoapModels(
		List<UserSelectedRoutes> models) {
		List<UserSelectedRoutesSoap> soapModels = new ArrayList<UserSelectedRoutesSoap>(models.size());

		for (UserSelectedRoutes model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserSelectedRoutesSoap[soapModels.size()]);
	}

	public UserSelectedRoutesSoap() {
	}

	public UserSelectedRoutesPK getPrimaryKey() {
		return new UserSelectedRoutesPK(_userId, _routeId);
	}

	public void setPrimaryKey(UserSelectedRoutesPK pk) {
		setUserId(pk.userId);
		setRouteId(pk.routeId);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getRouteId() {
		return _routeId;
	}

	public void setRouteId(long routeId) {
		_routeId = routeId;
	}

	private long _userId;
	private long _routeId;
}
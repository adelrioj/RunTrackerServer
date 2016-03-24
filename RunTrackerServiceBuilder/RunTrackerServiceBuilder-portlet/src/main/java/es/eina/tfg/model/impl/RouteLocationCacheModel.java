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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import es.eina.tfg.model.RouteLocation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RouteLocation in entity cache.
 *
 * @author adelrioj
 * @see RouteLocation
 * @generated
 */
public class RouteLocationCacheModel implements CacheModel<RouteLocation>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{routePositionId=");
		sb.append(routePositionId);
		sb.append(", routeId=");
		sb.append(routeId);
		sb.append(", latitude=");
		sb.append(latitude);
		sb.append(", longitude=");
		sb.append(longitude);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RouteLocation toEntityModel() {
		RouteLocationImpl routeLocationImpl = new RouteLocationImpl();

		routeLocationImpl.setRoutePositionId(routePositionId);
		routeLocationImpl.setRouteId(routeId);
		routeLocationImpl.setLatitude(latitude);
		routeLocationImpl.setLongitude(longitude);

		routeLocationImpl.resetOriginalValues();

		return routeLocationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		routePositionId = objectInput.readLong();
		routeId = objectInput.readLong();
		latitude = objectInput.readDouble();
		longitude = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(routePositionId);
		objectOutput.writeLong(routeId);
		objectOutput.writeDouble(latitude);
		objectOutput.writeDouble(longitude);
	}

	public long routePositionId;
	public long routeId;
	public double latitude;
	public double longitude;
}
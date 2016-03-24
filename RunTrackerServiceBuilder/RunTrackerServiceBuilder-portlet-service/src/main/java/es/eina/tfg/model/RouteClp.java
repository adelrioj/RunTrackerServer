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

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.RouteLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author adelrioj
 */
public class RouteClp extends BaseModelImpl<Route> implements Route {
	public RouteClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Route.class;
	}

	@Override
	public String getModelClassName() {
		return Route.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _routeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRouteId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _routeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("routeId", getRouteId());
		attributes.put("type", getType());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("authorId", getAuthorId());
		attributes.put("isPublic", getIsPublic());
		attributes.put("startingTime", getStartingTime());
		attributes.put("creationTime", getCreationTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long routeId = (Long)attributes.get("routeId");

		if (routeId != null) {
			setRouteId(routeId);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long authorId = (Long)attributes.get("authorId");

		if (authorId != null) {
			setAuthorId(authorId);
		}

		Boolean isPublic = (Boolean)attributes.get("isPublic");

		if (isPublic != null) {
			setIsPublic(isPublic);
		}

		Date startingTime = (Date)attributes.get("startingTime");

		if (startingTime != null) {
			setStartingTime(startingTime);
		}

		Date creationTime = (Date)attributes.get("creationTime");

		if (creationTime != null) {
			setCreationTime(creationTime);
		}
	}

	@Override
	public long getRouteId() {
		return _routeId;
	}

	@Override
	public void setRouteId(long routeId) {
		_routeId = routeId;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setRouteId", long.class);

				method.invoke(_routeRemoteModel, routeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_routeRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_routeRemoteModel, name);
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

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_routeRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAuthorId() {
		return _authorId;
	}

	@Override
	public void setAuthorId(long authorId) {
		_authorId = authorId;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthorId", long.class);

				method.invoke(_routeRemoteModel, authorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIsPublic() {
		return _isPublic;
	}

	@Override
	public boolean isIsPublic() {
		return _isPublic;
	}

	@Override
	public void setIsPublic(boolean isPublic) {
		_isPublic = isPublic;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setIsPublic", boolean.class);

				method.invoke(_routeRemoteModel, isPublic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartingTime() {
		return _startingTime;
	}

	@Override
	public void setStartingTime(Date startingTime) {
		_startingTime = startingTime;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setStartingTime", Date.class);

				method.invoke(_routeRemoteModel, startingTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreationTime() {
		return _creationTime;
	}

	@Override
	public void setCreationTime(Date creationTime) {
		_creationTime = creationTime;

		if (_routeRemoteModel != null) {
			try {
				Class<?> clazz = _routeRemoteModel.getClass();

				Method method = clazz.getMethod("setCreationTime", Date.class);

				method.invoke(_routeRemoteModel, creationTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRouteRemoteModel() {
		return _routeRemoteModel;
	}

	public void setRouteRemoteModel(BaseModel<?> routeRemoteModel) {
		_routeRemoteModel = routeRemoteModel;
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

		Class<?> remoteModelClass = _routeRemoteModel.getClass();

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

		Object returnValue = method.invoke(_routeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RouteLocalServiceUtil.addRoute(this);
		}
		else {
			RouteLocalServiceUtil.updateRoute(this);
		}
	}

	@Override
	public Route toEscapedModel() {
		return (Route)ProxyUtil.newProxyInstance(Route.class.getClassLoader(),
			new Class[] { Route.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RouteClp clone = new RouteClp();

		clone.setRouteId(getRouteId());
		clone.setType(getType());
		clone.setName(getName());
		clone.setDescription(getDescription());
		clone.setAuthorId(getAuthorId());
		clone.setIsPublic(getIsPublic());
		clone.setStartingTime(getStartingTime());
		clone.setCreationTime(getCreationTime());

		return clone;
	}

	@Override
	public int compareTo(Route route) {
		int value = 0;

		value = DateUtil.compareTo(getCreationTime(), route.getCreationTime());

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

		if (!(obj instanceof RouteClp)) {
			return false;
		}

		RouteClp route = (RouteClp)obj;

		long primaryKey = route.getPrimaryKey();

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

		sb.append("{routeId=");
		sb.append(getRouteId());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", authorId=");
		sb.append(getAuthorId());
		sb.append(", isPublic=");
		sb.append(getIsPublic());
		sb.append(", startingTime=");
		sb.append(getStartingTime());
		sb.append(", creationTime=");
		sb.append(getCreationTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("es.eina.tfg.model.Route");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>routeId</column-name><column-value><![CDATA[");
		sb.append(getRouteId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>authorId</column-name><column-value><![CDATA[");
		sb.append(getAuthorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isPublic</column-name><column-value><![CDATA[");
		sb.append(getIsPublic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startingTime</column-name><column-value><![CDATA[");
		sb.append(getStartingTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creationTime</column-name><column-value><![CDATA[");
		sb.append(getCreationTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _routeId;
	private String _type;
	private String _name;
	private String _description;
	private long _authorId;
	private boolean _isPublic;
	private Date _startingTime;
	private Date _creationTime;
	private BaseModel<?> _routeRemoteModel;
	private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;
}
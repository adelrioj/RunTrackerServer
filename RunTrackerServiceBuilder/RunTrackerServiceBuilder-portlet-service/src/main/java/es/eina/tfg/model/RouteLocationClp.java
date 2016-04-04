package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RouteLocationClp extends BaseModelImpl<RouteLocation>
    implements RouteLocation {
    private long _routePositionId;
    private long _routeId;
    private double _latitude;
    private double _longitude;
    private BaseModel<?> _routeLocationRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public RouteLocationClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return RouteLocation.class;
    }

    @Override
    public String getModelClassName() {
        return RouteLocation.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _routePositionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRoutePositionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _routePositionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("routePositionId", getRoutePositionId());
        attributes.put("routeId", getRouteId());
        attributes.put("latitude", getLatitude());
        attributes.put("longitude", getLongitude());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long routePositionId = (Long) attributes.get("routePositionId");

        if (routePositionId != null) {
            setRoutePositionId(routePositionId);
        }

        Long routeId = (Long) attributes.get("routeId");

        if (routeId != null) {
            setRouteId(routeId);
        }

        Double latitude = (Double) attributes.get("latitude");

        if (latitude != null) {
            setLatitude(latitude);
        }

        Double longitude = (Double) attributes.get("longitude");

        if (longitude != null) {
            setLongitude(longitude);
        }
    }

    @Override
    public long getRoutePositionId() {
        return _routePositionId;
    }

    @Override
    public void setRoutePositionId(long routePositionId) {
        _routePositionId = routePositionId;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setRoutePositionId", long.class);

                method.invoke(_routeLocationRemoteModel, routePositionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getRouteId() {
        return _routeId;
    }

    @Override
    public void setRouteId(long routeId) {
        _routeId = routeId;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setRouteId", long.class);

                method.invoke(_routeLocationRemoteModel, routeId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLatitude() {
        return _latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        _latitude = latitude;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setLatitude", double.class);

                method.invoke(_routeLocationRemoteModel, latitude);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getLongitude() {
        return _longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        _longitude = longitude;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setLongitude", double.class);

                method.invoke(_routeLocationRemoteModel, longitude);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRouteLocationRemoteModel() {
        return _routeLocationRemoteModel;
    }

    public void setRouteLocationRemoteModel(
        BaseModel<?> routeLocationRemoteModel) {
        _routeLocationRemoteModel = routeLocationRemoteModel;
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

        Class<?> remoteModelClass = _routeLocationRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_routeLocationRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RouteLocationLocalServiceUtil.addRouteLocation(this);
        } else {
            RouteLocationLocalServiceUtil.updateRouteLocation(this);
        }
    }

    @Override
    public RouteLocation toEscapedModel() {
        return (RouteLocation) ProxyUtil.newProxyInstance(RouteLocation.class.getClassLoader(),
            new Class[] { RouteLocation.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RouteLocationClp clone = new RouteLocationClp();

        clone.setRoutePositionId(getRoutePositionId());
        clone.setRouteId(getRouteId());
        clone.setLatitude(getLatitude());
        clone.setLongitude(getLongitude());

        return clone;
    }

    @Override
    public int compareTo(RouteLocation routeLocation) {
        int value = 0;

        if (getRouteId() < routeLocation.getRouteId()) {
            value = -1;
        } else if (getRouteId() > routeLocation.getRouteId()) {
            value = 1;
        } else {
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

        if (!(obj instanceof RouteLocationClp)) {
            return false;
        }

        RouteLocationClp routeLocation = (RouteLocationClp) obj;

        long primaryKey = routeLocation.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{routePositionId=");
        sb.append(getRoutePositionId());
        sb.append(", routeId=");
        sb.append(getRouteId());
        sb.append(", latitude=");
        sb.append(getLatitude());
        sb.append(", longitude=");
        sb.append(getLongitude());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.RouteLocation");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>routePositionId</column-name><column-value><![CDATA[");
        sb.append(getRoutePositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>routeId</column-name><column-value><![CDATA[");
        sb.append(getRouteId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>latitude</column-name><column-value><![CDATA[");
        sb.append(getLatitude());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>longitude</column-name><column-value><![CDATA[");
        sb.append(getLongitude());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

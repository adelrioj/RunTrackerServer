package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import es.eina.tfg.service.persistence.RouteLocationPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RouteLocationClp extends BaseModelImpl<RouteLocation>
    implements RouteLocation {
    private long _idRouteLocation;
    private long _idRoute;
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
    public RouteLocationPK getPrimaryKey() {
        return new RouteLocationPK(_idRouteLocation, _idRoute);
    }

    @Override
    public void setPrimaryKey(RouteLocationPK primaryKey) {
        setIdRouteLocation(primaryKey.idRouteLocation);
        setIdRoute(primaryKey.idRoute);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new RouteLocationPK(_idRouteLocation, _idRoute);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((RouteLocationPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRouteLocation", getIdRouteLocation());
        attributes.put("idRoute", getIdRoute());
        attributes.put("latitude", getLatitude());
        attributes.put("longitude", getLongitude());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRouteLocation = (Long) attributes.get("idRouteLocation");

        if (idRouteLocation != null) {
            setIdRouteLocation(idRouteLocation);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
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
    public long getIdRouteLocation() {
        return _idRouteLocation;
    }

    @Override
    public void setIdRouteLocation(long idRouteLocation) {
        _idRouteLocation = idRouteLocation;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRouteLocation", long.class);

                method.invoke(_routeLocationRemoteModel, idRouteLocation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdRoute() {
        return _idRoute;
    }

    @Override
    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;

        if (_routeLocationRemoteModel != null) {
            try {
                Class<?> clazz = _routeLocationRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRoute", long.class);

                method.invoke(_routeLocationRemoteModel, idRoute);
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

        clone.setIdRouteLocation(getIdRouteLocation());
        clone.setIdRoute(getIdRoute());
        clone.setLatitude(getLatitude());
        clone.setLongitude(getLongitude());

        return clone;
    }

    @Override
    public int compareTo(RouteLocation routeLocation) {
        int value = 0;

        if (getIdRoute() < routeLocation.getIdRoute()) {
            value = -1;
        } else if (getIdRoute() > routeLocation.getIdRoute()) {
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

        RouteLocationPK primaryKey = routeLocation.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{idRouteLocation=");
        sb.append(getIdRouteLocation());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
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
            "<column><column-name>idRouteLocation</column-name><column-value><![CDATA[");
        sb.append(getIdRouteLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
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

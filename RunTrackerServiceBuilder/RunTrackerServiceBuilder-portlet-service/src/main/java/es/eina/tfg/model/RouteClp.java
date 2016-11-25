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


public class RouteClp extends BaseModelImpl<Route> implements Route {
    private long _idRoute;
    private long _idAuthor;
    private String _type;
    private String _name;
    private String _description;
    private boolean _isPublic;
    private Date _creationTime;
    private BaseModel<?> _routeRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

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
        return _idRoute;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdRoute(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idRoute;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRoute", getIdRoute());
        attributes.put("idAuthor", getIdAuthor());
        attributes.put("type", getType());
        attributes.put("name", getName());
        attributes.put("description", getDescription());
        attributes.put("isPublic", getIsPublic());
        attributes.put("creationTime", getCreationTime());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        Long idAuthor = (Long) attributes.get("idAuthor");

        if (idAuthor != null) {
            setIdAuthor(idAuthor);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Boolean isPublic = (Boolean) attributes.get("isPublic");

        if (isPublic != null) {
            setIsPublic(isPublic);
        }

        Date creationTime = (Date) attributes.get("creationTime");

        if (creationTime != null) {
            setCreationTime(creationTime);
        }
    }

    @Override
    public long getIdRoute() {
        return _idRoute;
    }

    @Override
    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;

        if (_routeRemoteModel != null) {
            try {
                Class<?> clazz = _routeRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRoute", long.class);

                method.invoke(_routeRemoteModel, idRoute);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdAuthor() {
        return _idAuthor;
    }

    @Override
    public void setIdAuthor(long idAuthor) {
        _idAuthor = idAuthor;

        if (_routeRemoteModel != null) {
            try {
                Class<?> clazz = _routeRemoteModel.getClass();

                Method method = clazz.getMethod("setIdAuthor", long.class);

                method.invoke(_routeRemoteModel, idAuthor);
            } catch (Exception e) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
            } catch (Exception e) {
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
            } else {
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
        } else {
            RouteLocalServiceUtil.updateRoute(this);
        }
    }

    @Override
    public Route toEscapedModel() {
        return (Route) ProxyUtil.newProxyInstance(Route.class.getClassLoader(),
            new Class[] { Route.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RouteClp clone = new RouteClp();

        clone.setIdRoute(getIdRoute());
        clone.setIdAuthor(getIdAuthor());
        clone.setType(getType());
        clone.setName(getName());
        clone.setDescription(getDescription());
        clone.setIsPublic(getIsPublic());
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

        RouteClp route = (RouteClp) obj;

        long primaryKey = route.getPrimaryKey();

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
        StringBundler sb = new StringBundler(15);

        sb.append("{idRoute=");
        sb.append(getIdRoute());
        sb.append(", idAuthor=");
        sb.append(getIdAuthor());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", isPublic=");
        sb.append(getIsPublic());
        sb.append(", creationTime=");
        sb.append(getCreationTime());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Route");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idAuthor</column-name><column-value><![CDATA[");
        sb.append(getIdAuthor());
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
            "<column><column-name>isPublic</column-name><column-value><![CDATA[");
        sb.append(getIsPublic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creationTime</column-name><column-value><![CDATA[");
        sb.append(getCreationTime());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

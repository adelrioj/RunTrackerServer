package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;
import es.eina.tfg.service.persistence.UserAndRoutePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UserAndRouteClp extends BaseModelImpl<UserAndRoute>
    implements UserAndRoute {
    private long _idUser;
    private long _idRoute;
    private BaseModel<?> _userAndRouteRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public UserAndRouteClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return UserAndRoute.class;
    }

    @Override
    public String getModelClassName() {
        return UserAndRoute.class.getName();
    }

    @Override
    public UserAndRoutePK getPrimaryKey() {
        return new UserAndRoutePK(_idUser, _idRoute);
    }

    @Override
    public void setPrimaryKey(UserAndRoutePK primaryKey) {
        setIdUser(primaryKey.idUser);
        setIdRoute(primaryKey.idRoute);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new UserAndRoutePK(_idUser, _idRoute);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((UserAndRoutePK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("idRoute", getIdRoute());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }
    }

    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _idUser = idUser;

        if (_userAndRouteRemoteModel != null) {
            try {
                Class<?> clazz = _userAndRouteRemoteModel.getClass();

                Method method = clazz.getMethod("setIdUser", long.class);

                method.invoke(_userAndRouteRemoteModel, idUser);
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

        if (_userAndRouteRemoteModel != null) {
            try {
                Class<?> clazz = _userAndRouteRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRoute", long.class);

                method.invoke(_userAndRouteRemoteModel, idRoute);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUserAndRouteRemoteModel() {
        return _userAndRouteRemoteModel;
    }

    public void setUserAndRouteRemoteModel(BaseModel<?> userAndRouteRemoteModel) {
        _userAndRouteRemoteModel = userAndRouteRemoteModel;
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

        Class<?> remoteModelClass = _userAndRouteRemoteModel.getClass();

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

        Object returnValue = method.invoke(_userAndRouteRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserAndRouteLocalServiceUtil.addUserAndRoute(this);
        } else {
            UserAndRouteLocalServiceUtil.updateUserAndRoute(this);
        }
    }

    @Override
    public UserAndRoute toEscapedModel() {
        return (UserAndRoute) ProxyUtil.newProxyInstance(UserAndRoute.class.getClassLoader(),
            new Class[] { UserAndRoute.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UserAndRouteClp clone = new UserAndRouteClp();

        clone.setIdUser(getIdUser());
        clone.setIdRoute(getIdRoute());

        return clone;
    }

    @Override
    public int compareTo(UserAndRoute userAndRoute) {
        int value = 0;

        if (getIdUser() < userAndRoute.getIdUser()) {
            value = -1;
        } else if (getIdUser() > userAndRoute.getIdUser()) {
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

        if (!(obj instanceof UserAndRouteClp)) {
            return false;
        }

        UserAndRouteClp userAndRoute = (UserAndRouteClp) obj;

        UserAndRoutePK primaryKey = userAndRoute.getPrimaryKey();

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
        StringBundler sb = new StringBundler(5);

        sb.append("{idUser=");
        sb.append(getIdUser());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAndRoute");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

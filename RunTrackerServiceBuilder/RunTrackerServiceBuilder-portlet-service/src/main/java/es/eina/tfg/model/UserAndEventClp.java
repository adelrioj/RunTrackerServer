package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import es.eina.tfg.service.persistence.UserAndEventPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UserAndEventClp extends BaseModelImpl<UserAndEvent>
    implements UserAndEvent {
    private long _idUser;
    private long _idEvent;
    private long _idRace;
    private BaseModel<?> _userAndEventRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public UserAndEventClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return UserAndEvent.class;
    }

    @Override
    public String getModelClassName() {
        return UserAndEvent.class.getName();
    }

    @Override
    public UserAndEventPK getPrimaryKey() {
        return new UserAndEventPK(_idUser, _idEvent);
    }

    @Override
    public void setPrimaryKey(UserAndEventPK primaryKey) {
        setIdUser(primaryKey.idUser);
        setIdEvent(primaryKey.idEvent);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new UserAndEventPK(_idUser, _idEvent);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((UserAndEventPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idUser", getIdUser());
        attributes.put("idEvent", getIdEvent());
        attributes.put("idRace", getIdRace());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idEvent = (Long) attributes.get("idEvent");

        if (idEvent != null) {
            setIdEvent(idEvent);
        }

        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }
    }

    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _idUser = idUser;

        if (_userAndEventRemoteModel != null) {
            try {
                Class<?> clazz = _userAndEventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdUser", long.class);

                method.invoke(_userAndEventRemoteModel, idUser);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdEvent() {
        return _idEvent;
    }

    @Override
    public void setIdEvent(long idEvent) {
        _idEvent = idEvent;

        if (_userAndEventRemoteModel != null) {
            try {
                Class<?> clazz = _userAndEventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdEvent", long.class);

                method.invoke(_userAndEventRemoteModel, idEvent);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(long idRace) {
        _idRace = idRace;

        if (_userAndEventRemoteModel != null) {
            try {
                Class<?> clazz = _userAndEventRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRace", long.class);

                method.invoke(_userAndEventRemoteModel, idRace);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUserAndEventRemoteModel() {
        return _userAndEventRemoteModel;
    }

    public void setUserAndEventRemoteModel(BaseModel<?> userAndEventRemoteModel) {
        _userAndEventRemoteModel = userAndEventRemoteModel;
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

        Class<?> remoteModelClass = _userAndEventRemoteModel.getClass();

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

        Object returnValue = method.invoke(_userAndEventRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserAndEventLocalServiceUtil.addUserAndEvent(this);
        } else {
            UserAndEventLocalServiceUtil.updateUserAndEvent(this);
        }
    }

    @Override
    public UserAndEvent toEscapedModel() {
        return (UserAndEvent) ProxyUtil.newProxyInstance(UserAndEvent.class.getClassLoader(),
            new Class[] { UserAndEvent.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UserAndEventClp clone = new UserAndEventClp();

        clone.setIdUser(getIdUser());
        clone.setIdEvent(getIdEvent());
        clone.setIdRace(getIdRace());

        return clone;
    }

    @Override
    public int compareTo(UserAndEvent userAndEvent) {
        UserAndEventPK primaryKey = userAndEvent.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserAndEventClp)) {
            return false;
        }

        UserAndEventClp userAndEvent = (UserAndEventClp) obj;

        UserAndEventPK primaryKey = userAndEvent.getPrimaryKey();

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
        StringBundler sb = new StringBundler(7);

        sb.append("{idUser=");
        sb.append(getIdUser());
        sb.append(", idEvent=");
        sb.append(getIdEvent());
        sb.append(", idRace=");
        sb.append(getIdRace());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.UserAndEvent");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idEvent</column-name><column-value><![CDATA[");
        sb.append(getIdEvent());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

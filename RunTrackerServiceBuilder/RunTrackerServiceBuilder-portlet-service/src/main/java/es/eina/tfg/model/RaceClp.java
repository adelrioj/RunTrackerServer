package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.RaceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RaceClp extends BaseModelImpl<Race> implements Race {
    private long _idRace;
    private long _idUser;
    private long _idRoute;
    private String _type;
    private BaseModel<?> _raceRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public RaceClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Race.class;
    }

    @Override
    public String getModelClassName() {
        return Race.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _idRace;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdRace(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idRace;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idRace", getIdRace());
        attributes.put("idUser", getIdUser());
        attributes.put("idRoute", getIdRoute());
        attributes.put("type", getType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        Long idRoute = (Long) attributes.get("idRoute");

        if (idRoute != null) {
            setIdRoute(idRoute);
        }

        String type = (String) attributes.get("type");

        if (type != null) {
            setType(type);
        }
    }

    @Override
    public long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(long idRace) {
        _idRace = idRace;

        if (_raceRemoteModel != null) {
            try {
                Class<?> clazz = _raceRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRace", long.class);

                method.invoke(_raceRemoteModel, idRace);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdUser() {
        return _idUser;
    }

    @Override
    public void setIdUser(long idUser) {
        _idUser = idUser;

        if (_raceRemoteModel != null) {
            try {
                Class<?> clazz = _raceRemoteModel.getClass();

                Method method = clazz.getMethod("setIdUser", long.class);

                method.invoke(_raceRemoteModel, idUser);
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

        if (_raceRemoteModel != null) {
            try {
                Class<?> clazz = _raceRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRoute", long.class);

                method.invoke(_raceRemoteModel, idRoute);
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

        if (_raceRemoteModel != null) {
            try {
                Class<?> clazz = _raceRemoteModel.getClass();

                Method method = clazz.getMethod("setType", String.class);

                method.invoke(_raceRemoteModel, type);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRaceRemoteModel() {
        return _raceRemoteModel;
    }

    public void setRaceRemoteModel(BaseModel<?> raceRemoteModel) {
        _raceRemoteModel = raceRemoteModel;
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

        Class<?> remoteModelClass = _raceRemoteModel.getClass();

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

        Object returnValue = method.invoke(_raceRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RaceLocalServiceUtil.addRace(this);
        } else {
            RaceLocalServiceUtil.updateRace(this);
        }
    }

    @Override
    public Race toEscapedModel() {
        return (Race) ProxyUtil.newProxyInstance(Race.class.getClassLoader(),
            new Class[] { Race.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RaceClp clone = new RaceClp();

        clone.setIdRace(getIdRace());
        clone.setIdUser(getIdUser());
        clone.setIdRoute(getIdRoute());
        clone.setType(getType());

        return clone;
    }

    @Override
    public int compareTo(Race race) {
        int value = 0;

        if (getIdUser() < race.getIdUser()) {
            value = -1;
        } else if (getIdUser() > race.getIdUser()) {
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

        if (!(obj instanceof RaceClp)) {
            return false;
        }

        RaceClp race = (RaceClp) obj;

        long primaryKey = race.getPrimaryKey();

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

        sb.append("{idRace=");
        sb.append(getIdRace());
        sb.append(", idUser=");
        sb.append(getIdUser());
        sb.append(", idRoute=");
        sb.append(getIdRoute());
        sb.append(", type=");
        sb.append(getType());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Race");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idUser</column-name><column-value><![CDATA[");
        sb.append(getIdUser());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRoute</column-name><column-value><![CDATA[");
        sb.append(getIdRoute());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

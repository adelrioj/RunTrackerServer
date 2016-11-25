package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.PowerLocalServiceUtil;
import es.eina.tfg.service.persistence.PowerPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PowerClp extends BaseModelImpl<Power> implements Power {
    private long _idMeasurement;
    private Long _idRace;
    private long _idDevice;
    private long _idSensor;
    private Date _time;
    private String _sensorMode;
    private int _level;
    private BaseModel<?> _powerRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public PowerClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Power.class;
    }

    @Override
    public String getModelClassName() {
        return Power.class.getName();
    }

    @Override
    public PowerPK getPrimaryKey() {
        return new PowerPK(_idMeasurement, _idRace);
    }

    @Override
    public void setPrimaryKey(PowerPK primaryKey) {
        setIdMeasurement(primaryKey.idMeasurement);
        setIdRace(primaryKey.idRace);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new PowerPK(_idMeasurement, _idRace);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((PowerPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idMeasurement", getIdMeasurement());
        attributes.put("idRace", getIdRace());
        attributes.put("idDevice", getIdDevice());
        attributes.put("idSensor", getIdSensor());
        attributes.put("time", getTime());
        attributes.put("sensorMode", getSensorMode());
        attributes.put("level", getLevel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idMeasurement = (Long) attributes.get("idMeasurement");

        if (idMeasurement != null) {
            setIdMeasurement(idMeasurement);
        }

        Long idRace = (Long) attributes.get("idRace");

        if (idRace != null) {
            setIdRace(idRace);
        }

        Long idDevice = (Long) attributes.get("idDevice");

        if (idDevice != null) {
            setIdDevice(idDevice);
        }

        Long idSensor = (Long) attributes.get("idSensor");

        if (idSensor != null) {
            setIdSensor(idSensor);
        }

        Date time = (Date) attributes.get("time");

        if (time != null) {
            setTime(time);
        }

        String sensorMode = (String) attributes.get("sensorMode");

        if (sensorMode != null) {
            setSensorMode(sensorMode);
        }

        Integer level = (Integer) attributes.get("level");

        if (level != null) {
            setLevel(level);
        }
    }

    @Override
    public long getIdMeasurement() {
        return _idMeasurement;
    }

    @Override
    public void setIdMeasurement(long idMeasurement) {
        _idMeasurement = idMeasurement;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setIdMeasurement", long.class);

                method.invoke(_powerRemoteModel, idMeasurement);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Long getIdRace() {
        return _idRace;
    }

    @Override
    public void setIdRace(Long idRace) {
        _idRace = idRace;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setIdRace", Long.class);

                method.invoke(_powerRemoteModel, idRace);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdDevice() {
        return _idDevice;
    }

    @Override
    public void setIdDevice(long idDevice) {
        _idDevice = idDevice;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setIdDevice", long.class);

                method.invoke(_powerRemoteModel, idDevice);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getIdSensor() {
        return _idSensor;
    }

    @Override
    public void setIdSensor(long idSensor) {
        _idSensor = idSensor;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setIdSensor", long.class);

                method.invoke(_powerRemoteModel, idSensor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTime() {
        return _time;
    }

    @Override
    public void setTime(Date time) {
        _time = time;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setTime", Date.class);

                method.invoke(_powerRemoteModel, time);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSensorMode() {
        return _sensorMode;
    }

    @Override
    public void setSensorMode(String sensorMode) {
        _sensorMode = sensorMode;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setSensorMode", String.class);

                method.invoke(_powerRemoteModel, sensorMode);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLevel() {
        return _level;
    }

    @Override
    public void setLevel(int level) {
        _level = level;

        if (_powerRemoteModel != null) {
            try {
                Class<?> clazz = _powerRemoteModel.getClass();

                Method method = clazz.getMethod("setLevel", int.class);

                method.invoke(_powerRemoteModel, level);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPowerRemoteModel() {
        return _powerRemoteModel;
    }

    public void setPowerRemoteModel(BaseModel<?> powerRemoteModel) {
        _powerRemoteModel = powerRemoteModel;
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

        Class<?> remoteModelClass = _powerRemoteModel.getClass();

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

        Object returnValue = method.invoke(_powerRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PowerLocalServiceUtil.addPower(this);
        } else {
            PowerLocalServiceUtil.updatePower(this);
        }
    }

    @Override
    public Power toEscapedModel() {
        return (Power) ProxyUtil.newProxyInstance(Power.class.getClassLoader(),
            new Class[] { Power.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PowerClp clone = new PowerClp();

        clone.setIdMeasurement(getIdMeasurement());
        clone.setIdRace(getIdRace());
        clone.setIdDevice(getIdDevice());
        clone.setIdSensor(getIdSensor());
        clone.setTime(getTime());
        clone.setSensorMode(getSensorMode());
        clone.setLevel(getLevel());

        return clone;
    }

    @Override
    public int compareTo(Power power) {
        int value = 0;

        value = DateUtil.compareTo(getTime(), power.getTime());

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

        if (!(obj instanceof PowerClp)) {
            return false;
        }

        PowerClp power = (PowerClp) obj;

        PowerPK primaryKey = power.getPrimaryKey();

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
        StringBundler sb = new StringBundler(15);

        sb.append("{idMeasurement=");
        sb.append(getIdMeasurement());
        sb.append(", idRace=");
        sb.append(getIdRace());
        sb.append(", idDevice=");
        sb.append(getIdDevice());
        sb.append(", idSensor=");
        sb.append(getIdSensor());
        sb.append(", time=");
        sb.append(getTime());
        sb.append(", sensorMode=");
        sb.append(getSensorMode());
        sb.append(", level=");
        sb.append(getLevel());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Power");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idMeasurement</column-name><column-value><![CDATA[");
        sb.append(getIdMeasurement());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idRace</column-name><column-value><![CDATA[");
        sb.append(getIdRace());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idDevice</column-name><column-value><![CDATA[");
        sb.append(getIdDevice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idSensor</column-name><column-value><![CDATA[");
        sb.append(getIdSensor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>time</column-name><column-value><![CDATA[");
        sb.append(getTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sensorMode</column-name><column-value><![CDATA[");
        sb.append(getSensorMode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>level</column-name><column-value><![CDATA[");
        sb.append(getLevel());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.SensorLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class SensorClp extends BaseModelImpl<Sensor> implements Sensor {
    private long _idSensor;
    private int _type;
    private String _description;
    private String _dataUnits;
    private String _dataType;
    private String _dataUncertainity;
    private String _dataLowerRange;
    private String _dataUpperRange;
    private String _dataPacketFormat;
    private BaseModel<?> _sensorRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public SensorClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Sensor.class;
    }

    @Override
    public String getModelClassName() {
        return Sensor.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _idSensor;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIdSensor(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _idSensor;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idSensor", getIdSensor());
        attributes.put("type", getType());
        attributes.put("description", getDescription());
        attributes.put("dataUnits", getDataUnits());
        attributes.put("dataType", getDataType());
        attributes.put("dataUncertainity", getDataUncertainity());
        attributes.put("dataLowerRange", getDataLowerRange());
        attributes.put("dataUpperRange", getDataUpperRange());
        attributes.put("dataPacketFormat", getDataPacketFormat());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idSensor = (Long) attributes.get("idSensor");

        if (idSensor != null) {
            setIdSensor(idSensor);
        }

        Integer type = (Integer) attributes.get("type");

        if (type != null) {
            setType(type);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String dataUnits = (String) attributes.get("dataUnits");

        if (dataUnits != null) {
            setDataUnits(dataUnits);
        }

        String dataType = (String) attributes.get("dataType");

        if (dataType != null) {
            setDataType(dataType);
        }

        String dataUncertainity = (String) attributes.get("dataUncertainity");

        if (dataUncertainity != null) {
            setDataUncertainity(dataUncertainity);
        }

        String dataLowerRange = (String) attributes.get("dataLowerRange");

        if (dataLowerRange != null) {
            setDataLowerRange(dataLowerRange);
        }

        String dataUpperRange = (String) attributes.get("dataUpperRange");

        if (dataUpperRange != null) {
            setDataUpperRange(dataUpperRange);
        }

        String dataPacketFormat = (String) attributes.get("dataPacketFormat");

        if (dataPacketFormat != null) {
            setDataPacketFormat(dataPacketFormat);
        }
    }

    @Override
    public long getIdSensor() {
        return _idSensor;
    }

    @Override
    public void setIdSensor(long idSensor) {
        _idSensor = idSensor;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setIdSensor", long.class);

                method.invoke(_sensorRemoteModel, idSensor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getType() {
        return _type;
    }

    @Override
    public void setType(int type) {
        _type = type;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setType", int.class);

                method.invoke(_sensorRemoteModel, type);
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

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDescription", String.class);

                method.invoke(_sensorRemoteModel, description);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataUnits() {
        return _dataUnits;
    }

    @Override
    public void setDataUnits(String dataUnits) {
        _dataUnits = dataUnits;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataUnits", String.class);

                method.invoke(_sensorRemoteModel, dataUnits);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataType() {
        return _dataType;
    }

    @Override
    public void setDataType(String dataType) {
        _dataType = dataType;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataType", String.class);

                method.invoke(_sensorRemoteModel, dataType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataUncertainity() {
        return _dataUncertainity;
    }

    @Override
    public void setDataUncertainity(String dataUncertainity) {
        _dataUncertainity = dataUncertainity;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataUncertainity",
                        String.class);

                method.invoke(_sensorRemoteModel, dataUncertainity);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataLowerRange() {
        return _dataLowerRange;
    }

    @Override
    public void setDataLowerRange(String dataLowerRange) {
        _dataLowerRange = dataLowerRange;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataLowerRange",
                        String.class);

                method.invoke(_sensorRemoteModel, dataLowerRange);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataUpperRange() {
        return _dataUpperRange;
    }

    @Override
    public void setDataUpperRange(String dataUpperRange) {
        _dataUpperRange = dataUpperRange;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataUpperRange",
                        String.class);

                method.invoke(_sensorRemoteModel, dataUpperRange);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDataPacketFormat() {
        return _dataPacketFormat;
    }

    @Override
    public void setDataPacketFormat(String dataPacketFormat) {
        _dataPacketFormat = dataPacketFormat;

        if (_sensorRemoteModel != null) {
            try {
                Class<?> clazz = _sensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDataPacketFormat",
                        String.class);

                method.invoke(_sensorRemoteModel, dataPacketFormat);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSensorRemoteModel() {
        return _sensorRemoteModel;
    }

    public void setSensorRemoteModel(BaseModel<?> sensorRemoteModel) {
        _sensorRemoteModel = sensorRemoteModel;
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

        Class<?> remoteModelClass = _sensorRemoteModel.getClass();

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

        Object returnValue = method.invoke(_sensorRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SensorLocalServiceUtil.addSensor(this);
        } else {
            SensorLocalServiceUtil.updateSensor(this);
        }
    }

    @Override
    public Sensor toEscapedModel() {
        return (Sensor) ProxyUtil.newProxyInstance(Sensor.class.getClassLoader(),
            new Class[] { Sensor.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        SensorClp clone = new SensorClp();

        clone.setIdSensor(getIdSensor());
        clone.setType(getType());
        clone.setDescription(getDescription());
        clone.setDataUnits(getDataUnits());
        clone.setDataType(getDataType());
        clone.setDataUncertainity(getDataUncertainity());
        clone.setDataLowerRange(getDataLowerRange());
        clone.setDataUpperRange(getDataUpperRange());
        clone.setDataPacketFormat(getDataPacketFormat());

        return clone;
    }

    @Override
    public int compareTo(Sensor sensor) {
        int value = 0;

        if (getType() < sensor.getType()) {
            value = -1;
        } else if (getType() > sensor.getType()) {
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

        if (!(obj instanceof SensorClp)) {
            return false;
        }

        SensorClp sensor = (SensorClp) obj;

        long primaryKey = sensor.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{idSensor=");
        sb.append(getIdSensor());
        sb.append(", type=");
        sb.append(getType());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", dataUnits=");
        sb.append(getDataUnits());
        sb.append(", dataType=");
        sb.append(getDataType());
        sb.append(", dataUncertainity=");
        sb.append(getDataUncertainity());
        sb.append(", dataLowerRange=");
        sb.append(getDataLowerRange());
        sb.append(", dataUpperRange=");
        sb.append(getDataUpperRange());
        sb.append(", dataPacketFormat=");
        sb.append(getDataPacketFormat());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Sensor");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idSensor</column-name><column-value><![CDATA[");
        sb.append(getIdSensor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>type</column-name><column-value><![CDATA[");
        sb.append(getType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataUnits</column-name><column-value><![CDATA[");
        sb.append(getDataUnits());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataType</column-name><column-value><![CDATA[");
        sb.append(getDataType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataUncertainity</column-name><column-value><![CDATA[");
        sb.append(getDataUncertainity());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataLowerRange</column-name><column-value><![CDATA[");
        sb.append(getDataLowerRange());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataUpperRange</column-name><column-value><![CDATA[");
        sb.append(getDataUpperRange());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataPacketFormat</column-name><column-value><![CDATA[");
        sb.append(getDataPacketFormat());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

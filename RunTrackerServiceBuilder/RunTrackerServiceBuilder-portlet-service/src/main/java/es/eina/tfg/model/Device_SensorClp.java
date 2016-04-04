package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.persistence.Device_SensorPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Device_SensorClp extends BaseModelImpl<Device_Sensor>
    implements Device_Sensor {
    private long _deviceId;
    private long _sensorId;
    private boolean _status;
    private BaseModel<?> _device_SensorRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public Device_SensorClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Device_Sensor.class;
    }

    @Override
    public String getModelClassName() {
        return Device_Sensor.class.getName();
    }

    @Override
    public Device_SensorPK getPrimaryKey() {
        return new Device_SensorPK(_deviceId, _sensorId);
    }

    @Override
    public void setPrimaryKey(Device_SensorPK primaryKey) {
        setDeviceId(primaryKey.deviceId);
        setSensorId(primaryKey.sensorId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new Device_SensorPK(_deviceId, _sensorId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((Device_SensorPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("deviceId", getDeviceId());
        attributes.put("sensorId", getSensorId());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long deviceId = (Long) attributes.get("deviceId");

        if (deviceId != null) {
            setDeviceId(deviceId);
        }

        Long sensorId = (Long) attributes.get("sensorId");

        if (sensorId != null) {
            setSensorId(sensorId);
        }

        Boolean status = (Boolean) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getDeviceId() {
        return _deviceId;
    }

    @Override
    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;

        if (_device_SensorRemoteModel != null) {
            try {
                Class<?> clazz = _device_SensorRemoteModel.getClass();

                Method method = clazz.getMethod("setDeviceId", long.class);

                method.invoke(_device_SensorRemoteModel, deviceId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSensorId() {
        return _sensorId;
    }

    @Override
    public void setSensorId(long sensorId) {
        _sensorId = sensorId;

        if (_device_SensorRemoteModel != null) {
            try {
                Class<?> clazz = _device_SensorRemoteModel.getClass();

                Method method = clazz.getMethod("setSensorId", long.class);

                method.invoke(_device_SensorRemoteModel, sensorId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getStatus() {
        return _status;
    }

    @Override
    public boolean isStatus() {
        return _status;
    }

    @Override
    public void setStatus(boolean status) {
        _status = status;

        if (_device_SensorRemoteModel != null) {
            try {
                Class<?> clazz = _device_SensorRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", boolean.class);

                method.invoke(_device_SensorRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDevice_SensorRemoteModel() {
        return _device_SensorRemoteModel;
    }

    public void setDevice_SensorRemoteModel(
        BaseModel<?> device_SensorRemoteModel) {
        _device_SensorRemoteModel = device_SensorRemoteModel;
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

        Class<?> remoteModelClass = _device_SensorRemoteModel.getClass();

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

        Object returnValue = method.invoke(_device_SensorRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Device_SensorLocalServiceUtil.addDevice_Sensor(this);
        } else {
            Device_SensorLocalServiceUtil.updateDevice_Sensor(this);
        }
    }

    @Override
    public Device_Sensor toEscapedModel() {
        return (Device_Sensor) ProxyUtil.newProxyInstance(Device_Sensor.class.getClassLoader(),
            new Class[] { Device_Sensor.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Device_SensorClp clone = new Device_SensorClp();

        clone.setDeviceId(getDeviceId());
        clone.setSensorId(getSensorId());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(Device_Sensor device_Sensor) {
        int value = 0;

        if (getDeviceId() < device_Sensor.getDeviceId()) {
            value = -1;
        } else if (getDeviceId() > device_Sensor.getDeviceId()) {
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

        if (!(obj instanceof Device_SensorClp)) {
            return false;
        }

        Device_SensorClp device_Sensor = (Device_SensorClp) obj;

        Device_SensorPK primaryKey = device_Sensor.getPrimaryKey();

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

        sb.append("{deviceId=");
        sb.append(getDeviceId());
        sb.append(", sensorId=");
        sb.append(getSensorId());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.Device_Sensor");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>deviceId</column-name><column-value><![CDATA[");
        sb.append(getDeviceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sensorId</column-name><column-value><![CDATA[");
        sb.append(getSensorId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

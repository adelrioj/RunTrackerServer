package es.eina.tfg.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.persistence.DeviceAndSensorPK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DeviceAndSensorClp extends BaseModelImpl<DeviceAndSensor>
    implements DeviceAndSensor {
    private long _idDevice;
    private long _idSensor;
    private boolean _status;
    private BaseModel<?> _deviceAndSensorRemoteModel;
    private Class<?> _clpSerializerClass = es.eina.tfg.service.ClpSerializer.class;

    public DeviceAndSensorClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return DeviceAndSensor.class;
    }

    @Override
    public String getModelClassName() {
        return DeviceAndSensor.class.getName();
    }

    @Override
    public DeviceAndSensorPK getPrimaryKey() {
        return new DeviceAndSensorPK(_idDevice, _idSensor);
    }

    @Override
    public void setPrimaryKey(DeviceAndSensorPK primaryKey) {
        setIdDevice(primaryKey.idDevice);
        setIdSensor(primaryKey.idSensor);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new DeviceAndSensorPK(_idDevice, _idSensor);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((DeviceAndSensorPK) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idDevice", getIdDevice());
        attributes.put("idSensor", getIdSensor());
        attributes.put("status", getStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idDevice = (Long) attributes.get("idDevice");

        if (idDevice != null) {
            setIdDevice(idDevice);
        }

        Long idSensor = (Long) attributes.get("idSensor");

        if (idSensor != null) {
            setIdSensor(idSensor);
        }

        Boolean status = (Boolean) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }
    }

    @Override
    public long getIdDevice() {
        return _idDevice;
    }

    @Override
    public void setIdDevice(long idDevice) {
        _idDevice = idDevice;

        if (_deviceAndSensorRemoteModel != null) {
            try {
                Class<?> clazz = _deviceAndSensorRemoteModel.getClass();

                Method method = clazz.getMethod("setIdDevice", long.class);

                method.invoke(_deviceAndSensorRemoteModel, idDevice);
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

        if (_deviceAndSensorRemoteModel != null) {
            try {
                Class<?> clazz = _deviceAndSensorRemoteModel.getClass();

                Method method = clazz.getMethod("setIdSensor", long.class);

                method.invoke(_deviceAndSensorRemoteModel, idSensor);
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

        if (_deviceAndSensorRemoteModel != null) {
            try {
                Class<?> clazz = _deviceAndSensorRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", boolean.class);

                method.invoke(_deviceAndSensorRemoteModel, status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDeviceAndSensorRemoteModel() {
        return _deviceAndSensorRemoteModel;
    }

    public void setDeviceAndSensorRemoteModel(
        BaseModel<?> deviceAndSensorRemoteModel) {
        _deviceAndSensorRemoteModel = deviceAndSensorRemoteModel;
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

        Class<?> remoteModelClass = _deviceAndSensorRemoteModel.getClass();

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

        Object returnValue = method.invoke(_deviceAndSensorRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DeviceAndSensorLocalServiceUtil.addDeviceAndSensor(this);
        } else {
            DeviceAndSensorLocalServiceUtil.updateDeviceAndSensor(this);
        }
    }

    @Override
    public DeviceAndSensor toEscapedModel() {
        return (DeviceAndSensor) ProxyUtil.newProxyInstance(DeviceAndSensor.class.getClassLoader(),
            new Class[] { DeviceAndSensor.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        DeviceAndSensorClp clone = new DeviceAndSensorClp();

        clone.setIdDevice(getIdDevice());
        clone.setIdSensor(getIdSensor());
        clone.setStatus(getStatus());

        return clone;
    }

    @Override
    public int compareTo(DeviceAndSensor deviceAndSensor) {
        int value = 0;

        if (getIdDevice() < deviceAndSensor.getIdDevice()) {
            value = -1;
        } else if (getIdDevice() > deviceAndSensor.getIdDevice()) {
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

        if (!(obj instanceof DeviceAndSensorClp)) {
            return false;
        }

        DeviceAndSensorClp deviceAndSensor = (DeviceAndSensorClp) obj;

        DeviceAndSensorPK primaryKey = deviceAndSensor.getPrimaryKey();

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

        sb.append("{idDevice=");
        sb.append(getIdDevice());
        sb.append(", idSensor=");
        sb.append(getIdSensor());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("es.eina.tfg.model.DeviceAndSensor");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>idDevice</column-name><column-value><![CDATA[");
        sb.append(getIdDevice());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>idSensor</column-name><column-value><![CDATA[");
        sb.append(getIdSensor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

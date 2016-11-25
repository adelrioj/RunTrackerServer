package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DeviceAndSensor}.
 * </p>
 *
 * @author adelrioj
 * @see DeviceAndSensor
 * @generated
 */
public class DeviceAndSensorWrapper implements DeviceAndSensor,
    ModelWrapper<DeviceAndSensor> {
    private DeviceAndSensor _deviceAndSensor;

    public DeviceAndSensorWrapper(DeviceAndSensor deviceAndSensor) {
        _deviceAndSensor = deviceAndSensor;
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

    /**
    * Returns the primary key of this device and sensor.
    *
    * @return the primary key of this device and sensor
    */
    @Override
    public es.eina.tfg.service.persistence.DeviceAndSensorPK getPrimaryKey() {
        return _deviceAndSensor.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device and sensor.
    *
    * @param primaryKey the primary key of this device and sensor
    */
    @Override
    public void setPrimaryKey(
        es.eina.tfg.service.persistence.DeviceAndSensorPK primaryKey) {
        _deviceAndSensor.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id device of this device and sensor.
    *
    * @return the id device of this device and sensor
    */
    @Override
    public long getIdDevice() {
        return _deviceAndSensor.getIdDevice();
    }

    /**
    * Sets the id device of this device and sensor.
    *
    * @param idDevice the id device of this device and sensor
    */
    @Override
    public void setIdDevice(long idDevice) {
        _deviceAndSensor.setIdDevice(idDevice);
    }

    /**
    * Returns the id sensor of this device and sensor.
    *
    * @return the id sensor of this device and sensor
    */
    @Override
    public long getIdSensor() {
        return _deviceAndSensor.getIdSensor();
    }

    /**
    * Sets the id sensor of this device and sensor.
    *
    * @param idSensor the id sensor of this device and sensor
    */
    @Override
    public void setIdSensor(long idSensor) {
        _deviceAndSensor.setIdSensor(idSensor);
    }

    /**
    * Returns the status of this device and sensor.
    *
    * @return the status of this device and sensor
    */
    @Override
    public boolean getStatus() {
        return _deviceAndSensor.getStatus();
    }

    /**
    * Returns <code>true</code> if this device and sensor is status.
    *
    * @return <code>true</code> if this device and sensor is status; <code>false</code> otherwise
    */
    @Override
    public boolean isStatus() {
        return _deviceAndSensor.isStatus();
    }

    /**
    * Sets whether this device and sensor is status.
    *
    * @param status the status of this device and sensor
    */
    @Override
    public void setStatus(boolean status) {
        _deviceAndSensor.setStatus(status);
    }

    @Override
    public boolean isNew() {
        return _deviceAndSensor.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _deviceAndSensor.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _deviceAndSensor.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _deviceAndSensor.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _deviceAndSensor.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _deviceAndSensor.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _deviceAndSensor.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _deviceAndSensor.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _deviceAndSensor.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _deviceAndSensor.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _deviceAndSensor.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceAndSensorWrapper((DeviceAndSensor) _deviceAndSensor.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.DeviceAndSensor deviceAndSensor) {
        return _deviceAndSensor.compareTo(deviceAndSensor);
    }

    @Override
    public int hashCode() {
        return _deviceAndSensor.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.DeviceAndSensor> toCacheModel() {
        return _deviceAndSensor.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.DeviceAndSensor toEscapedModel() {
        return new DeviceAndSensorWrapper(_deviceAndSensor.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.DeviceAndSensor toUnescapedModel() {
        return new DeviceAndSensorWrapper(_deviceAndSensor.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _deviceAndSensor.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _deviceAndSensor.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _deviceAndSensor.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceAndSensorWrapper)) {
            return false;
        }

        DeviceAndSensorWrapper deviceAndSensorWrapper = (DeviceAndSensorWrapper) obj;

        if (Validator.equals(_deviceAndSensor,
                    deviceAndSensorWrapper._deviceAndSensor)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public DeviceAndSensor getWrappedDeviceAndSensor() {
        return _deviceAndSensor;
    }

    @Override
    public DeviceAndSensor getWrappedModel() {
        return _deviceAndSensor;
    }

    @Override
    public void resetOriginalValues() {
        _deviceAndSensor.resetOriginalValues();
    }
}

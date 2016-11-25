package es.eina.tfg.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Device}.
 * </p>
 *
 * @author adelrioj
 * @see Device
 * @generated
 */
public class DeviceWrapper implements Device, ModelWrapper<Device> {
    private Device _device;

    public DeviceWrapper(Device device) {
        _device = device;
    }

    @Override
    public Class<?> getModelClass() {
        return Device.class;
    }

    @Override
    public String getModelClassName() {
        return Device.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idDevice", getIdDevice());
        attributes.put("idUser", getIdUser());
        attributes.put("deviceUUID", getDeviceUUID());
        attributes.put("description", getDescription());
        attributes.put("status", getStatus());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("serverPhoneNumber", getServerPhoneNumber());
        attributes.put("smsPollTime", getSmsPollTime());
        attributes.put("smsTransmitPeriod", getSmsTransmitPeriod());
        attributes.put("cloudId", getCloudId());
        attributes.put("serverIp", getServerIp());
        attributes.put("httpTransmitPeriod", getHttpTransmitPeriod());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idDevice = (Long) attributes.get("idDevice");

        if (idDevice != null) {
            setIdDevice(idDevice);
        }

        Long idUser = (Long) attributes.get("idUser");

        if (idUser != null) {
            setIdUser(idUser);
        }

        String deviceUUID = (String) attributes.get("deviceUUID");

        if (deviceUUID != null) {
            setDeviceUUID(deviceUUID);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String status = (String) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        String serverPhoneNumber = (String) attributes.get("serverPhoneNumber");

        if (serverPhoneNumber != null) {
            setServerPhoneNumber(serverPhoneNumber);
        }

        String smsPollTime = (String) attributes.get("smsPollTime");

        if (smsPollTime != null) {
            setSmsPollTime(smsPollTime);
        }

        String smsTransmitPeriod = (String) attributes.get("smsTransmitPeriod");

        if (smsTransmitPeriod != null) {
            setSmsTransmitPeriod(smsTransmitPeriod);
        }

        String cloudId = (String) attributes.get("cloudId");

        if (cloudId != null) {
            setCloudId(cloudId);
        }

        String serverIp = (String) attributes.get("serverIp");

        if (serverIp != null) {
            setServerIp(serverIp);
        }

        String httpTransmitPeriod = (String) attributes.get(
                "httpTransmitPeriod");

        if (httpTransmitPeriod != null) {
            setHttpTransmitPeriod(httpTransmitPeriod);
        }
    }

    /**
    * Returns the primary key of this device.
    *
    * @return the primary key of this device
    */
    @Override
    public long getPrimaryKey() {
        return _device.getPrimaryKey();
    }

    /**
    * Sets the primary key of this device.
    *
    * @param primaryKey the primary key of this device
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _device.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id device of this device.
    *
    * @return the id device of this device
    */
    @Override
    public long getIdDevice() {
        return _device.getIdDevice();
    }

    /**
    * Sets the id device of this device.
    *
    * @param idDevice the id device of this device
    */
    @Override
    public void setIdDevice(long idDevice) {
        _device.setIdDevice(idDevice);
    }

    /**
    * Returns the id user of this device.
    *
    * @return the id user of this device
    */
    @Override
    public long getIdUser() {
        return _device.getIdUser();
    }

    /**
    * Sets the id user of this device.
    *
    * @param idUser the id user of this device
    */
    @Override
    public void setIdUser(long idUser) {
        _device.setIdUser(idUser);
    }

    /**
    * Returns the device u u i d of this device.
    *
    * @return the device u u i d of this device
    */
    @Override
    public java.lang.String getDeviceUUID() {
        return _device.getDeviceUUID();
    }

    /**
    * Sets the device u u i d of this device.
    *
    * @param deviceUUID the device u u i d of this device
    */
    @Override
    public void setDeviceUUID(java.lang.String deviceUUID) {
        _device.setDeviceUUID(deviceUUID);
    }

    /**
    * Returns the description of this device.
    *
    * @return the description of this device
    */
    @Override
    public java.lang.String getDescription() {
        return _device.getDescription();
    }

    /**
    * Sets the description of this device.
    *
    * @param description the description of this device
    */
    @Override
    public void setDescription(java.lang.String description) {
        _device.setDescription(description);
    }

    /**
    * Returns the status of this device.
    *
    * @return the status of this device
    */
    @Override
    public java.lang.String getStatus() {
        return _device.getStatus();
    }

    /**
    * Sets the status of this device.
    *
    * @param status the status of this device
    */
    @Override
    public void setStatus(java.lang.String status) {
        _device.setStatus(status);
    }

    /**
    * Returns the phone number of this device.
    *
    * @return the phone number of this device
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _device.getPhoneNumber();
    }

    /**
    * Sets the phone number of this device.
    *
    * @param phoneNumber the phone number of this device
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _device.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the server phone number of this device.
    *
    * @return the server phone number of this device
    */
    @Override
    public java.lang.String getServerPhoneNumber() {
        return _device.getServerPhoneNumber();
    }

    /**
    * Sets the server phone number of this device.
    *
    * @param serverPhoneNumber the server phone number of this device
    */
    @Override
    public void setServerPhoneNumber(java.lang.String serverPhoneNumber) {
        _device.setServerPhoneNumber(serverPhoneNumber);
    }

    /**
    * Returns the sms poll time of this device.
    *
    * @return the sms poll time of this device
    */
    @Override
    public java.lang.String getSmsPollTime() {
        return _device.getSmsPollTime();
    }

    /**
    * Sets the sms poll time of this device.
    *
    * @param smsPollTime the sms poll time of this device
    */
    @Override
    public void setSmsPollTime(java.lang.String smsPollTime) {
        _device.setSmsPollTime(smsPollTime);
    }

    /**
    * Returns the sms transmit period of this device.
    *
    * @return the sms transmit period of this device
    */
    @Override
    public java.lang.String getSmsTransmitPeriod() {
        return _device.getSmsTransmitPeriod();
    }

    /**
    * Sets the sms transmit period of this device.
    *
    * @param smsTransmitPeriod the sms transmit period of this device
    */
    @Override
    public void setSmsTransmitPeriod(java.lang.String smsTransmitPeriod) {
        _device.setSmsTransmitPeriod(smsTransmitPeriod);
    }

    /**
    * Returns the cloud ID of this device.
    *
    * @return the cloud ID of this device
    */
    @Override
    public java.lang.String getCloudId() {
        return _device.getCloudId();
    }

    /**
    * Sets the cloud ID of this device.
    *
    * @param cloudId the cloud ID of this device
    */
    @Override
    public void setCloudId(java.lang.String cloudId) {
        _device.setCloudId(cloudId);
    }

    /**
    * Returns the server ip of this device.
    *
    * @return the server ip of this device
    */
    @Override
    public java.lang.String getServerIp() {
        return _device.getServerIp();
    }

    /**
    * Sets the server ip of this device.
    *
    * @param serverIp the server ip of this device
    */
    @Override
    public void setServerIp(java.lang.String serverIp) {
        _device.setServerIp(serverIp);
    }

    /**
    * Returns the http transmit period of this device.
    *
    * @return the http transmit period of this device
    */
    @Override
    public java.lang.String getHttpTransmitPeriod() {
        return _device.getHttpTransmitPeriod();
    }

    /**
    * Sets the http transmit period of this device.
    *
    * @param httpTransmitPeriod the http transmit period of this device
    */
    @Override
    public void setHttpTransmitPeriod(java.lang.String httpTransmitPeriod) {
        _device.setHttpTransmitPeriod(httpTransmitPeriod);
    }

    @Override
    public boolean isNew() {
        return _device.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _device.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _device.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _device.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _device.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _device.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _device.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _device.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _device.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _device.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _device.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DeviceWrapper((Device) _device.clone());
    }

    @Override
    public int compareTo(es.eina.tfg.model.Device device) {
        return _device.compareTo(device);
    }

    @Override
    public int hashCode() {
        return _device.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<es.eina.tfg.model.Device> toCacheModel() {
        return _device.toCacheModel();
    }

    @Override
    public es.eina.tfg.model.Device toEscapedModel() {
        return new DeviceWrapper(_device.toEscapedModel());
    }

    @Override
    public es.eina.tfg.model.Device toUnescapedModel() {
        return new DeviceWrapper(_device.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _device.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _device.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _device.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DeviceWrapper)) {
            return false;
        }

        DeviceWrapper deviceWrapper = (DeviceWrapper) obj;

        if (Validator.equals(_device, deviceWrapper._device)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Device getWrappedDevice() {
        return _device;
    }

    @Override
    public Device getWrappedModel() {
        return _device;
    }

    @Override
    public void resetOriginalValues() {
        _device.resetOriginalValues();
    }
}

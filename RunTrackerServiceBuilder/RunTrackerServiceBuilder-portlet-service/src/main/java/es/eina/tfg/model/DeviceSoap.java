package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.DeviceServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.DeviceServiceSoap
 * @generated
 */
public class DeviceSoap implements Serializable {
    private long _deviceId;
    private long _userId;
    private String _deviceUUID;
    private String _description;
    private String _status;
    private String _phoneNumber;
    private String _serverPhoneNumber;
    private String _smsPollTime;
    private String _smsTransmitPeriod;
    private String _cloudId;
    private String _serverIp;
    private String _httpTransmitPeriod;

    public DeviceSoap() {
    }

    public static DeviceSoap toSoapModel(Device model) {
        DeviceSoap soapModel = new DeviceSoap();

        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setUserId(model.getUserId());
        soapModel.setDeviceUUID(model.getDeviceUUID());
        soapModel.setDescription(model.getDescription());
        soapModel.setStatus(model.getStatus());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setServerPhoneNumber(model.getServerPhoneNumber());
        soapModel.setSmsPollTime(model.getSmsPollTime());
        soapModel.setSmsTransmitPeriod(model.getSmsTransmitPeriod());
        soapModel.setCloudId(model.getCloudId());
        soapModel.setServerIp(model.getServerIp());
        soapModel.setHttpTransmitPeriod(model.getHttpTransmitPeriod());

        return soapModel;
    }

    public static DeviceSoap[] toSoapModels(Device[] models) {
        DeviceSoap[] soapModels = new DeviceSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DeviceSoap[][] toSoapModels(Device[][] models) {
        DeviceSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DeviceSoap[models.length][models[0].length];
        } else {
            soapModels = new DeviceSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DeviceSoap[] toSoapModels(List<Device> models) {
        List<DeviceSoap> soapModels = new ArrayList<DeviceSoap>(models.size());

        for (Device model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DeviceSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _deviceId;
    }

    public void setPrimaryKey(long pk) {
        setDeviceId(pk);
    }

    public long getDeviceId() {
        return _deviceId;
    }

    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getDeviceUUID() {
        return _deviceUUID;
    }

    public void setDeviceUUID(String deviceUUID) {
        _deviceUUID = deviceUUID;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String status) {
        _status = status;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String getServerPhoneNumber() {
        return _serverPhoneNumber;
    }

    public void setServerPhoneNumber(String serverPhoneNumber) {
        _serverPhoneNumber = serverPhoneNumber;
    }

    public String getSmsPollTime() {
        return _smsPollTime;
    }

    public void setSmsPollTime(String smsPollTime) {
        _smsPollTime = smsPollTime;
    }

    public String getSmsTransmitPeriod() {
        return _smsTransmitPeriod;
    }

    public void setSmsTransmitPeriod(String smsTransmitPeriod) {
        _smsTransmitPeriod = smsTransmitPeriod;
    }

    public String getCloudId() {
        return _cloudId;
    }

    public void setCloudId(String cloudId) {
        _cloudId = cloudId;
    }

    public String getServerIp() {
        return _serverIp;
    }

    public void setServerIp(String serverIp) {
        _serverIp = serverIp;
    }

    public String getHttpTransmitPeriod() {
        return _httpTransmitPeriod;
    }

    public void setHttpTransmitPeriod(String httpTransmitPeriod) {
        _httpTransmitPeriod = httpTransmitPeriod;
    }
}

package es.eina.tfg.model;

import es.eina.tfg.service.persistence.Device_SensorPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.Device_SensorServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.Device_SensorServiceSoap
 * @generated
 */
public class Device_SensorSoap implements Serializable {
    private long _deviceId;
    private long _sensorId;
    private boolean _status;

    public Device_SensorSoap() {
    }

    public static Device_SensorSoap toSoapModel(Device_Sensor model) {
        Device_SensorSoap soapModel = new Device_SensorSoap();

        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setSensorId(model.getSensorId());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static Device_SensorSoap[] toSoapModels(Device_Sensor[] models) {
        Device_SensorSoap[] soapModels = new Device_SensorSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static Device_SensorSoap[][] toSoapModels(Device_Sensor[][] models) {
        Device_SensorSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new Device_SensorSoap[models.length][models[0].length];
        } else {
            soapModels = new Device_SensorSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static Device_SensorSoap[] toSoapModels(List<Device_Sensor> models) {
        List<Device_SensorSoap> soapModels = new ArrayList<Device_SensorSoap>(models.size());

        for (Device_Sensor model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new Device_SensorSoap[soapModels.size()]);
    }

    public Device_SensorPK getPrimaryKey() {
        return new Device_SensorPK(_deviceId, _sensorId);
    }

    public void setPrimaryKey(Device_SensorPK pk) {
        setDeviceId(pk.deviceId);
        setSensorId(pk.sensorId);
    }

    public long getDeviceId() {
        return _deviceId;
    }

    public void setDeviceId(long deviceId) {
        _deviceId = deviceId;
    }

    public long getSensorId() {
        return _sensorId;
    }

    public void setSensorId(long sensorId) {
        _sensorId = sensorId;
    }

    public boolean getStatus() {
        return _status;
    }

    public boolean isStatus() {
        return _status;
    }

    public void setStatus(boolean status) {
        _status = status;
    }
}

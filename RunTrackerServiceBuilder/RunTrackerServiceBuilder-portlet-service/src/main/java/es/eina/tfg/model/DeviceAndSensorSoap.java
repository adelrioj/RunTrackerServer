package es.eina.tfg.model;

import es.eina.tfg.service.persistence.DeviceAndSensorPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author adelrioj
 * @generated
 */
public class DeviceAndSensorSoap implements Serializable {
    private long _idDevice;
    private long _idSensor;
    private boolean _status;

    public DeviceAndSensorSoap() {
    }

    public static DeviceAndSensorSoap toSoapModel(DeviceAndSensor model) {
        DeviceAndSensorSoap soapModel = new DeviceAndSensorSoap();

        soapModel.setIdDevice(model.getIdDevice());
        soapModel.setIdSensor(model.getIdSensor());
        soapModel.setStatus(model.getStatus());

        return soapModel;
    }

    public static DeviceAndSensorSoap[] toSoapModels(DeviceAndSensor[] models) {
        DeviceAndSensorSoap[] soapModels = new DeviceAndSensorSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DeviceAndSensorSoap[][] toSoapModels(
        DeviceAndSensor[][] models) {
        DeviceAndSensorSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DeviceAndSensorSoap[models.length][models[0].length];
        } else {
            soapModels = new DeviceAndSensorSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DeviceAndSensorSoap[] toSoapModels(
        List<DeviceAndSensor> models) {
        List<DeviceAndSensorSoap> soapModels = new ArrayList<DeviceAndSensorSoap>(models.size());

        for (DeviceAndSensor model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DeviceAndSensorSoap[soapModels.size()]);
    }

    public DeviceAndSensorPK getPrimaryKey() {
        return new DeviceAndSensorPK(_idDevice, _idSensor);
    }

    public void setPrimaryKey(DeviceAndSensorPK pk) {
        setIdDevice(pk.idDevice);
        setIdSensor(pk.idSensor);
    }

    public long getIdDevice() {
        return _idDevice;
    }

    public void setIdDevice(long idDevice) {
        _idDevice = idDevice;
    }

    public long getIdSensor() {
        return _idSensor;
    }

    public void setIdSensor(long idSensor) {
        _idSensor = idSensor;
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

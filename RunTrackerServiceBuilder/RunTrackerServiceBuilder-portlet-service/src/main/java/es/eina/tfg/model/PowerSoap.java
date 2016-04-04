package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.PowerServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.PowerServiceSoap
 * @generated
 */
public class PowerSoap implements Serializable {
    private long _measurementId;
    private long _raceId;
    private long _userId;
    private long _deviceId;
    private long _sensorId;
    private Date _time;
    private String _sensorMode;
    private int _level;

    public PowerSoap() {
    }

    public static PowerSoap toSoapModel(Power model) {
        PowerSoap soapModel = new PowerSoap();

        soapModel.setMeasurementId(model.getMeasurementId());
        soapModel.setRaceId(model.getRaceId());
        soapModel.setUserId(model.getUserId());
        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setSensorId(model.getSensorId());
        soapModel.setTime(model.getTime());
        soapModel.setSensorMode(model.getSensorMode());
        soapModel.setLevel(model.getLevel());

        return soapModel;
    }

    public static PowerSoap[] toSoapModels(Power[] models) {
        PowerSoap[] soapModels = new PowerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PowerSoap[][] toSoapModels(Power[][] models) {
        PowerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PowerSoap[models.length][models[0].length];
        } else {
            soapModels = new PowerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PowerSoap[] toSoapModels(List<Power> models) {
        List<PowerSoap> soapModels = new ArrayList<PowerSoap>(models.size());

        for (Power model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PowerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _measurementId;
    }

    public void setPrimaryKey(long pk) {
        setMeasurementId(pk);
    }

    public long getMeasurementId() {
        return _measurementId;
    }

    public void setMeasurementId(long measurementId) {
        _measurementId = measurementId;
    }

    public long getRaceId() {
        return _raceId;
    }

    public void setRaceId(long raceId) {
        _raceId = raceId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
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

    public Date getTime() {
        return _time;
    }

    public void setTime(Date time) {
        _time = time;
    }

    public String getSensorMode() {
        return _sensorMode;
    }

    public void setSensorMode(String sensorMode) {
        _sensorMode = sensorMode;
    }

    public int getLevel() {
        return _level;
    }

    public void setLevel(int level) {
        _level = level;
    }
}

package es.eina.tfg.model;

import es.eina.tfg.service.persistence.PowerPK;

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
    private long _idMeasurement;
    private Long _idRace;
    private long _idDevice;
    private long _idSensor;
    private Date _time;
    private String _sensorMode;
    private int _level;

    public PowerSoap() {
    }

    public static PowerSoap toSoapModel(Power model) {
        PowerSoap soapModel = new PowerSoap();

        soapModel.setIdMeasurement(model.getIdMeasurement());
        soapModel.setIdRace(model.getIdRace());
        soapModel.setIdDevice(model.getIdDevice());
        soapModel.setIdSensor(model.getIdSensor());
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

    public PowerPK getPrimaryKey() {
        return new PowerPK(_idMeasurement, _idRace);
    }

    public void setPrimaryKey(PowerPK pk) {
        setIdMeasurement(pk.idMeasurement);
        setIdRace(pk.idRace);
    }

    public long getIdMeasurement() {
        return _idMeasurement;
    }

    public void setIdMeasurement(long idMeasurement) {
        _idMeasurement = idMeasurement;
    }

    public Long getIdRace() {
        return _idRace;
    }

    public void setIdRace(Long idRace) {
        _idRace = idRace;
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

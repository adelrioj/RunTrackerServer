package es.eina.tfg.model;

import es.eina.tfg.service.persistence.LocationPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.LocationServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.LocationServiceSoap
 * @generated
 */
public class LocationSoap implements Serializable {
    private Long _idRace;
    private long _idMeasurement;
    private long _idDevice;
    private long _idSensor;
    private Date _time;
    private String _sensorMode;
    private int _sysRef;
    private double _latitude;
    private double _longitude;
    private double _speed;
    private double _distance;
    private double _altitude;

    public LocationSoap() {
    }

    public static LocationSoap toSoapModel(Location model) {
        LocationSoap soapModel = new LocationSoap();

        soapModel.setIdRace(model.getIdRace());
        soapModel.setIdMeasurement(model.getIdMeasurement());
        soapModel.setIdDevice(model.getIdDevice());
        soapModel.setIdSensor(model.getIdSensor());
        soapModel.setTime(model.getTime());
        soapModel.setSensorMode(model.getSensorMode());
        soapModel.setSysRef(model.getSysRef());
        soapModel.setLatitude(model.getLatitude());
        soapModel.setLongitude(model.getLongitude());
        soapModel.setSpeed(model.getSpeed());
        soapModel.setDistance(model.getDistance());
        soapModel.setAltitude(model.getAltitude());

        return soapModel;
    }

    public static LocationSoap[] toSoapModels(Location[] models) {
        LocationSoap[] soapModels = new LocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[][] toSoapModels(Location[][] models) {
        LocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LocationSoap[models.length][models[0].length];
        } else {
            soapModels = new LocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LocationSoap[] toSoapModels(List<Location> models) {
        List<LocationSoap> soapModels = new ArrayList<LocationSoap>(models.size());

        for (Location model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LocationSoap[soapModels.size()]);
    }

    public LocationPK getPrimaryKey() {
        return new LocationPK(_idRace, _idMeasurement);
    }

    public void setPrimaryKey(LocationPK pk) {
        setIdRace(pk.idRace);
        setIdMeasurement(pk.idMeasurement);
    }

    public Long getIdRace() {
        return _idRace;
    }

    public void setIdRace(Long idRace) {
        _idRace = idRace;
    }

    public long getIdMeasurement() {
        return _idMeasurement;
    }

    public void setIdMeasurement(long idMeasurement) {
        _idMeasurement = idMeasurement;
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

    public int getSysRef() {
        return _sysRef;
    }

    public void setSysRef(int sysRef) {
        _sysRef = sysRef;
    }

    public double getLatitude() {
        return _latitude;
    }

    public void setLatitude(double latitude) {
        _latitude = latitude;
    }

    public double getLongitude() {
        return _longitude;
    }

    public void setLongitude(double longitude) {
        _longitude = longitude;
    }

    public double getSpeed() {
        return _speed;
    }

    public void setSpeed(double speed) {
        _speed = speed;
    }

    public double getDistance() {
        return _distance;
    }

    public void setDistance(double distance) {
        _distance = distance;
    }

    public double getAltitude() {
        return _altitude;
    }

    public void setAltitude(double altitude) {
        _altitude = altitude;
    }
}

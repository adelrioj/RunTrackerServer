package es.eina.tfg.model;

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
    private long _measurementId;
    private Long _raceId;
    private long _userId;
    private long _deviceId;
    private long _sensorId;
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

        soapModel.setMeasurementId(model.getMeasurementId());
        soapModel.setRaceId(model.getRaceId());
        soapModel.setUserId(model.getUserId());
        soapModel.setDeviceId(model.getDeviceId());
        soapModel.setSensorId(model.getSensorId());
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

    public Long getRaceId() {
        return _raceId;
    }

    public void setRaceId(Long raceId) {
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

package es.eina.tfg.RunTrackerBL.entity;

import org.joda.time.DateTime;

public class RaceLocation {

    private Long idMeasurement;
    private Long idRace;
    private Long idDevice;
    private Long idSensor;
    private DateTime time;
    private String sensorMode;
    private Integer sysRef;
    private Double latitude;
    private Double longitude;
    private Double speed;
    private Double distance;
    private Double altitude;

    public Long getIdMeasurement() {
        return idMeasurement;
    }
    public void setIdMeasurement(Long idMeasurement) {
        this.idMeasurement = idMeasurement;
    }

    public Long getIdRace() {
        return idRace;
    }
    public void setIdRace(Long idRace) {
        this.idRace = idRace;
    }

    public Long getIdDevice() {
        return idDevice;
    }
    public void setIdDevice(Long idDevice) {
        this.idDevice = idDevice;
    }

    public Long getIdSensor() {
        return idSensor;
    }
    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public DateTime getTime() {
        return time;
    }
    public void setTime(DateTime time) {
        this.time = time;
    }

    public String getSensorMode() {
        return sensorMode;
    }
    public void setSensorMode(String sensorMode) {
        this.sensorMode = sensorMode;
    }

    public Integer getSysRef() {
        return sysRef;
    }
    public void setSysRef(Integer sysRef) {
        this.sysRef = sysRef;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getSpeed() {
        return speed;
    }
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDistance() {
        return distance;
    }
    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAltitude() {
        return altitude;
    }
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "RaceLocation{" +
                "idMeasurement=" + idMeasurement +
                ", idRace=" + idRace +
                ", idDevice=" + idDevice +
                ", idSensor=" + idSensor +
                ", time=" + time +
                ", sensorMode='" + sensorMode + '\'' +
                ", sysRef=" + sysRef +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", speed=" + speed +
                ", distance=" + distance +
                ", altitude=" + altitude +
                '}';
    }
}

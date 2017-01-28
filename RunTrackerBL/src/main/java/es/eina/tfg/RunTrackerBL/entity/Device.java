package es.eina.tfg.RunTrackerBL.entity;

import java.util.List;

public class Device {

    public static final String STATUS_SMSMODE = "SMSMODE";
    public static final String STATUS_3GMODE = "3GMODE";
    public static final String STATUS_DISABLED = "DISABLED";

    private Long idDevice;
    private Long idUser;
    private String deviceUUID;
    private String description;
    private String status;
    private String phoneNumber;
    private String serverPhoneNumber;
    private String smsPollTime;
    private String smsTransmitPeriod;
    private String cloudId;
    private String serverIp;
    private String httpTransmitPeriod;

    private List<DeviceAndSensor> sensors;

    public Long getIdDevice() {
        return idDevice;
    }
    public void setIdDevice(Long idDevice) {
        this.idDevice = idDevice;
    }

    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getDeviceUUID() {
        return deviceUUID;
    }
    public void setDeviceUUID(String deviceUUID) {
        this.deviceUUID = deviceUUID;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServerPhoneNumber() {
        return serverPhoneNumber;
    }
    public void setServerPhoneNumber(String serverPhoneNumber) {
        this.serverPhoneNumber = serverPhoneNumber;
    }

    public String getSmsPollTime() {
        return smsPollTime;
    }
    public void setSmsPollTime(String smsPollTime) {
        this.smsPollTime = smsPollTime;
    }

    public String getSmsTransmitPeriod() {
        return smsTransmitPeriod;
    }
    public void setSmsTransmitPeriod(String smsTransmitPeriod) {
        this.smsTransmitPeriod = smsTransmitPeriod;
    }

    public String getCloudId() {
        return cloudId;
    }
    public void setCloudId(String cloudId) {
        this.cloudId = cloudId;
    }

    public String getServerIp() {
        return serverIp;
    }
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getHttpTransmitPeriod() {
        return httpTransmitPeriod;
    }
    public void setHttpTransmitPeriod(String httpTransmitPeriod) {
        this.httpTransmitPeriod = httpTransmitPeriod;
    }

    public List<DeviceAndSensor> getSensors() {
        return sensors;
    }
    public void setSensors(List<DeviceAndSensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "Device{" +
                "idDevice=" + idDevice +
                ", idUser=" + idUser +
                ", deviceUUID='" + deviceUUID + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", serverPhoneNumber='" + serverPhoneNumber + '\'' +
                ", smsPollTime=" + smsPollTime +
                ", smsTransmitPeriod=" + smsTransmitPeriod +
                ", cloudId='" + cloudId + '\'' +
                ", serverIp='" + serverIp + '\'' +
                ", httpTransmitPeriod=" + httpTransmitPeriod +
                ", sensors=" + sensors +
                '}';
    }
}

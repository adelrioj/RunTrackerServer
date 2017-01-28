package es.eina.tfg.RunTrackerBL.entity;

public class DeviceAndSensor {

    private Sensor sensor;
    private boolean status;

    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeviceAndSensor{" +
                "sensor=" + sensor +
                ", status='" + status + '\'' +
                '}';
    }
}

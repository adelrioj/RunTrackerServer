package es.eina.tfg.RunTrackerBL.entity;

public class Sensor {

    private Long idSensor;
    private String description;
    private String dataUnits;
    private String dataType;
    private String dataUncertainity;
    private String dataLowerRange;
    private String dataUpperRange;
    private String dataPacketFormat;

    public Long getIdSensor() {
        return idSensor;
    }
    public void setIdSensor(Long idSensor) {
        this.idSensor = idSensor;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDataUnits() {
        return dataUnits;
    }
    public void setDataUnits(String dataUnits) {
        this.dataUnits = dataUnits;
    }

    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataUncertainity() {
        return dataUncertainity;
    }
    public void setDataUncertainity(String dataUncertainity) {
        this.dataUncertainity = dataUncertainity;
    }

    public String getDataLowerRange() {
        return dataLowerRange;
    }
    public void setDataLowerRange(String dataLowerRange) {
        this.dataLowerRange = dataLowerRange;
    }

    public String getDataUpperRange() {
        return dataUpperRange;
    }
    public void setDataUpperRange(String dataUpperRange) {
        this.dataUpperRange = dataUpperRange;
    }

    public String getDataPacketFormat() {
        return dataPacketFormat;
    }
    public void setDataPacketFormat(String dataPacketFormat) {
        this.dataPacketFormat = dataPacketFormat;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "idSensor=" + idSensor +
                ", description='" + description + '\'' +
                ", dataUnits='" + dataUnits + '\'' +
                ", dataType='" + dataType + '\'' +
                ", dataUncertainity='" + dataUncertainity + '\'' +
                ", dataLowerRange='" + dataLowerRange + '\'' +
                ", dataUpperRange='" + dataUpperRange + '\'' +
                ", dataPacketFormat='" + dataPacketFormat + '\'' +
                '}';
    }
}

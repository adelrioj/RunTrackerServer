package es.eina.tfg.RunTrackerBL.converter;

public class SensorConverter {

    public static es.eina.tfg.RunTrackerBL.entity.Sensor toLocalSensor(es.eina.tfg.model.Sensor toConvert){
        es.eina.tfg.RunTrackerBL.entity.Sensor localSensor = new es.eina.tfg.RunTrackerBL.entity.Sensor();

        localSensor.setIdSensor(toConvert.getIdSensor());
        localSensor.setDescription(toConvert.getDescription());
        localSensor.setDataUnits(toConvert.getDataUnits());
        localSensor.setDataType(toConvert.getDataType());
        localSensor.setDataUncertainity(toConvert.getDataUncertainity());
        localSensor.setDataLowerRange(toConvert.getDataLowerRange());
        localSensor.setDataUpperRange(toConvert.getDataUpperRange());
        localSensor.setDataPacketFormat(toConvert.getDataPacketFormat());

        return localSensor;
    }
}
package es.eina.tfg.RunTrackerBL.converter;

import java.util.List;

public class DeviceConverter {

    public static es.eina.tfg.RunTrackerBL.entity.Device toLocalDevice(
            es.eina.tfg.model.Device toConvert,
            List<es.eina.tfg.RunTrackerBL.entity.DeviceAndSensor> sensors){
        es.eina.tfg.RunTrackerBL.entity.Device localDevice = new es.eina.tfg.RunTrackerBL.entity.Device();

        localDevice.setIdDevice(toConvert.getIdDevice());
        localDevice.setIdUser(toConvert.getIdUser());
        localDevice.setDeviceUUID(toConvert.getDeviceUUID());
        localDevice.setDescription(toConvert.getDescription());
        localDevice.setStatus(toConvert.getStatus());
        localDevice.setPhoneNumber(toConvert.getPhoneNumber());
        localDevice.setServerPhoneNumber(toConvert.getServerPhoneNumber());
        localDevice.setSmsPollTime(toConvert.getSmsPollTime());
        localDevice.setSmsTransmitPeriod(toConvert.getSmsTransmitPeriod());
        localDevice.setCloudId(toConvert.getCloudId());
        localDevice.setServerIp(toConvert.getServerIp());
        localDevice.setHttpTransmitPeriod(toConvert.getHttpTransmitPeriod());

        localDevice.setSensors(sensors);

        return localDevice;
    }

    public static es.eina.tfg.RunTrackerBL.entity.DeviceAndSensor toLocalDeviceAndSensor(es.eina.tfg.model.DeviceAndSensor toConvert,
                                                                                         es.eina.tfg.RunTrackerBL.entity.Sensor sensor){
        es.eina.tfg.RunTrackerBL.entity.DeviceAndSensor localDeviceAndSensor = new es.eina.tfg.RunTrackerBL.entity.DeviceAndSensor();

        localDeviceAndSensor.setSensor(sensor);
        localDeviceAndSensor.setStatus(toConvert.getStatus());

        return  localDeviceAndSensor;
    }
}

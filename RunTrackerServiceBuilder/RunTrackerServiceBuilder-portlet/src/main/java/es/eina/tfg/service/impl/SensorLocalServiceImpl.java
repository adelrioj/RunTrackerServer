package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingSensorException;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.base.SensorLocalServiceBaseImpl;

/**
 * The implementation of the sensor local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.SensorLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see SensorLocalServiceBaseImpl
 * @see es.eina.tfg.service.SensorLocalServiceUtil
 */
public class SensorLocalServiceImpl extends SensorLocalServiceBaseImpl {
    public Sensor add(Integer type, String description, String dataUnits, String dataType, String dataUncertainity,
                      String dataLowerRange, String dataUpperRange, String dataPacketFormat)
            throws SystemException {
        Long sensorId = counterLocalService.increment();

        Sensor sensor = createSensor(sensorId);
        sensor.setType(type);
        sensor.setDescription(description);
        sensor.setDataUnits(dataUnits);
        sensor.setDataType(dataType);
        sensor.setDataUncertainity(dataUncertainity);
        sensor.setDataLowerRange(dataLowerRange);
        sensor.setDataUpperRange(dataUpperRange);
        sensor.setDataPacketFormat(dataPacketFormat);

        return updateSensor(sensor);
    }

    public Sensor update(Long sensorId, Integer type, String description, String dataUnits, String dataType,
                         String dataUncertainity, String dataLowerRange, String dataUpperRange, String dataPacketFormat)
            throws SystemException, NonExistingSensorException {
        Sensor sensor = fetchSensor(sensorId);
        if (sensor == null){
            throw new NonExistingSensorException("The Sensor: " + sensorId +" does not exists on the database");
        }
        sensor.setType(type);
        sensor.setDescription(description);
        sensor.setDataUnits(dataUnits);
        sensor.setDataType(dataType);
        sensor.setDataUncertainity(dataUncertainity);
        sensor.setDataLowerRange(dataLowerRange);
        sensor.setDataUpperRange(dataUpperRange);
        sensor.setDataPacketFormat(dataPacketFormat);

        return updateSensor(sensor);
    }
}
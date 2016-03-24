package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NonExistingDeviceAndSensorRelationException;
import es.eina.tfg.NonExistingMeasurementException;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.model.Power;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.base.PowerLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.Device_SensorPK;

import java.util.Date;

/**
 * The implementation of the power local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.PowerLocalService} interface.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see PowerLocalServiceBaseImpl
 * @see es.eina.tfg.service.PowerLocalServiceUtil
 */
public class PowerLocalServiceImpl extends PowerLocalServiceBaseImpl {

    public Power add(Long raceId, Long userId, Long deviceId, Long sensorId, Date time, String sensorMode, Integer level)
            throws SystemException, NonExistingUserException, NonExistingDeviceAndSensorRelationException, NonExistingRaceException {

        Long measurementId = counterLocalService.increment();

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }
        Device_Sensor deviceSensor = Device_SensorLocalServiceUtil.fetchDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
        if (deviceSensor == null){
            throw new NonExistingDeviceAndSensorRelationException(
                    "The device:" + deviceId + " and sensor: " + sensorId + " has no relation on the database");
        }
        Race race = RaceLocalServiceUtil.fetchRace(raceId);
        if (race == null){
            throw new NonExistingRaceException("Race:" + raceId + " does not exists on the database");
        }

        Power power = createPower(measurementId);
        power.setRaceId(raceId);
        power.setUserId(userId);
        power.setDeviceId(deviceId);
        power.setSensorId(sensorId);
        power.setTime(time);
        power.setSensorMode(sensorMode);
        power.setLevel(level);

        return updatePower(power);
    }

    public Power update(Long measurementId, Long raceId, Long userId, Long deviceId, Long sensorId, Date time,
                        String sensorMode, Integer level)
            throws SystemException, NonExistingUserException, NonExistingDeviceAndSensorRelationException,
            NonExistingRaceException, NonExistingMeasurementException {

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }
        Device_Sensor deviceSensor = Device_SensorLocalServiceUtil.fetchDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
        if (deviceSensor == null){
            throw new NonExistingDeviceAndSensorRelationException(
                    "The device:" + deviceId + " and sensor: " + sensorId + " has no relation on the database");
        }
        Race race = RaceLocalServiceUtil.fetchRace(raceId);
        if (race == null){
            throw new NonExistingRaceException("Race:" + raceId + " does not exists on the database");
        }

        Power power = fetchPower(measurementId);
        if (power == null){
            throw new NonExistingMeasurementException(
                    "Measurement: " + measurementId + " type: " + this.getClass().getName() + " does not exists on the database");
        }
        power.setRaceId(raceId);
        power.setUserId(userId);
        power.setDeviceId(deviceId);
        power.setSensorId(sensorId);
        power.setTime(time);
        power.setSensorMode(sensorMode);
        power.setLevel(level);

        return updatePower(power);
    }
}
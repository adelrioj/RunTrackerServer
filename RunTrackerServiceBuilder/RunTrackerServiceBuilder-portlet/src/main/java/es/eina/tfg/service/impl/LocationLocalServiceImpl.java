package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NonExistingDeviceAndSensorRelationException;
import es.eina.tfg.NonExistingMeasurementException;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.model.Location;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.base.LocationLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.Device_SensorPK;
import es.eina.tfg.service.persistence.LocationUtil;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the location local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.LocationLocalService} interface.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see LocationLocalServiceBaseImpl
 * @see es.eina.tfg.service.LocationLocalServiceUtil
 */
public class LocationLocalServiceImpl extends LocationLocalServiceBaseImpl {

    public Location add(Long raceId, Long userId, Long deviceId, Long sensorId, Date time, String sensorMode,
                        int sysRef, double latitude, double longitude, double speed, double distance, double altitude)
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

        Location location = createLocation(measurementId);
        location.setRaceId(raceId);
        location.setUserId(userId);
        location.setDeviceId(deviceId);
        location.setSensorId(sensorId);
        location.setTime(time);
        location.setSensorMode(sensorMode);
        location.setSysRef(sysRef);
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        location.setSpeed(speed);
        location.setDistance(distance);
        location.setAltitude(altitude);

        return updateLocation(location);
    }

    public Location update(Long measurementId, Long raceId, Long userId, Long deviceId, Long sensorId, Date time,
                           String sensorMode, int sysRef, double latitude, double longitude, double speed,
                           double distance, double altitude)
            throws SystemException, NonExistingMeasurementException {
        Location location = fetchLocation(measurementId);
        if (location == null){
            throw new NonExistingMeasurementException(
                    "Measurement: " + measurementId + " type: " + this.getClass().getName() + " does not exists on the database");
        }

        location.setRaceId(raceId);
        location.setUserId(userId);
        location.setDeviceId(deviceId);
        location.setSensorId(sensorId);
        location.setTime(time);
        location.setSensorMode(sensorMode);
        location.setSysRef(sysRef);
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        location.setSpeed(speed);
        location.setDistance(distance);
        location.setAltitude(altitude);

        return updateLocation(location);
    }

    public List<Location> findByRaceId(Long raceId) throws SystemException {
        return LocationUtil.findByraceId(raceId);
    }
}
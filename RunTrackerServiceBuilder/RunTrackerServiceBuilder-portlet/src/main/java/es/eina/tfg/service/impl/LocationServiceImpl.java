package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingDeviceAndSensorRelationException;
import es.eina.tfg.NonExistingMeasurementException;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Location;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.base.LocationServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the location remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.LocationService} interface.
 *
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see LocationServiceBaseImpl
 * @see es.eina.tfg.service.LocationServiceUtil
 */
public class LocationServiceImpl extends LocationServiceBaseImpl {
    public Location add(Long raceId, Long userId, Long deviceId, Long sensorId, Date time, String sensorMode,
                        int sysRef, double latitude, double longitude, double speed, double distance, double altitude)
            throws SystemException, NonExistingUserException, NonExistingDeviceAndSensorRelationException, NonExistingRaceException {
        return LocationLocalServiceUtil.add(raceId, userId,deviceId, sensorId, time, sensorMode, sysRef, latitude,
                longitude, speed, distance, altitude);
    }

    public Location update(Long measurementId, Long raceId, Long userId, Long deviceId, Long sensorId, Date time,
                           String sensorMode, int sysRef, double latitude, double longitude, double speed,
                           double distance, double altitude)
            throws SystemException, NonExistingMeasurementException {
        return LocationLocalServiceUtil.update(measurementId, raceId, userId, deviceId, sensorId, time, sensorMode,
                sysRef, latitude, longitude, speed, distance, altitude);
    }

    public Location delete (Long measurementId) throws SystemException, PortalException {
        return LocationLocalServiceUtil.deleteLocation(measurementId);
    }

    public Location getLocation (Long measurementId) throws SystemException, PortalException {
        return LocationLocalServiceUtil.getLocation(measurementId);
    }

    public List<Location> findByRaceId(Long raceId) throws SystemException {
        return LocationLocalServiceUtil.findByRaceId(raceId);
    }
}
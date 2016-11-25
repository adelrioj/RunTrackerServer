package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Location;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.base.LocationServiceBaseImpl;
import es.eina.tfg.service.persistence.LocationPK;

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

    public Location add(Long raceId, Long deviceId, Long sensorId, Date time, String sensorMode,
                        int sysRef, double latitude, double longitude, double speed, double distance, double altitude)
            throws SystemException {

        Location location = LocationLocalServiceUtil.createLocation(LocationLocalServiceUtil.generateNewIdLocation(raceId));
        location.setIdDevice(deviceId);
        location.setIdSensor(sensorId);
        location.setTime(time);
        location.setSensorMode(sensorMode);
        location.setSysRef(sysRef);
        location.setLatitude(latitude);
        location.setLongitude(longitude);
        location.setSpeed(speed);
        location.setDistance(distance);
        location.setAltitude(altitude);

        return LocationLocalServiceUtil.addLocation(location);
    }

    public Location getByidLocation (long idMeasurement, long idRace)
            throws SystemException, PortalException {
        LocationPK locationPK = new LocationPK(idRace, idMeasurement);
        return LocationLocalServiceUtil.getLocation(locationPK);
    }

    public List<Location> getByidRace(Long idRace)
            throws SystemException {
        return LocationLocalServiceUtil.getByRaceId(idRace);
    }
}

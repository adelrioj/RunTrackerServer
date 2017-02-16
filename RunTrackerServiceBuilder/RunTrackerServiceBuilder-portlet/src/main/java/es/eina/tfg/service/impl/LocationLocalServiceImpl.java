package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.model.Location;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.base.LocationLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.DeviceAndSensorPK;
import es.eina.tfg.service.persistence.LocationFinderUtil;
import es.eina.tfg.service.persistence.LocationPK;
import es.eina.tfg.service.persistence.LocationUtil;

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

    public LocationPK generateNewIdLocation(long idRace)
            throws SystemException {
        try {
            return new LocationPK(idRace, counterLocalService.increment(Location.class.getName()));
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Location.class.getName());
            throw e;
        }
    }

    public Location createLocation (long idRace, long idLocation){
        LocationPK locationPK = new LocationPK(idRace, idLocation);
        return createLocation(locationPK);
    }

    @Override
    public Location addLocation(Location location)
            throws SystemException {
        checkMadatoryAttributes(location);
        return super.addLocation(location);
    }

    @Override
    public Location updateLocation(Location location) throws SystemException {
        checkMadatoryAttributes(location);
        return super.updateLocation(location);
    }

    public void deleteByIdRace(long idRace)
            throws SystemException {
        LocationFinderUtil.deleteByIdRace(idRace);
    }

    private void checkMadatoryAttributes(Location location)
            throws SystemException {
        Race race = RaceLocalServiceUtil.fetchRace(location.getIdRace());
        if (race == null){
            throw new SystemException("Race:" + location.getIdRace() + " does not exists on the database");
        }

        DeviceAndSensorPK deviceAndSensorPK = new DeviceAndSensorPK(location.getIdDevice(), location.getIdSensor());
        DeviceAndSensor deviceAndSensor = DeviceAndSensorLocalServiceUtil.fetchDeviceAndSensor(deviceAndSensorPK);
        if (deviceAndSensor == null){
            throw new SystemException(
                    "The device:" + location.getIdDevice() + " and sensor: " + location.getIdSensor()
                            + " has no relation on the database");
        }

        if (location.getTime() == null){
            throw new SystemException("location time cannot be null");
        }
    }

    public List<Location> getByRaceId(Long raceId)
            throws SystemException {
        return LocationUtil.findByraceId(raceId);
    }

    private static Log _log = LogFactoryUtil.getLog(LocationLocalServiceImpl.class);
}

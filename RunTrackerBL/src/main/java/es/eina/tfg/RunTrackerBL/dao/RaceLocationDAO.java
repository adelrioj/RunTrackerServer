package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.RaceConverter;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;
import es.eina.tfg.service.LocationLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RaceLocationDAO {

    public static RaceLocation insert(final long relatedIdRace, final RaceLocation location)
            throws SystemException {
        _log.info("Inserting location: " + location + " on race: " + relatedIdRace);
        es.eina.tfg.model.Location sbLocation = LocationLocalServiceUtil.addLocation(createSBLocation(relatedIdRace, location));
        return RaceConverter.toLocalRaceLocation(sbLocation);
    }

    public static List<RaceLocation> insertMany(final long relatedIdRace, final List<RaceLocation> locations)
            throws SystemException {
        List<RaceLocation> result = new ArrayList<RaceLocation>();
        for (RaceLocation location : locations) {
            result.add(insert(relatedIdRace, location));
        }
        return result;
    }

    private static es.eina.tfg.model.Location createSBLocation (final long relatedIdRace,
                                                                final es.eina.tfg.RunTrackerBL.entity.RaceLocation toConvert){
        es.eina.tfg.model.Location sbLocation = LocationLocalServiceUtil.createLocation(relatedIdRace, toConvert.getIdMeasurement());
        sbLocation.setIdDevice(toConvert.getIdDevice());
        sbLocation.setIdSensor(toConvert.getIdSensor());
        sbLocation.setTime(toConvert.getTime().toDate());
        sbLocation.setLatitude(toConvert.getLatitude());
        sbLocation.setLongitude(toConvert.getLongitude());
        sbLocation.setAltitude(toConvert.getElevation());
        return sbLocation;
    }

    public static List<RaceLocation> getByIdRace(long idRace)
            throws SystemException {
        List<es.eina.tfg.model.Location> sbLocations;

        try {
            sbLocations = LocationLocalServiceUtil.getByRaceId(idRace);
        } catch (SystemException e) {
            _log.error("SystemException while getByRaceId for id: " + idRace);
            throw e;
        }
        List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> localLocations =
                new ArrayList<es.eina.tfg.RunTrackerBL.entity.RaceLocation>();
        for (es.eina.tfg.model.Location sbLocation : sbLocations) {
            localLocations.add(RaceConverter.toLocalRaceLocation(sbLocation));
        }
        return localLocations;
    }

    private static Log _log = LogFactoryUtil.getLog(RaceLocationDAO.class);
}

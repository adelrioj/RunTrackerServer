package es.eina.tfg.RunTrackerBL.converter;

import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.RunTrackerBL.util.MathUtil;
import org.joda.time.DateTime;

import java.util.List;

public class RaceConverter {

    public static es.eina.tfg.RunTrackerBL.entity.Race toLocalRace(final es.eina.tfg.model.Race toConvert,
                                                                   final List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> locations){
        es.eina.tfg.RunTrackerBL.entity.Race localRace = new es.eina.tfg.RunTrackerBL.entity.Race();
        localRace.setIdRace(toConvert.getIdRace());
        localRace.setIdRoute(toConvert.getIdRoute());
        localRace.setIdUser(toConvert.getIdUser());
        localRace.setType(toConvert.getType());
        if (isLocationsNotEmpty(locations)) setLocationBasedProperties(locations, localRace);
        return localRace;
    }

    public static void setLocationBasedProperties(List<RaceLocation> locations, Race localRace) {
        localRace.setLocations(locations);
        setKeyLocations(localRace, locations);
    }

    public static es.eina.tfg.RunTrackerBL.entity.RaceLocation toLocalRaceLocation(es.eina.tfg.model.Location sbLocation) {
        es.eina.tfg.RunTrackerBL.entity.RaceLocation raceLocation = new es.eina.tfg.RunTrackerBL.entity.RaceLocation();

        raceLocation.setIdMeasurement(sbLocation.getIdMeasurement());
        raceLocation.setIdRace(sbLocation.getIdRace());
        raceLocation.setIdDevice(sbLocation.getIdDevice());
        raceLocation.setIdSensor(sbLocation.getIdSensor());
        raceLocation.setTime(new DateTime(sbLocation.getTime()));
        raceLocation.setSensorMode(sbLocation.getSensorMode());
        raceLocation.setSysRef(sbLocation.getSysRef());
        raceLocation.setLatitude(sbLocation.getLatitude());
        raceLocation.setLongitude(sbLocation.getLongitude());
        raceLocation.setSpeed(sbLocation.getSpeed());
        raceLocation.setDistance(sbLocation.getDistance());
        raceLocation.setElevation(sbLocation.getAltitude());

        return raceLocation;
    }

    private static boolean isLocationsNotEmpty(List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> locations) {
        return locations != null && !locations.isEmpty();
    }

    private static void setKeyLocations(es.eina.tfg.RunTrackerBL.entity.Race localRace,
                                        List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> locations) {
        localRace.setStartLocation(locations.get(0));
        localRace.setEndLocation(locations.get(locations.size() - 1));
        localRace.setDistanceInMeters(calculateDistanceInMeters(locations));
    }

    private static Double calculateDistanceInMeters(List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> locations){
        Double distance = 0d;
        for (int i=0; i < (locations.size() - 1); i++){
            distance += MathUtil.distance(locations.get(i), locations.get(i+1));
        }
        return distance;
    }
}

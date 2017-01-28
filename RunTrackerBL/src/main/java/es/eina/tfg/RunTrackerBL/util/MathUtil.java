package es.eina.tfg.RunTrackerBL.util;

import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;

public class MathUtil {

    /**
     * Radius of the earth
     */
    public static final int EARTH_RADIUS = 6371;

    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     *
     * @return Distance in Meters
     */
    public static double distance(RouteLocation location1, RouteLocation location2) {

        Double latDistance = Math.toRadians(location2.getLatitude() - location1.getLatitude());
        Double lonDistance = Math.toRadians(location2.getLongitude() - location1.getLongitude());
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(location1.getLatitude())) * Math.cos(Math.toRadians(location2.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS * c * 1000; // convert to meters

        double height = location1.getElevation() - location2.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    /**
     * Same as primary distace method, but applied to Race locations.
     */
    public static double distance(RaceLocation location1, RaceLocation location2) {
        Double latDistance = Math.toRadians(location2.getLatitude() - location1.getLatitude());
        Double lonDistance = Math.toRadians(location2.getLongitude() - location1.getLongitude());
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(location1.getLatitude())) * Math.cos(Math.toRadians(location2.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = EARTH_RADIUS * c * 1000; // convert to meters

        double height = location1.getElevation() - location2.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}

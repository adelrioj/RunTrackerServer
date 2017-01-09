package es.eina.tfg.RouteViewer.model.googlemapsapi;

import es.eina.tfg.RouteViewer.model.RouteLocation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil {

    /**
     * Rounds number to given decimals
     * @param  value number to round
     * @param places number of decimals
     * @return round number
     * @link http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
     */
    public static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException("places must be >= 0");

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    /*
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     *
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     * @returns Distance in Meters
     */
    public static double distance(RouteLocation location1, RouteLocation location2) {

        final int R = 6371; // Radius of the earth

        Double latDistance = Math.toRadians(location2.getLatitude() - location1.getLatitude());
        Double lonDistance = Math.toRadians(location2.getLongitude() - location1.getLongitude());
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(location1.getLatitude())) * Math.cos(Math.toRadians(location2.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = location1.getElevation() - location2.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}

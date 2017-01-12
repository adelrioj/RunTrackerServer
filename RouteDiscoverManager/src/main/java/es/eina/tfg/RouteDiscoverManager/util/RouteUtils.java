package es.eina.tfg.RouteDiscoverManager.util;

import es.eina.tfg.RouteDiscoverManager.model.Route;
import es.eina.tfg.RouteDiscoverManager.model.RouteLocation;
import es.eina.tfg.RouteDiscoverManager.model.googlemapsapi.LocationAPI;

import java.util.List;

public class RouteUtils {

    public static void setLocationBasedPRoperties(Route localRoute, List<RouteLocation> locations) {
        localRoute.setLocations(locations);

        localRoute.setStartLocation(locations.get(0));
        localRoute.setEndLocation(locations.get(locations.size() - 1));
        localRoute.setDistanceInMeters(LocationAPI.calculateDistanceInMeters(locations));

        RouteLocation minElevation = locations.get(0);
        RouteLocation maxElevation = locations.get(0);
        Double maxElevationDiff = 0d;

        for (int i = 1; i<locations.size(); i++){
            if (minElevation.getElevation() > locations.get(i).getElevation()){
                minElevation = locations.get(i);
            } else if (maxElevation.getElevation() < locations.get(i).getElevation()){
                maxElevation = locations.get(i);
            }

            Double elevationDiff = locations.get(i).getElevation() - locations.get(i-1).getElevation();
            if (maxElevationDiff < elevationDiff){
                maxElevationDiff = elevationDiff;
            }
        }
        localRoute.setMinElevation(minElevation);
        localRoute.setMaxElevation(maxElevation);
        localRoute.setMaxElevationDifference(maxElevationDiff);
    }
}

package es.eina.tfg.RouteDiscoverManager.model.googlemapsapi;

import es.eina.tfg.RouteDiscoverManager.model.RouteLocation;

import java.util.List;

/**
 * Utils to calculate different location parameters, such as elevation, using Google Maps API.
 *
 * @author adelrioj.
 */
public class LocationAPI{

    public static Double calculateDistanceInMeters(List<RouteLocation> locations){
        Double distance = 0d;
        for (int i=0; i < (locations.size() - 1); i++){
            distance += MathUtil.distance(locations.get(i), locations.get(i+1));
        }
        return distance;
    }
}

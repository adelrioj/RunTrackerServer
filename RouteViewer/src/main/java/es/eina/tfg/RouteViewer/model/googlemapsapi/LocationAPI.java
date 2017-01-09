package es.eina.tfg.RouteViewer.model.googlemapsapi;

import com.google.maps.ElevationApi;
import com.google.maps.model.ElevationResult;
import com.google.maps.model.LatLng;
import es.eina.tfg.RouteViewer.model.RouteLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Utils to calculate different location parameters, such as elevation, using Google Maps API.
 *
 * @author adelrioj.
 */
public class LocationAPI extends GoogleAuthenticationAPI {

    public static List<RouteLocation> getElevation(List<RouteLocation> locations)
            throws Exception {

        HashMap<LatLngEnhanced, RouteLocation> locationMap = new HashMap<LatLngEnhanced, RouteLocation>();

        LatLng[] latLngArrayToSend = new LatLng[locations.size()];
        for (int i = 0; i<locations.size(); i++){
            latLngArrayToSend[i] = toLatLng(locations.get(i));
            LatLngEnhanced key = toLatLngEnhanced(locations.get(i));
            locationMap.put(key, locations.get(i));
        }

        ElevationResult[] elevationResultArrayResponse =
                ElevationApi.getByPoints(context, latLngArrayToSend).await();

        List<RouteLocation> toReturn = new ArrayList<RouteLocation>();
        for (ElevationResult elevationResult : elevationResultArrayResponse) {
            RouteLocation routeLocation = locationMap.get(toLatLngEnhanced(elevationResult.location));
            routeLocation.setElevation(elevationResult.elevation);
            toReturn.add(routeLocation);
        }

        return toReturn;
    }

    public static Double calculateDistanceInMeters(List<RouteLocation> locations){
        Double distance = 0d;
        for (int i=0; i < (locations.size() - 1); i++){
            distance += MathUtil.distance(locations.get(i), locations.get(i+1));
        }
        return distance;
    }

    private static LatLng toLatLng(final RouteLocation location){
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    private static LatLngEnhanced toLatLngEnhanced(final RouteLocation location){
        return new LatLngEnhanced(location.getLatitude(), location.getLongitude());
    }

    private static LatLngEnhanced toLatLngEnhanced(final LatLng latLng){
        return new LatLngEnhanced(latLng.lat, latLng.lng);
    }
}

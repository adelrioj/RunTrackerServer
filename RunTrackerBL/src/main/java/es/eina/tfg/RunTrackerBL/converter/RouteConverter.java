package es.eina.tfg.RunTrackerBL.converter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;
import es.eina.tfg.RunTrackerBL.util.MathUtil;

import java.util.List;

public class RouteConverter {

    public static Route toLocalRoute(final es.eina.tfg.model.Route toConvert,
                                     final User author,
                                     final List<es.eina.tfg.RunTrackerBL.entity.RouteLocation> locations)
            throws PortalException, SystemException {
        Route localRoute = new Route();
        localRoute.setIdRoute(toConvert.getIdRoute());
        localRoute.setAuthor(author);
        localRoute.setType(toConvert.getType());
        localRoute.setName(toConvert.getName());
        localRoute.setDescription(toConvert.getDescription());
        localRoute.setPublic(toConvert.getIsPublic());
        if (isLocationsNotEmpty(locations)) setLocationBasedProperties(locations, localRoute);
        return localRoute;
    }

    public static void setLocationBasedProperties(List<RouteLocation> locations, Route localRoute) {
        localRoute.setLocations(locations);
        setKeyLocations(localRoute, locations);
        calculateElevationProperties(localRoute, locations);
    }

    public static RouteLocation toLocalRouteLocation(
            final es.eina.tfg.model.RouteLocation toConvert){
        RouteLocation location = new RouteLocation();
        location.setId(toConvert.getIdRouteLocation());
        location.setLongitude(toConvert.getLongitude());
        location.setLatitude(toConvert.getLatitude());
        location.setElevation(toConvert.getElevation());
        return location;
    }

    private static boolean isLocationsNotEmpty(List<RouteLocation> locations) {
        return locations != null && !locations.isEmpty();
    }

    private static void setKeyLocations(Route localRoute, List<RouteLocation> locations) {
        localRoute.setStartLocation(locations.get(0));
        localRoute.setEndLocation(locations.get(locations.size() - 1));
        localRoute.setDistanceInMeters(calculateDistanceInMeters(locations));
    }

    private static void calculateElevationProperties(Route localRoute, List<RouteLocation> locations) {
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

    private static Double calculateDistanceInMeters(List<RouteLocation> locations){
        Double distance = 0d;
        for (int i=0; i < (locations.size() - 1); i++){
            distance += MathUtil.distance(locations.get(i), locations.get(i+1));
        }
        return distance;
    }
}

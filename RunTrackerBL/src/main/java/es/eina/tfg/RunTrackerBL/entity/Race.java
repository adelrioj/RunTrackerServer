package es.eina.tfg.RunTrackerBL.entity;

import java.util.List;

public class Race {

    public static final String TYPE_RUNNING = Route.TYPE_RUNNING;
    public static final String TYPE_CYCLING = Route.TYPE_CYCLING;

    private Long idRace;
    private Long idUser;
    private Route route;
    private String type;

    private List<RaceLocation> locations;

    private Double distanceInMeters;
    private RaceLocation minElevation;
    private RaceLocation maxElevation;
    private Double maxElevationDifference;
    private RaceLocation startLocation;
    private RaceLocation endLocation;

    public Long getIdRace() {
        return idRace;
    }
    public void setIdRace(Long idRace) {
        this.idRace = idRace;
    }

    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public List<RaceLocation> getLocations() {
        return locations;
    }
    public void setLocations(List<RaceLocation> locations) {
        this.locations = locations;
    }

    public Double getDistanceInMeters() {
        return distanceInMeters;
    }
    public void setDistanceInMeters(Double distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public RaceLocation getMinElevation() {
        return minElevation;
    }
    public void setMinElevation(RaceLocation minElevation) {
        this.minElevation = minElevation;
    }

    public RaceLocation getMaxElevation() {
        return maxElevation;
    }
    public void setMaxElevation(RaceLocation maxElevation) {
        this.maxElevation = maxElevation;
    }

    public Double getMaxElevationDifference() {
        return maxElevationDifference;
    }
    public void setMaxElevationDifference(Double maxElevationDifference) {
        this.maxElevationDifference = maxElevationDifference;
    }

    public RaceLocation getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(RaceLocation startLocation) {
        this.startLocation = startLocation;
    }

    public RaceLocation getEndLocation() {
        return endLocation;
    }
    public void setEndLocation(RaceLocation endLocation) {
        this.endLocation = endLocation;
    }

    @Override
    public String toString() {
        return "Race{" +
                "idRace=" + idRace +
                ", idUser=" + idUser +
                ", route=" + route +
                ", type='" + type + '\'' +
                ", locations=" + locations +
                ", distanceInMeters=" + distanceInMeters +
                ", minElevation=" + minElevation +
                ", maxElevation=" + maxElevation +
                ", maxElevationDifference=" + maxElevationDifference +
                ", startLocation=" + startLocation +
                ", endLocation=" + endLocation +
                '}';
    }
}

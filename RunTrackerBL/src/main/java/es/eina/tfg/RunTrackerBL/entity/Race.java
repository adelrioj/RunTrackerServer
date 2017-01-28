package es.eina.tfg.RunTrackerBL.entity;

import java.util.List;

public class Race {

    public static final String TYPE_RUNNING = Route.TYPE_RUNNING;
    public static final String TYPE_CYCLING = Route.TYPE_CYCLING;

    private Long idRace;
    private Long idUser;
    private Long idRoute;
    private String type;

    private List<RaceLocation> locations;

    private Double distanceInMeters;
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

    public Long getIdRoute() {
        return idRoute;
    }
    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
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
                ", idRoute=" + idRoute +
                ", type='" + type + '\'' +
                ", locations=" + locations +
                ", distanceInMeters=" + distanceInMeters +
                ", startLocation=" + startLocation +
                ", endLocation=" + endLocation +
                '}';
    }
}

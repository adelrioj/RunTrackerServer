package es.eina.tfg.RouteDiscoverManager.model;

import com.liferay.portal.model.User;

import java.util.List;

public class Route {

    public static final String TYPE_RUNNING = "RUNNING";
    public static final String TYPE_CYCLING = "CYCLING";

    private Long idRoute;
    private User author;
    private String type;
    private String name;
    private String description;
    private Boolean publicRoute;

    private Double distanceInMeters;
    private RouteLocation minElevation;
    private RouteLocation maxElevation;
    private Double maxElevationDifference;
    private RouteLocation startLocation;
    private RouteLocation endLocation;

    private List<RouteLocation> locations;

    public Route() {
        distanceInMeters = 0d;
    }

    public Long getIdRoute() {
        return idRoute;
    }
    public void setIdRoute(Long idRoute) {
        this.idRoute = idRoute;
    }

    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean isPublic() {
        return publicRoute;
    }
    public void setPublic(Boolean aPublic) {
        publicRoute = aPublic;
    }

    public Boolean getPublicRoute() {
        return publicRoute;
    }
    public void setPublicRoute(Boolean publicRoute) {
        this.publicRoute = publicRoute;
    }

    public Double getDistanceInMeters() {
        return distanceInMeters;
    }
    public void setDistanceInMeters(Double distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public RouteLocation getMinElevation() {
        return minElevation;
    }
    public void setMinElevation(RouteLocation minElevation) {
        this.minElevation = minElevation;
    }

    public RouteLocation getMaxElevation() {
        return maxElevation;
    }
    public void setMaxElevation(RouteLocation maxElevation) {
        this.maxElevation = maxElevation;
    }

    public Double getMaxElevationDifference() {
        return maxElevationDifference;
    }

    public void setMaxElevationDifference(Double maxElevationDifference) {
        this.maxElevationDifference = maxElevationDifference;
    }

    public RouteLocation getStartLocation() {
        return startLocation;
    }
    public void setStartLocation(RouteLocation startLocation) {
        this.startLocation = startLocation;
    }

    public RouteLocation getEndLocation() {
        return endLocation;
    }
    public void setEndLocation(RouteLocation endLocation) {
        this.endLocation = endLocation;
    }

    public List<RouteLocation> getLocations() {
        return locations;
    }
    public void setLocations(List<RouteLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Route{" +
                "idRoute=" + idRoute +
                ", author=" + author +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", publicRoute=" + publicRoute +
                ", distanceInMeters=" + distanceInMeters +
                ", minElevation=" + minElevation +
                ", maxElevation=" + maxElevation +
                ", maxElevationDifference=" + maxElevationDifference +
                ", startLocation=" + startLocation +
                ", endLocation=" + endLocation +
                ", locations=" + locations +
                '}';
    }
}

package es.eina.tfg.RouteDiscoverManager.model;

public class RouteLocation {

    private Long id;
    private Double latitude;
    private Double longitude;
    private Double elevation;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getElevation() {
        return elevation;
    }
    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return "RouteLocation{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", elevation=" + elevation +
                '}';
    }
}

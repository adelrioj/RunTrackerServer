package es.eina.tfg.RouteViewer.model;

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

    private List<RouteLocation> locations;

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
                ", isPublic=" + publicRoute +
                ", locations=" + locations +
                '}';
    }
}

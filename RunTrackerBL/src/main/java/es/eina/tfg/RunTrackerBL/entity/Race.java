package es.eina.tfg.RunTrackerBL.entity;

import java.util.List;

public class Race {

    private Long idRace;
    private Long idUser;
    private Long idRoute;
    private String type;

    private List<RaceLocation> locations;

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

    @Override
    public String toString() {
        return "Race{" +
                "idRace=" + idRace +
                ", idUser=" + idUser +
                ", idRoute=" + idRoute +
                ", type='" + type + '\'' +
                ", locations=" + locations +
                '}';
    }
}

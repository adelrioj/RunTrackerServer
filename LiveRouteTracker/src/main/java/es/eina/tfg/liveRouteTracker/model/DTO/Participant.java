package es.eina.tfg.liveRouteTracker.model.DTO;

import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;

public class Participant {

    private Long idUser;
    private String name;
    private Integer participationNumber;

    private UserAndEvent userAndEvent;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParticipationNumber() {
        return participationNumber;
    }

    public void setParticipationNumber(Integer participationNumber) {
        this.participationNumber = participationNumber;
    }

    public UserAndEvent getUserAndEvent() {
        return userAndEvent;
    }

    public void setUserAndEvent(UserAndEvent userAndEvent) {
        this.userAndEvent = userAndEvent;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", participationNumber=" + participationNumber +
                '}';
    }
}

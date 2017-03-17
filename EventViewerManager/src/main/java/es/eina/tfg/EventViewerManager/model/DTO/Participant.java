package es.eina.tfg.EventViewerManager.model.DTO;

public class Participant {

    private Long idUser;
    private String name;
    private Integer participationNumber;

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

    @Override
    public String toString() {
        return "Participant{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", participationNumber=" + participationNumber +
                '}';
    }
}

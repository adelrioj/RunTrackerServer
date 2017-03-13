package es.eina.tfg.EventDiscoverManager.model.DTO;

import org.joda.time.DateTime;

public class FullcalendarEventRequest {

    private DateTime start;
    private DateTime end;
    private Long idUser;
    private String contextPath;

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public String toString() {
        return "FullcalendarEventRequest{" +
                "start=" + start +
                ", end=" + end +
                ", idUser=" + idUser +
                ", contextPath='" + contextPath + '\'' +
                '}';
    }
}

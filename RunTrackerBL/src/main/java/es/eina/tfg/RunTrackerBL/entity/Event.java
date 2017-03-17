package es.eina.tfg.RunTrackerBL.entity;

import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.entity.Route;
import org.joda.time.DateTime;

import java.util.Date;

public class Event {

    private Long idEvent;

    private Route route;
    private User author;

    private String name;
    private DateTime plannedStartTime;
    private DateTime plannedFinishTime;
    private DateTime realStartTime;
    private DateTime realFinishTime;

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(DateTime plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public DateTime getPlannedFinishTime() {
        return plannedFinishTime;
    }

    public void setPlannedFinishTime(DateTime plannedFinishTime) {
        this.plannedFinishTime = plannedFinishTime;
    }

    public DateTime getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(DateTime realStartTime) {
        this.realStartTime = realStartTime;
    }

    public DateTime getRealFinishTime() {
        return realFinishTime;
    }

    public void setRealFinishTime(DateTime realFinishTime) {
        this.realFinishTime = realFinishTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "idEvent=" + idEvent +
                ", route=" + route +
                ", author=" + author +
                ", name='" + name + '\'' +
                ", plannedStartTime=" + plannedStartTime +
                ", plannedFinishTime=" + plannedFinishTime +
                ", realStartTime=" + realStartTime +
                ", realFinishTime=" + realFinishTime +
                '}';
    }
}

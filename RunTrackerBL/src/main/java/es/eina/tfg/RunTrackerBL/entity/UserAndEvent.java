package es.eina.tfg.RunTrackerBL.entity;

import com.liferay.portal.model.User;

public class UserAndEvent {

    private User participant;
    private Event event;
    private Race race;

    public User getParticipant() {
        return participant;
    }

    public void setParticipant(User participant) {
        this.participant = participant;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "UserAndEvent{" +
                "participant=" + participant +
                ", event=" + event +
                ", race=" + race +
                '}';
    }
}

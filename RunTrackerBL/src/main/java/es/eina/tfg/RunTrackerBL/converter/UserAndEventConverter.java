package es.eina.tfg.RunTrackerBL.converter;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;

public class UserAndEventConverter {
    public static UserAndEvent convert(es.eina.tfg.model.UserAndEvent sbUserAndEvent, Event event, User participant, Race race)
            throws PortalException, SystemException {
        if (sbUserAndEvent == null) return null;

        UserAndEvent localUserAndEvent = new UserAndEvent();
        localUserAndEvent.setEvent(event);
        localUserAndEvent.setParticipant(participant);
        localUserAndEvent.setRace(race);
        localUserAndEvent.setParticipationNumber(sbUserAndEvent.getParticipationNumber());
        return localUserAndEvent;
    }
}

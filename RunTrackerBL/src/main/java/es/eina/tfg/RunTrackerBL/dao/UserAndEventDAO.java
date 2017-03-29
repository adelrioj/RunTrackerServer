package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.RunTrackerBL.converter.UserAndEventConverter;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class UserAndEventDAO {

    public static UserAndEvent addParticipation(Long idUser, Long idEvent)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAndEvent sbUserAndEvent =
                UserAndEventLocalServiceUtil.addUserAndEvent(idUser, idEvent);
        return convert(sbUserAndEvent);
    }

    public static UserAndEvent update(UserAndEvent toUpdate)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAndEvent sbUserAndEvent =
                UserAndEventLocalServiceUtil.getById(toUpdate.getParticipant().getUserId(), toUpdate.getEvent().getIdEvent());
        sbUserAndEvent.setIdRace(toUpdate.getRace().getIdRace());
        sbUserAndEvent.setParticipationNumber(toUpdate.getParticipationNumber());
        sbUserAndEvent = UserAndEventLocalServiceUtil.updateUserAndEvent(sbUserAndEvent);
        return convert(sbUserAndEvent);
    }

    public static UserAndEvent deleteUserAndEvent(Long idEvent, Long idUser)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAndEvent sbUserAndEvent =
                UserAndEventLocalServiceUtil.deleteUserAndEvent(idEvent, idUser);
        return convert(sbUserAndEvent);
    }

    public static List<UserAndEvent> getByIdEventAndName(Long idEvent, String name)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.UserAndEvent> sbUserAndEvents =
                UserAndEventLocalServiceUtil.getByIdEventAndName(idEvent, name);
        return convertList(sbUserAndEvents);
    }

    public static List<UserAndEvent> getByIdEventAndName(Long idEvent, String name, int start, int end, OrderByComparator orderByComparator)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.UserAndEvent> sbUserAndEvents =
                UserAndEventLocalServiceUtil.getByIdEventAndName(idEvent, name, start, end, orderByComparator);
        return convertList(sbUserAndEvents);
    }

    public static UserAndEvent getById(Long idEvent, Long idUser)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAndEvent sbUserAndEvent = UserAndEventLocalServiceUtil.getById(idUser, idEvent);
        return convert(sbUserAndEvent);
    }

    public static List<UserAndEvent> getByIdEvent(Long idEvent)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.UserAndEvent> sbUserAndEvens = UserAndEventLocalServiceUtil.getByidEvent(idEvent);

        List<UserAndEvent> localUserAndEvents = new ArrayList<UserAndEvent>();
        for (es.eina.tfg.model.UserAndEvent sbUserAndEven : sbUserAndEvens) {
            UserAndEvent localUserAndEvent = convert(sbUserAndEven);
            localUserAndEvents.add(localUserAndEvent);
        }
        return localUserAndEvents;
    }

    private static List<UserAndEvent> convertList(List<es.eina.tfg.model.UserAndEvent> sbUserAndEvents)
            throws PortalException, SystemException {
        List<UserAndEvent> userAndEvents = new ArrayList<UserAndEvent>();
        for (es.eina.tfg.model.UserAndEvent sbUserAndEvent : sbUserAndEvents) {
            userAndEvents.add(convert(sbUserAndEvent));
        }
        return userAndEvents;
    }

    private static UserAndEvent convert(es.eina.tfg.model.UserAndEvent sbUserAndEvent)
            throws PortalException, SystemException {
        User participant = UserLocalServiceUtil.getUser(sbUserAndEvent.getIdUser());
        Event event = EventDAO.getByIdEvent(sbUserAndEvent.getIdEvent());
        Race race = (sbUserAndEvent.getIdRace() != 0) ? RaceDAO.getByIdRace(sbUserAndEvent.getIdRace()) : null;
        return UserAndEventConverter.convert(sbUserAndEvent, event, participant, race);
    }
}

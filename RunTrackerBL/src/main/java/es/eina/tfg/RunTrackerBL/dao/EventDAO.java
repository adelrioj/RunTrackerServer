package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.RunTrackerBL.converter.EventConverter;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class EventDAO {

    public static Event insert(Event toInsert)
            throws SystemException {
        _log.info("Inserting event: " + toInsert);

        Long sbEventId = EventLocalServiceUtil.generateNewIdEvent();
        es.eina.tfg.model.Event sbEvent = EventLocalServiceUtil.createEvent(sbEventId);
        sbEvent.setName(toInsert.getName());
        sbEvent.setIdAuthor(toInsert.getAuthor().getUserId());
        sbEvent.setIdRoute(toInsert.getRoute().getIdRoute());
        sbEvent.setPlannedStartingTime(toInsert.getPlannedStartTime().toDate());
        sbEvent.setPlannedFinishTime(toInsert.getPlannedFinishTime().toDate());
        sbEvent.setRealStartingTime(null);
        sbEvent.setRealFinishTime(null);

        sbEvent = EventLocalServiceUtil.addEvent(sbEvent);

        return EventConverter.convert(sbEvent, toInsert.getRoute(), toInsert.getAuthor());
    }

    public static Event update(Event toUpdate)
            throws SystemException, PortalException {
        _log.info("Updating event: " + toUpdate);

        es.eina.tfg.model.Event sbEvent = EventLocalServiceUtil.getEvent(toUpdate.getIdEvent());

        sbEvent.setIdRoute(toUpdate.getRoute().getIdRoute());
        sbEvent.setIdAuthor(toUpdate.getAuthor().getUserId());

        sbEvent.setName(toUpdate.getName());
        sbEvent.setPlannedStartingTime(toUpdate.getPlannedStartTime().toDate());
        sbEvent.setPlannedFinishTime(toUpdate.getPlannedFinishTime().toDate());
        if (toUpdate.getRealStartTime() != null){
            sbEvent.setRealStartingTime(toUpdate.getRealStartTime().toDate());
        }
        if (toUpdate.getRealFinishTime() != null){
            sbEvent.setRealFinishTime(toUpdate.getRealFinishTime().toDate());
        }

        sbEvent = EventLocalServiceUtil.updateEvent(sbEvent);

        return EventConverter.convert(sbEvent, toUpdate.getRoute(), toUpdate.getAuthor());
    }

    public static void deleteUserAndEvent(Long idEvent, Long idUser)
            throws SystemException, PortalException {
        UserAndEventLocalServiceUtil.deleteUserAndEvent(idEvent, idUser);
    }

    public static List<Event> getByPlannedStartTime(DateTime plannedStartTime,
                                                    int start,
                                                    int end,
                                                    OrderByComparator comparator)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Event> sbEvents =  EventLocalServiceUtil.getByPlannedStartTime(plannedStartTime.toDate(), start, end, comparator);
        List<Event> localEvents = new ArrayList<Event>();
        for (es.eina.tfg.model.Event sbEvent : sbEvents) {
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            User author = UserLocalServiceUtil.getUserById(sbEvent.getIdAuthor());
            localEvents.add(EventConverter.convert(sbEvent, route, author));
        }
        return localEvents;
    }



    public static List<Event> getByIdUserAndTimeRange(long idUser,
                                                      DateTime startPlannedStartingTime,
                                                      DateTime endPlannedStartingTime,
                                                      int start,
                                                      int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Event> sbEvents = EventLocalServiceUtil.getByIdUserAndTimeRange(idUser,
                startPlannedStartingTime.toDate(), endPlannedStartingTime.toDate(), start, end);

        User user = UserLocalServiceUtil.getUser(idUser);

        List<Event> localEvents = new ArrayList<Event>();
        for (es.eina.tfg.model.Event sbEvent : sbEvents) {
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            localEvents.add(EventConverter.convert(sbEvent, route, user));
        }
        return localEvents;
    }

    public static List<Event> getUnselectedEventsByIdUserAndTimeRange(long idUser,
                                                                      DateTime startPlannedStartingTime,
                                                                      DateTime endPlannedStartingTime,
                                                                      int start,
                                                                      int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Event> sbEvents = EventLocalServiceUtil
                .getUnselectedEventsByIdUserAndTimeRange(idUser, startPlannedStartingTime.toDate(),
                        endPlannedStartingTime.toDate(), start, end);

        User user = UserLocalServiceUtil.getUser(idUser);

        List<Event> localEvents = new ArrayList<Event>();
        for (es.eina.tfg.model.Event sbEvent : sbEvents) {
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            localEvents.add(EventConverter.convert(sbEvent, route, user));
        }
        return localEvents;
    }

    public static Event getByIdEvent(Long idEvent)
            throws SystemException, PortalException {
        es.eina.tfg.model.Event sbEvent = EventLocalServiceUtil.getEvent(idEvent);
        Event localEvent = null;
        if (sbEvent != null){
            User author = UserLocalServiceUtil.getUser(sbEvent.getIdAuthor());
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            localEvent = EventConverter.convert(sbEvent, route, author);
        }
        return localEvent;
    }

    public static Event getLastEvent(Long idUser)
            throws SystemException, PortalException {
        Event localEvent = null;

        es.eina.tfg.model.Event sbEvent = EventLocalServiceUtil.getLastEvent(idUser);
        if (sbEvent != null){
            User author = UserLocalServiceUtil.getUser(sbEvent.getIdAuthor());
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            localEvent = EventConverter.convert(sbEvent, route, author);
        }
        return localEvent;
    }

    public static Event getLastUnselectedEvent(Long idUser)
            throws SystemException, PortalException {
        Event localEvent = null;

        es.eina.tfg.model.Event sbEvent = EventLocalServiceUtil.getLastUnselectedEvent(idUser);
        if (sbEvent != null){
            User author = UserLocalServiceUtil.getUser(sbEvent.getIdAuthor());
            Route route = RouteDAO.getByIdRoute(sbEvent.getIdRoute());
            localEvent = EventConverter.convert(sbEvent, route, author);
        }
        return localEvent;
    }

    public static List<UserAndEvent> getParticipants(Long idEvent,
                                                     String name,
                                                     int start,
                                                     int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.UserAndEvent> sbUserAndEvents = EventLocalServiceUtil.getUserAndEventByIdEvent(idEvent, name, start, end);
        List<UserAndEvent> userAndEvents = new ArrayList<UserAndEvent>();
        for (es.eina.tfg.model.UserAndEvent sbUserAndEvent : sbUserAndEvents) {
            userAndEvents.add(convertUserAndEvent(sbUserAndEvent));
        }
        return userAndEvents;
    }

    public static UserAndEvent addParticipation(Long idUser, Long idEvent)
            throws SystemException, PortalException {
        es.eina.tfg.model.UserAndEvent sbUserAndEvent = UserAndEventLocalServiceUtil.addUserAndEvent(idUser, idEvent);
        return convertUserAndEvent(sbUserAndEvent);
    }

    private static UserAndEvent convertUserAndEvent(es.eina.tfg.model.UserAndEvent sbUserAndEvent)
            throws PortalException, SystemException {
        if (sbUserAndEvent == null) return null;

        User participant = UserLocalServiceUtil.getUser(sbUserAndEvent.getIdUser());
        Event event = getByIdEvent(sbUserAndEvent.getIdEvent());
        Race race = null;
        if (sbUserAndEvent.getIdRace() != 0 ) {
            race = RaceDAO.getByIdRace(sbUserAndEvent.getIdRace());
        }

        UserAndEvent localUserAndEvent = new UserAndEvent();
        localUserAndEvent.setEvent(event);
        localUserAndEvent.setParticipant(participant);
        localUserAndEvent.setRace(race);

        return localUserAndEvent;
    }

    private static Log _log = LogFactoryUtil.getLog(EventDAO.class);
}

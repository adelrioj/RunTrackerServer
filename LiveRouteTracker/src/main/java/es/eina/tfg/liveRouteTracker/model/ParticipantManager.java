package es.eina.tfg.liveRouteTracker.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.RunTrackerBL.dao.RaceDAO;
import es.eina.tfg.RunTrackerBL.dao.RaceLocationDAO;
import es.eina.tfg.RunTrackerBL.dao.UserAndEventDAO;
import es.eina.tfg.RunTrackerBL.entity.*;
import es.eina.tfg.liveRouteTracker.model.DTO.Participant;
import es.eina.tfg.liveRouteTracker.model.DTO.ParticipantDisplayTerms;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParticipantManager {

    public static void addParticipantRaceSampleData(Long idEvent)
            throws SystemException, PortalException {
        List<Participant> participants = getParticipants(idEvent);

        for (Participant participant : participants) {

            Route routeToAdd = participant.getUserAndEvent().getEvent().getRoute();

            Race race = new Race();
            race.setIdUser(participant.getIdUser());
            race.setRoute(routeToAdd);
            race.setType(routeToAdd.getType());

            List<RaceLocation> raceLocations = new ArrayList<RaceLocation>();
            DateTime start = participant.getUserAndEvent().getEvent().getRealStartTime();
            for (int i = 0; i < routeToAdd.getLocations().size()/2 + participant.getParticipationNumber(); i++){
                RouteLocation routeLocation = routeToAdd.getLocations().get(i);

                RaceLocation raceLocation = new RaceLocation();
                raceLocation.setIdMeasurement(routeLocation.getId());
                raceLocation.setIdDevice(1L);
                raceLocation.setIdSensor(1L);
                raceLocation.setTime(start);
                raceLocation.setLatitude(routeLocation.getLatitude());
                raceLocation.setLongitude(routeLocation.getLongitude());
                raceLocation.setElevation(routeLocation.getElevation());
                raceLocations.add(raceLocation);

                start = start.plusSeconds(10);
            }
            race.setLocations(raceLocations);

            Race inserted = RaceDAO.insert(race);
            RaceLocationDAO.insertMany(inserted.getIdRace(), raceLocations);

            UserAndEvent toUpdate = participant.getUserAndEvent();
            toUpdate.setRace(inserted);
            UserAndEventDAO.update(toUpdate);
        }
    }

    public static List<Participant> getParticipantsByDisplayTerms(ParticipantDisplayTerms displayTerms,
                                                                  int start,
                                                                  int end,
                                                                  OrderByComparator orderByComparator) {
        _log.info("Starting getParticipantsByDisplayTerms for ParticipantDisplayTerms: " + displayTerms);

        Long idEvent = displayTerms.getIdEvent();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        List<Participant> participants = Collections.emptyList();
        try {
            List<UserAndEvent> userAndEvents = UserAndEventDAO.getByIdEventAndName(idEvent, name, start, end, orderByComparator);
            participants = convertList(userAndEvents);
        } catch (SystemException e) {
            _log.error("SystemException throwed for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for: " + displayTerms, e);
        }

        return participants;
    }

    public static int getParticipantsByDisplayTermsCount(ParticipantDisplayTerms displayTerms) {
        _log.info("Starting getParticipantsByDisplayTerms for ParticipantDisplayTerms: " + displayTerms);

        Long idEvent = displayTerms.getIdEvent();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        List<UserAndEvent> userAndEvents = Collections.emptyList();
        try {
            userAndEvents = UserAndEventDAO.getByIdEventAndName(idEvent, name);
        } catch (SystemException e) {
            _log.error("SystemException throwed for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for: " + displayTerms, e);
        }

        return userAndEvents.size();
    }

    public static List<Participant> getParticipants(Long idEvent){
        List<Participant> participants = Collections.emptyList();
        try {
            List<UserAndEvent> userAndEvents = UserAndEventDAO.getByIdEvent(idEvent);
            participants = convertList(userAndEvents);
        } catch (SystemException e) {
            _log.error("SystemException throwed for idEvent: " + idEvent, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for idEvent: " + idEvent, e);
        }
        return participants;
    }

    public static Participant getById(Long idEvent, Long idParticipant) {
        Participant participant = null;
        try {
            UserAndEvent userAndEvent = UserAndEventDAO.getById(idEvent, idParticipant);
            participant = convert(userAndEvent);
        } catch (SystemException e) {
            _log.error("SystemException throwed for idEvent: " + idEvent + " idParticipant: " + idParticipant, e);
        } catch (PortalException e) {
            _log.error("PortalException throwed for idEvent: " + idEvent + " idParticipant: " + idParticipant, e);
        }
        return participant;
    }

    private static List<Participant>  convertList(List<UserAndEvent> userAndEvents) {
        List<Participant> participants = new ArrayList<Participant>();
        for (UserAndEvent userAndEvent : userAndEvents) {
            Participant participant = convert(userAndEvent);
            participants.add(participant);
        }
        return participants;
    }

    private static Participant convert(UserAndEvent userAndEvent) {
        Participant participant = new Participant();
        participant.setIdUser(userAndEvent.getParticipant().getUserId());
        participant.setName(userAndEvent.getParticipant().getFullName());
        participant.setParticipationNumber(userAndEvent.getParticipationNumber());
        participant.setUserAndEvent(userAndEvent);
        return participant;
    }

    private static Log _log = LogFactoryUtil.getLog(ParticipantManager.class);
}

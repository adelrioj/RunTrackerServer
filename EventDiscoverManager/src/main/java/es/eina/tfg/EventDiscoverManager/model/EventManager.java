package es.eina.tfg.EventDiscoverManager.model;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.EventDiscoverManager.exception.UnableToObtainEventException;
import es.eina.tfg.EventDiscoverManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.EventDiscoverManager.exception.UnableToProcessActionException;
import es.eina.tfg.EventDiscoverManager.model.DTO.FullcalendarEventRequest;
import es.eina.tfg.EventDiscoverManager.model.DTO.FullcalendarEventResponse;
import es.eina.tfg.RunTrackerBL.dao.EventDAO;
import es.eina.tfg.RunTrackerBL.dao.RouteDAO;
import es.eina.tfg.RunTrackerBL.dao.UserAndEventDAO;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.RunTrackerBL.entity.UserAndEvent;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventManager {

    private static final DateTimeFormatter YEAR_TO_DAY_FORMATTER = DateTimeFormat.forPattern(WebKeys.TODAY_DATE_PATTERN);

    public static List getDisponibleMonthRacesAsEvents(FullcalendarEventRequest eventRequest)
            throws UnableToParseJSONDataException {
        if (eventRequest.getStart() == null){
            eventRequest.setStart(DateTime.now().dayOfMonth().withMinimumValue());
        }
        if (eventRequest.getEnd() == null){
            eventRequest.setEnd(DateTime.now().dayOfMonth().withMaximumValue());
        }

        List events = Collections.emptyList();
        try {
            List<Event> toConvert =
                    EventDAO.getUnselectedEventsByIdUserAndTimeRange(
                            eventRequest.getIdUser(),
                            eventRequest.getStart(),
                            eventRequest.getEnd(),
                            QueryUtil.ALL_POS, QueryUtil.ALL_POS);
            events = convert(toConvert, eventRequest.getContextPath());
        } catch (IOException e) {
            _log.error("IOException while convert for: " + eventRequest, e);
            throw new UnableToParseJSONDataException(e);
        } catch (SystemException e) {
            _log.error("IOException while getByIdUserAndDate for: " + eventRequest, e);
            throw new UnableToParseJSONDataException(e);
        } catch (PortalException e) {
            e.printStackTrace();
        }
        return events;
    }

    public static Event getSelectedEvent(Long idEvent, Long idUser)
            throws UnableToObtainEventException{
        Event event;
        if (idEvent == null || idEvent == 0){
            event = getLastUnselectedEvent(idUser);
        } else {
            event = getByIdEvent(idEvent);
        }
        return event;
    }

    public static UserAndEvent addParticipation(Long idUser, Long idEvent) throws UnableToProcessActionException {
        try {
            return UserAndEventDAO.addParticipation(idUser, idEvent);
        } catch (SystemException e) {
            throw new UnableToProcessActionException(e);
        } catch (PortalException e) {
            throw new UnableToProcessActionException(e);
        }
    }

    private static Event getByIdEvent(Long idEvent)
            throws UnableToObtainEventException {
        try {
            return EventDAO.getByIdEvent(idEvent);
        } catch (SystemException e) {
            throw new UnableToObtainEventException(e);
        } catch (PortalException e) {
            throw new UnableToObtainEventException(e);
        }
    }

    private static Event getLastUnselectedEvent(Long idUser)
            throws UnableToObtainEventException {
        try {
            return EventDAO.getLastUnselectedEvent(idUser);
        } catch (SystemException e) {
            throw new UnableToObtainEventException(e);
        } catch (PortalException e) {
            throw new UnableToObtainEventException(e);
        }
    }

    private static List<FullcalendarEventResponse> convert(List<Event> races, String imageNamespace)
            throws IOException {
        List<FullcalendarEventResponse> calendarDTOList = new ArrayList<FullcalendarEventResponse>();
        for (Event event : races) {
            FullcalendarEventResponse calendar = new FullcalendarEventResponse();
            calendar.setId(String.valueOf(event.getIdEvent()));
            calendar.setTitle(event.getName());
            calendar.setStart(YEAR_TO_DAY_FORMATTER.print(event.getPlannedStartTime()));
            calendar.setEnd(YEAR_TO_DAY_FORMATTER.print(event.getPlannedFinishTime()));
            calendar.setBorderColor("darkgray");
            calendar.setBackgroundColor("lightgray");
            calendar.setTextColor("black");
            calendar.setIconURL(imageNamespace + "/images/icon_event.png");

            calendarDTOList.add(calendar);
        }
        return calendarDTOList;
    }

    private static Log _log = LogFactoryUtil.getLog(EventManager.class);
}

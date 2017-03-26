package es.eina.tfg.EventViewerManager.model;

import com.liferay.docs.route.util.WebKeys;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.EventViewerManager.exception.UnableToObtainEventException;
import es.eina.tfg.EventViewerManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.EventViewerManager.exception.UnableToProcessActionException;
import es.eina.tfg.EventViewerManager.model.DTO.FullcalendarEventRequest;
import es.eina.tfg.EventViewerManager.model.DTO.FullcalendarEventResponse;
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

    private static final DateTimeFormatter FULL_TIME_FORMATTER = DateTimeFormat.forPattern(WebKeys.ADDEVENT_DATE_FORMAT);
    private static final DateTimeFormatter YEAR_TO_DAY_FORMATTER = DateTimeFormat.forPattern(WebKeys.TODAY_DATE_PATTERN);

    public static Event insert(String name,
                               String startDate, String startTime,
                               String endDate, String endTime,
                               Long idRoute,
                               User author)
            throws SystemException, PortalException {
        Event toInsert = new Event();
        toInsert.setName(name);
        toInsert.setRoute(RouteDAO.getByIdRoute(idRoute));
        toInsert.setAuthor(author);
        toInsert.setPlannedStartTime(getDateTime(startDate, startTime));
        toInsert.setPlannedFinishTime(getDateTime(endDate, endTime));

        return EventDAO.insert(toInsert);
    }

    public static Event startEvent(Long idEvent)
            throws UnableToProcessActionException {
        try {
            Event event = EventDAO.getByIdEvent(idEvent);
            event.setRealStartTime(DateTime.now());
            event.setRealFinishTime(null);
            return EventDAO.update(event);
        } catch (SystemException e) {
            throw new UnableToProcessActionException(e);
        } catch (PortalException e) {
            throw new UnableToProcessActionException(e);
        }
    }

    public static Event finishEvent(Long idEvent)
            throws UnableToProcessActionException {
        try {
            Event event = EventDAO.getByIdEvent(idEvent);
            event.setRealFinishTime(DateTime.now());
            return EventDAO.update(event);
        } catch (SystemException e) {
            throw new UnableToProcessActionException(e);
        } catch (PortalException e) {
            throw new UnableToProcessActionException(e);
        }
    }

    public static void deleteParticipation(Long idEvent, Long idUser)
            throws UnableToProcessActionException {
        if (idEvent != null && idEvent != 0 && idUser != null && idUser != 0){
            try {
                UserAndEventDAO.deleteUserAndEvent(idEvent, idUser);
            } catch (SystemException e) {
                throw new UnableToProcessActionException(e);
            } catch (PortalException e) {
                throw new UnableToProcessActionException(e);
            }
        }
    }

    public static List getMonthRacesAsEvents(FullcalendarEventRequest eventRequest)
            throws UnableToParseJSONDataException {
        if (eventRequest.getStart() == null){
            eventRequest.setStart(DateTime.now().dayOfMonth().withMinimumValue());
        }
        if (eventRequest.getEnd() == null){
            eventRequest.setEnd(DateTime.now().dayOfMonth().withMaximumValue());
        }

        List events = Collections.emptyList();
        try {
            List<Event> toConvert = EventDAO.getByIdUserAndTimeRange(eventRequest.getIdUser(),
                    eventRequest.getStart(), eventRequest.getEnd(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
            event = getLastEvent(idUser);
        } else {
            event = getByIdEvent(idEvent);
        }
        return event;
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

    private static Event getLastEvent(Long idUser)
            throws UnableToObtainEventException {
        try {
            return EventDAO.getLastEvent(idUser);
        } catch (SystemException e) {
            throw new UnableToObtainEventException(e);
        } catch (PortalException e) {
            throw new UnableToObtainEventException(e);
        }
    }

    private static DateTime getDateTime(String date, String time) {
        return FULL_TIME_FORMATTER.parseDateTime((date + " " + time).trim());
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

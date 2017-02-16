package es.eina.tfg.TrainingManager.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import es.eina.tfg.RunTrackerBL.dao.RaceDAO;
import es.eina.tfg.RunTrackerBL.dao.RaceLocationDAO;
import es.eina.tfg.RunTrackerBL.dao.RouteDAO;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;
import es.eina.tfg.TrainingManager.exception.UnableToDeleteRaceException;
import es.eina.tfg.TrainingManager.exception.UnableToObtainRaceException;
import es.eina.tfg.TrainingManager.exception.UnableToParseJSONDataException;
import es.eina.tfg.TrainingManager.model.DTO.FullcalendarEventRequest;
import es.eina.tfg.TrainingManager.model.DTO.FullcalendarEventResponse;
import es.eina.tfg.TrainingManager.model.converter.FullcalendarConverter;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrainingManager {

    public static final DateTimeFormatter YEAR_TO_DAY_DTFORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");

    public static void addSampleData(User user)
            throws PortalException, SystemException {
        List<Route> routes = RouteDAO.getByIdUserAndName(user.getUserId(), "", 0, 999);

        DateTime start = new DateTime().withYear(2017).withMonthOfYear(1).withDayOfMonth(1);
        DateTime end = new DateTime().withYear(2017).withMonthOfYear(2).withDayOfMonth(15);

        int routesIndex = 0;
        while (start.isBefore(end)){

            Route routeToAdd = routes.get(routesIndex);

            Race race = new Race();
            race.setIdUser(user.getUserId());
            race.setRoute(routeToAdd);
            race.setType(routeToAdd.getType());

            List<RaceLocation> raceLocations = new ArrayList<RaceLocation>();
            start = start.withHourOfDay(8).withMinuteOfHour(1).withSecondOfMinute(1);
            for (int i = 0; i < routeToAdd.getLocations().size()/2; i++){
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


            start = start.plusDays(1);
            routesIndex = routesIndex == routes.size() - 1 ? 0 : routesIndex + 1;
        }
    }

    public static void deleteRace(Long idRace)
            throws UnableToDeleteRaceException {
        try {
            RaceDAO.delete(idRace);
        } catch (SystemException e) {
            throw new UnableToDeleteRaceException(e);
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

        List events;
        try {
            List<Race> races = RaceDAO.getByIdUserAndDate(eventRequest.getIdUser(),
                    eventRequest.getStart(), eventRequest.getEnd(), 0, 999);
            events = convert(races, eventRequest.getContextPath());
        } catch (IOException e) {
            _log.error("IOException while convert for: " + eventRequest, e);
            throw new UnableToParseJSONDataException(e);
        } catch (SystemException e) {
            _log.error("IOException while getByIdUserAndDate for: " + eventRequest, e);
            throw new UnableToParseJSONDataException(e);
        }
        return events;
    }

    public static String getTodayDateAsString(){
        return YEAR_TO_DAY_DTFORMATTER.print(DateTime.now());
    }

    public static Race getSelectedRace(Long idRace, Long idUser)
            throws UnableToObtainRaceException {
        Race race;
        if (idRace == null || idRace == 0){
            race = getLastRace(idUser);
        } else {
            race = getByIdRace(idRace);
        }
        return race;
    }

    private static Race getLastRace(Long idUser)
            throws UnableToObtainRaceException {
        try {
            return RaceDAO.getLastRace(idUser);
        } catch (SystemException e) {
            throw new UnableToObtainRaceException(e);
        }
    }

    private static Race getByIdRace(Long idRace)
            throws UnableToObtainRaceException {
        try {
            return RaceDAO.getByIdRace(idRace);
        } catch (SystemException e) {
            throw new UnableToObtainRaceException(e);
        } catch (PortalException e) {
            throw new UnableToObtainRaceException(e);
        }
    }

    private static List<FullcalendarEventResponse> convert(List<Race> races, String imageNamespace)
            throws IOException {
        List<FullcalendarEventResponse> calendarDTOList = new ArrayList<FullcalendarEventResponse>();
        for (Race race : races) {
            FullcalendarEventResponse calendar =
                    FullcalendarConverter.convert(race,
                            "white",
                            "white",
                            "white",
                            imageNamespace + "/images/icon_race.png");
            calendarDTOList.add(calendar);
        }
        return calendarDTOList;
    }

    private static Log _log = LogFactoryUtil.getLog(TrainingManager.class);
}

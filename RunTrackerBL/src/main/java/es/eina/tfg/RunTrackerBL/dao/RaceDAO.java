package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.RaceConverter;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.persistence.LocationPK;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RaceDAO {

    public static Race insert(Race race)
            throws SystemException {
        _log.info("Inserting: " + race);
        es.eina.tfg.model.Race toInsert = createSbRaceFromLocalRace(race);
        es.eina.tfg.model.Race inserted = RaceLocalServiceUtil.addRace(toInsert);
        return RaceConverter.toLocalRace(inserted, race.getRoute(), Collections.<RaceLocation>emptyList());
    }

    public static void delete(Long idRace)
            throws SystemException {
        try {
            LocationLocalServiceUtil.deleteByIdRace(idRace);
            RaceLocalServiceUtil.deleteRace(idRace);
        } catch (PortalException e) {
            throw new SystemException(e);
        }
    }

    public static Race getByIdRace(Long idRace)
            throws SystemException, PortalException {
        es.eina.tfg.model.Race sbRace;
        try {
            sbRace = RaceLocalServiceUtil.getRace(idRace);
        } catch (SystemException e) {
            _log.error("SystemException while RaceLocalServiceUtil.getRace for idRace: " + idRace);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while RaceLocalServiceUtil.getRace for idRace: " + idRace, e);
            throw e;
        }

        Race raceToReturn;
        try{
            List<RaceLocation> locations = RaceLocationDAO.getByIdRace(sbRace.getIdRace());
            Route route = RouteDAO.getByIdRoute(sbRace.getIdRoute());
            raceToReturn = RaceConverter.toLocalRace(sbRace, route, locations);
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRace for race: " + sbRace);
            throw e;
        }
        return raceToReturn;
    }

    public static List<Race> getByIdUserAndDate(Long idUser,
                                                DateTime startTime,
                                                DateTime endTime,
                                                int start,
                                                int end)
            throws SystemException {
        List<Race> localRaces = new ArrayList<Race>();
        try {
            List<es.eina.tfg.model.Race> sbRaces = RaceLocalServiceUtil.getByIdUserAndTimeRange(
                    idUser, startTime.toDate(), endTime.toDate(), start, end);
            for (es.eina.tfg.model.Race sbRace : sbRaces) {
                List<RaceLocation> locations = RaceLocationDAO.getByIdRace(sbRace.getIdRace());
                Route route = RouteDAO.getByIdRoute(sbRace.getIdRoute());
                localRaces.add(RaceConverter.toLocalRace(sbRace, route, locations));
            }
        } catch (SystemException e) {
            _log.error("SystemException while getByIdUserAndTimeRange for "
                    + "idUser: " + idUser + " "
                    + "startTime: " + startTime + " "
                    + "endTime: " + endTime);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getByIdRoute for "
                    + "idUser: " + idUser + " "
                    + "startTime: " + startTime + " "
                    + "endTime: " + endTime);
            throw new SystemException(e);
        }
        return localRaces;
    }

    public static Race getLastRace(Long idUser)
            throws SystemException {
        Race localRace = null;
        try {
            es.eina.tfg.model.Race sbRace = RaceLocalServiceUtil.getLastRace(idUser);
            if (sbRace != null){
                Route route = RouteDAO.getByIdRoute(sbRace.getIdRoute());
                List<RaceLocation> locations = RaceLocationDAO.getByIdRace(sbRace.getIdRace());
                localRace = RaceConverter.toLocalRace(sbRace, route, locations);
            }
        } catch (SystemException e) {
            _log.error("SystemException while getByIdUserAndTimeRange for "
                    + "idUser: " + idUser);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while getLastRace for "
                    + "idUser: " + idUser);
            throw new SystemException(e);
        }
        return localRace;
    }

    private static es.eina.tfg.model.Race createSbRaceFromLocalRace(Race race)
            throws SystemException {
        long idRace = RaceLocalServiceUtil.generateNewIdRace();
        es.eina.tfg.model.Race sbRace = RaceLocalServiceUtil.createRace(idRace);
        sbRace.setIdRoute(race.getRoute().getIdRoute());
        sbRace.setIdUser(race.getIdUser());
        sbRace.setType(race.getType());
        return sbRace;
    }

    private static Log _log = LogFactoryUtil.getLog(RaceDAO.class);
}

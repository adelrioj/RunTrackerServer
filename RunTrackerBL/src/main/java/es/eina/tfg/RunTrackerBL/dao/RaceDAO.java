package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.RaceConverter;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.service.RaceLocalServiceUtil;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class RaceDAO {

    public static Race getByIdRace(Long idRace)
            throws SystemException, PortalException {
        es.eina.tfg.model.Race sbRace;
        try {
            sbRace = RaceLocalServiceUtil.getRace(idRace);
        } catch (SystemException e) {
            _log.error("SystemException while RaceLocalServiceUtil.getRace for route: " + idRace);
            throw e;
        } catch (PortalException e) {
            _log.error("PortalException while RaceLocalServiceUtil.getRace for route: " + idRace, e);
            throw e;
        }

        Race raceToReturn;
        try{
            List<RaceLocation> locations = RaceLocationDAO.getByIdRace(sbRace.getIdRace());
            raceToReturn = RaceConverter.toLocalRace(sbRace, locations);
        } catch (SystemException e) {
            _log.error("SystemException while getByIdRace for route: " + sbRace);
            throw e;
        }
        return raceToReturn;
    }

    public static List<Race> getByIdUserWithLatestDate(Long idUser,
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
                Race localRace = RaceConverter.toLocalRace(sbRace, locations);
                localRaces.add(localRace);
            }
        } catch (SystemException e) {
            _log.error("asdasd while as for "
                    + "idUser: " + idUser + " "
                    + "startTime: " + startTime + " "
                    + "endTime: " + endTime);
            throw e;
        }
        return localRaces;
    }

    private static Log _log = LogFactoryUtil.getLog(RaceDAO.class);
}

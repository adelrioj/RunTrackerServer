package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.RaceConverter;
import es.eina.tfg.RunTrackerBL.entity.RaceLocation;
import es.eina.tfg.service.LocationLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RaceLocationDAO {
    public static List<RaceLocation> getByIdRace(long idRace)
            throws SystemException {
        List<es.eina.tfg.model.Location> sbLocations;

        try {
            sbLocations = LocationLocalServiceUtil.getByRaceId(idRace);
        } catch (SystemException e) {
            _log.error("SystemException while getByidRoute for id: " + idRace);
            throw e;
        }
        List<es.eina.tfg.RunTrackerBL.entity.RaceLocation> localLocations =
                new ArrayList<es.eina.tfg.RunTrackerBL.entity.RaceLocation>();
        for (es.eina.tfg.model.Location sbLocation : sbLocations) {
            localLocations.add(RaceConverter.toLocalRaceLocation(sbLocation));
        }
        return localLocations;
    }

    private static Log _log = LogFactoryUtil.getLog(RaceLocationDAO.class);
}

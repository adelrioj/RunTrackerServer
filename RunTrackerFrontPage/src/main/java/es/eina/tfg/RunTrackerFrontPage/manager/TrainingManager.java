package es.eina.tfg.RunTrackerFrontPage.manager;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.dao.RaceDAO;
import es.eina.tfg.RunTrackerBL.entity.Race;
import es.eina.tfg.RunTrackerFrontPage.exception.UnableToFindRaceException;

import java.util.List;

public class TrainingManager {

    public static List<Race> getLastRaces(long idUser)
            throws UnableToFindRaceException {
        List<Race> races;
        try {
            races = RaceDAO.getRacesOrderByStartTime(idUser, 0, 3);
        } catch (SystemException e) {
            throw new UnableToFindRaceException(e);
        } catch (PortalException e) {
            throw new UnableToFindRaceException(e);
        }
        return races;
    }
}

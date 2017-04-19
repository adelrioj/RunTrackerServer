package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.Location;
import es.eina.tfg.model.Power;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.PowerLocalServiceUtil;
import es.eina.tfg.service.base.RaceLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.LocationPK;
import es.eina.tfg.service.persistence.RaceFinderUtil;
import es.eina.tfg.service.persistence.RaceUtil;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the race local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RaceLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see RaceLocalServiceBaseImpl
 * @see es.eina.tfg.service.RaceLocalServiceUtil
 */
public class RaceLocalServiceImpl extends RaceLocalServiceBaseImpl {

    public Long generateNewIdRace()
            throws SystemException {
        try {
            return counterLocalService.increment(Race.class.getName());
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Race.class.getName());
            throw e;
        }
    }

    @Override
    public Race addRace(Race race)
            throws SystemException {
        checkMadatoryAttributes(race);
        return super.addRace(race);
    }

    @Override
    public Race updateRace(Race race)
            throws SystemException {
        checkMadatoryAttributes(race);
        return super.updateRace(race);
    }

    private void checkMadatoryAttributes(Race race)
            throws SystemException {
        User user = UserLocalServiceUtil.fetchUser(race.getIdUser());
        if (user == null){
            throw new SystemException("The user: " + race.getIdUser() +" does not exists on the database");
        }
    }

    public List<Race> getByUserId (Long userId)
            throws SystemException {
        return RaceUtil.findByuserId(userId);
    }

    public List<Race> getByIdUserAndTimeRange(long idUser, Date startTime, Date endTime, int start, int end)
            throws SystemException {
        return RaceFinderUtil.getByIdUserAndTimeRange(idUser, startTime, endTime, start, end);
    }

    public Race getLastRace(long idUser)
            throws SystemException {
        return RaceFinderUtil.getLastRace(idUser);
    }

    public List<Location> getLocations (long idRace)
            throws SystemException {
        return LocationLocalServiceUtil.getByRaceId(idRace);
    }

    public List<Power> getPowerMeasurements (long idRace)
            throws SystemException {
        return PowerLocalServiceUtil.getByRaceId(idRace);
    }

    public List<Race> getRacesOrderByStartTime(long idUser, int start, int end)
            throws SystemException {
        return RaceFinderUtil.getRacesOrderByStartTime(idUser, start, end);
    }

    public long countByIdUser(long idUser)
            throws SystemException {
        return RaceFinderUtil.countByIdUser(idUser);
    }

    public static final String TYPE_WALKING = RouteLocalServiceImpl.TYPE_WALKING;
    public static final String TYPE_RUNNING = RouteLocalServiceImpl.TYPE_RUNNING;
    public static final String TYPE_CYCLING = RouteLocalServiceImpl.TYPE_CYCLING;

    private static Log _log = LogFactoryUtil.getLog(RaceLocalServiceImpl.class);
}

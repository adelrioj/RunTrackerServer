package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.base.RaceServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the race remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RaceService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see RaceServiceBaseImpl
 * @see es.eina.tfg.service.RaceServiceUtil
 */
public class RaceServiceImpl extends RaceServiceBaseImpl {
    public Race add(Long userId, Long routeId, String type, Integer userHeight, Integer userWeight)
            throws SystemException, NonExistingUserException {
        return RaceLocalServiceUtil.add(userId, routeId, type, userHeight, userWeight);
    }

    public Race update(Long raceId, Long userId, Long routeId, String type, Integer userHeight, Integer userWeight)
            throws SystemException, NonExistingUserException, NonExistingRaceException {
        return RaceLocalServiceUtil.update(raceId, userId, routeId, type, userHeight, userWeight);
    }

    public Race delete(Long raceId) throws SystemException, PortalException {
        return RaceLocalServiceUtil.deleteRace(raceId);
    }

    public Race getRace (Long raceId) throws SystemException, PortalException {
        return RaceLocalServiceUtil.getRace(raceId);
    }

    public List<Race> findByUserId (Long userId) throws SystemException {
        return RaceLocalServiceUtil.findByUserId(userId);
    }

    public static final String TYPE_WALKING = RaceLocalServiceImpl.TYPE_WALKING;
    public static final String TYPE_RUNNING = RaceLocalServiceImpl.TYPE_RUNNING;
    public static final String TYPE_CYCLING = RaceLocalServiceImpl.TYPE_CYCLING;
}
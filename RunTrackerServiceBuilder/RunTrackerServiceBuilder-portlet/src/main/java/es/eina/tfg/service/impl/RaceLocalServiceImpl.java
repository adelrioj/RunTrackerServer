package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.base.RaceLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.RaceUtil;

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

    public Race add(Long userId, Long routeId, String type, Integer userHeight, Integer userWeight)
            throws SystemException, NonExistingUserException {

        Long raceId = counterLocalService.increment();

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }

        Race race = createRace(raceId);
        race.setUserId(userId);
        if (Validator.isNotNull(routeId)){
            race.setRouteId(routeId);
        }else {
            race.setRouteId(DEFAULT_ROUTEID);
        }
        race.setType(type);
        race.setUserHeight(userHeight);
        race.setUserWeight(userWeight);

        return updateRace(race);
    }

    public Race update(Long raceId, Long userId, Long routeId, String type, Integer userHeight, Integer userWeight)
            throws SystemException, NonExistingUserException, NonExistingRaceException {

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }
        Race race = fetchRace(raceId);
        if (race == null){
            throw new NonExistingRaceException("Race: " + raceId + " does not exists on the database");
        }

        race.setUserId(userId);
        if (Validator.isNotNull(routeId)){
            race.setRouteId(routeId);
        }else {
            race.setRouteId(DEFAULT_ROUTEID);
        }
        race.setType(type);
        race.setUserHeight(userHeight);
        race.setUserWeight(userWeight);

        return updateRace(race);
    }

    public List<Race> findByUserId (Long userId) throws SystemException {
        return RaceUtil.findByuserId(userId);
    }

    public static final Long DEFAULT_ROUTEID = (long) 1;

    public static final String TYPE_WALKING = RouteLocalServiceImpl.TYPE_WALKING;
    public static final String TYPE_RUNNING = RouteLocalServiceImpl.TYPE_RUNNING;
    public static final String TYPE_CYCLING = RouteLocalServiceImpl.TYPE_CYCLING;
}
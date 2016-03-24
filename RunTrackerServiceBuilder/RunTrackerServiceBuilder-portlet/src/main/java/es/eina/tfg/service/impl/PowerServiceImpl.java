package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingDeviceAndSensorRelationException;
import es.eina.tfg.NonExistingMeasurementException;
import es.eina.tfg.NonExistingRaceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Power;
import es.eina.tfg.service.PowerLocalServiceUtil;
import es.eina.tfg.service.base.PowerServiceBaseImpl;

import java.util.Date;

/**
 * The implementation of the power remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.PowerService} interface.
 *
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see PowerServiceBaseImpl
 * @see es.eina.tfg.service.PowerServiceUtil
 */
public class PowerServiceImpl extends PowerServiceBaseImpl {
    public Power add(Long raceId, Long userId, Long deviceId, Long sensorId, Date time, String sensorMode, Integer level)
            throws SystemException, NonExistingUserException, NonExistingDeviceAndSensorRelationException, NonExistingRaceException {
        return PowerLocalServiceUtil.add(raceId, userId, deviceId, sensorId, time, sensorMode, level);
    }

    public Power update(Long measurementId, Long raceId, Long userId, Long deviceId, Long sensorId, Date time,
                        String sensorMode, Integer level)
            throws SystemException, NonExistingUserException, NonExistingDeviceAndSensorRelationException,
            NonExistingRaceException, NonExistingMeasurementException {
        return PowerLocalServiceUtil.update(measurementId, raceId, userId, deviceId, sensorId, time, sensorMode, level);
    }

    public Power delete(Long measurementId) throws SystemException, PortalException {
        return PowerLocalServiceUtil.deletePower(measurementId);
    }

    public Power getPower(Long measurementId) throws SystemException, PortalException {
        return PowerLocalServiceUtil.getPower(measurementId);
    }
}
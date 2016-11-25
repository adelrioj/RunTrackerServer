package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.model.Power;
import es.eina.tfg.model.Race;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.base.PowerLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.DeviceAndSensorPK;
import es.eina.tfg.service.persistence.PowerPK;
import es.eina.tfg.service.persistence.PowerUtil;

import java.util.List;

/**
 * The implementation of the power local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.PowerLocalService} interface.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see PowerLocalServiceBaseImpl
 * @see es.eina.tfg.service.PowerLocalServiceUtil
 */
public class PowerLocalServiceImpl extends PowerLocalServiceBaseImpl {

    public PowerPK generateNewIdPower(long idRace)
            throws SystemException {
        try {
            return new PowerPK(idRace, counterLocalService.increment(Power.class.getName()));
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Power.class.getName());
            throw e;
        }
    }

    @Override
    public Power addPower(Power power)
            throws SystemException {
        checkMadatoryAttributes(power);
        return super.addPower(power);
    }

    @Override
    public Power updatePower(Power power)
            throws SystemException {
        checkMadatoryAttributes(power);
        return super.updatePower(power);
    }

    private void checkMadatoryAttributes(Power power)
            throws SystemException {
        Race race = RaceLocalServiceUtil.fetchRace(power.getIdRace());
        if (race == null){
            throw new SystemException("Race:" + power.getIdRace() + " does not exists on the database");
        }

        DeviceAndSensorPK deviceAndSensorPK = new DeviceAndSensorPK(power.getIdDevice(), power.getIdSensor());
        DeviceAndSensor deviceAndSensor = DeviceAndSensorLocalServiceUtil.fetchDeviceAndSensor(deviceAndSensorPK);
        if (deviceAndSensor == null){
            throw new SystemException(
                    "The device:" + power.getIdDevice() + " and sensor: " + power.getIdSensor()
                            + " has no relation on the database");
        }

        if (power.getTime() == null){
            throw new SystemException("Power time cannot be null");
        }
    }

    public List<Power> getByRaceId(Long raceId)
            throws SystemException {
        return PowerUtil.findByraceId(raceId);
    }

    private static Log _log = LogFactoryUtil.getLog(PowerLocalServiceImpl.class);
}

package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Location;
import es.eina.tfg.model.Power;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.PowerLocalServiceUtil;
import es.eina.tfg.service.base.PowerServiceBaseImpl;
import es.eina.tfg.service.persistence.PowerPK;

import java.util.Date;
import java.util.List;

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

    public Power add(Long raceId, Long deviceId, Long sensorId, Date time, String sensorMode, Integer level)
            throws SystemException {
        Power power = PowerLocalServiceUtil.createPower(PowerLocalServiceUtil.generateNewIdPower(raceId));
        power.setIdDevice(deviceId);
        power.setIdSensor(sensorId);
        power.setTime(time);
        power.setSensorMode(sensorMode);
        power.setLevel(level);

        return PowerLocalServiceUtil.addPower(power);
    }

    public Power getPower(long idMeasurement, long idRace)
            throws SystemException, PortalException {
        PowerPK powerPK = new PowerPK(idMeasurement, idRace);
        return PowerLocalServiceUtil.getPower(powerPK);
    }

    public List<Location> getByidRace(Long idRace)
            throws SystemException {
        return LocationLocalServiceUtil.getByRaceId(idRace);
    }
}

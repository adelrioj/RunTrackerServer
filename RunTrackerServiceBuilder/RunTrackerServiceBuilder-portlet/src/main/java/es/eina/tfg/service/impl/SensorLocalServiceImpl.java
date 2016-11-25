package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.base.SensorLocalServiceBaseImpl;

/**
 * The implementation of the sensor local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.SensorLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see SensorLocalServiceBaseImpl
 * @see es.eina.tfg.service.SensorLocalServiceUtil
 */
public class SensorLocalServiceImpl extends SensorLocalServiceBaseImpl {

    public Long generateNewIdSensor()
            throws SystemException {
        try {
            return counterLocalService.increment(Sensor.class.getName());
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Sensor.class.getName());
            throw e;
        }
    }

    private static Log _log = LogFactoryUtil.getLog(SensorLocalServiceImpl.class);
}

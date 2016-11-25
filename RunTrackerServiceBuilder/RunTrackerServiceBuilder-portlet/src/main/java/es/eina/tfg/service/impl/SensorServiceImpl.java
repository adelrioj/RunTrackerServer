package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.SensorLocalServiceUtil;
import es.eina.tfg.service.base.SensorServiceBaseImpl;

/**
 * The implementation of the sensor remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.SensorService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see SensorServiceBaseImpl
 * @see es.eina.tfg.service.SensorServiceUtil
 */
public class SensorServiceImpl extends SensorServiceBaseImpl {

    public Sensor getSensor(Long sensorId) throws SystemException, PortalException {
        return SensorLocalServiceUtil.getSensor(sensorId);
    }

}

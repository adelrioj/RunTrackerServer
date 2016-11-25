package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.service.base.DeviceAndSensorLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.DeviceAndSensorUtil;

import java.util.List;

/**
 * The implementation of the DeviceAndSensor local service.
 *
 *  NOTE FOR DEVELOPERS:
 * Never reference this interface directly.
 * Always use {@link es.eina.tfg.service.DeviceAndSensorLocalServiceUtil} to access the DeviceAndSensor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder
 * to copy their definitions into the {@link es.eina.tfg.service.DeviceAndSensorLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see DeviceAndSensorLocalServiceBaseImpl
 * @see es.eina.tfg.service.DeviceAndSensorLocalServiceUtil
 */
public class DeviceAndSensorLocalServiceImpl
        extends DeviceAndSensorLocalServiceBaseImpl {

    public List<DeviceAndSensor> getSensorsByDevice(Long deviceId)
            throws SystemException {
        return DeviceAndSensorUtil.findBydeviceId(deviceId);
    }

    public List<DeviceAndSensor> getActiveSensorsByDevice(Long deviceId)
            throws SystemException {
        return DeviceAndSensorUtil.findByactiveSensors(deviceId);
    }
}

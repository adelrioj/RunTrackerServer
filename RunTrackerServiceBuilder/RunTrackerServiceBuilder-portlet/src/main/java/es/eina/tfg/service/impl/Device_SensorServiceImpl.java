package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingDeviceException;
import es.eina.tfg.NonExistingSensorException;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.base.Device_SensorServiceBaseImpl;
import es.eina.tfg.service.persistence.Device_SensorPK;

import java.util.List;

/**
 * The implementation of the device_ sensor remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.Device_SensorService} interface.
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see Device_SensorServiceBaseImpl
 * @see es.eina.tfg.service.Device_SensorServiceUtil
 */
public class Device_SensorServiceImpl extends Device_SensorServiceBaseImpl {
    public Device_Sensor add(Long deviceId, Long sensorId, boolean status)
            throws NonExistingDeviceException, NonExistingSensorException, SystemException {
        return Device_SensorLocalServiceUtil.add(deviceId, sensorId, status);
    }

    public Device_Sensor update(Long deviceId, Long sensorId, boolean status)
            throws SystemException, PortalException {
        return Device_SensorLocalServiceUtil.update(deviceId, sensorId, status);
    }

    public Device_Sensor delete (Long deviceId, Long sensorId) throws SystemException, PortalException {
        return Device_SensorLocalServiceUtil.deleteDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
    }

    public Device_Sensor getDeviceSensor (Long deviceId, Long sensorId)
            throws SystemException, PortalException {
        return Device_SensorLocalServiceUtil.getDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
    }

    public List<Device_Sensor> findByDeviceId(Long deviceId)
            throws SystemException {
        return Device_SensorLocalServiceUtil.findByDeviceId(deviceId);
    }

    public List<Device_Sensor> findActiveSensors(Long deviceId)
            throws SystemException {
        return Device_SensorLocalServiceUtil.findActiveSensors(deviceId);
    }
}
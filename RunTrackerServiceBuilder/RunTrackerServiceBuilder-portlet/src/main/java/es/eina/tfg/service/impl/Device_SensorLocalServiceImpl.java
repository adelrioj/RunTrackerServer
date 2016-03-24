package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingDeviceException;
import es.eina.tfg.NonExistingSensorException;
import es.eina.tfg.model.Device;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.DeviceLocalServiceUtil;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.SensorLocalServiceUtil;
import es.eina.tfg.service.base.Device_SensorLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.Device_SensorPK;
import es.eina.tfg.service.persistence.Device_SensorUtil;

import java.util.List;

/**
 * The implementation of the device_ sensor local service.
 *
 *  NOTE FOR DEVELOPERS:
 * Never reference this interface directly.
 * Always use {@link es.eina.tfg.service.Device_SensorLocalServiceUtil} to access the device_ sensor local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder
 * to copy their definitions into the {@link es.eina.tfg.service.Device_SensorLocalService} interface.
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see Device_SensorLocalServiceBaseImpl
 * @see es.eina.tfg.service.Device_SensorLocalServiceUtil
 */
public class Device_SensorLocalServiceImpl extends Device_SensorLocalServiceBaseImpl {

    public Device_Sensor add(Long deviceId, Long sensorId, boolean status)
            throws SystemException, NonExistingDeviceException, NonExistingSensorException {

        Device device = DeviceLocalServiceUtil.fetchDevice(deviceId);
        if (device == null){
            throw new NonExistingDeviceException("The device: " + deviceId +" does not exists on the database");
        }
        Sensor sensor = SensorLocalServiceUtil.fetchSensor(sensorId);
        if (sensor == null){
            throw new NonExistingSensorException("The sensor: " + sensorId +" does not exists on the database");
        }

        Device_Sensor deviceSensor = createDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
        deviceSensor.setStatus(status);
        return Device_SensorLocalServiceUtil.updateDevice_Sensor(deviceSensor);
    }

    public Device_Sensor update(Long deviceId, Long sensorId, boolean status)
            throws SystemException, PortalException {
        Device_Sensor deviceSensor = Device_SensorLocalServiceUtil.getDevice_Sensor(new Device_SensorPK(deviceId, sensorId));
        deviceSensor.setStatus(status);
        return Device_SensorLocalServiceUtil.updateDevice_Sensor(deviceSensor);
    }

    public List<Device_Sensor> findByDeviceId(Long deviceId)
            throws SystemException {
        return Device_SensorUtil.findBydeviceId(deviceId);
    }

    public List<Device_Sensor> findActiveSensors(Long deviceId)
            throws SystemException {
        return Device_SensorUtil.findByactiveSensors(deviceId);
    }
}
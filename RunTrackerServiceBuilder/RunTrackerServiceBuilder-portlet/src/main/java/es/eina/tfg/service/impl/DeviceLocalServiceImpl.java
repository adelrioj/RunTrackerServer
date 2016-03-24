package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NoSuchDeviceException;
import es.eina.tfg.NonExistingDeviceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Device;
import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.SensorLocalServiceUtil;
import es.eina.tfg.service.base.DeviceLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.DeviceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the device local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.DeviceLocalService} interface.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks based on the propagated JAAS credentials
 * because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see DeviceLocalServiceBaseImpl
 * @see es.eina.tfg.service.DeviceLocalServiceUtil
 */
public class DeviceLocalServiceImpl extends DeviceLocalServiceBaseImpl {

    public Device add (String deviceUUID, Long userId, String description, String status, String phoneNumber,
                             String serverPhoneNumber, String smsPollTime, String smsTransmitPeriod, String cloudId,
                             String serverIp, String httpTransmitPeriod)
            throws SystemException, NonExistingUserException {
        Long deviceInternalId = counterLocalService.increment();

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }

        Device device = createDevice(deviceInternalId);
        device.setDeviceUUID(deviceUUID);
        device.setUserId(userId);
        device.setDescription(description);
        device.setStatus(status);
        device.setPhoneNumber(phoneNumber);
        device.setServerPhoneNumber(serverPhoneNumber);
        device.setSmsPollTime(smsPollTime);
        device.setSmsTransmitPeriod(smsTransmitPeriod);
        device.setCloudId(cloudId);
        device.setServerIp(serverIp);
        device.setHttpTransmitPeriod(httpTransmitPeriod);

        return updateDevice(device);
    }

    public Device update (Long deviceId, String deviceUUID, Long userId, String description, String status, String phoneNumber,
                                String serverPhoneNumber, String smsPollTime, String smsTransmitPeriod, String cloudId,
                                String serverIp, String httpTransmitPeriod)
            throws SystemException, NonExistingUserException, NonExistingDeviceException {
        Device device = fetchDevice(deviceId);
        if (device == null){
            throw new NonExistingDeviceException("The device: " + deviceId +" does not exists on the database");
        }

        User user = UserLocalServiceUtil.fetchUser(userId);
        if (user == null){
            throw new NonExistingUserException("The user: " + userId +" does not exists on the database");
        }

        device.setUserId(userId);
        device.setDeviceUUID(deviceUUID);
        device.setDescription(description);
        device.setStatus(status);
        device.setPhoneNumber(phoneNumber);
        device.setServerPhoneNumber(serverPhoneNumber);
        device.setSmsPollTime(smsPollTime);
        device.setSmsTransmitPeriod(smsTransmitPeriod);
        device.setCloudId(cloudId);
        device.setServerIp(serverIp);
        device.setHttpTransmitPeriod(httpTransmitPeriod);

        return updateDevice(device);
    }

    public Device getDeviceByPhoneNumber(String phoneNumber) throws NoSuchDeviceException, SystemException {
        return DeviceUtil.findByphoneNumber(phoneNumber);
    }

    public List<Sensor> getSensors (Long deviceId) throws SystemException {
        List<Device_Sensor> deviceSensors = Device_SensorLocalServiceUtil.findByDeviceId(deviceId);
        List<Sensor> sensors = new ArrayList<Sensor>();
        for (Device_Sensor deviceSensor : deviceSensors) {
            Sensor sensor = SensorLocalServiceUtil.fetchSensor(deviceSensor.getSensorId());
            if (sensor != null){
                sensors.add(sensor);
            }
        }
        return sensors;
    }

    public List<Sensor> getActiveSensors (Long deviceId) throws SystemException {
        List<Device_Sensor> deviceSensors = Device_SensorLocalServiceUtil.findActiveSensors(deviceId);
        List<Sensor> sensors = new ArrayList<Sensor>();
        for (Device_Sensor deviceSensor : deviceSensors) {
            Sensor sensor = SensorLocalServiceUtil.fetchSensor(deviceSensor.getSensorId());
            if (sensor != null){
                sensors.add(sensor);
            }
        }
        return sensors;
    }

    public List<Device> findByUserId (Long userId) throws SystemException {
        return DeviceUtil.findByuserId(userId);
    }

    public Device findBydeviceUUID (String deviceUUID) throws NoSuchDeviceException, SystemException {
        return DeviceUtil.findBydeviceUUID(deviceUUID);
    }

    public List<Device> findByStatus (String status) throws SystemException {
        return DeviceUtil.findBystatus(status);
    }

    public List<Device> findByStatus (String status, int start, int end) throws SystemException {
        return DeviceUtil.findBystatus(status, start, end);
    }

    public static final String STATUS_SMSMODE = "SMSMODE";
    public static final String STATUS_3GMODE = "3GMODE";
}
package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NoSuchDeviceException;
import es.eina.tfg.model.Device;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.DeviceLocalServiceUtil;
import es.eina.tfg.service.base.DeviceServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the device remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.DeviceService} interface.
 *
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see DeviceServiceBaseImpl
 * @see es.eina.tfg.service.DeviceServiceUtil
 */
public class DeviceServiceImpl extends DeviceServiceBaseImpl {

    public Device add (Long userId, String deviceUUID, String description, String status, String phoneNumber,
                       String serverPhoneNumber, String smsPollTime, String smsTransmitPeriod, String cloudId,
                       String serverIp, String httpTransmitPeriod)
            throws SystemException {

        Device device = DeviceLocalServiceUtil.createDevice(DeviceLocalServiceUtil.generateNewIdDevice());
        device.setIdUser(userId);
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

        return DeviceLocalServiceUtil.addDevice(device);
    }

    public Device update (Long deviceId, String description, String status, String phoneNumber,
                          String smsTransmitPeriod, String httpTransmitPeriod)
            throws SystemException, PortalException {
        Device device = DeviceLocalServiceUtil.getDevice(deviceId);
        device.setDescription(description);
        device.setStatus(status);
        device.setPhoneNumber(phoneNumber);
        device.setSmsTransmitPeriod(smsTransmitPeriod);
        device.setHttpTransmitPeriod(httpTransmitPeriod);

        return DeviceLocalServiceUtil.updateDevice(device);
    }

    public Device delete (Long deviceId)
            throws SystemException, PortalException {
        return DeviceLocalServiceUtil.deleteDevice(deviceId);
    }

    public Device getDevice (Long deviceId)
            throws SystemException, PortalException {
        return DeviceLocalServiceUtil.getDevice(deviceId);
    }

    public List<Sensor> getSensors (Long deviceId)
            throws SystemException {
        return DeviceLocalServiceUtil.getSensors(deviceId);
    }

    public List<Sensor> getActiveSensors (Long deviceId)
            throws SystemException {
        return DeviceLocalServiceUtil.getActiveSensors(deviceId);
    }

    public Device getDeviceByPhoneNumber(String phoneNumber)
            throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.getDeviceByPhoneNumber(phoneNumber);
    }

    public List<Device> getByUserId (Long userId)
            throws SystemException {
        return DeviceLocalServiceUtil.getByUserId(userId);
    }

    public Device getByDeviceUUID (String deviceUUID)
            throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.getBydeviceUUID(deviceUUID);
    }

    public List<Device> getByStatus (String status)
            throws SystemException {
        return DeviceLocalServiceUtil.getByStatus(status);
    }

    public List<Device> getByStatus (String status, int start, int end)
            throws SystemException {
        return DeviceLocalServiceUtil.getByStatus(status, start, end);
    }

    public static final String STATUS_SMSMODE = DeviceLocalServiceImpl.STATUS_SMSMODE;
    public static final String STATUS_3GMODE = DeviceLocalServiceImpl.STATUS_3GMODE;
}

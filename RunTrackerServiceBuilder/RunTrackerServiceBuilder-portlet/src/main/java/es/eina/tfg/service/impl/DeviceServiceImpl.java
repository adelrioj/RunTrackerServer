package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NoSuchDeviceException;
import es.eina.tfg.NonExistingDeviceException;
import es.eina.tfg.NonExistingUserException;
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
            throws SystemException, NonExistingUserException {
        return DeviceLocalServiceUtil.add(deviceUUID, userId, description, status, phoneNumber, serverPhoneNumber, smsPollTime,
                smsTransmitPeriod, cloudId, serverIp, httpTransmitPeriod);
    }

    public Device update (Long deviceId, String deviceUUID, Long userId, String description, String status, String phoneNumber,
                          String serverPhoneNumber, String smsPollTime, String smsTransmitPeriod, String cloudId,
                          String serverIp, String httpTransmitPeriod)
            throws SystemException, NonExistingUserException, NonExistingDeviceException {
        return DeviceLocalServiceUtil.update(deviceId, deviceUUID, userId, description, status, phoneNumber, serverPhoneNumber,
                smsPollTime, smsTransmitPeriod, cloudId, serverIp, httpTransmitPeriod);
    }

    public Device delete (Long deviceId) throws SystemException, PortalException {
        return DeviceLocalServiceUtil.deleteDevice(deviceId);
    }

    public Device getDevice (Long deviceId) throws SystemException, PortalException {
        return DeviceLocalServiceUtil.getDevice(deviceId);
    }

    public List<Sensor> getSensors (Long deviceId) throws SystemException {
        return DeviceLocalServiceUtil.getSensors(deviceId);
    }

    public List<Sensor> getActiveSensors (Long deviceId) throws SystemException {
        return DeviceLocalServiceUtil.getActiveSensors(deviceId);
    }

    public Device getDeviceByPhoneNumber(String phoneNumber) throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.getDeviceByPhoneNumber(phoneNumber);
    }

    public List<Device> findByUserId (Long userId) throws SystemException {
        return DeviceLocalServiceUtil.findByUserId(userId);
    }

    public Device findByDeviceUUID (String deviceUUID) throws NoSuchDeviceException, SystemException {
        return DeviceLocalServiceUtil.findBydeviceUUID(deviceUUID);
    }

    public List<Device> findByStatus (String status) throws SystemException {
        return DeviceLocalServiceUtil.findByStatus(status);
    }

    public List<Device> findByStatus (String status, int start, int end) throws SystemException {
        return DeviceLocalServiceUtil.findByStatus(status, start, end);
    }

    public static final String STATUS_SMSMODE = DeviceLocalServiceImpl.STATUS_SMSMODE;
    public static final String STATUS_3GMODE = DeviceLocalServiceImpl.STATUS_3GMODE;
}
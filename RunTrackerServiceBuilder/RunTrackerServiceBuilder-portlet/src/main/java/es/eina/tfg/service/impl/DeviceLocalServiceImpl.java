package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.NoSuchDeviceException;
import es.eina.tfg.NonExistingDeviceException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.model.Device;
import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.DeviceLocalServiceUtil;
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

    public Long generateNewIdDevice()
            throws SystemException {
        try {
            return counterLocalService.increment(Device.class.getName());
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Device.class.getName());
            throw e;
        }
    }

    @Override
    public Device addDevice(Device device)
            throws SystemException {
        checkMadatoryAttributes(device);
        return super.addDevice(device);
    }

    @Override
    public Device updateDevice(Device device)
            throws SystemException {
        checkMadatoryAttributes(device);
        return super.updateDevice(device);
    }

    private void checkMadatoryAttributes(Device device)
            throws SystemException {
        User user = UserLocalServiceUtil.fetchUser(device.getIdUser());
        if (user == null){
            throw new SystemException("The user: " + device.getIdUser() +" does not exists on the database");
        }
    }

    public List<Sensor> getSensors (Long deviceId)
            throws SystemException {
        List<DeviceAndSensor> deviceAndSensors = DeviceAndSensorLocalServiceUtil.getSensorsByDevice(deviceId);
        return getSensorsFromDeviceAndSensorRelation(deviceAndSensors);
    }

    public List<Sensor> getActiveSensors (Long deviceId)
            throws SystemException {
        List<DeviceAndSensor> deviceAndSensors = DeviceAndSensorLocalServiceUtil.getActiveSensorsByDevice(deviceId);
        return getSensorsFromDeviceAndSensorRelation(deviceAndSensors);
    }

    private List<Sensor> getSensorsFromDeviceAndSensorRelation(List<DeviceAndSensor> deviceAndSensors)
            throws SystemException {
        List<Sensor> sensors = new ArrayList<Sensor>();
        for (DeviceAndSensor deviceSensor : deviceAndSensors) {
            try {
                sensors.add(SensorLocalServiceUtil.getSensor(deviceSensor.getIdSensor()));
            } catch (PortalException e) {
                _log.error("PortalException: Cannot SensorLocalServiceUtil.getSensor() for ID: "
                        + deviceSensor.getIdSensor());
            }
        }
        return sensors;
    }

    public Device getDeviceByPhoneNumber(String phoneNumber)
            throws NoSuchDeviceException, SystemException {
        return DeviceUtil.findByphoneNumber(phoneNumber);
    }

    public List<Device> getByUserId (Long userId)
            throws SystemException {
        return DeviceUtil.findByuserId(userId);
    }

    public Device getBydeviceUUID (String deviceUUID)
            throws NoSuchDeviceException, SystemException {
        return DeviceUtil.findBydeviceUUID(deviceUUID);
    }

    public List<Device> getByStatus (String status)
            throws SystemException {
        return DeviceUtil.findBystatus(status);
    }

    public List<Device> getByStatus (String status, int start, int end)
            throws SystemException {
        return DeviceUtil.findBystatus(status, start, end);
    }

    public List<Device> getByDescriptionAndIdUser(long idUser, String description, int start, int end)
            throws SystemException {
        DynamicQuery dynamicQuery = buildGetDevicesByDescriptionAndIdUserDynamicQuery(idUser, description);
        return DeviceUtil.findWithDynamicQuery(dynamicQuery, start, end);
    }

    public int getByDescriptionAndIdUserCount(long idUser, String description)
            throws SystemException {
        DynamicQuery dynamicQuery = buildGetDevicesByDescriptionAndIdUserDynamicQuery(idUser, description);
        return (int) DeviceUtil.countWithDynamicQuery(dynamicQuery);
    }

    private DynamicQuery buildGetDevicesByDescriptionAndIdUserDynamicQuery(long idUser, String description){
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Device.class);
        Junction junction = RestrictionsFactoryUtil.conjunction();
        junction.add(RestrictionsFactoryUtil.eq("idUser", idUser));
        junction.add(RestrictionsFactoryUtil.ilike("description",
                (new StringBuilder("%")).append(description).append("%").toString()));
        dynamicQuery.add(junction);
        return dynamicQuery;
    }

    public static final String STATUS_SMSMODE = "SMSMODE";
    public static final String STATUS_3GMODE = "3GMODE";
    public static final String STATUS_DISABLED = "DISABLED";

    private static Log _log = LogFactoryUtil.getLog(DeviceLocalServiceImpl.class);
}

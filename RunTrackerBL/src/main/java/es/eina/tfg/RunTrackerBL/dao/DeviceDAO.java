package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.DeviceConverter;
import es.eina.tfg.RunTrackerBL.entity.Device;
import es.eina.tfg.RunTrackerBL.entity.DeviceAndSensor;
import es.eina.tfg.RunTrackerBL.entity.Sensor;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.DeviceLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class DeviceDAO {

    public static Device delete(long idDevice)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.DeviceAndSensor> deviceAndSensorList = DeviceAndSensorLocalServiceUtil.getSensorsByDevice(idDevice);
        for (es.eina.tfg.model.DeviceAndSensor deviceAndSensor : deviceAndSensorList) {
            DeviceAndSensorLocalServiceUtil.delete(deviceAndSensor.getIdDevice(), deviceAndSensor.getIdSensor());
        }
        es.eina.tfg.model.Device sbDevice = DeviceLocalServiceUtil.deleteDevice(idDevice);
        return DeviceConverter.toLocalDevice(sbDevice, null);
    }

    public static Device getByIdDevice(long idDevice)
            throws SystemException, PortalException {
        es.eina.tfg.model.Device dbDevice = DeviceLocalServiceUtil.getDevice(idDevice);
        List<DeviceAndSensor> localDeviceSensors = getAttachedSensors(idDevice);
        return DeviceConverter.toLocalDevice(dbDevice, localDeviceSensors);
    }

    public static List<Device> getByIdUserAndDescription(long idUser, String description, int start, int end)
            throws SystemException, PortalException {
        List<es.eina.tfg.model.Device> sbDevices = DeviceLocalServiceUtil.getByDescriptionAndIdUser(idUser, description, start, end);
        List<Device> localDevices = new ArrayList<Device>();
        for (es.eina.tfg.model.Device sbDevice : sbDevices) {
            List<DeviceAndSensor> localSensors = getAttachedSensors(sbDevice.getIdDevice());
            Device localDevice = DeviceConverter.toLocalDevice(sbDevice, localSensors);
            localDevices.add(localDevice);
        }
        return localDevices;
    }

    public static int getByIdUserAndDescriptionCount(long idUser, String description)
            throws SystemException {
        return DeviceLocalServiceUtil.getByDescriptionAndIdUserCount(idUser, description);
    }

    private static List<DeviceAndSensor> getAttachedSensors(long idDevice)
            throws PortalException, SystemException {
        _log.info("Starting getAttachedSensors for idDevice: " + idDevice);
        List<es.eina.tfg.model.DeviceAndSensor> sbDeviceAndSensorList = DeviceAndSensorLocalServiceUtil.getSensorsByDevice(idDevice);

        List<DeviceAndSensor> localDeviceAndSensors = new ArrayList<DeviceAndSensor>();
        for (es.eina.tfg.model.DeviceAndSensor sbDeviceAndSensor : sbDeviceAndSensorList) {
            Sensor sensor = SensorDAO.getByIdSensor(sbDeviceAndSensor.getIdSensor());
            localDeviceAndSensors.add(DeviceConverter.toLocalDeviceAndSensor(sbDeviceAndSensor, sensor));
        }
        return localDeviceAndSensors;
    }

    private static Log _log = LogFactoryUtil.getLog(DeviceDAO.class);
}

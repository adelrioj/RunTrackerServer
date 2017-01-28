package es.eina.tfg.DeviceManager.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.DeviceManager.exception.UnableToDeleteDeviceException;
import es.eina.tfg.DeviceManager.model.DeviceDisplayTerms;
import es.eina.tfg.RunTrackerBL.dao.DeviceDAO;
import es.eina.tfg.RunTrackerBL.entity.Device;

import java.util.Collections;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

public class DeviceManager {

    public static void delete(Long idDevice)
            throws UnableToDeleteDeviceException {
        try {
            if (isNotNull(idDevice)){
                Device device = DeviceDAO.delete(idDevice);
                _log.info("Device successfully deleted: " + device);
            }
        } catch (SystemException e) {
            _log.error("SystemException while DeviceDAO.delete for: " + idDevice, e);
            throw new UnableToDeleteDeviceException(e);
        } catch (PortalException e) {
            _log.error("PortalException while DeviceDAO.delete for: " + idDevice, e);
            throw new UnableToDeleteDeviceException(e);
        }
    }

    public static Device getRouteToRender(long idDevice) {
        Device device = null;
        if (isNotNull(idDevice) || idDevice != 0) {
            try {
                device = DeviceDAO.getByIdDevice(idDevice);
            } catch (SystemException e) {
                _log.error("SystemException while DeviceDAO.getRouteToRender for: " + idDevice, e);
            } catch (PortalException e) {
                _log.error("PortalException while DeviceDAO.getRouteToRender for: " + idDevice, e);
            }
        }
        return device;
    }

    public static List<Device> getDeviceByDisplayTerms(DeviceDisplayTerms displayTerms, int start, int end) {
        long idUser = displayTerms.getUser().getUserId();
        String description = displayTerms.getDescription();

        List<Device> devices = Collections.emptyList();
        try {
            devices = DeviceDAO.getByIdUserAndDescription(idUser, description, start, end);
        } catch (SystemException e) {
            _log.error("SystemException while DeviceDAO.getByIdUserAndDescription for: " + displayTerms);
        } catch (PortalException e) {
            _log.error("PortalException while DeviceDAO.getByIdUserAndDescription for: " + displayTerms);
        }
        return devices;
    }

    public static int getDeviceByDisplayTermsCount(DeviceDisplayTerms displayTerms) {
        long idUser = displayTerms.getUser().getUserId();
        String description = displayTerms.getDescription();

        int count = 0;
        try {
            count = DeviceDAO.getByIdUserAndDescriptionCount(idUser, description);
        } catch (SystemException e) {
            _log.error("SystemException while DeviceDAO.getByIdUserAndDescriptionCount for: " + displayTerms);
        }

        return count;
    }

    private static Log _log = LogFactoryUtil.getLog(DeviceManager.class);
}

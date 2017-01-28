package es.eina.tfg.RunTrackerBL.dao;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RunTrackerBL.converter.SensorConverter;
import es.eina.tfg.RunTrackerBL.entity.Sensor;
import es.eina.tfg.service.SensorLocalServiceUtil;

public class SensorDAO {

    public static Sensor getByIdSensor(long idSensor)
            throws PortalException, SystemException {
        Sensor sensor;
        try {
            es.eina.tfg.model.Sensor sbSensor = SensorLocalServiceUtil.getSensor(idSensor);
            sensor = SensorConverter.toLocalSensor(sbSensor);
        } catch (PortalException e) {
            _log.error("PortalException while SensorLocalServiceUtil.getSensor() for idSensor: " + idSensor);
            throw e;
        } catch (SystemException e) {
            _log.error("SystemException while SensorLocalServiceUtil.getSensor() for idSensor: " + idSensor);
            throw e;
        }
        return sensor;
    }

    private static Log _log = LogFactoryUtil.getLog(SensorDAO.class);
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class Device_SensorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Device_SensorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Device_SensorLocalServiceUtil.getService());
        setClass(Device_Sensor.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.deviceId");
    }
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.DeviceAndSensor;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class DeviceAndSensorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DeviceAndSensorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DeviceAndSensorLocalServiceUtil.getService());
        setClass(DeviceAndSensor.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idDevice");
    }
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Sensor;
import es.eina.tfg.service.SensorLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class SensorActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SensorActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SensorLocalServiceUtil.getService());
        setClass(Sensor.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("sensorId");
    }
}

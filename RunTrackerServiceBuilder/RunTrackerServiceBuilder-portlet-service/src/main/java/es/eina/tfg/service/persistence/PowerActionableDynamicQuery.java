package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Power;
import es.eina.tfg.service.PowerLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class PowerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PowerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PowerLocalServiceUtil.getService());
        setClass(Power.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idMeasurement");
    }
}

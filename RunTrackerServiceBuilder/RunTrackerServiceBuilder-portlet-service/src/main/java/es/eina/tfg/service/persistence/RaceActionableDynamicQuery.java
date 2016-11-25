package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Race;
import es.eina.tfg.service.RaceLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class RaceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RaceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RaceLocalServiceUtil.getService());
        setClass(Race.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idRace");
    }
}

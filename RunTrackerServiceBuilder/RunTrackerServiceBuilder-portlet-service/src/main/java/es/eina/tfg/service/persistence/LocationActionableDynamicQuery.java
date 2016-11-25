package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Location;
import es.eina.tfg.service.LocationLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class LocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LocationLocalServiceUtil.getService());
        setClass(Location.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idRace");
    }
}

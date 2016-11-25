package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class RouteLocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RouteLocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RouteLocationLocalServiceUtil.getService());
        setClass(RouteLocation.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idRouteLocation");
    }
}

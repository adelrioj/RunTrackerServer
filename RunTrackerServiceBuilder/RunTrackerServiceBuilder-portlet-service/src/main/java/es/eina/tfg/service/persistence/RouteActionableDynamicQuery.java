package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Route;
import es.eina.tfg.service.RouteLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class RouteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RouteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RouteLocalServiceUtil.getService());
        setClass(Route.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("routeId");
    }
}

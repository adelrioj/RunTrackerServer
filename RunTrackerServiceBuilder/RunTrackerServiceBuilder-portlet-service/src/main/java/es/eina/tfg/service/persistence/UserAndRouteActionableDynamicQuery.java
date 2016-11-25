package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class UserAndRouteActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserAndRouteActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserAndRouteLocalServiceUtil.getService());
        setClass(UserAndRoute.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idUser");
    }
}

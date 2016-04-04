package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class UserSelectedRoutesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserSelectedRoutesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserSelectedRoutesLocalServiceUtil.getService());
        setClass(UserSelectedRoutes.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.userId");
    }
}

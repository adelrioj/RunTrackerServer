package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class UserAndEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserAndEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserAndEventLocalServiceUtil.getService());
        setClass(UserAndEvent.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.idUser");
    }
}

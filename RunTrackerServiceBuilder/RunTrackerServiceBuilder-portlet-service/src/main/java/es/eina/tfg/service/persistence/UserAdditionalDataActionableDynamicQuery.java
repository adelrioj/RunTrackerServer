package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

/**
 * @author adelrioj
 * @generated
 */
public abstract class UserAdditionalDataActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserAdditionalDataActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserAdditionalDataLocalServiceUtil.getService());
        setClass(UserAdditionalData.class);

        setClassLoader(es.eina.tfg.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}

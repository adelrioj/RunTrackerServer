package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

/**
 * The extended model base implementation for the UserAdditionalData service. Represents a row in the &quot;GL_UserAdditionalData&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAdditionalDataImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataImpl
 * @see es.eina.tfg.model.UserAdditionalData
 * @generated
 */
public abstract class UserAdditionalDataBaseImpl
    extends UserAdditionalDataModelImpl implements UserAdditionalData {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user additional data model instance should use the {@link UserAdditionalData} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserAdditionalDataLocalServiceUtil.addUserAdditionalData(this);
        } else {
            UserAdditionalDataLocalServiceUtil.updateUserAdditionalData(this);
        }
    }
}

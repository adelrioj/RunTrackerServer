package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;

/**
 * The extended model base implementation for the UserSelectedRoutes service. Represents a row in the &quot;GL_UserSelectedRoutes&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserSelectedRoutesImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserSelectedRoutesImpl
 * @see es.eina.tfg.model.UserSelectedRoutes
 * @generated
 */
public abstract class UserSelectedRoutesBaseImpl
    extends UserSelectedRoutesModelImpl implements UserSelectedRoutes {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user selected routes model instance should use the {@link UserSelectedRoutes} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserSelectedRoutesLocalServiceUtil.addUserSelectedRoutes(this);
        } else {
            UserSelectedRoutesLocalServiceUtil.updateUserSelectedRoutes(this);
        }
    }
}

package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;

/**
 * The extended model base implementation for the UserAndRoute service. Represents a row in the &quot;GL_UserAndRoute&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserAndRouteImpl}.
 * </p>
 *
 * @author adelrioj
 * @see UserAndRouteImpl
 * @see es.eina.tfg.model.UserAndRoute
 * @generated
 */
public abstract class UserAndRouteBaseImpl extends UserAndRouteModelImpl
    implements UserAndRoute {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a user and route model instance should use the {@link UserAndRoute} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UserAndRouteLocalServiceUtil.addUserAndRoute(this);
        } else {
            UserAndRouteLocalServiceUtil.updateUserAndRoute(this);
        }
    }
}
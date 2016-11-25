package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserAndRoute;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;
import es.eina.tfg.service.base.UserAndRouteLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.UserAndRouteUtil;

import java.util.List;

/**
 * The implementation of the user selected routes local service.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks based on the propagated JAAS credentials
 * because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see UserAndRouteLocalServiceBaseImpl
 * @see es.eina.tfg.service.UserAndRouteLocalServiceUtil
 */
public class UserAndRouteLocalServiceImpl
        extends UserAndRouteLocalServiceBaseImpl {

    @Override
    public UserAndRoute addUserAndRoute(UserAndRoute userAndRoute)
            throws SystemException {
        checkMadatoryAttributes(userAndRoute);
        return super.addUserAndRoute(userAndRoute);
    }

    private void checkMadatoryAttributes(UserAndRoute userAndRoute)
            throws SystemException {
        UserAdditionalData user = UserAdditionalDataLocalServiceUtil.fetchUserAdditionalData(userAndRoute.getIdUser());
        if (user == null){
            throw new SystemException("The user: "
                    + userAndRoute.getIdUser() + " does not exists on the database");
        }

        Route route = RouteLocalServiceUtil.fetchRoute(userAndRoute.getIdRoute());
        if (route == null){
            throw new SystemException("The route: "
                    + userAndRoute.getIdRoute() + " does no exists on the database");
        }
    }

    public List<UserAndRoute> getByidUser(Long userId)
            throws SystemException {
        return UserAndRouteUtil.findByuserId(userId);
    }
}

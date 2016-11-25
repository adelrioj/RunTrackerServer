package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.*;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;
import es.eina.tfg.service.base.UserAdditionalDataLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the user additional data local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.UserAdditionalDataLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataLocalServiceBaseImpl
 * @see es.eina.tfg.service.UserAdditionalDataLocalServiceUtil
 */
public class UserAdditionalDataLocalServiceImpl
    extends UserAdditionalDataLocalServiceBaseImpl {

    @Override
    public UserAdditionalData addUserAdditionalData(UserAdditionalData userAdditionalData)
            throws SystemException {
        checkMadatoryAttributes(userAdditionalData);
        userAdditionalData.setSmsCount(0);
        return super.addUserAdditionalData(userAdditionalData);
    }

    @Override
    public UserAdditionalData updateUserAdditionalData(UserAdditionalData userAdditionalData)
            throws SystemException {
        checkMadatoryAttributes(userAdditionalData);
        return super.updateUserAdditionalData(userAdditionalData);
    }

    private void checkMadatoryAttributes(UserAdditionalData userAdditionalData)
            throws SystemException {
        User user = UserLocalServiceUtil.fetchUser(userAdditionalData.getIdUser());
        if (user == null){
            throw new SystemException("The user: "
                    + userAdditionalData.getIdUser() +" does not exists on the database");
        }
    }

    public List<UserAndRoute> getUserAndRoute(Long userId)
            throws SystemException {
        return UserAndRouteLocalServiceUtil.getByidUser(userId);
    }

    public List<Route> getAssociatedRoutes(Long idUser)
            throws SystemException, PortalException {
        List<UserAndRoute> userAndRoutes = UserAndRouteLocalServiceUtil.getByidUser(idUser);
        List<Route> routes = new ArrayList<Route>();
        for (UserAndRoute userAndRoute : userAndRoutes) {
            routes.add(RouteLocalServiceUtil.getRoute(userAndRoute.getIdRoute()));
        }
        return routes;
    }

    public List<Event> getAssociatedEvents(Long idUser)
            throws SystemException, PortalException {
        List<UserAndEvent> userAndEvents = UserAndEventLocalServiceUtil.getByidUser(idUser);
        List<Event> events = new ArrayList<Event>();
        for (UserAndEvent event : userAndEvents) {
            events.add(EventLocalServiceUtil.getEvent(event.getIdEvent()));
        }
        return events;
    }
}

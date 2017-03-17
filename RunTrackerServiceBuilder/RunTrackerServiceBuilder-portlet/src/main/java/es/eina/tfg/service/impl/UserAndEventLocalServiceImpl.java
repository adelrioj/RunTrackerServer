package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Event;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.service.*;
import es.eina.tfg.service.base.UserAndEventLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.UserAndEventPK;
import es.eina.tfg.service.persistence.UserAndEventPersistence;
import es.eina.tfg.service.persistence.UserAndEventUtil;

import java.util.List;

/**
 * The implementation of the user and event local service.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks based on the propagated JAAS credentials
 * because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see UserAndEventLocalServiceBaseImpl
 * @see es.eina.tfg.service.UserAndEventLocalServiceUtil
 */
public class UserAndEventLocalServiceImpl
    extends UserAndEventLocalServiceBaseImpl {

    @Override
    public UserAndEvent addUserAndEvent(UserAndEvent userAndEvent)
            throws SystemException {
        checkMadatoryAttributes(userAndEvent);
        return super.addUserAndEvent(userAndEvent);
    }

    public UserAndEvent addUserAndEvent(long idUser, long idEvent)
            throws SystemException {
        UserAndEventPK userAndEventPK = new UserAndEventPK(idUser, idEvent);
        UserAndEvent userAndEvent = UserAndEventLocalServiceUtil.createUserAndEvent(userAndEventPK);
        checkMadatoryAttributes(userAndEvent);
        return super.addUserAndEvent(userAndEvent);
    }

    public UserAndEvent deleteUserAndEvent(long idEvent, long idUser)
            throws SystemException, PortalException {
        UserAndEventPK userAndEventPK = new UserAndEventPK(idUser, idEvent);
        return deleteUserAndEvent(userAndEventPK);
    }

    private void checkMadatoryAttributes(UserAndEvent userAndEvent)
            throws SystemException {
        UserAdditionalData user = UserAdditionalDataLocalServiceUtil.fetchUserAdditionalData(userAndEvent.getIdUser());
        if (user == null){
            throw new SystemException("The user: "
                    + userAndEvent.getIdUser() + " does not exists on the database");
        }

        Event event = EventLocalServiceUtil.fetchEvent(userAndEvent.getIdEvent());
        if (event == null){
            throw new SystemException("The event: "
                    + userAndEvent.getIdEvent() + " does no exists on the database");
        }
    }

    public List<UserAndEvent> getByidUser(long userId)
            throws SystemException {
        return UserAndEventUtil.findByuserId(userId);
    }

    public List<UserAndEvent> getByidEvent(long idEvent)
            throws SystemException {
        return UserAndEventUtil.findByidEvent(idEvent);
    }

    public List<UserAndEvent> getByRace(long idRace)
            throws SystemException {
        return UserAndEventUtil.findByraceId(idRace);
    }
}

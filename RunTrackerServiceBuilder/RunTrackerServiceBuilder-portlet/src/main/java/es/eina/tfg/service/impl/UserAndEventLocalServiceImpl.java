package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.model.Event;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import es.eina.tfg.service.base.UserAndEventLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.UserAndEventFinderUtil;
import es.eina.tfg.service.persistence.UserAndEventPK;
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

    public UserAndEvent addUserAndEvent(long idUser, long idEvent)
            throws SystemException, PortalException {
        checkMadatoryAttributes(idUser, idEvent);

        UserAndEventFinderUtil.add(idUser, idEvent);

        UserAndEventPK userAndEventPK = new UserAndEventPK(idUser, idEvent);
        return getUserAndEvent(userAndEventPK);
    }

    public UserAndEvent deleteUserAndEvent(long idEvent, long idUser)
            throws SystemException, PortalException {
        UserAndEventPK userAndEventPK = new UserAndEventPK(idUser, idEvent);
        return deleteUserAndEvent(userAndEventPK);
    }

    private void checkMadatoryAttributes(long idUser, long idEvent)
            throws SystemException {
        UserAdditionalData user = UserAdditionalDataLocalServiceUtil.fetchUserAdditionalData(idUser);
        if (user == null){
            throw new SystemException("The user: " + idUser + " does not exists on the database");
        }

        Event event = EventLocalServiceUtil.fetchEvent(idEvent);
        if (event == null){
            throw new SystemException("The event: " + idEvent + " does no exists on the database");
        }
    }

    public UserAndEvent getById(long userId, long idEvent)
            throws SystemException, PortalException {
        UserAndEventPK userAndEventPK = new UserAndEventPK(userId, idEvent);
        return getUserAndEvent(userAndEventPK);
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

    public List<UserAndEvent> getByIdEventAndName(long idEvent, String name)
            throws SystemException{
        return UserAndEventFinderUtil.getByIdEventAndName(idEvent, name);
    }

    public List<UserAndEvent> getByIdEventAndName(long idEvent, String name, int start, int end)
            throws SystemException{
        return UserAndEventFinderUtil.getByIdEventAndName(idEvent, name, start, end);
    }

    public List<UserAndEvent> getByIdEventAndName(long idEvent,
                                                  String name,
                                                  int start,
                                                  int end,
                                                  OrderByComparator orderByComparator)
            throws SystemException{
        return UserAndEventFinderUtil.getByIdEventAndName(idEvent, name, start, end, orderByComparator);
    }
}

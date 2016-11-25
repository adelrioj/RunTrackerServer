package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.model.Event;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.base.EventServiceBaseImpl;

import java.util.Date;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks based on the propagated JAAS credentials
 * because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see EventServiceBaseImpl
 * @see es.eina.tfg.service.EventServiceUtil
 */
public class EventServiceImpl
        extends EventServiceBaseImpl {
    public Event add (long idRoute, long idAuthor, String name, Date plannedStartingTime, Date plannedFinishTime,
                      Date realStartingTime, Date realFinishTime)
            throws SystemException {
        Event event = EventLocalServiceUtil.createEvent(EventLocalServiceUtil.generateNewIdEvent());
        event.setIdRoute(idRoute);
        event.setIdAuthor(idAuthor);
        event.setName(name);
        event.setPlannedStartingTime(plannedStartingTime);
        event.setPlannedFinishTime(plannedFinishTime);
        event.setRealStartingTime(realStartingTime);
        event.setRealFinishTime(realFinishTime);

        return EventLocalServiceUtil.addEvent(event);
    }

    public Event update(long idEvent, long idRoute, String name, Date plannedStartingTime, Date plannedFinishTime,
                        Date realStartingTime, Date realFinishTime)
            throws SystemException, PortalException {
        Event event = EventLocalServiceUtil.getEvent(idEvent);
        event.setIdRoute(idRoute);
        event.setName(name);
        event.setPlannedStartingTime(plannedStartingTime);
        event.setPlannedFinishTime(plannedFinishTime);
        event.setRealStartingTime(realStartingTime);
        event.setRealFinishTime(realFinishTime);

        return EventLocalServiceUtil.updateEvent(event);
    }

    public Event delete(long idEvent)
            throws SystemException, PortalException {
        return EventLocalServiceUtil.deleteEvent(idEvent);
    }

    public Event getByidEvent(long idEvent)
            throws SystemException, PortalException {
        return EventLocalServiceUtil.getEvent(idEvent);
    }

}

package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.Event;
import es.eina.tfg.model.Route;
import es.eina.tfg.model.UserAndEvent;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import es.eina.tfg.service.base.EventLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.EventFinderUtil;
import es.eina.tfg.service.persistence.EventUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

/**
 * The implementation of the event local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.EventLocalService} interface.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks based on the propagated JAAS credentials
 * because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see EventLocalServiceBaseImpl
 * @see es.eina.tfg.service.EventLocalServiceUtil
 */
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {

    public Long generateNewIdEvent()
            throws SystemException {
        try {
            return counterLocalService.increment(Event.class.getName());
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Event.class.getName());
            throw e;
        }
    }

    @Override
    public Event addEvent(Event event)
            throws SystemException {
        checkMadatoryAttributes(event);
        return super.addEvent(event);
    }

    @Override
    public Event updateEvent(Event event)
            throws SystemException {
        checkMadatoryAttributes(event);
        return super.updateEvent(event);
    }

    private void checkMadatoryAttributes(Event event)
            throws SystemException {

        User author = UserLocalServiceUtil.fetchUser(event.getIdAuthor());
        if (author == null){
            throw new SystemException("The user: " + event.getIdAuthor() +" does not exists on the database");
        }

        Route route = RouteLocalServiceUtil.fetchRoute(event.getIdRoute());
        if (route == null){
            throw new SystemException("The route: " + event.getIdRoute() +" does not exists on the database");
        }
    }

    /*public List<User> getParticipants(long idEvent)
            throws SystemException, PortalException {
        List<UserAndEvent> userAndEvents = UserAndEventLocalServiceUtil.getByidEvent(idEvent);
        List<User> users = new ArrayList<User>();
        for (UserAndEvent userAndEvent : userAndEvents) {
            users.add(UserLocalServiceUtil.getUser(userAndEvent.getIdUser()));
        }

        return users;
    }*/

    public List<Event> getByidAuthor(long idAuthor)
            throws SystemException {
        return EventUtil.findByauthor(idAuthor);
    }

    public List<Event> getByidRoute(long idRoute)
            throws SystemException {
        return EventUtil.findByrouteId(idRoute);
    }

    public List<Event> getByPlannedStartTime(Date plannedStartTime, int start, int end, OrderByComparator comparator)
            throws SystemException {
        return EventUtil.findByplannedStartingTime(plannedStartTime, start, end, comparator);
    }

    public List<Event> getByIdUserAndTimeRange(long idUser, Date startPlannedStartingTime,
                                               Date endPlannedStartingTime, int start, int end)
            throws SystemException {
        return EventFinderUtil.getByIdUserAndTimeRange(idUser, startPlannedStartingTime,
                endPlannedStartingTime, start, end);
    }

    public Event getLastEvent(long idUser)
            throws SystemException {
        return EventFinderUtil.getLastEvent(idUser);
    }

    public Event getLastUnselectedEvent(long idUser)
            throws SystemException {
        return EventFinderUtil.getLastUnselectedEvent(idUser);
    }

    public List<Event> getUnselectedEventsByIdUserAndTimeRange(long idUser,
                                                               Date startPlannedStartingTime,
                                                               Date endPlannedStartingTime,
                                                               int start,
                                                               int end)
            throws SystemException {
        return eventFinder.getUnselectedEventsByIdUserAndTimeRange(idUser, startPlannedStartingTime,
                endPlannedStartingTime, start, end);
    }

    public List<Event> getLiveEvents(String name,
                                        boolean isConjunction,
                                        int start,
                                        int end,
                                        OrderByComparator orderByComparator)
            throws SystemException, PortalException {
        DynamicQuery dynamicQuery = getEventDynamicQuery(null, null, name,
                null, null,
                null, null,
                isConjunction);

        dynamicQuery.add(PropertyFactoryUtil.forName("realStartingTime").isNotNull());
        dynamicQuery.add(PropertyFactoryUtil.forName("realFinishTime").isNull());

        return EventLocalServiceUtil.dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    private DynamicQuery getEventDynamicQuery(Long idRoute,
                                              Long idAuthor,
                                              String name,
                                              Date plannedStartTimeMin, Date plannedStartTimeMax,
                                              Date plannedFinishTimeMin, Date plannedFinishTimeMax,
                                              boolean isConjunction)
            throws SystemException {
        Junction junction =
                isConjunction ? RestrictionsFactoryUtil.conjunction() : RestrictionsFactoryUtil.disjunction();

        if (isNotNull(idRoute)){
            Property property = PropertyFactoryUtil.forName("idRoute");
            junction.add(property.eq(idRoute));
        }
        if (isNotNull(idAuthor)){
            Property property = PropertyFactoryUtil.forName("idAuthor");
            junction.add(property.eq(idAuthor));
        }
        if (isNotNull(name)){
            Property property = PropertyFactoryUtil.forName("name");
            String value = (new StringBuilder(StringPool.PERCENT)).append(name).append(StringPool.PERCENT).toString();
            junction.add(property.like(value));
        }
        if (isNotNull(plannedStartTimeMin) && isNotNull(plannedStartTimeMax)){
            Property property = PropertyFactoryUtil.forName("plannedStartingTime");
            junction.add(property.between(plannedStartTimeMin, plannedStartTimeMax));
        }
        if (isNotNull(plannedFinishTimeMin) && isNotNull(plannedFinishTimeMax)){
            Property property = PropertyFactoryUtil.forName("plannedFinishTime");
            junction.add(property.between(plannedFinishTimeMin, plannedFinishTimeMax));
        }

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(es.eina.tfg.model.Event.class);
        dynamicQuery.add(junction);

        return dynamicQuery;
    }

    private static Log _log = LogFactoryUtil.getLog(EventLocalServiceImpl.class);
}

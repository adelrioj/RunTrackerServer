package es.eina.tfg.liveRouteTracker.model;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import es.eina.tfg.RunTrackerBL.dao.EventDAO;
import es.eina.tfg.RunTrackerBL.entity.Event;
import es.eina.tfg.liveRouteTracker.exception.UnableToObtainEventException;
import es.eina.tfg.liveRouteTracker.model.DTO.EventDisplayTerms;

import java.util.Collections;
import java.util.List;

public class EventManager {

    public static List<Event> getLiveEventsByDisplayTerms(EventDisplayTerms displayTerms,
                                                          int start,
                                                          int end,
                                                          OrderByComparator orderByComparator) {
        _log.info("Starting getLiveEventsByDisplayTerms for: " + displayTerms);

        String name;
        boolean isConjunction;

        if (displayTerms.isAdvancedSearch()){
            name = displayTerms.getName();
            isConjunction = displayTerms.isAndOperator();
        } else {
            name = displayTerms.getKeywords();
            isConjunction = true;
        }

        List<Event> events = Collections.emptyList();
        try {
            events = EventDAO.getLiveEvents(name, isConjunction, start, end, orderByComparator);
        } catch (SystemException e) {
            _log.error("SystemException while getLiveEvents for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException while getLiveEvents for: " + displayTerms, e);
        }
        return events;
    }

    public static int getLiveEventsByDisplayTermsCount(EventDisplayTerms displayTerms) {
        _log.info("Starting getLiveEventsByDisplayTermsCount for: " + displayTerms);

        String name;
        if (displayTerms.isAdvancedSearch()){
            name = displayTerms.getKeywords();
        } else{
            name = displayTerms.getName();
        }

        int count = 0;
        try {
            count = EventDAO.getLiveEvents(name, true,
                    QueryUtil.ALL_POS, QueryUtil.ALL_POS, null).size();
        } catch (SystemException e) {
            _log.error("SystemException while getLiveEvents for: " + displayTerms, e);
        } catch (PortalException e) {
            _log.error("PortalException while getLiveEvents for: " + displayTerms, e);
        }
        return count;
    }

    public static Event getByIdEvent(Long idEvent)
            throws UnableToObtainEventException {
        try {
            return EventDAO.getByIdEvent(idEvent);
        } catch (SystemException e) {
            throw new UnableToObtainEventException(e);
        } catch (PortalException e) {
            throw new UnableToObtainEventException(e);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(EventManager.class);
}

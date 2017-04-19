package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class EventFinderUtil {
    private static EventFinder _finder;

    public static java.util.List<es.eina.tfg.model.Event> getByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .getByIdUserAndTimeRange(idUser, startPlannedStartingTime,
            endPlannedStartingTime, start, end);
    }

    public static java.util.List<es.eina.tfg.model.Event> getUnselectedEventsByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .getUnselectedEventsByIdUserAndTimeRange(idUser,
            startPlannedStartingTime, endPlannedStartingTime, start, end);
    }

    public static es.eina.tfg.model.Event getLastEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getLastEvent(idUser);
    }

    public static es.eina.tfg.model.Event getLastUnselectedEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getLastUnselectedEvent(idUser);
    }

    public static long countByIdAuthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByIdAuthor(idAuthor);
    }

    public static EventFinder getFinder() {
        if (_finder == null) {
            _finder = (EventFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    EventFinder.class.getName());

            ReferenceRegistry.registerReference(EventFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(EventFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(EventFinderUtil.class, "_finder");
    }
}

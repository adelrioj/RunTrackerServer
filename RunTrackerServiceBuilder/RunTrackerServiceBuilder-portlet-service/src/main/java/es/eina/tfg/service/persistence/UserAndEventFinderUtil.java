package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class UserAndEventFinderUtil {
    private static UserAndEventFinder _finder;

    public static void add(long idUser, long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().add(idUser, idEvent);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getByIdEventAndName(idEvent, name);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getByIdEventAndName(idEvent, name, start, end);
    }

    public static java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .getByIdEventAndName(idEvent, name, start, end,
            orderByComparator);
    }

    public static long countParticipationByIdUser(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countParticipationByIdUser(idAuthor);
    }

    public static UserAndEventFinder getFinder() {
        if (_finder == null) {
            _finder = (UserAndEventFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    UserAndEventFinder.class.getName());

            ReferenceRegistry.registerReference(UserAndEventFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(UserAndEventFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(UserAndEventFinderUtil.class,
            "_finder");
    }
}

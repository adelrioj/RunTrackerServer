package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class RaceFinderUtil {
    private static RaceFinder _finder;

    public static java.util.List<es.eina.tfg.model.Race> getByIdUserAndTimeRange(
        long idUser, java.util.Date startTime, java.util.Date endTime,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .getByIdUserAndTimeRange(idUser, startTime, endTime, start,
            end);
    }

    public static es.eina.tfg.model.Race getLastRace(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getLastRace(idUser);
    }

    public static RaceFinder getFinder() {
        if (_finder == null) {
            _finder = (RaceFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    RaceFinder.class.getName());

            ReferenceRegistry.registerReference(RaceFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(RaceFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RaceFinderUtil.class, "_finder");
    }
}

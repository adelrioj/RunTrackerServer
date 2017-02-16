package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class LocationFinderUtil {
    private static LocationFinder _finder;

    public static void deleteByIdRace(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().deleteByIdRace(idRace);
    }

    public static LocationFinder getFinder() {
        if (_finder == null) {
            _finder = (LocationFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    LocationFinder.class.getName());

            ReferenceRegistry.registerReference(LocationFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(LocationFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(LocationFinderUtil.class, "_finder");
    }
}

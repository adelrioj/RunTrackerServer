package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class RouteLocationFinderUtil {
    private static RouteLocationFinder _finder;

    public static void deleteByIdRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().deleteByIdRoute(idRoute);
    }

    public static RouteLocationFinder getFinder() {
        if (_finder == null) {
            _finder = (RouteLocationFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    RouteLocationFinder.class.getName());

            ReferenceRegistry.registerReference(RouteLocationFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(RouteLocationFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RouteLocationFinderUtil.class,
            "_finder");
    }
}

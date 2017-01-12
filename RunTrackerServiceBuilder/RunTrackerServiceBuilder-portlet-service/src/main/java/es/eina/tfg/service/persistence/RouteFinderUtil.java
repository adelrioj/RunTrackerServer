package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class RouteFinderUtil {
    private static RouteFinder _finder;

    public static java.util.List<es.eina.tfg.model.Route> getByIdUserAndName(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getByIdUserAndName(idUser, name, start, end);
    }

    public static long getByIdUserAndNameCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getByIdUserAndNameCount(idUser, name);
    }

    public static java.util.List<es.eina.tfg.model.Route> getPublicRoutesNotSelectedByUser(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .getPublicRoutesNotSelectedByUser(idUser, name, start, end);
    }

    public static long getPublicRoutesNotSelectedByUserCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getPublicRoutesNotSelectedByUserCount(idUser, name);
    }

    public static RouteFinder getFinder() {
        if (_finder == null) {
            _finder = (RouteFinder) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    RouteFinder.class.getName());

            ReferenceRegistry.registerReference(RouteFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(RouteFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RouteFinderUtil.class, "_finder");
    }
}

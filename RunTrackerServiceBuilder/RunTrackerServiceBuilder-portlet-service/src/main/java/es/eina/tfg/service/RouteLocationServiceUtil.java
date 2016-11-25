package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for RouteLocation. This utility wraps
 * {@link es.eina.tfg.service.impl.RouteLocationServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see RouteLocationService
 * @see es.eina.tfg.service.base.RouteLocationServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteLocationServiceImpl
 * @generated
 */
public class RouteLocationServiceUtil {
    private static RouteLocationService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RouteLocationServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static es.eina.tfg.model.RouteLocation add(long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().add(routeId, latitude, longitude);
    }

    public static es.eina.tfg.model.RouteLocation update(long routeLocationId,
        long routeId, java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().update(routeLocationId, routeId, latitude, longitude);
    }

    public static es.eina.tfg.model.RouteLocation delete(long idRouteLocation,
        long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().delete(idRouteLocation, idRoute);
    }

    public static java.util.List<es.eina.tfg.model.RouteLocation> getByRouteId(
        long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByRouteId(routeId);
    }

    public static void clearService() {
        _service = null;
    }

    public static RouteLocationService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RouteLocationService.class.getName());

            if (invokableService instanceof RouteLocationService) {
                _service = (RouteLocationService) invokableService;
            } else {
                _service = new RouteLocationServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(RouteLocationServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RouteLocationService service) {
    }
}

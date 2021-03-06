package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Route. This utility wraps
 * {@link es.eina.tfg.service.impl.RouteServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see RouteService
 * @see es.eina.tfg.service.base.RouteServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteServiceImpl
 * @generated
 */
public class RouteServiceUtil {
    private static RouteService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RouteServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static es.eina.tfg.model.Route add(java.lang.String type,
        java.lang.String name, java.lang.String description,
        java.lang.Long authorId, boolean isPublic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().add(type, name, description, authorId, isPublic);
    }

    public static es.eina.tfg.model.Route update(java.lang.Long routeId,
        java.lang.String type, java.lang.String name,
        java.lang.String description, boolean isPublic)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().update(routeId, type, name, description, isPublic);
    }

    public static es.eina.tfg.model.Route delete(java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().delete(routeId);
    }

    public static es.eina.tfg.model.Route getRoute(java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRoute(routeId);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByAuthor(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByAuthor(userId);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByisPublic(
        boolean isPublic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByisPublic(isPublic);
    }

    public static java.util.List<es.eina.tfg.model.Route> getPublicRoutes(
        boolean isPublic, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPublicRoutes(isPublic, start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static RouteService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RouteService.class.getName());

            if (invokableService instanceof RouteService) {
                _service = (RouteService) invokableService;
            } else {
                _service = new RouteServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(RouteServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RouteService service) {
    }
}

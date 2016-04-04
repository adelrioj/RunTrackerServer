package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for UserSelectedRoutes. This utility wraps
 * {@link es.eina.tfg.service.impl.UserSelectedRoutesServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see UserSelectedRoutesService
 * @see es.eina.tfg.service.base.UserSelectedRoutesServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserSelectedRoutesServiceImpl
 * @generated
 */
public class UserSelectedRoutesServiceUtil {
    private static UserSelectedRoutesService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.UserSelectedRoutesServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static es.eina.tfg.model.UserSelectedRoutes add(
        java.lang.Long userId, java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException,
            es.eina.tfg.RouteAlreadySelectedByUserException {
        return getService().add(userId, routeId);
    }

    public static es.eina.tfg.model.UserSelectedRoutes delete(
        java.lang.Long userId, java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().delete(userId, routeId);
    }

    public static es.eina.tfg.model.UserSelectedRoutes getUserSelectedRoute(
        java.lang.Long userId, java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserSelectedRoute(userId, routeId);
    }

    public static void clearService() {
        _service = null;
    }

    public static UserSelectedRoutesService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UserSelectedRoutesService.class.getName());

            if (invokableService instanceof UserSelectedRoutesService) {
                _service = (UserSelectedRoutesService) invokableService;
            } else {
                _service = new UserSelectedRoutesServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(UserSelectedRoutesServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UserSelectedRoutesService service) {
    }
}

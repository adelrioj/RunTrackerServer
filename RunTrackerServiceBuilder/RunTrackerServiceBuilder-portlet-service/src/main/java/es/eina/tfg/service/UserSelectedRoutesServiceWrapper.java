package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserSelectedRoutesService}.
 *
 * @author adelrioj
 * @see UserSelectedRoutesService
 * @generated
 */
public class UserSelectedRoutesServiceWrapper
    implements UserSelectedRoutesService,
        ServiceWrapper<UserSelectedRoutesService> {
    private UserSelectedRoutesService _userSelectedRoutesService;

    public UserSelectedRoutesServiceWrapper(
        UserSelectedRoutesService userSelectedRoutesService) {
        _userSelectedRoutesService = userSelectedRoutesService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userSelectedRoutesService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userSelectedRoutesService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userSelectedRoutesService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public es.eina.tfg.model.UserSelectedRoutes add(java.lang.Long userId,
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException,
            es.eina.tfg.RouteAlreadySelectedByUserException {
        return _userSelectedRoutesService.add(userId, routeId);
    }

    @Override
    public es.eina.tfg.model.UserSelectedRoutes delete(java.lang.Long userId,
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userSelectedRoutesService.delete(userId, routeId);
    }

    @Override
    public es.eina.tfg.model.UserSelectedRoutes getUserSelectedRoute(
        java.lang.Long userId, java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userSelectedRoutesService.getUserSelectedRoute(userId, routeId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserSelectedRoutesService getWrappedUserSelectedRoutesService() {
        return _userSelectedRoutesService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserSelectedRoutesService(
        UserSelectedRoutesService userSelectedRoutesService) {
        _userSelectedRoutesService = userSelectedRoutesService;
    }

    @Override
    public UserSelectedRoutesService getWrappedService() {
        return _userSelectedRoutesService;
    }

    @Override
    public void setWrappedService(
        UserSelectedRoutesService userSelectedRoutesService) {
        _userSelectedRoutesService = userSelectedRoutesService;
    }
}

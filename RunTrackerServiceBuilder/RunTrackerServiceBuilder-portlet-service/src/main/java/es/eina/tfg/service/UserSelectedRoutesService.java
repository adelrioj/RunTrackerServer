package es.eina.tfg.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for UserSelectedRoutes. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see UserSelectedRoutesServiceUtil
 * @see es.eina.tfg.service.base.UserSelectedRoutesServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserSelectedRoutesServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface UserSelectedRoutesService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserSelectedRoutesServiceUtil} to access the user selected routes remote service. Add custom service methods to {@link es.eina.tfg.service.impl.UserSelectedRoutesServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public es.eina.tfg.model.UserSelectedRoutes add(java.lang.Long userId,
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException,
            es.eina.tfg.RouteAlreadySelectedByUserException;

    public es.eina.tfg.model.UserSelectedRoutes delete(java.lang.Long userId,
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public es.eina.tfg.model.UserSelectedRoutes getUserSelectedRoute(
        java.lang.Long userId, java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}

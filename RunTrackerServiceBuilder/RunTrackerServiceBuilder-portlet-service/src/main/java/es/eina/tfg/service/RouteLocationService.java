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
 * Provides the remote service interface for RouteLocation. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see RouteLocationServiceUtil
 * @see es.eina.tfg.service.base.RouteLocationServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteLocationServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RouteLocationService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RouteLocationServiceUtil} to access the route location remote service. Add custom service methods to {@link es.eina.tfg.service.impl.RouteLocationServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public es.eina.tfg.model.RouteLocation add(java.lang.Long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRouteException;

    public es.eina.tfg.model.RouteLocation update(
        java.lang.Long routeLocationId, java.lang.Long routeId,
        java.lang.Double latitude, java.lang.Double longitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRouteException,
            es.eina.tfg.NonExistingRouteLocationException;

    public es.eina.tfg.model.RouteLocation delete(
        java.lang.Long routeLocationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public es.eina.tfg.model.RouteLocation getRouteLocation(
        java.lang.Long routeLocationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.RouteLocation> findByRouteId(
        java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.SystemException;
}

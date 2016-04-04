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
 * Provides the remote service interface for Route. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see RouteServiceUtil
 * @see es.eina.tfg.service.base.RouteServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RouteService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RouteServiceUtil} to access the route remote service. Add custom service methods to {@link es.eina.tfg.service.impl.RouteServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public es.eina.tfg.model.Route add(java.lang.String type,
        java.lang.String name, java.lang.String description,
        java.lang.Long authorId, boolean isPublic, java.util.Date startingTime)
        throws com.liferay.portal.kernel.exception.SystemException;

    public es.eina.tfg.model.Route update(java.lang.Long routeId,
        java.lang.String type, java.lang.String name,
        java.lang.String description, java.lang.Long authorId,
        boolean isPublic, java.util.Date startingTime,
        java.util.Date creationTime)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRouteException;

    public es.eina.tfg.model.Route delete(java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public es.eina.tfg.model.Route getRoute(java.lang.Long routeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.Route> findByAuthor(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<es.eina.tfg.model.Route> getPublicRoutes()
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<es.eina.tfg.model.Route> getPublicRoutes(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;
}

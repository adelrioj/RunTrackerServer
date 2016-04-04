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
 * Provides the remote service interface for Race. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author adelrioj
 * @see RaceServiceUtil
 * @see es.eina.tfg.service.base.RaceServiceBaseImpl
 * @see es.eina.tfg.service.impl.RaceServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface RaceService extends BaseService, InvokableService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RaceServiceUtil} to access the race remote service. Add custom service methods to {@link es.eina.tfg.service.impl.RaceServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

    public es.eina.tfg.model.Race add(java.lang.Long userId,
        java.lang.Long routeId, java.lang.String type,
        java.lang.Integer userHeight, java.lang.Integer userWeight)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException;

    public es.eina.tfg.model.Race update(java.lang.Long raceId,
        java.lang.Long userId, java.lang.Long routeId, java.lang.String type,
        java.lang.Integer userHeight, java.lang.Integer userWeight)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRaceException,
            es.eina.tfg.NonExistingUserException;

    public es.eina.tfg.model.Race delete(java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public es.eina.tfg.model.Race getRace(java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.Race> findByUserId(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException;
}

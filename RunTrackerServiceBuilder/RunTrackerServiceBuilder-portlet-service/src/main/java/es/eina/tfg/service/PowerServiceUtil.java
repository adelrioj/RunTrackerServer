package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Power. This utility wraps
 * {@link es.eina.tfg.service.impl.PowerServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see PowerService
 * @see es.eina.tfg.service.base.PowerServiceBaseImpl
 * @see es.eina.tfg.service.impl.PowerServiceImpl
 * @generated
 */
public class PowerServiceUtil {
    private static PowerService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.PowerServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static es.eina.tfg.model.Power add(java.lang.Long raceId,
        java.lang.Long deviceId, java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, java.lang.Integer level)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .add(raceId, deviceId, sensorId, time, sensorMode, level);
    }

    public static es.eina.tfg.model.Power getPower(long idMeasurement,
        long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPower(idMeasurement, idRace);
    }

    public static java.util.List<es.eina.tfg.model.Location> getByidRace(
        java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidRace(idRace);
    }

    public static void clearService() {
        _service = null;
    }

    public static PowerService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PowerService.class.getName());

            if (invokableService instanceof PowerService) {
                _service = (PowerService) invokableService;
            } else {
                _service = new PowerServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PowerServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PowerService service) {
    }
}

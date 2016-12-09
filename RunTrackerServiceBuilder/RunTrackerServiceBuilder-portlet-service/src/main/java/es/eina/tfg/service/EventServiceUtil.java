package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Event. This utility wraps
 * {@link es.eina.tfg.service.impl.EventServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author adelrioj
 * @see EventService
 * @see es.eina.tfg.service.base.EventServiceBaseImpl
 * @see es.eina.tfg.service.impl.EventServiceImpl
 * @generated
 */
public class EventServiceUtil {
    private static EventService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.EventServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static es.eina.tfg.model.Event add(long idRoute, long idAuthor,
        java.lang.String name, java.util.Date plannedStartingTime,
        java.util.Date plannedFinishTime, java.util.Date realStartingTime,
        java.util.Date realFinishTime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .add(idRoute, idAuthor, name, plannedStartingTime,
            plannedFinishTime, realStartingTime, realFinishTime);
    }

    public static es.eina.tfg.model.Event update(long idEvent, long idRoute,
        java.lang.String name, java.util.Date plannedStartingTime,
        java.util.Date plannedFinishTime, java.util.Date realStartingTime,
        java.util.Date realFinishTime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .update(idEvent, idRoute, name, plannedStartingTime,
            plannedFinishTime, realStartingTime, realFinishTime);
    }

    public static es.eina.tfg.model.Event delete(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().delete(idEvent);
    }

    public static es.eina.tfg.model.Event getByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidEvent(idEvent);
    }

    public static void clearService() {
        _service = null;
    }

    public static EventService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EventService.class.getName());

            if (invokableService instanceof EventService) {
                _service = (EventService) invokableService;
            } else {
                _service = new EventServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(EventServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(EventService service) {
    }
}
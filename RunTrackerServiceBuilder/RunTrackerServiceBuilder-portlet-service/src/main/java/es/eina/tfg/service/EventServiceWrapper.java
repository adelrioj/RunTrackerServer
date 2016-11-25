package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EventService}.
 *
 * @author adelrioj
 * @see EventService
 * @generated
 */
public class EventServiceWrapper implements EventService,
    ServiceWrapper<EventService> {
    private EventService _eventService;

    public EventServiceWrapper(EventService eventService) {
        _eventService = eventService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _eventService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _eventService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _eventService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public es.eina.tfg.model.Event add(long idRoute, long idAuthor,
        java.lang.String name, java.util.Date plannedStartingTime,
        java.util.Date plannedFinishTime, java.util.Date realStartingTime,
        java.util.Date realFinishTime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _eventService.add(idRoute, idAuthor, name, plannedStartingTime,
            plannedFinishTime, realStartingTime, realFinishTime);
    }

    @Override
    public es.eina.tfg.model.Event update(long idEvent, long idRoute,
        java.lang.String name, java.util.Date plannedStartingTime,
        java.util.Date plannedFinishTime, java.util.Date realStartingTime,
        java.util.Date realFinishTime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventService.update(idEvent, idRoute, name,
            plannedStartingTime, plannedFinishTime, realStartingTime,
            realFinishTime);
    }

    @Override
    public es.eina.tfg.model.Event delete(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventService.delete(idEvent);
    }

    @Override
    public es.eina.tfg.model.Event getByidEvent(long idEvent)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _eventService.getByidEvent(idEvent);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EventService getWrappedEventService() {
        return _eventService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEventService(EventService eventService) {
        _eventService = eventService;
    }

    @Override
    public EventService getWrappedService() {
        return _eventService;
    }

    @Override
    public void setWrappedService(EventService eventService) {
        _eventService = eventService;
    }
}

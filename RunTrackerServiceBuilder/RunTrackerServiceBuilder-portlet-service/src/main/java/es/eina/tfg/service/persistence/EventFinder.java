package es.eina.tfg.service.persistence;

public interface EventFinder {
    public java.util.List<es.eina.tfg.model.Event> getByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.Event> getUnselectedEventsByIdUserAndTimeRange(
        long idUser, java.util.Date startPlannedStartingTime,
        java.util.Date endPlannedStartingTime, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public es.eina.tfg.model.Event getLastEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    public es.eina.tfg.model.Event getLastUnselectedEvent(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.UserAndEvent> getUserAndEventByIdEvent(
        long idEvent, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}

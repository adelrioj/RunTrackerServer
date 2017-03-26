package es.eina.tfg.service.persistence;

public interface UserAndEventFinder {
    public void add(long idUser, long idEvent)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.UserAndEvent> getByIdEventAndName(
        long idEvent, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;
}

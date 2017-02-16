package es.eina.tfg.service.persistence;

public interface RaceFinder {
    public java.util.List<es.eina.tfg.model.Race> getByIdUserAndTimeRange(
        long idUser, java.util.Date startTime, java.util.Date endTime,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public es.eina.tfg.model.Race getLastRace(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;
}

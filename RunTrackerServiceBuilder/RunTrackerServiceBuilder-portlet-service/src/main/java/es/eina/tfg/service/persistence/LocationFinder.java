package es.eina.tfg.service.persistence;

public interface LocationFinder {
    public void deleteByIdRace(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;
}

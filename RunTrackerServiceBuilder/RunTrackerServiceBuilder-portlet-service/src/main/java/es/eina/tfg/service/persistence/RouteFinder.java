package es.eina.tfg.service.persistence;

public interface RouteFinder {
    public java.util.List<es.eina.tfg.model.Route> getByIdUserAndName(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long getByIdUserAndNameCount(long idUser, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;
}

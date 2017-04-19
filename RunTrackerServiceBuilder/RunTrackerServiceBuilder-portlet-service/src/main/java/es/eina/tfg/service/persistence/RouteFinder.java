package es.eina.tfg.service.persistence;

public interface RouteFinder {
    public java.util.List<es.eina.tfg.model.Route> getByIdUserAndName(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long getByIdUserAndNameCount(long idUser, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<es.eina.tfg.model.Route> getPublicRoutesNotSelectedByUser(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long getPublicRoutesNotSelectedByUserCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long countByIdAuthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException;
}

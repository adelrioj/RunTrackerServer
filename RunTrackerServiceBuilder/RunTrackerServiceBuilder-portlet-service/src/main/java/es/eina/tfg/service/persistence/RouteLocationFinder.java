package es.eina.tfg.service.persistence;

public interface RouteLocationFinder {
    public void deleteByIdRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;
}

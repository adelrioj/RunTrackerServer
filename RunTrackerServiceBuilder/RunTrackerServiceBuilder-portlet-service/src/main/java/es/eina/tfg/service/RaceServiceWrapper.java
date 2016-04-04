package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RaceService}.
 *
 * @author adelrioj
 * @see RaceService
 * @generated
 */
public class RaceServiceWrapper implements RaceService,
    ServiceWrapper<RaceService> {
    private RaceService _raceService;

    public RaceServiceWrapper(RaceService raceService) {
        _raceService = raceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _raceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _raceService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _raceService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public es.eina.tfg.model.Race add(java.lang.Long userId,
        java.lang.Long routeId, java.lang.String type,
        java.lang.Integer userHeight, java.lang.Integer userWeight)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException {
        return _raceService.add(userId, routeId, type, userHeight, userWeight);
    }

    @Override
    public es.eina.tfg.model.Race update(java.lang.Long raceId,
        java.lang.Long userId, java.lang.Long routeId, java.lang.String type,
        java.lang.Integer userHeight, java.lang.Integer userWeight)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingRaceException,
            es.eina.tfg.NonExistingUserException {
        return _raceService.update(raceId, userId, routeId, type, userHeight,
            userWeight);
    }

    @Override
    public es.eina.tfg.model.Race delete(java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _raceService.delete(raceId);
    }

    @Override
    public es.eina.tfg.model.Race getRace(java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _raceService.getRace(raceId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Race> findByUserId(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceService.findByUserId(userId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RaceService getWrappedRaceService() {
        return _raceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRaceService(RaceService raceService) {
        _raceService = raceService;
    }

    @Override
    public RaceService getWrappedService() {
        return _raceService;
    }

    @Override
    public void setWrappedService(RaceService raceService) {
        _raceService = raceService;
    }
}

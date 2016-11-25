package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PowerService}.
 *
 * @author adelrioj
 * @see PowerService
 * @generated
 */
public class PowerServiceWrapper implements PowerService,
    ServiceWrapper<PowerService> {
    private PowerService _powerService;

    public PowerServiceWrapper(PowerService powerService) {
        _powerService = powerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _powerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _powerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _powerService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public es.eina.tfg.model.Power add(java.lang.Long raceId,
        java.lang.Long deviceId, java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, java.lang.Integer level)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _powerService.add(raceId, deviceId, sensorId, time, sensorMode,
            level);
    }

    @Override
    public es.eina.tfg.model.Power getPower(long idMeasurement, long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _powerService.getPower(idMeasurement, idRace);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Location> getByidRace(
        java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _powerService.getByidRace(idRace);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PowerService getWrappedPowerService() {
        return _powerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPowerService(PowerService powerService) {
        _powerService = powerService;
    }

    @Override
    public PowerService getWrappedService() {
        return _powerService;
    }

    @Override
    public void setWrappedService(PowerService powerService) {
        _powerService = powerService;
    }
}

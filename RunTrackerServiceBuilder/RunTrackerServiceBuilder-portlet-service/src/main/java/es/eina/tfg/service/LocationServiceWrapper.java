package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LocationService}.
 *
 * @author adelrioj
 * @see LocationService
 * @generated
 */
public class LocationServiceWrapper implements LocationService,
    ServiceWrapper<LocationService> {
    private LocationService _locationService;

    public LocationServiceWrapper(LocationService locationService) {
        _locationService = locationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _locationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _locationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _locationService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public es.eina.tfg.model.Location add(java.lang.Long raceId,
        java.lang.Long userId, java.lang.Long deviceId,
        java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, int sysRef, double latitude,
        double longitude, double speed, double distance, double altitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingDeviceAndSensorRelationException,
            es.eina.tfg.NonExistingRaceException,
            es.eina.tfg.NonExistingUserException {
        return _locationService.add(raceId, userId, deviceId, sensorId, time,
            sensorMode, sysRef, latitude, longitude, speed, distance, altitude);
    }

    @Override
    public es.eina.tfg.model.Location update(java.lang.Long measurementId,
        java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
        java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, int sysRef, double latitude,
        double longitude, double speed, double distance, double altitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingMeasurementException {
        return _locationService.update(measurementId, raceId, userId, deviceId,
            sensorId, time, sensorMode, sysRef, latitude, longitude, speed,
            distance, altitude);
    }

    @Override
    public es.eina.tfg.model.Location delete(java.lang.Long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _locationService.delete(measurementId);
    }

    @Override
    public es.eina.tfg.model.Location getLocation(java.lang.Long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _locationService.getLocation(measurementId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Location> findByRaceId(
        java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationService.findByRaceId(raceId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LocationService getWrappedLocationService() {
        return _locationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLocationService(LocationService locationService) {
        _locationService = locationService;
    }

    @Override
    public LocationService getWrappedService() {
        return _locationService;
    }

    @Override
    public void setWrappedService(LocationService locationService) {
        _locationService = locationService;
    }
}

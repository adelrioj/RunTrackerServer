package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LocationLocalService}.
 *
 * @author adelrioj
 * @see LocationLocalService
 * @generated
 */
public class LocationLocalServiceWrapper implements LocationLocalService,
    ServiceWrapper<LocationLocalService> {
    private LocationLocalService _locationLocalService;

    public LocationLocalServiceWrapper(
        LocationLocalService locationLocalService) {
        _locationLocalService = locationLocalService;
    }

    /**
    * Adds the location to the database. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Location addLocation(
        es.eina.tfg.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.addLocation(location);
    }

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param measurementId the primary key for the new location
    * @return the new location
    */
    @Override
    public es.eina.tfg.model.Location createLocation(long measurementId) {
        return _locationLocalService.createLocation(measurementId);
    }

    /**
    * Deletes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param measurementId the primary key of the location
    * @return the location that was removed
    * @throws PortalException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Location deleteLocation(long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.deleteLocation(measurementId);
    }

    /**
    * Deletes the location from the database. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Location deleteLocation(
        es.eina.tfg.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.deleteLocation(location);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _locationLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.eina.tfg.model.Location fetchLocation(long measurementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.fetchLocation(measurementId);
    }

    /**
    * Returns the location with the primary key.
    *
    * @param measurementId the primary key of the location
    * @return the location
    * @throws PortalException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Location getLocation(long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.getLocation(measurementId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @return the range of locations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.Location> getLocations(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.getLocations(start, end);
    }

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.getLocationsCount();
    }

    /**
    * Updates the location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param location the location
    * @return the location that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Location updateLocation(
        es.eina.tfg.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.updateLocation(location);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _locationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _locationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _locationLocalService.invokeMethod(name, parameterTypes,
            arguments);
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
        return _locationLocalService.add(raceId, userId, deviceId, sensorId,
            time, sensorMode, sysRef, latitude, longitude, speed, distance,
            altitude);
    }

    @Override
    public es.eina.tfg.model.Location update(java.lang.Long measurementId,
        java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
        java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, int sysRef, double latitude,
        double longitude, double speed, double distance, double altitude)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingMeasurementException {
        return _locationLocalService.update(measurementId, raceId, userId,
            deviceId, sensorId, time, sensorMode, sysRef, latitude, longitude,
            speed, distance, altitude);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Location> findByRaceId(
        java.lang.Long raceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _locationLocalService.findByRaceId(raceId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LocationLocalService getWrappedLocationLocalService() {
        return _locationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLocationLocalService(
        LocationLocalService locationLocalService) {
        _locationLocalService = locationLocalService;
    }

    @Override
    public LocationLocalService getWrappedService() {
        return _locationLocalService;
    }

    @Override
    public void setWrappedService(LocationLocalService locationLocalService) {
        _locationLocalService = locationLocalService;
    }
}

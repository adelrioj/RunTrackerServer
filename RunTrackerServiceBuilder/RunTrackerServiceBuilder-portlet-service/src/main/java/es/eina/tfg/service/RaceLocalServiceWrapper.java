package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RaceLocalService}.
 *
 * @author adelrioj
 * @see RaceLocalService
 * @generated
 */
public class RaceLocalServiceWrapper implements RaceLocalService,
    ServiceWrapper<RaceLocalService> {
    private RaceLocalService _raceLocalService;

    public RaceLocalServiceWrapper(RaceLocalService raceLocalService) {
        _raceLocalService = raceLocalService;
    }

    /**
    * Adds the race to the database. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Race addRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.addRace(race);
    }

    /**
    * Creates a new race with the primary key. Does not add the race to the database.
    *
    * @param idRace the primary key for the new race
    * @return the new race
    */
    @Override
    public es.eina.tfg.model.Race createRace(long idRace) {
        return _raceLocalService.createRace(idRace);
    }

    /**
    * Deletes the race with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idRace the primary key of the race
    * @return the race that was removed
    * @throws PortalException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Race deleteRace(long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.deleteRace(idRace);
    }

    /**
    * Deletes the race from the database. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Race deleteRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.deleteRace(race);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _raceLocalService.dynamicQuery();
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
        return _raceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _raceLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _raceLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _raceLocalService.dynamicQueryCount(dynamicQuery);
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
        return _raceLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public es.eina.tfg.model.Race fetchRace(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.fetchRace(idRace);
    }

    /**
    * Returns the race with the primary key.
    *
    * @param idRace the primary key of the race
    * @return the race
    * @throws PortalException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Race getRace(long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getRace(idRace);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the races.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of races
    * @param end the upper bound of the range of races (not inclusive)
    * @return the range of races
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<es.eina.tfg.model.Race> getRaces(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getRaces(start, end);
    }

    /**
    * Returns the number of races.
    *
    * @return the number of races
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRacesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getRacesCount();
    }

    /**
    * Updates the race in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.Race updateRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.updateRace(race);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _raceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _raceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _raceLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.lang.Long generateNewIdRace()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.generateNewIdRace();
    }

    @Override
    public java.util.List<es.eina.tfg.model.Race> getByUserId(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getByUserId(userId);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Race> getByIdUserAndTimeRange(
        long idUser, java.util.Date startTime, java.util.Date endTime,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getByIdUserAndTimeRange(idUser, startTime,
            endTime, start, end);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Location> getLocations(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getLocations(idRace);
    }

    @Override
    public java.util.List<es.eina.tfg.model.Power> getPowerMeasurements(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException {
        return _raceLocalService.getPowerMeasurements(idRace);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RaceLocalService getWrappedRaceLocalService() {
        return _raceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRaceLocalService(RaceLocalService raceLocalService) {
        _raceLocalService = raceLocalService;
    }

    @Override
    public RaceLocalService getWrappedService() {
        return _raceLocalService;
    }

    @Override
    public void setWrappedService(RaceLocalService raceLocalService) {
        _raceLocalService = raceLocalService;
    }
}

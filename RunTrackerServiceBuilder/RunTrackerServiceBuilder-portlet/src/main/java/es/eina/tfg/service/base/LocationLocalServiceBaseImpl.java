package es.eina.tfg.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import es.eina.tfg.model.Location;
import es.eina.tfg.service.LocationLocalService;
import es.eina.tfg.service.persistence.DeviceAndSensorPersistence;
import es.eina.tfg.service.persistence.DevicePersistence;
import es.eina.tfg.service.persistence.EventPersistence;
import es.eina.tfg.service.persistence.LocationPK;
import es.eina.tfg.service.persistence.LocationPersistence;
import es.eina.tfg.service.persistence.PowerPersistence;
import es.eina.tfg.service.persistence.RacePersistence;
import es.eina.tfg.service.persistence.RouteLocationPersistence;
import es.eina.tfg.service.persistence.RoutePersistence;
import es.eina.tfg.service.persistence.SensorPersistence;
import es.eina.tfg.service.persistence.UserAdditionalDataPersistence;
import es.eina.tfg.service.persistence.UserAndEventPersistence;
import es.eina.tfg.service.persistence.UserAndRoutePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the location local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link es.eina.tfg.service.impl.LocationLocalServiceImpl}.
 * </p>
 *
 * @author adelrioj
 * @see es.eina.tfg.service.impl.LocationLocalServiceImpl
 * @see es.eina.tfg.service.LocationLocalServiceUtil
 * @generated
 */
public abstract class LocationLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements LocationLocalService, IdentifiableBean {
    @BeanReference(type = es.eina.tfg.service.DeviceLocalService.class)
    protected es.eina.tfg.service.DeviceLocalService deviceLocalService;
    @BeanReference(type = es.eina.tfg.service.DeviceService.class)
    protected es.eina.tfg.service.DeviceService deviceService;
    @BeanReference(type = DevicePersistence.class)
    protected DevicePersistence devicePersistence;
    @BeanReference(type = es.eina.tfg.service.DeviceAndSensorLocalService.class)
    protected es.eina.tfg.service.DeviceAndSensorLocalService deviceAndSensorLocalService;
    @BeanReference(type = DeviceAndSensorPersistence.class)
    protected DeviceAndSensorPersistence deviceAndSensorPersistence;
    @BeanReference(type = es.eina.tfg.service.EventLocalService.class)
    protected es.eina.tfg.service.EventLocalService eventLocalService;
    @BeanReference(type = es.eina.tfg.service.EventService.class)
    protected es.eina.tfg.service.EventService eventService;
    @BeanReference(type = EventPersistence.class)
    protected EventPersistence eventPersistence;
    @BeanReference(type = es.eina.tfg.service.LocationLocalService.class)
    protected es.eina.tfg.service.LocationLocalService locationLocalService;
    @BeanReference(type = es.eina.tfg.service.LocationService.class)
    protected es.eina.tfg.service.LocationService locationService;
    @BeanReference(type = LocationPersistence.class)
    protected LocationPersistence locationPersistence;
    @BeanReference(type = es.eina.tfg.service.PowerLocalService.class)
    protected es.eina.tfg.service.PowerLocalService powerLocalService;
    @BeanReference(type = es.eina.tfg.service.PowerService.class)
    protected es.eina.tfg.service.PowerService powerService;
    @BeanReference(type = PowerPersistence.class)
    protected PowerPersistence powerPersistence;
    @BeanReference(type = es.eina.tfg.service.RaceLocalService.class)
    protected es.eina.tfg.service.RaceLocalService raceLocalService;
    @BeanReference(type = es.eina.tfg.service.RaceService.class)
    protected es.eina.tfg.service.RaceService raceService;
    @BeanReference(type = RacePersistence.class)
    protected RacePersistence racePersistence;
    @BeanReference(type = es.eina.tfg.service.RouteLocalService.class)
    protected es.eina.tfg.service.RouteLocalService routeLocalService;
    @BeanReference(type = es.eina.tfg.service.RouteService.class)
    protected es.eina.tfg.service.RouteService routeService;
    @BeanReference(type = RoutePersistence.class)
    protected RoutePersistence routePersistence;
    @BeanReference(type = es.eina.tfg.service.RouteLocationLocalService.class)
    protected es.eina.tfg.service.RouteLocationLocalService routeLocationLocalService;
    @BeanReference(type = es.eina.tfg.service.RouteLocationService.class)
    protected es.eina.tfg.service.RouteLocationService routeLocationService;
    @BeanReference(type = RouteLocationPersistence.class)
    protected RouteLocationPersistence routeLocationPersistence;
    @BeanReference(type = es.eina.tfg.service.SensorLocalService.class)
    protected es.eina.tfg.service.SensorLocalService sensorLocalService;
    @BeanReference(type = es.eina.tfg.service.SensorService.class)
    protected es.eina.tfg.service.SensorService sensorService;
    @BeanReference(type = SensorPersistence.class)
    protected SensorPersistence sensorPersistence;
    @BeanReference(type = es.eina.tfg.service.UserAdditionalDataLocalService.class)
    protected es.eina.tfg.service.UserAdditionalDataLocalService userAdditionalDataLocalService;
    @BeanReference(type = es.eina.tfg.service.UserAdditionalDataService.class)
    protected es.eina.tfg.service.UserAdditionalDataService userAdditionalDataService;
    @BeanReference(type = UserAdditionalDataPersistence.class)
    protected UserAdditionalDataPersistence userAdditionalDataPersistence;
    @BeanReference(type = es.eina.tfg.service.UserAndEventLocalService.class)
    protected es.eina.tfg.service.UserAndEventLocalService userAndEventLocalService;
    @BeanReference(type = UserAndEventPersistence.class)
    protected UserAndEventPersistence userAndEventPersistence;
    @BeanReference(type = es.eina.tfg.service.UserAndRouteLocalService.class)
    protected es.eina.tfg.service.UserAndRouteLocalService userAndRouteLocalService;
    @BeanReference(type = UserAndRoutePersistence.class)
    protected UserAndRoutePersistence userAndRoutePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private LocationLocalServiceClpInvoker _clpInvoker = new LocationLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link es.eina.tfg.service.LocationLocalServiceUtil} to access the location local service.
     */

    /**
     * Adds the location to the database. Also notifies the appropriate model listeners.
     *
     * @param location the location
     * @return the location that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Location addLocation(Location location) throws SystemException {
        location.setNew(true);

        return locationPersistence.update(location);
    }

    /**
     * Creates a new location with the primary key. Does not add the location to the database.
     *
     * @param locationPK the primary key for the new location
     * @return the new location
     */
    @Override
    public Location createLocation(LocationPK locationPK) {
        return locationPersistence.create(locationPK);
    }

    /**
     * Deletes the location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param locationPK the primary key of the location
     * @return the location that was removed
     * @throws PortalException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Location deleteLocation(LocationPK locationPK)
        throws PortalException, SystemException {
        return locationPersistence.remove(locationPK);
    }

    /**
     * Deletes the location from the database. Also notifies the appropriate model listeners.
     *
     * @param location the location
     * @return the location that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Location deleteLocation(Location location) throws SystemException {
        return locationPersistence.remove(location);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Location.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return locationPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return locationPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return locationPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return locationPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return locationPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Location fetchLocation(LocationPK locationPK)
        throws SystemException {
        return locationPersistence.fetchByPrimaryKey(locationPK);
    }

    /**
     * Returns the location with the primary key.
     *
     * @param locationPK the primary key of the location
     * @return the location
     * @throws PortalException if a location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Location getLocation(LocationPK locationPK)
        throws PortalException, SystemException {
        return locationPersistence.findByPrimaryKey(locationPK);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return locationPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Location> getLocations(int start, int end)
        throws SystemException {
        return locationPersistence.findAll(start, end);
    }

    /**
     * Returns the number of locations.
     *
     * @return the number of locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getLocationsCount() throws SystemException {
        return locationPersistence.countAll();
    }

    /**
     * Updates the location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param location the location
     * @return the location that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Location updateLocation(Location location) throws SystemException {
        return locationPersistence.update(location);
    }

    /**
     * Returns the device local service.
     *
     * @return the device local service
     */
    public es.eina.tfg.service.DeviceLocalService getDeviceLocalService() {
        return deviceLocalService;
    }

    /**
     * Sets the device local service.
     *
     * @param deviceLocalService the device local service
     */
    public void setDeviceLocalService(
        es.eina.tfg.service.DeviceLocalService deviceLocalService) {
        this.deviceLocalService = deviceLocalService;
    }

    /**
     * Returns the device remote service.
     *
     * @return the device remote service
     */
    public es.eina.tfg.service.DeviceService getDeviceService() {
        return deviceService;
    }

    /**
     * Sets the device remote service.
     *
     * @param deviceService the device remote service
     */
    public void setDeviceService(
        es.eina.tfg.service.DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    /**
     * Returns the device persistence.
     *
     * @return the device persistence
     */
    public DevicePersistence getDevicePersistence() {
        return devicePersistence;
    }

    /**
     * Sets the device persistence.
     *
     * @param devicePersistence the device persistence
     */
    public void setDevicePersistence(DevicePersistence devicePersistence) {
        this.devicePersistence = devicePersistence;
    }

    /**
     * Returns the device and sensor local service.
     *
     * @return the device and sensor local service
     */
    public es.eina.tfg.service.DeviceAndSensorLocalService getDeviceAndSensorLocalService() {
        return deviceAndSensorLocalService;
    }

    /**
     * Sets the device and sensor local service.
     *
     * @param deviceAndSensorLocalService the device and sensor local service
     */
    public void setDeviceAndSensorLocalService(
        es.eina.tfg.service.DeviceAndSensorLocalService deviceAndSensorLocalService) {
        this.deviceAndSensorLocalService = deviceAndSensorLocalService;
    }

    /**
     * Returns the device and sensor persistence.
     *
     * @return the device and sensor persistence
     */
    public DeviceAndSensorPersistence getDeviceAndSensorPersistence() {
        return deviceAndSensorPersistence;
    }

    /**
     * Sets the device and sensor persistence.
     *
     * @param deviceAndSensorPersistence the device and sensor persistence
     */
    public void setDeviceAndSensorPersistence(
        DeviceAndSensorPersistence deviceAndSensorPersistence) {
        this.deviceAndSensorPersistence = deviceAndSensorPersistence;
    }

    /**
     * Returns the event local service.
     *
     * @return the event local service
     */
    public es.eina.tfg.service.EventLocalService getEventLocalService() {
        return eventLocalService;
    }

    /**
     * Sets the event local service.
     *
     * @param eventLocalService the event local service
     */
    public void setEventLocalService(
        es.eina.tfg.service.EventLocalService eventLocalService) {
        this.eventLocalService = eventLocalService;
    }

    /**
     * Returns the event remote service.
     *
     * @return the event remote service
     */
    public es.eina.tfg.service.EventService getEventService() {
        return eventService;
    }

    /**
     * Sets the event remote service.
     *
     * @param eventService the event remote service
     */
    public void setEventService(es.eina.tfg.service.EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Returns the event persistence.
     *
     * @return the event persistence
     */
    public EventPersistence getEventPersistence() {
        return eventPersistence;
    }

    /**
     * Sets the event persistence.
     *
     * @param eventPersistence the event persistence
     */
    public void setEventPersistence(EventPersistence eventPersistence) {
        this.eventPersistence = eventPersistence;
    }

    /**
     * Returns the location local service.
     *
     * @return the location local service
     */
    public es.eina.tfg.service.LocationLocalService getLocationLocalService() {
        return locationLocalService;
    }

    /**
     * Sets the location local service.
     *
     * @param locationLocalService the location local service
     */
    public void setLocationLocalService(
        es.eina.tfg.service.LocationLocalService locationLocalService) {
        this.locationLocalService = locationLocalService;
    }

    /**
     * Returns the location remote service.
     *
     * @return the location remote service
     */
    public es.eina.tfg.service.LocationService getLocationService() {
        return locationService;
    }

    /**
     * Sets the location remote service.
     *
     * @param locationService the location remote service
     */
    public void setLocationService(
        es.eina.tfg.service.LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * Returns the location persistence.
     *
     * @return the location persistence
     */
    public LocationPersistence getLocationPersistence() {
        return locationPersistence;
    }

    /**
     * Sets the location persistence.
     *
     * @param locationPersistence the location persistence
     */
    public void setLocationPersistence(LocationPersistence locationPersistence) {
        this.locationPersistence = locationPersistence;
    }

    /**
     * Returns the power local service.
     *
     * @return the power local service
     */
    public es.eina.tfg.service.PowerLocalService getPowerLocalService() {
        return powerLocalService;
    }

    /**
     * Sets the power local service.
     *
     * @param powerLocalService the power local service
     */
    public void setPowerLocalService(
        es.eina.tfg.service.PowerLocalService powerLocalService) {
        this.powerLocalService = powerLocalService;
    }

    /**
     * Returns the power remote service.
     *
     * @return the power remote service
     */
    public es.eina.tfg.service.PowerService getPowerService() {
        return powerService;
    }

    /**
     * Sets the power remote service.
     *
     * @param powerService the power remote service
     */
    public void setPowerService(es.eina.tfg.service.PowerService powerService) {
        this.powerService = powerService;
    }

    /**
     * Returns the power persistence.
     *
     * @return the power persistence
     */
    public PowerPersistence getPowerPersistence() {
        return powerPersistence;
    }

    /**
     * Sets the power persistence.
     *
     * @param powerPersistence the power persistence
     */
    public void setPowerPersistence(PowerPersistence powerPersistence) {
        this.powerPersistence = powerPersistence;
    }

    /**
     * Returns the race local service.
     *
     * @return the race local service
     */
    public es.eina.tfg.service.RaceLocalService getRaceLocalService() {
        return raceLocalService;
    }

    /**
     * Sets the race local service.
     *
     * @param raceLocalService the race local service
     */
    public void setRaceLocalService(
        es.eina.tfg.service.RaceLocalService raceLocalService) {
        this.raceLocalService = raceLocalService;
    }

    /**
     * Returns the race remote service.
     *
     * @return the race remote service
     */
    public es.eina.tfg.service.RaceService getRaceService() {
        return raceService;
    }

    /**
     * Sets the race remote service.
     *
     * @param raceService the race remote service
     */
    public void setRaceService(es.eina.tfg.service.RaceService raceService) {
        this.raceService = raceService;
    }

    /**
     * Returns the race persistence.
     *
     * @return the race persistence
     */
    public RacePersistence getRacePersistence() {
        return racePersistence;
    }

    /**
     * Sets the race persistence.
     *
     * @param racePersistence the race persistence
     */
    public void setRacePersistence(RacePersistence racePersistence) {
        this.racePersistence = racePersistence;
    }

    /**
     * Returns the route local service.
     *
     * @return the route local service
     */
    public es.eina.tfg.service.RouteLocalService getRouteLocalService() {
        return routeLocalService;
    }

    /**
     * Sets the route local service.
     *
     * @param routeLocalService the route local service
     */
    public void setRouteLocalService(
        es.eina.tfg.service.RouteLocalService routeLocalService) {
        this.routeLocalService = routeLocalService;
    }

    /**
     * Returns the route remote service.
     *
     * @return the route remote service
     */
    public es.eina.tfg.service.RouteService getRouteService() {
        return routeService;
    }

    /**
     * Sets the route remote service.
     *
     * @param routeService the route remote service
     */
    public void setRouteService(es.eina.tfg.service.RouteService routeService) {
        this.routeService = routeService;
    }

    /**
     * Returns the route persistence.
     *
     * @return the route persistence
     */
    public RoutePersistence getRoutePersistence() {
        return routePersistence;
    }

    /**
     * Sets the route persistence.
     *
     * @param routePersistence the route persistence
     */
    public void setRoutePersistence(RoutePersistence routePersistence) {
        this.routePersistence = routePersistence;
    }

    /**
     * Returns the route location local service.
     *
     * @return the route location local service
     */
    public es.eina.tfg.service.RouteLocationLocalService getRouteLocationLocalService() {
        return routeLocationLocalService;
    }

    /**
     * Sets the route location local service.
     *
     * @param routeLocationLocalService the route location local service
     */
    public void setRouteLocationLocalService(
        es.eina.tfg.service.RouteLocationLocalService routeLocationLocalService) {
        this.routeLocationLocalService = routeLocationLocalService;
    }

    /**
     * Returns the route location remote service.
     *
     * @return the route location remote service
     */
    public es.eina.tfg.service.RouteLocationService getRouteLocationService() {
        return routeLocationService;
    }

    /**
     * Sets the route location remote service.
     *
     * @param routeLocationService the route location remote service
     */
    public void setRouteLocationService(
        es.eina.tfg.service.RouteLocationService routeLocationService) {
        this.routeLocationService = routeLocationService;
    }

    /**
     * Returns the route location persistence.
     *
     * @return the route location persistence
     */
    public RouteLocationPersistence getRouteLocationPersistence() {
        return routeLocationPersistence;
    }

    /**
     * Sets the route location persistence.
     *
     * @param routeLocationPersistence the route location persistence
     */
    public void setRouteLocationPersistence(
        RouteLocationPersistence routeLocationPersistence) {
        this.routeLocationPersistence = routeLocationPersistence;
    }

    /**
     * Returns the sensor local service.
     *
     * @return the sensor local service
     */
    public es.eina.tfg.service.SensorLocalService getSensorLocalService() {
        return sensorLocalService;
    }

    /**
     * Sets the sensor local service.
     *
     * @param sensorLocalService the sensor local service
     */
    public void setSensorLocalService(
        es.eina.tfg.service.SensorLocalService sensorLocalService) {
        this.sensorLocalService = sensorLocalService;
    }

    /**
     * Returns the sensor remote service.
     *
     * @return the sensor remote service
     */
    public es.eina.tfg.service.SensorService getSensorService() {
        return sensorService;
    }

    /**
     * Sets the sensor remote service.
     *
     * @param sensorService the sensor remote service
     */
    public void setSensorService(
        es.eina.tfg.service.SensorService sensorService) {
        this.sensorService = sensorService;
    }

    /**
     * Returns the sensor persistence.
     *
     * @return the sensor persistence
     */
    public SensorPersistence getSensorPersistence() {
        return sensorPersistence;
    }

    /**
     * Sets the sensor persistence.
     *
     * @param sensorPersistence the sensor persistence
     */
    public void setSensorPersistence(SensorPersistence sensorPersistence) {
        this.sensorPersistence = sensorPersistence;
    }

    /**
     * Returns the user additional data local service.
     *
     * @return the user additional data local service
     */
    public es.eina.tfg.service.UserAdditionalDataLocalService getUserAdditionalDataLocalService() {
        return userAdditionalDataLocalService;
    }

    /**
     * Sets the user additional data local service.
     *
     * @param userAdditionalDataLocalService the user additional data local service
     */
    public void setUserAdditionalDataLocalService(
        es.eina.tfg.service.UserAdditionalDataLocalService userAdditionalDataLocalService) {
        this.userAdditionalDataLocalService = userAdditionalDataLocalService;
    }

    /**
     * Returns the user additional data remote service.
     *
     * @return the user additional data remote service
     */
    public es.eina.tfg.service.UserAdditionalDataService getUserAdditionalDataService() {
        return userAdditionalDataService;
    }

    /**
     * Sets the user additional data remote service.
     *
     * @param userAdditionalDataService the user additional data remote service
     */
    public void setUserAdditionalDataService(
        es.eina.tfg.service.UserAdditionalDataService userAdditionalDataService) {
        this.userAdditionalDataService = userAdditionalDataService;
    }

    /**
     * Returns the user additional data persistence.
     *
     * @return the user additional data persistence
     */
    public UserAdditionalDataPersistence getUserAdditionalDataPersistence() {
        return userAdditionalDataPersistence;
    }

    /**
     * Sets the user additional data persistence.
     *
     * @param userAdditionalDataPersistence the user additional data persistence
     */
    public void setUserAdditionalDataPersistence(
        UserAdditionalDataPersistence userAdditionalDataPersistence) {
        this.userAdditionalDataPersistence = userAdditionalDataPersistence;
    }

    /**
     * Returns the user and event local service.
     *
     * @return the user and event local service
     */
    public es.eina.tfg.service.UserAndEventLocalService getUserAndEventLocalService() {
        return userAndEventLocalService;
    }

    /**
     * Sets the user and event local service.
     *
     * @param userAndEventLocalService the user and event local service
     */
    public void setUserAndEventLocalService(
        es.eina.tfg.service.UserAndEventLocalService userAndEventLocalService) {
        this.userAndEventLocalService = userAndEventLocalService;
    }

    /**
     * Returns the user and event persistence.
     *
     * @return the user and event persistence
     */
    public UserAndEventPersistence getUserAndEventPersistence() {
        return userAndEventPersistence;
    }

    /**
     * Sets the user and event persistence.
     *
     * @param userAndEventPersistence the user and event persistence
     */
    public void setUserAndEventPersistence(
        UserAndEventPersistence userAndEventPersistence) {
        this.userAndEventPersistence = userAndEventPersistence;
    }

    /**
     * Returns the user and route local service.
     *
     * @return the user and route local service
     */
    public es.eina.tfg.service.UserAndRouteLocalService getUserAndRouteLocalService() {
        return userAndRouteLocalService;
    }

    /**
     * Sets the user and route local service.
     *
     * @param userAndRouteLocalService the user and route local service
     */
    public void setUserAndRouteLocalService(
        es.eina.tfg.service.UserAndRouteLocalService userAndRouteLocalService) {
        this.userAndRouteLocalService = userAndRouteLocalService;
    }

    /**
     * Returns the user and route persistence.
     *
     * @return the user and route persistence
     */
    public UserAndRoutePersistence getUserAndRoutePersistence() {
        return userAndRoutePersistence;
    }

    /**
     * Sets the user and route persistence.
     *
     * @param userAndRoutePersistence the user and route persistence
     */
    public void setUserAndRoutePersistence(
        UserAndRoutePersistence userAndRoutePersistence) {
        this.userAndRoutePersistence = userAndRoutePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("es.eina.tfg.model.Location",
            locationLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "es.eina.tfg.model.Location");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Location.class;
    }

    protected String getModelClassName() {
        return Location.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = locationPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

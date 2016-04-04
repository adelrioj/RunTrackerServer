package es.eina.tfg.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import es.eina.tfg.model.RouteLocation;
import es.eina.tfg.service.RouteLocationService;
import es.eina.tfg.service.persistence.DevicePersistence;
import es.eina.tfg.service.persistence.Device_SensorPersistence;
import es.eina.tfg.service.persistence.LocationPersistence;
import es.eina.tfg.service.persistence.PowerPersistence;
import es.eina.tfg.service.persistence.RacePersistence;
import es.eina.tfg.service.persistence.RouteLocationPersistence;
import es.eina.tfg.service.persistence.RoutePersistence;
import es.eina.tfg.service.persistence.SensorPersistence;
import es.eina.tfg.service.persistence.UserAdditionalDataPersistence;
import es.eina.tfg.service.persistence.UserSelectedRoutesPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the route location remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link es.eina.tfg.service.impl.RouteLocationServiceImpl}.
 * </p>
 *
 * @author adelrioj
 * @see es.eina.tfg.service.impl.RouteLocationServiceImpl
 * @see es.eina.tfg.service.RouteLocationServiceUtil
 * @generated
 */
public abstract class RouteLocationServiceBaseImpl extends BaseServiceImpl
    implements RouteLocationService, IdentifiableBean {
    @BeanReference(type = es.eina.tfg.service.DeviceLocalService.class)
    protected es.eina.tfg.service.DeviceLocalService deviceLocalService;
    @BeanReference(type = es.eina.tfg.service.DeviceService.class)
    protected es.eina.tfg.service.DeviceService deviceService;
    @BeanReference(type = DevicePersistence.class)
    protected DevicePersistence devicePersistence;
    @BeanReference(type = es.eina.tfg.service.Device_SensorLocalService.class)
    protected es.eina.tfg.service.Device_SensorLocalService device_SensorLocalService;
    @BeanReference(type = es.eina.tfg.service.Device_SensorService.class)
    protected es.eina.tfg.service.Device_SensorService device_SensorService;
    @BeanReference(type = Device_SensorPersistence.class)
    protected Device_SensorPersistence device_SensorPersistence;
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
    @BeanReference(type = es.eina.tfg.service.UserSelectedRoutesLocalService.class)
    protected es.eina.tfg.service.UserSelectedRoutesLocalService userSelectedRoutesLocalService;
    @BeanReference(type = es.eina.tfg.service.UserSelectedRoutesService.class)
    protected es.eina.tfg.service.UserSelectedRoutesService userSelectedRoutesService;
    @BeanReference(type = UserSelectedRoutesPersistence.class)
    protected UserSelectedRoutesPersistence userSelectedRoutesPersistence;
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
    private RouteLocationServiceClpInvoker _clpInvoker = new RouteLocationServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link es.eina.tfg.service.RouteLocationServiceUtil} to access the route location remote service.
     */

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
     * Returns the device_ sensor local service.
     *
     * @return the device_ sensor local service
     */
    public es.eina.tfg.service.Device_SensorLocalService getDevice_SensorLocalService() {
        return device_SensorLocalService;
    }

    /**
     * Sets the device_ sensor local service.
     *
     * @param device_SensorLocalService the device_ sensor local service
     */
    public void setDevice_SensorLocalService(
        es.eina.tfg.service.Device_SensorLocalService device_SensorLocalService) {
        this.device_SensorLocalService = device_SensorLocalService;
    }

    /**
     * Returns the device_ sensor remote service.
     *
     * @return the device_ sensor remote service
     */
    public es.eina.tfg.service.Device_SensorService getDevice_SensorService() {
        return device_SensorService;
    }

    /**
     * Sets the device_ sensor remote service.
     *
     * @param device_SensorService the device_ sensor remote service
     */
    public void setDevice_SensorService(
        es.eina.tfg.service.Device_SensorService device_SensorService) {
        this.device_SensorService = device_SensorService;
    }

    /**
     * Returns the device_ sensor persistence.
     *
     * @return the device_ sensor persistence
     */
    public Device_SensorPersistence getDevice_SensorPersistence() {
        return device_SensorPersistence;
    }

    /**
     * Sets the device_ sensor persistence.
     *
     * @param device_SensorPersistence the device_ sensor persistence
     */
    public void setDevice_SensorPersistence(
        Device_SensorPersistence device_SensorPersistence) {
        this.device_SensorPersistence = device_SensorPersistence;
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
     * Returns the user selected routes local service.
     *
     * @return the user selected routes local service
     */
    public es.eina.tfg.service.UserSelectedRoutesLocalService getUserSelectedRoutesLocalService() {
        return userSelectedRoutesLocalService;
    }

    /**
     * Sets the user selected routes local service.
     *
     * @param userSelectedRoutesLocalService the user selected routes local service
     */
    public void setUserSelectedRoutesLocalService(
        es.eina.tfg.service.UserSelectedRoutesLocalService userSelectedRoutesLocalService) {
        this.userSelectedRoutesLocalService = userSelectedRoutesLocalService;
    }

    /**
     * Returns the user selected routes remote service.
     *
     * @return the user selected routes remote service
     */
    public es.eina.tfg.service.UserSelectedRoutesService getUserSelectedRoutesService() {
        return userSelectedRoutesService;
    }

    /**
     * Sets the user selected routes remote service.
     *
     * @param userSelectedRoutesService the user selected routes remote service
     */
    public void setUserSelectedRoutesService(
        es.eina.tfg.service.UserSelectedRoutesService userSelectedRoutesService) {
        this.userSelectedRoutesService = userSelectedRoutesService;
    }

    /**
     * Returns the user selected routes persistence.
     *
     * @return the user selected routes persistence
     */
    public UserSelectedRoutesPersistence getUserSelectedRoutesPersistence() {
        return userSelectedRoutesPersistence;
    }

    /**
     * Sets the user selected routes persistence.
     *
     * @param userSelectedRoutesPersistence the user selected routes persistence
     */
    public void setUserSelectedRoutesPersistence(
        UserSelectedRoutesPersistence userSelectedRoutesPersistence) {
        this.userSelectedRoutesPersistence = userSelectedRoutesPersistence;
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
    }

    public void destroy() {
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
        return RouteLocation.class;
    }

    protected String getModelClassName() {
        return RouteLocation.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = routeLocationPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

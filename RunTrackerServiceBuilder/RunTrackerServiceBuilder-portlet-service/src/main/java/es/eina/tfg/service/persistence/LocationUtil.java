package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.Location;

import java.util.List;

/**
 * The persistence utility for the location service. This utility wraps {@link LocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see LocationPersistence
 * @see LocationPersistenceImpl
 * @generated
 */
public class LocationUtil {
    private static LocationPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Location location) {
        getPersistence().clearCache(location);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Location> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Location> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Location> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Location update(Location location) throws SystemException {
        return getPersistence().update(location);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Location update(Location location,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(location, serviceContext);
    }

    /**
    * Returns all the locations where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByraceId(idRace);
    }

    /**
    * Returns a range of all the locations where idRace = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRace the id race
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @return the range of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByraceId(idRace, start, end);
    }

    /**
    * Returns an ordered range of all the locations where idRace = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRace the id race
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByraceId(idRace, start, end, orderByComparator);
    }

    /**
    * Returns the first location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location
    * @throws es.eina.tfg.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location findByraceId_First(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException {
        return getPersistence().findByraceId_First(idRace, orderByComparator);
    }

    /**
    * Returns the first location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location fetchByraceId_First(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByraceId_First(idRace, orderByComparator);
    }

    /**
    * Returns the last location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location
    * @throws es.eina.tfg.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location findByraceId_Last(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException {
        return getPersistence().findByraceId_Last(idRace, orderByComparator);
    }

    /**
    * Returns the last location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location fetchByraceId_Last(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByraceId_Last(idRace, orderByComparator);
    }

    /**
    * Returns the locations before and after the current location in the ordered set where idRace = &#63;.
    *
    * @param locationPK the primary key of the current location
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next location
    * @throws es.eina.tfg.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location[] findByraceId_PrevAndNext(
        es.eina.tfg.service.persistence.LocationPK locationPK,
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException {
        return getPersistence()
                   .findByraceId_PrevAndNext(locationPK, idRace,
            orderByComparator);
    }

    /**
    * Removes all the locations where idRace = &#63; from the database.
    *
    * @param idRace the id race
    * @throws SystemException if a system exception occurred
    */
    public static void removeByraceId(java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByraceId(idRace);
    }

    /**
    * Returns the number of locations where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public static int countByraceId(java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByraceId(idRace);
    }

    /**
    * Caches the location in the entity cache if it is enabled.
    *
    * @param location the location
    */
    public static void cacheResult(es.eina.tfg.model.Location location) {
        getPersistence().cacheResult(location);
    }

    /**
    * Caches the locations in the entity cache if it is enabled.
    *
    * @param locations the locations
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.Location> locations) {
        getPersistence().cacheResult(locations);
    }

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param locationPK the primary key for the new location
    * @return the new location
    */
    public static es.eina.tfg.model.Location create(
        es.eina.tfg.service.persistence.LocationPK locationPK) {
        return getPersistence().create(locationPK);
    }

    /**
    * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param locationPK the primary key of the location
    * @return the location that was removed
    * @throws es.eina.tfg.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location remove(
        es.eina.tfg.service.persistence.LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException {
        return getPersistence().remove(locationPK);
    }

    public static es.eina.tfg.model.Location updateImpl(
        es.eina.tfg.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(location);
    }

    /**
    * Returns the location with the primary key or throws a {@link es.eina.tfg.NoSuchLocationException} if it could not be found.
    *
    * @param locationPK the primary key of the location
    * @return the location
    * @throws es.eina.tfg.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location findByPrimaryKey(
        es.eina.tfg.service.persistence.LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException {
        return getPersistence().findByPrimaryKey(locationPK);
    }

    /**
    * Returns the location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param locationPK the primary key of the location
    * @return the location, or <code>null</code> if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Location fetchByPrimaryKey(
        es.eina.tfg.service.persistence.LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(locationPK);
    }

    /**
    * Returns all the locations.
    *
    * @return the locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Location> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<es.eina.tfg.model.Location> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.LocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of locations
    * @param end the upper bound of the range of locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Location> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LocationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LocationPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    LocationPersistence.class.getName());

            ReferenceRegistry.registerReference(LocationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LocationPersistence persistence) {
    }
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.RouteLocation;

import java.util.List;

/**
 * The persistence utility for the route location service. This utility wraps {@link RouteLocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RouteLocationPersistence
 * @see RouteLocationPersistenceImpl
 * @generated
 */
public class RouteLocationUtil {
    private static RouteLocationPersistence _persistence;

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
    public static void clearCache(RouteLocation routeLocation) {
        getPersistence().clearCache(routeLocation);
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
    public static List<RouteLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<RouteLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<RouteLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static RouteLocation update(RouteLocation routeLocation)
        throws SystemException {
        return getPersistence().update(routeLocation);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static RouteLocation update(RouteLocation routeLocation,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(routeLocation, serviceContext);
    }

    /**
    * Returns all the route locations where routeId = &#63;.
    *
    * @param routeId the route ID
    * @return the matching route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrouteId(routeId);
    }

    /**
    * Returns a range of all the route locations where routeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param routeId the route ID
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @return the range of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long routeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByrouteId(routeId, start, end);
    }

    /**
    * Returns an ordered range of all the route locations where routeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param routeId the route ID
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long routeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByrouteId(routeId, start, end, orderByComparator);
    }

    /**
    * Returns the first route location in the ordered set where routeId = &#63;.
    *
    * @param routeId the route ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation findByrouteId_First(
        long routeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException {
        return getPersistence().findByrouteId_First(routeId, orderByComparator);
    }

    /**
    * Returns the first route location in the ordered set where routeId = &#63;.
    *
    * @param routeId the route ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching route location, or <code>null</code> if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation fetchByrouteId_First(
        long routeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrouteId_First(routeId, orderByComparator);
    }

    /**
    * Returns the last route location in the ordered set where routeId = &#63;.
    *
    * @param routeId the route ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation findByrouteId_Last(
        long routeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException {
        return getPersistence().findByrouteId_Last(routeId, orderByComparator);
    }

    /**
    * Returns the last route location in the ordered set where routeId = &#63;.
    *
    * @param routeId the route ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching route location, or <code>null</code> if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation fetchByrouteId_Last(
        long routeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByrouteId_Last(routeId, orderByComparator);
    }

    /**
    * Returns the route locations before and after the current route location in the ordered set where routeId = &#63;.
    *
    * @param routePositionId the primary key of the current route location
    * @param routeId the route ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation[] findByrouteId_PrevAndNext(
        long routePositionId, long routeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException {
        return getPersistence()
                   .findByrouteId_PrevAndNext(routePositionId, routeId,
            orderByComparator);
    }

    /**
    * Removes all the route locations where routeId = &#63; from the database.
    *
    * @param routeId the route ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByrouteId(long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByrouteId(routeId);
    }

    /**
    * Returns the number of route locations where routeId = &#63;.
    *
    * @param routeId the route ID
    * @return the number of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public static int countByrouteId(long routeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByrouteId(routeId);
    }

    /**
    * Caches the route location in the entity cache if it is enabled.
    *
    * @param routeLocation the route location
    */
    public static void cacheResult(
        es.eina.tfg.model.RouteLocation routeLocation) {
        getPersistence().cacheResult(routeLocation);
    }

    /**
    * Caches the route locations in the entity cache if it is enabled.
    *
    * @param routeLocations the route locations
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.RouteLocation> routeLocations) {
        getPersistence().cacheResult(routeLocations);
    }

    /**
    * Creates a new route location with the primary key. Does not add the route location to the database.
    *
    * @param routePositionId the primary key for the new route location
    * @return the new route location
    */
    public static es.eina.tfg.model.RouteLocation create(long routePositionId) {
        return getPersistence().create(routePositionId);
    }

    /**
    * Removes the route location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param routePositionId the primary key of the route location
    * @return the route location that was removed
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation remove(long routePositionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException {
        return getPersistence().remove(routePositionId);
    }

    public static es.eina.tfg.model.RouteLocation updateImpl(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(routeLocation);
    }

    /**
    * Returns the route location with the primary key or throws a {@link es.eina.tfg.NoSuchRouteLocationException} if it could not be found.
    *
    * @param routePositionId the primary key of the route location
    * @return the route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation findByPrimaryKey(
        long routePositionId)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException {
        return getPersistence().findByPrimaryKey(routePositionId);
    }

    /**
    * Returns the route location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param routePositionId the primary key of the route location
    * @return the route location, or <code>null</code> if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation fetchByPrimaryKey(
        long routePositionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(routePositionId);
    }

    /**
    * Returns all the route locations.
    *
    * @return the route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the route locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @return the range of route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the route locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the route locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of route locations.
    *
    * @return the number of route locations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RouteLocationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RouteLocationPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    RouteLocationPersistence.class.getName());

            ReferenceRegistry.registerReference(RouteLocationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RouteLocationPersistence persistence) {
    }
}

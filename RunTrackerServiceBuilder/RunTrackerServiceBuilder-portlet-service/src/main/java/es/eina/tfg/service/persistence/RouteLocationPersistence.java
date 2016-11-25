package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.RouteLocation;

/**
 * The persistence interface for the route location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RouteLocationPersistenceImpl
 * @see RouteLocationUtil
 * @generated
 */
public interface RouteLocationPersistence extends BasePersistence<RouteLocation> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RouteLocationUtil} to access the route location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the route locations where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the matching route locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the route locations where idRoute = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRoute the id route
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @return the range of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long idRoute, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the route locations where idRoute = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idRoute the id route
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.RouteLocation> findByrouteId(
        long idRoute, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first route location in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation findByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException;

    /**
    * Returns the first route location in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching route location, or <code>null</code> if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation fetchByrouteId_First(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last route location in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation findByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException;

    /**
    * Returns the last route location in the ordered set where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching route location, or <code>null</code> if a matching route location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation fetchByrouteId_Last(long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the route locations before and after the current route location in the ordered set where idRoute = &#63;.
    *
    * @param routeLocationPK the primary key of the current route location
    * @param idRoute the id route
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation[] findByrouteId_PrevAndNext(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK,
        long idRoute,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException;

    /**
    * Removes all the route locations where idRoute = &#63; from the database.
    *
    * @param idRoute the id route
    * @throws SystemException if a system exception occurred
    */
    public void removeByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of route locations where idRoute = &#63;.
    *
    * @param idRoute the id route
    * @return the number of matching route locations
    * @throws SystemException if a system exception occurred
    */
    public int countByrouteId(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the route location in the entity cache if it is enabled.
    *
    * @param routeLocation the route location
    */
    public void cacheResult(es.eina.tfg.model.RouteLocation routeLocation);

    /**
    * Caches the route locations in the entity cache if it is enabled.
    *
    * @param routeLocations the route locations
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.RouteLocation> routeLocations);

    /**
    * Creates a new route location with the primary key. Does not add the route location to the database.
    *
    * @param routeLocationPK the primary key for the new route location
    * @return the new route location
    */
    public es.eina.tfg.model.RouteLocation create(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK);

    /**
    * Removes the route location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location that was removed
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation remove(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException;

    public es.eina.tfg.model.RouteLocation updateImpl(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the route location with the primary key or throws a {@link es.eina.tfg.NoSuchRouteLocationException} if it could not be found.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location
    * @throws es.eina.tfg.NoSuchRouteLocationException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation findByPrimaryKey(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRouteLocationException;

    /**
    * Returns the route location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location, or <code>null</code> if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.RouteLocation fetchByPrimaryKey(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the route locations.
    *
    * @return the route locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.RouteLocation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.RouteLocation> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.RouteLocation> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the route locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of route locations.
    *
    * @return the number of route locations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

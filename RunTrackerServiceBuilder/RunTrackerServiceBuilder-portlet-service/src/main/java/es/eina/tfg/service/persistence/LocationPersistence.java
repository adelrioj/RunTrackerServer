package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Location;

/**
 * The persistence interface for the location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see LocationPersistenceImpl
 * @see LocationUtil
 * @generated
 */
public interface LocationPersistence extends BasePersistence<Location> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LocationUtil} to access the location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the locations where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the matching locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Location> findByraceId(
        java.lang.Long idRace, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location
    * @throws es.eina.tfg.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location findByraceId_First(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException;

    /**
    * Returns the first location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location fetchByraceId_First(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location
    * @throws es.eina.tfg.NoSuchLocationException if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location findByraceId_Last(java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException;

    /**
    * Returns the last location in the ordered set where idRace = &#63;.
    *
    * @param idRace the id race
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching location, or <code>null</code> if a matching location could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location fetchByraceId_Last(
        java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public es.eina.tfg.model.Location[] findByraceId_PrevAndNext(
        LocationPK locationPK, java.lang.Long idRace,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException;

    /**
    * Removes all the locations where idRace = &#63; from the database.
    *
    * @param idRace the id race
    * @throws SystemException if a system exception occurred
    */
    public void removeByraceId(java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of locations where idRace = &#63;.
    *
    * @param idRace the id race
    * @return the number of matching locations
    * @throws SystemException if a system exception occurred
    */
    public int countByraceId(java.lang.Long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the location in the entity cache if it is enabled.
    *
    * @param location the location
    */
    public void cacheResult(es.eina.tfg.model.Location location);

    /**
    * Caches the locations in the entity cache if it is enabled.
    *
    * @param locations the locations
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.Location> locations);

    /**
    * Creates a new location with the primary key. Does not add the location to the database.
    *
    * @param locationPK the primary key for the new location
    * @return the new location
    */
    public es.eina.tfg.model.Location create(LocationPK locationPK);

    /**
    * Removes the location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param locationPK the primary key of the location
    * @return the location that was removed
    * @throws es.eina.tfg.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location remove(LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException;

    public es.eina.tfg.model.Location updateImpl(
        es.eina.tfg.model.Location location)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the location with the primary key or throws a {@link es.eina.tfg.NoSuchLocationException} if it could not be found.
    *
    * @param locationPK the primary key of the location
    * @return the location
    * @throws es.eina.tfg.NoSuchLocationException if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location findByPrimaryKey(LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchLocationException;

    /**
    * Returns the location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param locationPK the primary key of the location
    * @return the location, or <code>null</code> if a location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Location fetchByPrimaryKey(LocationPK locationPK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the locations.
    *
    * @return the locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Location> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Location> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Location> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of locations.
    *
    * @return the number of locations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

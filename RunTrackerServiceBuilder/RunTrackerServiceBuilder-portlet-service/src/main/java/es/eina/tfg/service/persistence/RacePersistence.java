package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Race;

/**
 * The persistence interface for the race service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RacePersistenceImpl
 * @see RaceUtil
 * @generated
 */
public interface RacePersistence extends BasePersistence<Race> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RaceUtil} to access the race persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the races where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching races
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Race> findByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the races where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of races
    * @param end the upper bound of the range of races (not inclusive)
    * @return the range of matching races
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Race> findByuserId(long idUser,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the races where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of races
    * @param end the upper bound of the range of races (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching races
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Race> findByuserId(long idUser,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first race in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching race
    * @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race findByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRaceException;

    /**
    * Returns the first race in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching race, or <code>null</code> if a matching race could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race fetchByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last race in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching race
    * @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race findByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRaceException;

    /**
    * Returns the last race in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching race, or <code>null</code> if a matching race could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race fetchByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the races before and after the current race in the ordered set where idUser = &#63;.
    *
    * @param idRace the primary key of the current race
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next race
    * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race[] findByuserId_PrevAndNext(long idRace,
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRaceException;

    /**
    * Removes all the races where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of races where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching races
    * @throws SystemException if a system exception occurred
    */
    public int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the race in the entity cache if it is enabled.
    *
    * @param race the race
    */
    public void cacheResult(es.eina.tfg.model.Race race);

    /**
    * Caches the races in the entity cache if it is enabled.
    *
    * @param races the races
    */
    public void cacheResult(java.util.List<es.eina.tfg.model.Race> races);

    /**
    * Creates a new race with the primary key. Does not add the race to the database.
    *
    * @param idRace the primary key for the new race
    * @return the new race
    */
    public es.eina.tfg.model.Race create(long idRace);

    /**
    * Removes the race with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idRace the primary key of the race
    * @return the race that was removed
    * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race remove(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRaceException;

    public es.eina.tfg.model.Race updateImpl(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the race with the primary key or throws a {@link es.eina.tfg.NoSuchRaceException} if it could not be found.
    *
    * @param idRace the primary key of the race
    * @return the race
    * @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race findByPrimaryKey(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchRaceException;

    /**
    * Returns the race with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idRace the primary key of the race
    * @return the race, or <code>null</code> if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Race fetchByPrimaryKey(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the races.
    *
    * @return the races
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Race> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Race> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the races.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of races
    * @param end the upper bound of the range of races (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of races
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Race> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the races from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of races.
    *
    * @return the number of races
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

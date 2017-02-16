package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.UserAndRoute;

/**
 * The persistence interface for the user and route service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndRoutePersistenceImpl
 * @see UserAndRouteUtil
 * @generated
 */
public interface UserAndRoutePersistence extends BasePersistence<UserAndRoute> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserAndRouteUtil} to access the user and route persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the user and routes where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user and routes where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of user and routes
    * @param end the upper bound of the range of user and routes (not inclusive)
    * @return the range of matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user and routes where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of user and routes
    * @param end the upper bound of the range of user and routes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute findByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException;

    /**
    * Returns the first user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and route, or <code>null</code> if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute fetchByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute findByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException;

    /**
    * Returns the last user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and route, or <code>null</code> if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute fetchByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user and routes before and after the current user and route in the ordered set where idUser = &#63;.
    *
    * @param userAndRoutePK the primary key of the current user and route
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute[] findByuserId_PrevAndNext(
        UserAndRoutePK userAndRoutePK, long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException;

    /**
    * Removes all the user and routes where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and routes where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the user and route in the entity cache if it is enabled.
    *
    * @param userAndRoute the user and route
    */
    public void cacheResult(es.eina.tfg.model.UserAndRoute userAndRoute);

    /**
    * Caches the user and routes in the entity cache if it is enabled.
    *
    * @param userAndRoutes the user and routes
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.UserAndRoute> userAndRoutes);

    /**
    * Creates a new user and route with the primary key. Does not add the user and route to the database.
    *
    * @param userAndRoutePK the primary key for the new user and route
    * @return the new user and route
    */
    public es.eina.tfg.model.UserAndRoute create(UserAndRoutePK userAndRoutePK);

    /**
    * Removes the user and route with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route that was removed
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute remove(UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException;

    public es.eina.tfg.model.UserAndRoute updateImpl(
        es.eina.tfg.model.UserAndRoute userAndRoute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user and route with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndRouteException} if it could not be found.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute findByPrimaryKey(
        UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException;

    /**
    * Returns the user and route with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route, or <code>null</code> if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAndRoute fetchByPrimaryKey(
        UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user and routes.
    *
    * @return the user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the user and routes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user and routes
    * @param end the upper bound of the range of user and routes (not inclusive)
    * @return the range of user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the user and routes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAndRouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user and routes
    * @param end the upper bound of the range of user and routes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of user and routes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAndRoute> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user and routes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user and routes.
    *
    * @return the number of user and routes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.UserAndRoute;

import java.util.List;

/**
 * The persistence utility for the user and route service. This utility wraps {@link UserAndRoutePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAndRoutePersistence
 * @see UserAndRoutePersistenceImpl
 * @generated
 */
public class UserAndRouteUtil {
    private static UserAndRoutePersistence _persistence;

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
    public static void clearCache(UserAndRoute userAndRoute) {
        getPersistence().clearCache(userAndRoute);
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
    public static List<UserAndRoute> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserAndRoute> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserAndRoute> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserAndRoute update(UserAndRoute userAndRoute)
        throws SystemException {
        return getPersistence().update(userAndRoute);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserAndRoute update(UserAndRoute userAndRoute,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(userAndRoute, serviceContext);
    }

    /**
    * Returns all the user and routes where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(idUser);
    }

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
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(idUser, start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findByuserId(
        long idUser, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByuserId(idUser, start, end, orderByComparator);
    }

    /**
    * Returns the first user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute findByuserId_First(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException {
        return getPersistence().findByuserId_First(idUser, orderByComparator);
    }

    /**
    * Returns the first user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user and route, or <code>null</code> if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute fetchByuserId_First(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_First(idUser, orderByComparator);
    }

    /**
    * Returns the last user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute findByuserId_Last(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException {
        return getPersistence().findByuserId_Last(idUser, orderByComparator);
    }

    /**
    * Returns the last user and route in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user and route, or <code>null</code> if a matching user and route could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute fetchByuserId_Last(
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_Last(idUser, orderByComparator);
    }

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
    public static es.eina.tfg.model.UserAndRoute[] findByuserId_PrevAndNext(
        UserAndRoutePK userAndRoutePK, long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException {
        return getPersistence()
                   .findByuserId_PrevAndNext(userAndRoutePK, idUser,
            orderByComparator);
    }

    /**
    * Removes all the user and routes where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public static void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByuserId(idUser);
    }

    /**
    * Returns the number of user and routes where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching user and routes
    * @throws SystemException if a system exception occurred
    */
    public static int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByuserId(idUser);
    }

    /**
    * Caches the user and route in the entity cache if it is enabled.
    *
    * @param userAndRoute the user and route
    */
    public static void cacheResult(es.eina.tfg.model.UserAndRoute userAndRoute) {
        getPersistence().cacheResult(userAndRoute);
    }

    /**
    * Caches the user and routes in the entity cache if it is enabled.
    *
    * @param userAndRoutes the user and routes
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.UserAndRoute> userAndRoutes) {
        getPersistence().cacheResult(userAndRoutes);
    }

    /**
    * Creates a new user and route with the primary key. Does not add the user and route to the database.
    *
    * @param userAndRoutePK the primary key for the new user and route
    * @return the new user and route
    */
    public static es.eina.tfg.model.UserAndRoute create(
        UserAndRoutePK userAndRoutePK) {
        return getPersistence().create(userAndRoutePK);
    }

    /**
    * Removes the user and route with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route that was removed
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute remove(
        UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException {
        return getPersistence().remove(userAndRoutePK);
    }

    public static es.eina.tfg.model.UserAndRoute updateImpl(
        es.eina.tfg.model.UserAndRoute userAndRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userAndRoute);
    }

    /**
    * Returns the user and route with the primary key or throws a {@link es.eina.tfg.NoSuchUserAndRouteException} if it could not be found.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route
    * @throws es.eina.tfg.NoSuchUserAndRouteException if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute findByPrimaryKey(
        UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAndRouteException {
        return getPersistence().findByPrimaryKey(userAndRoutePK);
    }

    /**
    * Returns the user and route with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userAndRoutePK the primary key of the user and route
    * @return the user and route, or <code>null</code> if a user and route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAndRoute fetchByPrimaryKey(
        UserAndRoutePK userAndRoutePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userAndRoutePK);
    }

    /**
    * Returns all the user and routes.
    *
    * @return the user and routes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<es.eina.tfg.model.UserAndRoute> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user and routes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user and routes.
    *
    * @return the number of user and routes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserAndRoutePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserAndRoutePersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    UserAndRoutePersistence.class.getName());

            ReferenceRegistry.registerReference(UserAndRouteUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserAndRoutePersistence persistence) {
    }
}

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.UserSelectedRoutes;

import java.util.List;

/**
 * The persistence utility for the user selected routes service. This utility wraps {@link UserSelectedRoutesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserSelectedRoutesPersistence
 * @see UserSelectedRoutesPersistenceImpl
 * @generated
 */
public class UserSelectedRoutesUtil {
    private static UserSelectedRoutesPersistence _persistence;

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
    public static void clearCache(UserSelectedRoutes userSelectedRoutes) {
        getPersistence().clearCache(userSelectedRoutes);
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
    public static List<UserSelectedRoutes> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserSelectedRoutes> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserSelectedRoutes> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserSelectedRoutes update(
        UserSelectedRoutes userSelectedRoutes) throws SystemException {
        return getPersistence().update(userSelectedRoutes);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserSelectedRoutes update(
        UserSelectedRoutes userSelectedRoutes, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(userSelectedRoutes, serviceContext);
    }

    /**
    * Returns all the user selected routeses where userId = &#63;.
    *
    * @param userId the user ID
    * @return the matching user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(userId);
    }

    /**
    * Returns a range of all the user selected routeses where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of user selected routeses
    * @param end the upper bound of the range of user selected routeses (not inclusive)
    * @return the range of matching user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
        long userId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByuserId(userId, start, end);
    }

    /**
    * Returns an ordered range of all the user selected routeses where userId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param userId the user ID
    * @param start the lower bound of the range of user selected routeses
    * @param end the upper bound of the range of user selected routeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
        long userId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByuserId(userId, start, end, orderByComparator);
    }

    /**
    * Returns the first user selected routes in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user selected routes
    * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a matching user selected routes could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes findByuserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserSelectedRoutesException {
        return getPersistence().findByuserId_First(userId, orderByComparator);
    }

    /**
    * Returns the first user selected routes in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes fetchByuserId_First(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_First(userId, orderByComparator);
    }

    /**
    * Returns the last user selected routes in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user selected routes
    * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a matching user selected routes could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes findByuserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserSelectedRoutesException {
        return getPersistence().findByuserId_Last(userId, orderByComparator);
    }

    /**
    * Returns the last user selected routes in the ordered set where userId = &#63;.
    *
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes fetchByuserId_Last(
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByuserId_Last(userId, orderByComparator);
    }

    /**
    * Returns the user selected routeses before and after the current user selected routes in the ordered set where userId = &#63;.
    *
    * @param userSelectedRoutesPK the primary key of the current user selected routes
    * @param userId the user ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next user selected routes
    * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes[] findByuserId_PrevAndNext(
        es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK,
        long userId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserSelectedRoutesException {
        return getPersistence()
                   .findByuserId_PrevAndNext(userSelectedRoutesPK, userId,
            orderByComparator);
    }

    /**
    * Removes all the user selected routeses where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByuserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByuserId(userId);
    }

    /**
    * Returns the number of user selected routeses where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByuserId(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByuserId(userId);
    }

    /**
    * Caches the user selected routes in the entity cache if it is enabled.
    *
    * @param userSelectedRoutes the user selected routes
    */
    public static void cacheResult(
        es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes) {
        getPersistence().cacheResult(userSelectedRoutes);
    }

    /**
    * Caches the user selected routeses in the entity cache if it is enabled.
    *
    * @param userSelectedRouteses the user selected routeses
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.UserSelectedRoutes> userSelectedRouteses) {
        getPersistence().cacheResult(userSelectedRouteses);
    }

    /**
    * Creates a new user selected routes with the primary key. Does not add the user selected routes to the database.
    *
    * @param userSelectedRoutesPK the primary key for the new user selected routes
    * @return the new user selected routes
    */
    public static es.eina.tfg.model.UserSelectedRoutes create(
        es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK) {
        return getPersistence().create(userSelectedRoutesPK);
    }

    /**
    * Removes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userSelectedRoutesPK the primary key of the user selected routes
    * @return the user selected routes that was removed
    * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes remove(
        es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserSelectedRoutesException {
        return getPersistence().remove(userSelectedRoutesPK);
    }

    public static es.eina.tfg.model.UserSelectedRoutes updateImpl(
        es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userSelectedRoutes);
    }

    /**
    * Returns the user selected routes with the primary key or throws a {@link es.eina.tfg.NoSuchUserSelectedRoutesException} if it could not be found.
    *
    * @param userSelectedRoutesPK the primary key of the user selected routes
    * @return the user selected routes
    * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes findByPrimaryKey(
        es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserSelectedRoutesException {
        return getPersistence().findByPrimaryKey(userSelectedRoutesPK);
    }

    /**
    * Returns the user selected routes with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userSelectedRoutesPK the primary key of the user selected routes
    * @return the user selected routes, or <code>null</code> if a user selected routes with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserSelectedRoutes fetchByPrimaryKey(
        es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userSelectedRoutesPK);
    }

    /**
    * Returns all the user selected routeses.
    *
    * @return the user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the user selected routeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user selected routeses
    * @param end the upper bound of the range of user selected routeses (not inclusive)
    * @return the range of user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the user selected routeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserSelectedRoutesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user selected routeses
    * @param end the upper bound of the range of user selected routeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user selected routeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user selected routeses.
    *
    * @return the number of user selected routeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserSelectedRoutesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserSelectedRoutesPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    UserSelectedRoutesPersistence.class.getName());

            ReferenceRegistry.registerReference(UserSelectedRoutesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserSelectedRoutesPersistence persistence) {
    }
}

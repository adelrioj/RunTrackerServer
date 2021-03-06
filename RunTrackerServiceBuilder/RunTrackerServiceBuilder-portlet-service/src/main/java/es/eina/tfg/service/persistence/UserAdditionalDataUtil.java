package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.UserAdditionalData;

import java.util.List;

/**
 * The persistence utility for the user additional data service. This utility wraps {@link UserAdditionalDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataPersistence
 * @see UserAdditionalDataPersistenceImpl
 * @generated
 */
public class UserAdditionalDataUtil {
    private static UserAdditionalDataPersistence _persistence;

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
    public static void clearCache(UserAdditionalData userAdditionalData) {
        getPersistence().clearCache(userAdditionalData);
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
    public static List<UserAdditionalData> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UserAdditionalData> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UserAdditionalData> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UserAdditionalData update(
        UserAdditionalData userAdditionalData) throws SystemException {
        return getPersistence().update(userAdditionalData);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UserAdditionalData update(
        UserAdditionalData userAdditionalData, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(userAdditionalData, serviceContext);
    }

    /**
    * Caches the user additional data in the entity cache if it is enabled.
    *
    * @param userAdditionalData the user additional data
    */
    public static void cacheResult(
        es.eina.tfg.model.UserAdditionalData userAdditionalData) {
        getPersistence().cacheResult(userAdditionalData);
    }

    /**
    * Caches the user additional datas in the entity cache if it is enabled.
    *
    * @param userAdditionalDatas the user additional datas
    */
    public static void cacheResult(
        java.util.List<es.eina.tfg.model.UserAdditionalData> userAdditionalDatas) {
        getPersistence().cacheResult(userAdditionalDatas);
    }

    /**
    * Creates a new user additional data with the primary key. Does not add the user additional data to the database.
    *
    * @param idUser the primary key for the new user additional data
    * @return the new user additional data
    */
    public static es.eina.tfg.model.UserAdditionalData create(long idUser) {
        return getPersistence().create(idUser);
    }

    /**
    * Removes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data that was removed
    * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData remove(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAdditionalDataException {
        return getPersistence().remove(idUser);
    }

    public static es.eina.tfg.model.UserAdditionalData updateImpl(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(userAdditionalData);
    }

    /**
    * Returns the user additional data with the primary key or throws a {@link es.eina.tfg.NoSuchUserAdditionalDataException} if it could not be found.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data
    * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData findByPrimaryKey(
        long idUser)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAdditionalDataException {
        return getPersistence().findByPrimaryKey(idUser);
    }

    /**
    * Returns the user additional data with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data, or <code>null</code> if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData fetchByPrimaryKey(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idUser);
    }

    /**
    * Returns all the user additional datas.
    *
    * @return the user additional datas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAdditionalData> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the user additional datas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAdditionalDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user additional datas
    * @param end the upper bound of the range of user additional datas (not inclusive)
    * @return the range of user additional datas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAdditionalData> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the user additional datas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAdditionalDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of user additional datas
    * @param end the upper bound of the range of user additional datas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of user additional datas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.UserAdditionalData> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the user additional datas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of user additional datas.
    *
    * @return the number of user additional datas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UserAdditionalDataPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UserAdditionalDataPersistence) PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
                    UserAdditionalDataPersistence.class.getName());

            ReferenceRegistry.registerReference(UserAdditionalDataUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UserAdditionalDataPersistence persistence) {
    }
}

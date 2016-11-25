package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.UserAdditionalData;

/**
 * The persistence interface for the user additional data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataPersistenceImpl
 * @see UserAdditionalDataUtil
 * @generated
 */
public interface UserAdditionalDataPersistence extends BasePersistence<UserAdditionalData> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UserAdditionalDataUtil} to access the user additional data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the user additional data in the entity cache if it is enabled.
    *
    * @param userAdditionalData the user additional data
    */
    public void cacheResult(
        es.eina.tfg.model.UserAdditionalData userAdditionalData);

    /**
    * Caches the user additional datas in the entity cache if it is enabled.
    *
    * @param userAdditionalDatas the user additional datas
    */
    public void cacheResult(
        java.util.List<es.eina.tfg.model.UserAdditionalData> userAdditionalDatas);

    /**
    * Creates a new user additional data with the primary key. Does not add the user additional data to the database.
    *
    * @param idUser the primary key for the new user additional data
    * @return the new user additional data
    */
    public es.eina.tfg.model.UserAdditionalData create(long idUser);

    /**
    * Removes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data that was removed
    * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAdditionalData remove(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAdditionalDataException;

    public es.eina.tfg.model.UserAdditionalData updateImpl(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the user additional data with the primary key or throws a {@link es.eina.tfg.NoSuchUserAdditionalDataException} if it could not be found.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data
    * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAdditionalData findByPrimaryKey(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchUserAdditionalDataException;

    /**
    * Returns the user additional data with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data, or <code>null</code> if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.UserAdditionalData fetchByPrimaryKey(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the user additional datas.
    *
    * @return the user additional datas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.UserAdditionalData> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAdditionalData> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.UserAdditionalData> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the user additional datas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of user additional datas.
    *
    * @return the number of user additional datas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserAdditionalDataLocalService}.
 *
 * @author adelrioj
 * @see UserAdditionalDataLocalService
 * @generated
 */
public class UserAdditionalDataLocalServiceWrapper
    implements UserAdditionalDataLocalService,
        ServiceWrapper<UserAdditionalDataLocalService> {
    private UserAdditionalDataLocalService _userAdditionalDataLocalService;

    public UserAdditionalDataLocalServiceWrapper(
        UserAdditionalDataLocalService userAdditionalDataLocalService) {
        _userAdditionalDataLocalService = userAdditionalDataLocalService;
    }

    /**
    * Adds the user additional data to the database. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData addUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.addUserAdditionalData(userAdditionalData);
    }

    /**
    * Creates a new user additional data with the primary key. Does not add the user additional data to the database.
    *
    * @param idUser the primary key for the new user additional data
    * @return the new user additional data
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData createUserAdditionalData(
        long idUser) {
        return _userAdditionalDataLocalService.createUserAdditionalData(idUser);
    }

    /**
    * Deletes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data that was removed
    * @throws PortalException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData deleteUserAdditionalData(
        long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.deleteUserAdditionalData(idUser);
    }

    /**
    * Deletes the user additional data from the database. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData deleteUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.deleteUserAdditionalData(userAdditionalData);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _userAdditionalDataLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAdditionalDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.UserAdditionalDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public es.eina.tfg.model.UserAdditionalData fetchUserAdditionalData(
        long idUser) throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.fetchUserAdditionalData(idUser);
    }

    /**
    * Returns the user additional data with the primary key.
    *
    * @param idUser the primary key of the user additional data
    * @return the user additional data
    * @throws PortalException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData getUserAdditionalData(
        long idUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.getUserAdditionalData(idUser);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<es.eina.tfg.model.UserAdditionalData> getUserAdditionalDatas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.getUserAdditionalDatas(start, end);
    }

    /**
    * Returns the number of user additional datas.
    *
    * @return the number of user additional datas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUserAdditionalDatasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.getUserAdditionalDatasCount();
    }

    /**
    * Updates the user additional data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public es.eina.tfg.model.UserAdditionalData updateUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.updateUserAdditionalData(userAdditionalData);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userAdditionalDataLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userAdditionalDataLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _userAdditionalDataLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public es.eina.tfg.model.UserAdditionalData add(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.add(userAdditionalData);
    }

    @Override
    public es.eina.tfg.model.UserAdditionalData update(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _userAdditionalDataLocalService.update(userAdditionalData);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserAdditionalDataLocalService getWrappedUserAdditionalDataLocalService() {
        return _userAdditionalDataLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserAdditionalDataLocalService(
        UserAdditionalDataLocalService userAdditionalDataLocalService) {
        _userAdditionalDataLocalService = userAdditionalDataLocalService;
    }

    @Override
    public UserAdditionalDataLocalService getWrappedService() {
        return _userAdditionalDataLocalService;
    }

    @Override
    public void setWrappedService(
        UserAdditionalDataLocalService userAdditionalDataLocalService) {
        _userAdditionalDataLocalService = userAdditionalDataLocalService;
    }
}

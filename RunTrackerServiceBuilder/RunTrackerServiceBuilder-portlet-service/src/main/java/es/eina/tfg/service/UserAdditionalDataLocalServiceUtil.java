package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UserAdditionalData. This utility wraps
 * {@link es.eina.tfg.service.impl.UserAdditionalDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see UserAdditionalDataLocalService
 * @see es.eina.tfg.service.base.UserAdditionalDataLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.UserAdditionalDataLocalServiceImpl
 * @generated
 */
public class UserAdditionalDataLocalServiceUtil {
    private static UserAdditionalDataLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.UserAdditionalDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the user additional data to the database. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData addUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addUserAdditionalData(userAdditionalData);
    }

    /**
    * Creates a new user additional data with the primary key. Does not add the user additional data to the database.
    *
    * @param userId the primary key for the new user additional data
    * @return the new user additional data
    */
    public static es.eina.tfg.model.UserAdditionalData createUserAdditionalData(
        long userId) {
        return getService().createUserAdditionalData(userId);
    }

    /**
    * Deletes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the user additional data
    * @return the user additional data that was removed
    * @throws PortalException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData deleteUserAdditionalData(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserAdditionalData(userId);
    }

    /**
    * Deletes the user additional data from the database. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData deleteUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUserAdditionalData(userAdditionalData);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static es.eina.tfg.model.UserAdditionalData fetchUserAdditionalData(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchUserAdditionalData(userId);
    }

    /**
    * Returns the user additional data with the primary key.
    *
    * @param userId the primary key of the user additional data
    * @return the user additional data
    * @throws PortalException if a user additional data with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData getUserAdditionalData(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAdditionalData(userId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<es.eina.tfg.model.UserAdditionalData> getUserAdditionalDatas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAdditionalDatas(start, end);
    }

    /**
    * Returns the number of user additional datas.
    *
    * @return the number of user additional datas
    * @throws SystemException if a system exception occurred
    */
    public static int getUserAdditionalDatasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserAdditionalDatasCount();
    }

    /**
    * Updates the user additional data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param userAdditionalData the user additional data
    * @return the user additional data that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.UserAdditionalData updateUserAdditionalData(
        es.eina.tfg.model.UserAdditionalData userAdditionalData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUserAdditionalData(userAdditionalData);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static es.eina.tfg.model.UserAdditionalData add(
        java.lang.Long userId, java.lang.Integer weight,
        java.lang.Integer height, java.lang.String registerType)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException {
        return getService().add(userId, weight, height, registerType);
    }

    public static es.eina.tfg.model.UserAdditionalData update(
        java.lang.Long userId, java.lang.Integer weight,
        java.lang.Integer height, java.lang.String registerType,
        java.lang.Long smsCounter)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingUserException {
        return getService()
                   .update(userId, weight, height, registerType, smsCounter);
    }

    public static java.util.List<es.eina.tfg.model.UserSelectedRoutes> getUserSelectedRoutes(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUserSelectedRoutes(userId);
    }

    public static void clearService() {
        _service = null;
    }

    public static UserAdditionalDataLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UserAdditionalDataLocalService.class.getName());

            if (invokableLocalService instanceof UserAdditionalDataLocalService) {
                _service = (UserAdditionalDataLocalService) invokableLocalService;
            } else {
                _service = new UserAdditionalDataLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(UserAdditionalDataLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UserAdditionalDataLocalService service) {
    }
}

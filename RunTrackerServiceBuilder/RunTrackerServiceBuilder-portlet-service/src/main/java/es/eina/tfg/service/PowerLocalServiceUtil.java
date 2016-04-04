package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Power. This utility wraps
 * {@link es.eina.tfg.service.impl.PowerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see PowerLocalService
 * @see es.eina.tfg.service.base.PowerLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.PowerLocalServiceImpl
 * @generated
 */
public class PowerLocalServiceUtil {
    private static PowerLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.PowerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the power to the database. Also notifies the appropriate model listeners.
    *
    * @param power the power
    * @return the power that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Power addPower(
        es.eina.tfg.model.Power power)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPower(power);
    }

    /**
    * Creates a new power with the primary key. Does not add the power to the database.
    *
    * @param measurementId the primary key for the new power
    * @return the new power
    */
    public static es.eina.tfg.model.Power createPower(long measurementId) {
        return getService().createPower(measurementId);
    }

    /**
    * Deletes the power with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param measurementId the primary key of the power
    * @return the power that was removed
    * @throws PortalException if a power with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Power deletePower(long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePower(measurementId);
    }

    /**
    * Deletes the power from the database. Also notifies the appropriate model listeners.
    *
    * @param power the power
    * @return the power that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Power deletePower(
        es.eina.tfg.model.Power power)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePower(power);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.Power fetchPower(long measurementId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPower(measurementId);
    }

    /**
    * Returns the power with the primary key.
    *
    * @param measurementId the primary key of the power
    * @return the power
    * @throws PortalException if a power with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Power getPower(long measurementId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPower(measurementId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the powers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of powers
    * @param end the upper bound of the range of powers (not inclusive)
    * @return the range of powers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Power> getPowers(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPowers(start, end);
    }

    /**
    * Returns the number of powers.
    *
    * @return the number of powers
    * @throws SystemException if a system exception occurred
    */
    public static int getPowersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPowersCount();
    }

    /**
    * Updates the power in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param power the power
    * @return the power that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Power updatePower(
        es.eina.tfg.model.Power power)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePower(power);
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

    public static es.eina.tfg.model.Power add(java.lang.Long raceId,
        java.lang.Long userId, java.lang.Long deviceId,
        java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, java.lang.Integer level)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingDeviceAndSensorRelationException,
            es.eina.tfg.NonExistingRaceException,
            es.eina.tfg.NonExistingUserException {
        return getService()
                   .add(raceId, userId, deviceId, sensorId, time, sensorMode,
            level);
    }

    public static es.eina.tfg.model.Power update(java.lang.Long measurementId,
        java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
        java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, java.lang.Integer level)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NonExistingDeviceAndSensorRelationException,
            es.eina.tfg.NonExistingMeasurementException,
            es.eina.tfg.NonExistingRaceException,
            es.eina.tfg.NonExistingUserException {
        return getService()
                   .update(measurementId, raceId, userId, deviceId, sensorId,
            time, sensorMode, level);
    }

    public static void clearService() {
        _service = null;
    }

    public static PowerLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PowerLocalService.class.getName());

            if (invokableLocalService instanceof PowerLocalService) {
                _service = (PowerLocalService) invokableLocalService;
            } else {
                _service = new PowerLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PowerLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PowerLocalService service) {
    }
}

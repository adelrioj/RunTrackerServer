package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Device. This utility wraps
 * {@link es.eina.tfg.service.impl.DeviceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see DeviceLocalService
 * @see es.eina.tfg.service.base.DeviceLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.DeviceLocalServiceImpl
 * @generated
 */
public class DeviceLocalServiceUtil {
    private static DeviceLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.DeviceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the device to the database. Also notifies the appropriate model listeners.
    *
    * @param device the device
    * @return the device that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Device addDevice(
        es.eina.tfg.model.Device device)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDevice(device);
    }

    /**
    * Creates a new device with the primary key. Does not add the device to the database.
    *
    * @param idDevice the primary key for the new device
    * @return the new device
    */
    public static es.eina.tfg.model.Device createDevice(long idDevice) {
        return getService().createDevice(idDevice);
    }

    /**
    * Deletes the device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idDevice the primary key of the device
    * @return the device that was removed
    * @throws PortalException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Device deleteDevice(long idDevice)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDevice(idDevice);
    }

    /**
    * Deletes the device from the database. Also notifies the appropriate model listeners.
    *
    * @param device the device
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Device deleteDevice(
        es.eina.tfg.model.Device device)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDevice(device);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.Device fetchDevice(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchDevice(idDevice);
    }

    /**
    * Returns the device with the primary key.
    *
    * @param idDevice the primary key of the device
    * @return the device
    * @throws PortalException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Device getDevice(long idDevice)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getDevice(idDevice);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of devices
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.Device> getDevices(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDevices(start, end);
    }

    /**
    * Returns the number of devices.
    *
    * @return the number of devices
    * @throws SystemException if a system exception occurred
    */
    public static int getDevicesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDevicesCount();
    }

    /**
    * Updates the device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param device the device
    * @return the device that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Device updateDevice(
        es.eina.tfg.model.Device device)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDevice(device);
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

    public static java.lang.Long generateNewIdDevice()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdDevice();
    }

    public static java.util.List<es.eina.tfg.model.Sensor> getSensors(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSensors(deviceId);
    }

    public static java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
        java.lang.Long deviceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getActiveSensors(deviceId);
    }

    public static es.eina.tfg.model.Device getDeviceByPhoneNumber(
        java.lang.String phoneNumber)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException {
        return getService().getDeviceByPhoneNumber(phoneNumber);
    }

    public static java.util.List<es.eina.tfg.model.Device> getByUserId(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByUserId(userId);
    }

    public static es.eina.tfg.model.Device getBydeviceUUID(
        java.lang.String deviceUUID)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException {
        return getService().getBydeviceUUID(deviceUUID);
    }

    public static java.util.List<es.eina.tfg.model.Device> getByStatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByStatus(status);
    }

    public static java.util.List<es.eina.tfg.model.Device> getByStatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByStatus(status, start, end);
    }

    public static java.util.List<es.eina.tfg.model.Device> getByDescriptionAndIdUser(
        long idUser, java.lang.String description, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getByDescriptionAndIdUser(idUser, description, start, end);
    }

    public static int getByDescriptionAndIdUserCount(long idUser,
        java.lang.String description)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByDescriptionAndIdUserCount(idUser, description);
    }

    public static void clearService() {
        _service = null;
    }

    public static DeviceLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DeviceLocalService.class.getName());

            if (invokableLocalService instanceof DeviceLocalService) {
                _service = (DeviceLocalService) invokableLocalService;
            } else {
                _service = new DeviceLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(DeviceLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DeviceLocalService service) {
    }
}

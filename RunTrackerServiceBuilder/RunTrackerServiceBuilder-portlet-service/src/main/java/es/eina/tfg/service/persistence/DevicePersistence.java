package es.eina.tfg.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.Device;

/**
 * The persistence interface for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DevicePersistenceImpl
 * @see DeviceUtil
 * @generated
 */
public interface DevicePersistence extends BasePersistence<Device> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the devices where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findByuserId(long idUser,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices where idUser = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param idUser the id user
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findByuserId(long idUser,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the first device in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchByuserId_First(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the last device in the ordered set where idUser = &#63;.
    *
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchByuserId_Last(long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the devices before and after the current device in the ordered set where idUser = &#63;.
    *
    * @param idDevice the primary key of the current device
    * @param idUser the id user
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device
    * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device[] findByuserId_PrevAndNext(long idDevice,
        long idUser,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Removes all the devices where idUser = &#63; from the database.
    *
    * @param idUser the id user
    * @throws SystemException if a system exception occurred
    */
    public void removeByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where idUser = &#63;.
    *
    * @param idUser the id user
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByuserId(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where deviceUUID = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
    *
    * @param deviceUUID the device u u i d
    * @return the matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findBydeviceUUID(
        java.lang.String deviceUUID)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param deviceUUID the device u u i d
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchBydeviceUUID(
        java.lang.String deviceUUID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param deviceUUID the device u u i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchBydeviceUUID(
        java.lang.String deviceUUID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where deviceUUID = &#63; from the database.
    *
    * @param deviceUUID the device u u i d
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device removeBydeviceUUID(
        java.lang.String deviceUUID)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the number of devices where deviceUUID = &#63;.
    *
    * @param deviceUUID the device u u i d
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countBydeviceUUID(java.lang.String deviceUUID)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where phoneNumber = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
    *
    * @param phoneNumber the phone number
    * @return the matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findByphoneNumber(
        java.lang.String phoneNumber)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param phoneNumber the phone number
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchByphoneNumber(
        java.lang.String phoneNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param phoneNumber the phone number
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchByphoneNumber(
        java.lang.String phoneNumber, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the device where phoneNumber = &#63; from the database.
    *
    * @param phoneNumber the phone number
    * @return the device that was removed
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device removeByphoneNumber(
        java.lang.String phoneNumber)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the number of devices where phoneNumber = &#63;.
    *
    * @param phoneNumber the phone number
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countByphoneNumber(java.lang.String phoneNumber)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the devices where status = &#63;.
    *
    * @param status the status
    * @return the matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findBystatus(
        java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @return the range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findBystatus(
        java.lang.String status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices where status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param status the status
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findBystatus(
        java.lang.String status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findBystatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the first device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchBystatus_First(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device
    * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findBystatus_Last(java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the last device in the ordered set where status = &#63;.
    *
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching device, or <code>null</code> if a matching device could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchBystatus_Last(
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the devices before and after the current device in the ordered set where status = &#63;.
    *
    * @param idDevice the primary key of the current device
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next device
    * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device[] findBystatus_PrevAndNext(long idDevice,
        java.lang.String status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Removes all the devices where status = &#63; from the database.
    *
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeBystatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices where status = &#63;.
    *
    * @param status the status
    * @return the number of matching devices
    * @throws SystemException if a system exception occurred
    */
    public int countBystatus(java.lang.String status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the device in the entity cache if it is enabled.
    *
    * @param device the device
    */
    public void cacheResult(es.eina.tfg.model.Device device);

    /**
    * Caches the devices in the entity cache if it is enabled.
    *
    * @param devices the devices
    */
    public void cacheResult(java.util.List<es.eina.tfg.model.Device> devices);

    /**
    * Creates a new device with the primary key. Does not add the device to the database.
    *
    * @param idDevice the primary key for the new device
    * @return the new device
    */
    public es.eina.tfg.model.Device create(long idDevice);

    /**
    * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idDevice the primary key of the device
    * @return the device that was removed
    * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device remove(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    public es.eina.tfg.model.Device updateImpl(es.eina.tfg.model.Device device)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the device with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
    *
    * @param idDevice the primary key of the device
    * @return the device
    * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device findByPrimaryKey(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException,
            es.eina.tfg.NoSuchDeviceException;

    /**
    * Returns the device with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idDevice the primary key of the device
    * @return the device, or <code>null</code> if a device with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public es.eina.tfg.model.Device fetchByPrimaryKey(long idDevice)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the devices.
    *
    * @return the devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<es.eina.tfg.model.Device> findAll(int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the devices.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of devices
    * @param end the upper bound of the range of devices (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of devices
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<es.eina.tfg.model.Device> findAll(int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the devices from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of devices.
    *
    * @return the number of devices
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

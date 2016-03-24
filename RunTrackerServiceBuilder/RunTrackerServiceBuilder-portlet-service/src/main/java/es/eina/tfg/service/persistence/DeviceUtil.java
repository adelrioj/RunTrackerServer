/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import es.eina.tfg.model.Device;

import java.util.List;

/**
 * The persistence utility for the device service. This utility wraps {@link DevicePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DevicePersistence
 * @see DevicePersistenceImpl
 * @generated
 */
public class DeviceUtil {
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
	public static void clearCache(Device device) {
		getPersistence().clearCache(device);
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
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Device> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Device update(Device device) throws SystemException {
		return getPersistence().update(device);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Device update(Device device, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(device, serviceContext);
	}

	/**
	* Returns all the devices where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Device> findByuserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns a range of all the devices where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Device> findByuserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the devices where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Device> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the devices before and after the current device in the ordered set where userId = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device[] findByuserId_PrevAndNext(
		long deviceId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence()
				   .findByuserId_PrevAndNext(deviceId, userId, orderByComparator);
	}

	/**
	* Removes all the devices where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Returns the number of devices where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Returns the device where deviceUUID = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	*
	* @param deviceUUID the device u u i d
	* @return the matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findBydeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findBydeviceUUID(deviceUUID);
	}

	/**
	* Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param deviceUUID the device u u i d
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchBydeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydeviceUUID(deviceUUID);
	}

	/**
	* Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param deviceUUID the device u u i d
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchBydeviceUUID(
		java.lang.String deviceUUID, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydeviceUUID(deviceUUID, retrieveFromCache);
	}

	/**
	* Removes the device where deviceUUID = &#63; from the database.
	*
	* @param deviceUUID the device u u i d
	* @return the device that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device removeBydeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().removeBydeviceUUID(deviceUUID);
	}

	/**
	* Returns the number of devices where deviceUUID = &#63;.
	*
	* @param deviceUUID the device u u i d
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydeviceUUID(java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydeviceUUID(deviceUUID);
	}

	/**
	* Returns the device where phoneNumber = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	*
	* @param phoneNumber the phone number
	* @return the matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findByphoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findByphoneNumber(phoneNumber);
	}

	/**
	* Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phoneNumber the phone number
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchByphoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByphoneNumber(phoneNumber);
	}

	/**
	* Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phoneNumber the phone number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchByphoneNumber(
		java.lang.String phoneNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByphoneNumber(phoneNumber, retrieveFromCache);
	}

	/**
	* Removes the device where phoneNumber = &#63; from the database.
	*
	* @param phoneNumber the phone number
	* @return the device that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device removeByphoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().removeByphoneNumber(phoneNumber);
	}

	/**
	* Returns the number of devices where phoneNumber = &#63;.
	*
	* @param phoneNumber the phone number
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countByphoneNumber(java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByphoneNumber(phoneNumber);
	}

	/**
	* Returns all the devices where status = &#63;.
	*
	* @param status the status
	* @return the matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Device> findBystatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(status);
	}

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
	public static java.util.List<es.eina.tfg.model.Device> findBystatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBystatus(status, start, end);
	}

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
	public static java.util.List<es.eina.tfg.model.Device> findBystatus(
		java.lang.String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findBystatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first device in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchBystatus_First(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findBystatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last device in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchBystatus_Last(
		java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the devices before and after the current device in the ordered set where status = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device[] findBystatus_PrevAndNext(
		long deviceId, java.lang.String status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence()
				   .findBystatus_PrevAndNext(deviceId, status, orderByComparator);
	}

	/**
	* Removes all the devices where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBystatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of devices where status = &#63;.
	*
	* @param status the status
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countBystatus(java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the device in the entity cache if it is enabled.
	*
	* @param device the device
	*/
	public static void cacheResult(es.eina.tfg.model.Device device) {
		getPersistence().cacheResult(device);
	}

	/**
	* Caches the devices in the entity cache if it is enabled.
	*
	* @param devices the devices
	*/
	public static void cacheResult(
		java.util.List<es.eina.tfg.model.Device> devices) {
		getPersistence().cacheResult(devices);
	}

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param deviceId the primary key for the new device
	* @return the new device
	*/
	public static es.eina.tfg.model.Device create(long deviceId) {
		return getPersistence().create(deviceId);
	}

	/**
	* Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the device
	* @return the device that was removed
	* @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device remove(long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().remove(deviceId);
	}

	public static es.eina.tfg.model.Device updateImpl(
		es.eina.tfg.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(device);
	}

	/**
	* Returns the device with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device
	* @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device findByPrimaryKey(long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		return getPersistence().findByPrimaryKey(deviceId);
	}

	/**
	* Returns the device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device, or <code>null</code> if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Device fetchByPrimaryKey(long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(deviceId);
	}

	/**
	* Returns all the devices.
	*
	* @return the devices
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Device> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<es.eina.tfg.model.Device> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<es.eina.tfg.model.Device> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the devices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DevicePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DevicePersistence)PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
					DevicePersistence.class.getName());

			ReferenceRegistry.registerReference(DeviceUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DevicePersistence persistence) {
	}

	private static DevicePersistence _persistence;
}
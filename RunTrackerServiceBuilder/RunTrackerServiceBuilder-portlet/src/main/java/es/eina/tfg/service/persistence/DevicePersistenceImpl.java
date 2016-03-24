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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchDeviceException;
import es.eina.tfg.model.Device;
import es.eina.tfg.model.impl.DeviceImpl;
import es.eina.tfg.model.impl.DeviceModelImpl;
import es.eina.tfg.service.persistence.DevicePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see DevicePersistence
 * @see DeviceUtil
 * @generated
 */
public class DevicePersistenceImpl extends BasePersistenceImpl<Device>
	implements DevicePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DeviceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
			new String[] { Long.class.getName() },
			DeviceModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the devices where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Device> findByuserId(long userId) throws SystemException {
		return findByuserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Device> findByuserId(long userId, int start, int end)
		throws SystemException {
		return findByuserId(userId, start, end, null);
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
	@Override
	public List<Device> findByuserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<Device> list = (List<Device>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Device device : list) {
				if ((userId != device.getUserId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DEVICE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DeviceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Device>(list);
				}
				else {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Device findByuserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchByuserId_First(userId, orderByComparator);

		if (device != null) {
			return device;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDeviceException(msg.toString());
	}

	/**
	 * Returns the first device in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByuserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Device> list = findByuserId(userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Device findByuserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchByuserId_Last(userId, orderByComparator);

		if (device != null) {
			return device;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDeviceException(msg.toString());
	}

	/**
	 * Returns the last device in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByuserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByuserId(userId);

		if (count == 0) {
			return null;
		}

		List<Device> list = findByuserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Device[] findByuserId_PrevAndNext(long deviceId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = findByPrimaryKey(deviceId);

		Session session = null;

		try {
			session = openSession();

			Device[] array = new DeviceImpl[3];

			array[0] = getByuserId_PrevAndNext(session, device, userId,
					orderByComparator, true);

			array[1] = device;

			array[2] = getByuserId_PrevAndNext(session, device, userId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Device getByuserId_PrevAndNext(Session session, Device device,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DEVICE_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DeviceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(device);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Device> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the devices where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByuserId(long userId) throws SystemException {
		for (Device device : findByuserId(userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(device);
		}
	}

	/**
	 * Returns the number of devices where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByuserId(long userId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEVICE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "device.userId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_DEVICEUUID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBydeviceUUID",
			new String[] { String.class.getName() },
			DeviceModelImpl.DEVICEUUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEVICEUUID = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydeviceUUID",
			new String[] { String.class.getName() });

	/**
	 * Returns the device where deviceUUID = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	 *
	 * @param deviceUUID the device u u i d
	 * @return the matching device
	 * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device findBydeviceUUID(String deviceUUID)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchBydeviceUUID(deviceUUID);

		if (device == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("deviceUUID=");
			msg.append(deviceUUID);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDeviceException(msg.toString());
		}

		return device;
	}

	/**
	 * Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param deviceUUID the device u u i d
	 * @return the matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchBydeviceUUID(String deviceUUID)
		throws SystemException {
		return fetchBydeviceUUID(deviceUUID, true);
	}

	/**
	 * Returns the device where deviceUUID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param deviceUUID the device u u i d
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchBydeviceUUID(String deviceUUID, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { deviceUUID };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
					finderArgs, this);
		}

		if (result instanceof Device) {
			Device device = (Device)result;

			if (!Validator.equals(deviceUUID, device.getDeviceUUID())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DEVICE_WHERE);

			boolean bindDeviceUUID = false;

			if (deviceUUID == null) {
				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_1);
			}
			else if (deviceUUID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_3);
			}
			else {
				bindDeviceUUID = true;

				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeviceUUID) {
					qPos.add(deviceUUID);
				}

				List<Device> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DevicePersistenceImpl.fetchBydeviceUUID(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Device device = list.get(0);

					result = device;

					cacheResult(device);

					if ((device.getDeviceUUID() == null) ||
							!device.getDeviceUUID().equals(deviceUUID)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
							finderArgs, device);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Device)result;
		}
	}

	/**
	 * Removes the device where deviceUUID = &#63; from the database.
	 *
	 * @param deviceUUID the device u u i d
	 * @return the device that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device removeBydeviceUUID(String deviceUUID)
		throws NoSuchDeviceException, SystemException {
		Device device = findBydeviceUUID(deviceUUID);

		return remove(device);
	}

	/**
	 * Returns the number of devices where deviceUUID = &#63;.
	 *
	 * @param deviceUUID the device u u i d
	 * @return the number of matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydeviceUUID(String deviceUUID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEVICEUUID;

		Object[] finderArgs = new Object[] { deviceUUID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEVICE_WHERE);

			boolean bindDeviceUUID = false;

			if (deviceUUID == null) {
				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_1);
			}
			else if (deviceUUID.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_3);
			}
			else {
				bindDeviceUUID = true;

				query.append(_FINDER_COLUMN_DEVICEUUID_DEVICEUUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDeviceUUID) {
					qPos.add(deviceUUID);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DEVICEUUID_DEVICEUUID_1 = "device.deviceUUID IS NULL";
	private static final String _FINDER_COLUMN_DEVICEUUID_DEVICEUUID_2 = "device.deviceUUID = ?";
	private static final String _FINDER_COLUMN_DEVICEUUID_DEVICEUUID_3 = "(device.deviceUUID IS NULL OR device.deviceUUID = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_PHONENUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByphoneNumber",
			new String[] { String.class.getName() },
			DeviceModelImpl.PHONENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHONENUMBER = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByphoneNumber",
			new String[] { String.class.getName() });

	/**
	 * Returns the device where phoneNumber = &#63; or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	 *
	 * @param phoneNumber the phone number
	 * @return the matching device
	 * @throws es.eina.tfg.NoSuchDeviceException if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device findByphoneNumber(String phoneNumber)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchByphoneNumber(phoneNumber);

		if (device == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phoneNumber=");
			msg.append(phoneNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDeviceException(msg.toString());
		}

		return device;
	}

	/**
	 * Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phoneNumber the phone number
	 * @return the matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByphoneNumber(String phoneNumber)
		throws SystemException {
		return fetchByphoneNumber(phoneNumber, true);
	}

	/**
	 * Returns the device where phoneNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phoneNumber the phone number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByphoneNumber(String phoneNumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { phoneNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
					finderArgs, this);
		}

		if (result instanceof Device) {
			Device device = (Device)result;

			if (!Validator.equals(phoneNumber, device.getPhoneNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DEVICE_WHERE);

			boolean bindPhoneNumber = false;

			if (phoneNumber == null) {
				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_1);
			}
			else if (phoneNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_3);
			}
			else {
				bindPhoneNumber = true;

				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPhoneNumber) {
					qPos.add(phoneNumber);
				}

				List<Device> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DevicePersistenceImpl.fetchByphoneNumber(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Device device = list.get(0);

					result = device;

					cacheResult(device);

					if ((device.getPhoneNumber() == null) ||
							!device.getPhoneNumber().equals(phoneNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
							finderArgs, device);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Device)result;
		}
	}

	/**
	 * Removes the device where phoneNumber = &#63; from the database.
	 *
	 * @param phoneNumber the phone number
	 * @return the device that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device removeByphoneNumber(String phoneNumber)
		throws NoSuchDeviceException, SystemException {
		Device device = findByphoneNumber(phoneNumber);

		return remove(device);
	}

	/**
	 * Returns the number of devices where phoneNumber = &#63;.
	 *
	 * @param phoneNumber the phone number
	 * @return the number of matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByphoneNumber(String phoneNumber) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHONENUMBER;

		Object[] finderArgs = new Object[] { phoneNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEVICE_WHERE);

			boolean bindPhoneNumber = false;

			if (phoneNumber == null) {
				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_1);
			}
			else if (phoneNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_3);
			}
			else {
				bindPhoneNumber = true;

				query.append(_FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPhoneNumber) {
					qPos.add(phoneNumber);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PHONENUMBER_PHONENUMBER_1 = "device.phoneNumber IS NULL";
	private static final String _FINDER_COLUMN_PHONENUMBER_PHONENUMBER_2 = "device.phoneNumber = ?";
	private static final String _FINDER_COLUMN_PHONENUMBER_PHONENUMBER_3 = "(device.phoneNumber IS NULL OR device.phoneNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, DeviceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { String.class.getName() },
			DeviceModelImpl.STATUS_COLUMN_BITMASK |
			DeviceModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { String.class.getName() });

	/**
	 * Returns all the devices where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Device> findBystatus(String status) throws SystemException {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Device> findBystatus(String status, int start, int end)
		throws SystemException {
		return findBystatus(status, start, end, null);
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
	@Override
	public List<Device> findBystatus(String status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<Device> list = (List<Device>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Device device : list) {
				if (!Validator.equals(status, device.getStatus())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DEVICE_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DeviceModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				if (!pagination) {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Device>(list);
				}
				else {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Device findBystatus_First(String status,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchBystatus_First(status, orderByComparator);

		if (device != null) {
			return device;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDeviceException(msg.toString());
	}

	/**
	 * Returns the first device in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchBystatus_First(String status,
		OrderByComparator orderByComparator) throws SystemException {
		List<Device> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Device findBystatus_Last(String status,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchBystatus_Last(status, orderByComparator);

		if (device != null) {
			return device;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDeviceException(msg.toString());
	}

	/**
	 * Returns the last device in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching device, or <code>null</code> if a matching device could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchBystatus_Last(String status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<Device> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Device[] findBystatus_PrevAndNext(long deviceId, String status,
		OrderByComparator orderByComparator)
		throws NoSuchDeviceException, SystemException {
		Device device = findByPrimaryKey(deviceId);

		Session session = null;

		try {
			session = openSession();

			Device[] array = new DeviceImpl[3];

			array[0] = getBystatus_PrevAndNext(session, device, status,
					orderByComparator, true);

			array[1] = device;

			array[2] = getBystatus_PrevAndNext(session, device, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Device getBystatus_PrevAndNext(Session session, Device device,
		String status, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DEVICE_WHERE);

		boolean bindStatus = false;

		if (status == null) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_1);
		}
		else if (status.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DeviceModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindStatus) {
			qPos.add(status);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(device);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Device> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the devices where status = &#63; from the database.
	 *
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBystatus(String status) throws SystemException {
		for (Device device : findBystatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(device);
		}
	}

	/**
	 * Returns the number of devices where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBystatus(String status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DEVICE_WHERE);

			boolean bindStatus = false;

			if (status == null) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_1);
			}
			else if (status.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				query.append(_FINDER_COLUMN_STATUS_STATUS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindStatus) {
					qPos.add(status);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_STATUS_STATUS_1 = "device.status IS NULL";
	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "device.status = ?";
	private static final String _FINDER_COLUMN_STATUS_STATUS_3 = "(device.status IS NULL OR device.status = '')";

	public DevicePersistenceImpl() {
		setModelClass(Device.class);
	}

	/**
	 * Caches the device in the entity cache if it is enabled.
	 *
	 * @param device the device
	 */
	@Override
	public void cacheResult(Device device) {
		EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceImpl.class, device.getPrimaryKey(), device);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
			new Object[] { device.getDeviceUUID() }, device);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
			new Object[] { device.getPhoneNumber() }, device);

		device.resetOriginalValues();
	}

	/**
	 * Caches the devices in the entity cache if it is enabled.
	 *
	 * @param devices the devices
	 */
	@Override
	public void cacheResult(List<Device> devices) {
		for (Device device : devices) {
			if (EntityCacheUtil.getResult(
						DeviceModelImpl.ENTITY_CACHE_ENABLED, DeviceImpl.class,
						device.getPrimaryKey()) == null) {
				cacheResult(device);
			}
			else {
				device.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all devices.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DeviceImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DeviceImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the device.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Device device) {
		EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceImpl.class, device.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(device);
	}

	@Override
	public void clearCache(List<Device> devices) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Device device : devices) {
			EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
				DeviceImpl.class, device.getPrimaryKey());

			clearUniqueFindersCache(device);
		}
	}

	protected void cacheUniqueFindersCache(Device device) {
		if (device.isNew()) {
			Object[] args = new Object[] { device.getDeviceUUID() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEUUID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEUUID, args,
				device);

			args = new Object[] { device.getPhoneNumber() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHONENUMBER, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHONENUMBER, args,
				device);
		}
		else {
			DeviceModelImpl deviceModelImpl = (DeviceModelImpl)device;

			if ((deviceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DEVICEUUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { device.getDeviceUUID() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEVICEUUID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DEVICEUUID,
					args, device);
			}

			if ((deviceModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHONENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { device.getPhoneNumber() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHONENUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHONENUMBER,
					args, device);
			}
		}
	}

	protected void clearUniqueFindersCache(Device device) {
		DeviceModelImpl deviceModelImpl = (DeviceModelImpl)device;

		Object[] args = new Object[] { device.getDeviceUUID() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEUUID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEUUID, args);

		if ((deviceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DEVICEUUID.getColumnBitmask()) != 0) {
			args = new Object[] { deviceModelImpl.getOriginalDeviceUUID() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEVICEUUID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DEVICEUUID, args);
		}

		args = new Object[] { device.getPhoneNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHONENUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHONENUMBER, args);

		if ((deviceModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHONENUMBER.getColumnBitmask()) != 0) {
			args = new Object[] { deviceModelImpl.getOriginalPhoneNumber() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHONENUMBER, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHONENUMBER, args);
		}
	}

	/**
	 * Creates a new device with the primary key. Does not add the device to the database.
	 *
	 * @param deviceId the primary key for the new device
	 * @return the new device
	 */
	@Override
	public Device create(long deviceId) {
		Device device = new DeviceImpl();

		device.setNew(true);
		device.setPrimaryKey(deviceId);

		return device;
	}

	/**
	 * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param deviceId the primary key of the device
	 * @return the device that was removed
	 * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device remove(long deviceId)
		throws NoSuchDeviceException, SystemException {
		return remove((Serializable)deviceId);
	}

	/**
	 * Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the device
	 * @return the device that was removed
	 * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device remove(Serializable primaryKey)
		throws NoSuchDeviceException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Device device = (Device)session.get(DeviceImpl.class, primaryKey);

			if (device == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(device);
		}
		catch (NoSuchDeviceException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Device removeImpl(Device device) throws SystemException {
		device = toUnwrappedModel(device);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(device)) {
				device = (Device)session.get(DeviceImpl.class,
						device.getPrimaryKeyObj());
			}

			if (device != null) {
				session.delete(device);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (device != null) {
			clearCache(device);
		}

		return device;
	}

	@Override
	public Device updateImpl(es.eina.tfg.model.Device device)
		throws SystemException {
		device = toUnwrappedModel(device);

		boolean isNew = device.isNew();

		DeviceModelImpl deviceModelImpl = (DeviceModelImpl)device;

		Session session = null;

		try {
			session = openSession();

			if (device.isNew()) {
				session.save(device);

				device.setNew(false);
			}
			else {
				session.merge(device);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DeviceModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((deviceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { deviceModelImpl.getOriginalUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { deviceModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((deviceModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { deviceModelImpl.getOriginalStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { deviceModelImpl.getStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
			DeviceImpl.class, device.getPrimaryKey(), device);

		clearUniqueFindersCache(device);
		cacheUniqueFindersCache(device);

		return device;
	}

	protected Device toUnwrappedModel(Device device) {
		if (device instanceof DeviceImpl) {
			return device;
		}

		DeviceImpl deviceImpl = new DeviceImpl();

		deviceImpl.setNew(device.isNew());
		deviceImpl.setPrimaryKey(device.getPrimaryKey());

		deviceImpl.setDeviceId(device.getDeviceId());
		deviceImpl.setUserId(device.getUserId());
		deviceImpl.setDeviceUUID(device.getDeviceUUID());
		deviceImpl.setDescription(device.getDescription());
		deviceImpl.setStatus(device.getStatus());
		deviceImpl.setPhoneNumber(device.getPhoneNumber());
		deviceImpl.setServerPhoneNumber(device.getServerPhoneNumber());
		deviceImpl.setSmsPollTime(device.getSmsPollTime());
		deviceImpl.setSmsTransmitPeriod(device.getSmsTransmitPeriod());
		deviceImpl.setCloudId(device.getCloudId());
		deviceImpl.setServerIp(device.getServerIp());
		deviceImpl.setHttpTransmitPeriod(device.getHttpTransmitPeriod());

		return deviceImpl;
	}

	/**
	 * Returns the device with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the device
	 * @return the device
	 * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDeviceException, SystemException {
		Device device = fetchByPrimaryKey(primaryKey);

		if (device == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDeviceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return device;
	}

	/**
	 * Returns the device with the primary key or throws a {@link es.eina.tfg.NoSuchDeviceException} if it could not be found.
	 *
	 * @param deviceId the primary key of the device
	 * @return the device
	 * @throws es.eina.tfg.NoSuchDeviceException if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device findByPrimaryKey(long deviceId)
		throws NoSuchDeviceException, SystemException {
		return findByPrimaryKey((Serializable)deviceId);
	}

	/**
	 * Returns the device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the device
	 * @return the device, or <code>null</code> if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Device device = (Device)EntityCacheUtil.getResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
				DeviceImpl.class, primaryKey);

		if (device == _nullDevice) {
			return null;
		}

		if (device == null) {
			Session session = null;

			try {
				session = openSession();

				device = (Device)session.get(DeviceImpl.class, primaryKey);

				if (device != null) {
					cacheResult(device);
				}
				else {
					EntityCacheUtil.putResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
						DeviceImpl.class, primaryKey, _nullDevice);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DeviceModelImpl.ENTITY_CACHE_ENABLED,
					DeviceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return device;
	}

	/**
	 * Returns the device with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param deviceId the primary key of the device
	 * @return the device, or <code>null</code> if a device with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Device fetchByPrimaryKey(long deviceId) throws SystemException {
		return fetchByPrimaryKey((Serializable)deviceId);
	}

	/**
	 * Returns all the devices.
	 *
	 * @return the devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Device> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Device> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Device> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Device> list = (List<Device>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DEVICE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DEVICE;

				if (pagination) {
					sql = sql.concat(DeviceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Device>(list);
				}
				else {
					list = (List<Device>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the devices from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Device device : findAll()) {
			remove(device);
		}
	}

	/**
	 * Returns the number of devices.
	 *
	 * @return the number of devices
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DEVICE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the device persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.eina.tfg.model.Device")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Device>> listenersList = new ArrayList<ModelListener<Device>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Device>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DeviceImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DEVICE = "SELECT device FROM Device device";
	private static final String _SQL_SELECT_DEVICE_WHERE = "SELECT device FROM Device device WHERE ";
	private static final String _SQL_COUNT_DEVICE = "SELECT COUNT(device) FROM Device device";
	private static final String _SQL_COUNT_DEVICE_WHERE = "SELECT COUNT(device) FROM Device device WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "device.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Device exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Device exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DevicePersistenceImpl.class);
	private static Device _nullDevice = new DeviceImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Device> toCacheModel() {
				return _nullDeviceCacheModel;
			}
		};

	private static CacheModel<Device> _nullDeviceCacheModel = new CacheModel<Device>() {
			@Override
			public Device toEntityModel() {
				return _nullDevice;
			}
		};
}
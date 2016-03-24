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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchUserSelectedRoutesException;
import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.model.impl.UserSelectedRoutesImpl;
import es.eina.tfg.model.impl.UserSelectedRoutesModelImpl;
import es.eina.tfg.service.persistence.UserSelectedRoutesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user selected routes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserSelectedRoutesPersistence
 * @see UserSelectedRoutesUtil
 * @generated
 */
public class UserSelectedRoutesPersistenceImpl extends BasePersistenceImpl<UserSelectedRoutes>
	implements UserSelectedRoutesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserSelectedRoutesUtil} to access the user selected routes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserSelectedRoutesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED,
			UserSelectedRoutesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED,
			UserSelectedRoutesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED,
			UserSelectedRoutesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED,
			UserSelectedRoutesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
			new String[] { Long.class.getName() },
			UserSelectedRoutesModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByuserId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the user selected routeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching user selected routeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSelectedRoutes> findByuserId(long userId)
		throws SystemException {
		return findByuserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserSelectedRoutes> findByuserId(long userId, int start, int end)
		throws SystemException {
		return findByuserId(userId, start, end, null);
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
	@Override
	public List<UserSelectedRoutes> findByuserId(long userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<UserSelectedRoutes> list = (List<UserSelectedRoutes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (UserSelectedRoutes userSelectedRoutes : list) {
				if ((userId != userSelectedRoutes.getUserId())) {
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

			query.append(_SQL_SELECT_USERSELECTEDROUTES_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(UserSelectedRoutesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<UserSelectedRoutes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserSelectedRoutes>(list);
				}
				else {
					list = (List<UserSelectedRoutes>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first user selected routes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user selected routes
	 * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a matching user selected routes could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes findByuserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserSelectedRoutesException, SystemException {
		UserSelectedRoutes userSelectedRoutes = fetchByuserId_First(userId,
				orderByComparator);

		if (userSelectedRoutes != null) {
			return userSelectedRoutes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserSelectedRoutesException(msg.toString());
	}

	/**
	 * Returns the first user selected routes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes fetchByuserId_First(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<UserSelectedRoutes> list = findByuserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserSelectedRoutes findByuserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserSelectedRoutesException, SystemException {
		UserSelectedRoutes userSelectedRoutes = fetchByuserId_Last(userId,
				orderByComparator);

		if (userSelectedRoutes != null) {
			return userSelectedRoutes;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchUserSelectedRoutesException(msg.toString());
	}

	/**
	 * Returns the last user selected routes in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes fetchByuserId_Last(long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByuserId(userId);

		if (count == 0) {
			return null;
		}

		List<UserSelectedRoutes> list = findByuserId(userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public UserSelectedRoutes[] findByuserId_PrevAndNext(
		UserSelectedRoutesPK userSelectedRoutesPK, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchUserSelectedRoutesException, SystemException {
		UserSelectedRoutes userSelectedRoutes = findByPrimaryKey(userSelectedRoutesPK);

		Session session = null;

		try {
			session = openSession();

			UserSelectedRoutes[] array = new UserSelectedRoutesImpl[3];

			array[0] = getByuserId_PrevAndNext(session, userSelectedRoutes,
					userId, orderByComparator, true);

			array[1] = userSelectedRoutes;

			array[2] = getByuserId_PrevAndNext(session, userSelectedRoutes,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected UserSelectedRoutes getByuserId_PrevAndNext(Session session,
		UserSelectedRoutes userSelectedRoutes, long userId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_USERSELECTEDROUTES_WHERE);

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
			query.append(UserSelectedRoutesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(userSelectedRoutes);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<UserSelectedRoutes> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the user selected routeses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByuserId(long userId) throws SystemException {
		for (UserSelectedRoutes userSelectedRoutes : findByuserId(userId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(userSelectedRoutes);
		}
	}

	/**
	 * Returns the number of user selected routeses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching user selected routeses
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

			query.append(_SQL_COUNT_USERSELECTEDROUTES_WHERE);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "userSelectedRoutes.id.userId = ?";

	public UserSelectedRoutesPersistenceImpl() {
		setModelClass(UserSelectedRoutes.class);
	}

	/**
	 * Caches the user selected routes in the entity cache if it is enabled.
	 *
	 * @param userSelectedRoutes the user selected routes
	 */
	@Override
	public void cacheResult(UserSelectedRoutes userSelectedRoutes) {
		EntityCacheUtil.putResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesImpl.class, userSelectedRoutes.getPrimaryKey(),
			userSelectedRoutes);

		userSelectedRoutes.resetOriginalValues();
	}

	/**
	 * Caches the user selected routeses in the entity cache if it is enabled.
	 *
	 * @param userSelectedRouteses the user selected routeses
	 */
	@Override
	public void cacheResult(List<UserSelectedRoutes> userSelectedRouteses) {
		for (UserSelectedRoutes userSelectedRoutes : userSelectedRouteses) {
			if (EntityCacheUtil.getResult(
						UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
						UserSelectedRoutesImpl.class,
						userSelectedRoutes.getPrimaryKey()) == null) {
				cacheResult(userSelectedRoutes);
			}
			else {
				userSelectedRoutes.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user selected routeses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserSelectedRoutesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserSelectedRoutesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user selected routes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserSelectedRoutes userSelectedRoutes) {
		EntityCacheUtil.removeResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesImpl.class, userSelectedRoutes.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserSelectedRoutes> userSelectedRouteses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserSelectedRoutes userSelectedRoutes : userSelectedRouteses) {
			EntityCacheUtil.removeResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
				UserSelectedRoutesImpl.class, userSelectedRoutes.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user selected routes with the primary key. Does not add the user selected routes to the database.
	 *
	 * @param userSelectedRoutesPK the primary key for the new user selected routes
	 * @return the new user selected routes
	 */
	@Override
	public UserSelectedRoutes create(UserSelectedRoutesPK userSelectedRoutesPK) {
		UserSelectedRoutes userSelectedRoutes = new UserSelectedRoutesImpl();

		userSelectedRoutes.setNew(true);
		userSelectedRoutes.setPrimaryKey(userSelectedRoutesPK);

		return userSelectedRoutes;
	}

	/**
	 * Removes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userSelectedRoutesPK the primary key of the user selected routes
	 * @return the user selected routes that was removed
	 * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes remove(UserSelectedRoutesPK userSelectedRoutesPK)
		throws NoSuchUserSelectedRoutesException, SystemException {
		return remove((Serializable)userSelectedRoutesPK);
	}

	/**
	 * Removes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user selected routes
	 * @return the user selected routes that was removed
	 * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes remove(Serializable primaryKey)
		throws NoSuchUserSelectedRoutesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserSelectedRoutes userSelectedRoutes = (UserSelectedRoutes)session.get(UserSelectedRoutesImpl.class,
					primaryKey);

			if (userSelectedRoutes == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserSelectedRoutesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userSelectedRoutes);
		}
		catch (NoSuchUserSelectedRoutesException nsee) {
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
	protected UserSelectedRoutes removeImpl(
		UserSelectedRoutes userSelectedRoutes) throws SystemException {
		userSelectedRoutes = toUnwrappedModel(userSelectedRoutes);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userSelectedRoutes)) {
				userSelectedRoutes = (UserSelectedRoutes)session.get(UserSelectedRoutesImpl.class,
						userSelectedRoutes.getPrimaryKeyObj());
			}

			if (userSelectedRoutes != null) {
				session.delete(userSelectedRoutes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userSelectedRoutes != null) {
			clearCache(userSelectedRoutes);
		}

		return userSelectedRoutes;
	}

	@Override
	public UserSelectedRoutes updateImpl(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws SystemException {
		userSelectedRoutes = toUnwrappedModel(userSelectedRoutes);

		boolean isNew = userSelectedRoutes.isNew();

		UserSelectedRoutesModelImpl userSelectedRoutesModelImpl = (UserSelectedRoutesModelImpl)userSelectedRoutes;

		Session session = null;

		try {
			session = openSession();

			if (userSelectedRoutes.isNew()) {
				session.save(userSelectedRoutes);

				userSelectedRoutes.setNew(false);
			}
			else {
				session.merge(userSelectedRoutes);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !UserSelectedRoutesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((userSelectedRoutesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						userSelectedRoutesModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] { userSelectedRoutesModelImpl.getUserId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}
		}

		EntityCacheUtil.putResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
			UserSelectedRoutesImpl.class, userSelectedRoutes.getPrimaryKey(),
			userSelectedRoutes);

		return userSelectedRoutes;
	}

	protected UserSelectedRoutes toUnwrappedModel(
		UserSelectedRoutes userSelectedRoutes) {
		if (userSelectedRoutes instanceof UserSelectedRoutesImpl) {
			return userSelectedRoutes;
		}

		UserSelectedRoutesImpl userSelectedRoutesImpl = new UserSelectedRoutesImpl();

		userSelectedRoutesImpl.setNew(userSelectedRoutes.isNew());
		userSelectedRoutesImpl.setPrimaryKey(userSelectedRoutes.getPrimaryKey());

		userSelectedRoutesImpl.setUserId(userSelectedRoutes.getUserId());
		userSelectedRoutesImpl.setRouteId(userSelectedRoutes.getRouteId());

		return userSelectedRoutesImpl;
	}

	/**
	 * Returns the user selected routes with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user selected routes
	 * @return the user selected routes
	 * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserSelectedRoutesException, SystemException {
		UserSelectedRoutes userSelectedRoutes = fetchByPrimaryKey(primaryKey);

		if (userSelectedRoutes == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserSelectedRoutesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userSelectedRoutes;
	}

	/**
	 * Returns the user selected routes with the primary key or throws a {@link es.eina.tfg.NoSuchUserSelectedRoutesException} if it could not be found.
	 *
	 * @param userSelectedRoutesPK the primary key of the user selected routes
	 * @return the user selected routes
	 * @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes findByPrimaryKey(
		UserSelectedRoutesPK userSelectedRoutesPK)
		throws NoSuchUserSelectedRoutesException, SystemException {
		return findByPrimaryKey((Serializable)userSelectedRoutesPK);
	}

	/**
	 * Returns the user selected routes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user selected routes
	 * @return the user selected routes, or <code>null</code> if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserSelectedRoutes userSelectedRoutes = (UserSelectedRoutes)EntityCacheUtil.getResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
				UserSelectedRoutesImpl.class, primaryKey);

		if (userSelectedRoutes == _nullUserSelectedRoutes) {
			return null;
		}

		if (userSelectedRoutes == null) {
			Session session = null;

			try {
				session = openSession();

				userSelectedRoutes = (UserSelectedRoutes)session.get(UserSelectedRoutesImpl.class,
						primaryKey);

				if (userSelectedRoutes != null) {
					cacheResult(userSelectedRoutes);
				}
				else {
					EntityCacheUtil.putResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
						UserSelectedRoutesImpl.class, primaryKey,
						_nullUserSelectedRoutes);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserSelectedRoutesModelImpl.ENTITY_CACHE_ENABLED,
					UserSelectedRoutesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userSelectedRoutes;
	}

	/**
	 * Returns the user selected routes with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userSelectedRoutesPK the primary key of the user selected routes
	 * @return the user selected routes, or <code>null</code> if a user selected routes with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserSelectedRoutes fetchByPrimaryKey(
		UserSelectedRoutesPK userSelectedRoutesPK) throws SystemException {
		return fetchByPrimaryKey((Serializable)userSelectedRoutesPK);
	}

	/**
	 * Returns all the user selected routeses.
	 *
	 * @return the user selected routeses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserSelectedRoutes> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<UserSelectedRoutes> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<UserSelectedRoutes> findAll(int start, int end,
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

		List<UserSelectedRoutes> list = (List<UserSelectedRoutes>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERSELECTEDROUTES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERSELECTEDROUTES;

				if (pagination) {
					sql = sql.concat(UserSelectedRoutesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserSelectedRoutes>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserSelectedRoutes>(list);
				}
				else {
					list = (List<UserSelectedRoutes>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the user selected routeses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserSelectedRoutes userSelectedRoutes : findAll()) {
			remove(userSelectedRoutes);
		}
	}

	/**
	 * Returns the number of user selected routeses.
	 *
	 * @return the number of user selected routeses
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

				Query q = session.createQuery(_SQL_COUNT_USERSELECTEDROUTES);

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
	 * Initializes the user selected routes persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.eina.tfg.model.UserSelectedRoutes")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserSelectedRoutes>> listenersList = new ArrayList<ModelListener<UserSelectedRoutes>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserSelectedRoutes>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserSelectedRoutesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERSELECTEDROUTES = "SELECT userSelectedRoutes FROM UserSelectedRoutes userSelectedRoutes";
	private static final String _SQL_SELECT_USERSELECTEDROUTES_WHERE = "SELECT userSelectedRoutes FROM UserSelectedRoutes userSelectedRoutes WHERE ";
	private static final String _SQL_COUNT_USERSELECTEDROUTES = "SELECT COUNT(userSelectedRoutes) FROM UserSelectedRoutes userSelectedRoutes";
	private static final String _SQL_COUNT_USERSELECTEDROUTES_WHERE = "SELECT COUNT(userSelectedRoutes) FROM UserSelectedRoutes userSelectedRoutes WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userSelectedRoutes.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserSelectedRoutes exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No UserSelectedRoutes exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserSelectedRoutesPersistenceImpl.class);
	private static UserSelectedRoutes _nullUserSelectedRoutes = new UserSelectedRoutesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserSelectedRoutes> toCacheModel() {
				return _nullUserSelectedRoutesCacheModel;
			}
		};

	private static CacheModel<UserSelectedRoutes> _nullUserSelectedRoutesCacheModel =
		new CacheModel<UserSelectedRoutes>() {
			@Override
			public UserSelectedRoutes toEntityModel() {
				return _nullUserSelectedRoutes;
			}
		};
}
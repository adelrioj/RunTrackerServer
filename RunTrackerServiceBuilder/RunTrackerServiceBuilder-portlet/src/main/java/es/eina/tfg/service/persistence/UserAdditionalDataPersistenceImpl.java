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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import es.eina.tfg.NoSuchUserAdditionalDataException;
import es.eina.tfg.model.UserAdditionalData;
import es.eina.tfg.model.impl.UserAdditionalDataImpl;
import es.eina.tfg.model.impl.UserAdditionalDataModelImpl;
import es.eina.tfg.service.persistence.UserAdditionalDataPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the user additional data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataPersistence
 * @see UserAdditionalDataUtil
 * @generated
 */
public class UserAdditionalDataPersistenceImpl extends BasePersistenceImpl<UserAdditionalData>
	implements UserAdditionalDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserAdditionalDataUtil} to access the user additional data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserAdditionalDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataModelImpl.FINDER_CACHE_ENABLED,
			UserAdditionalDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataModelImpl.FINDER_CACHE_ENABLED,
			UserAdditionalDataImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserAdditionalDataPersistenceImpl() {
		setModelClass(UserAdditionalData.class);
	}

	/**
	 * Caches the user additional data in the entity cache if it is enabled.
	 *
	 * @param userAdditionalData the user additional data
	 */
	@Override
	public void cacheResult(UserAdditionalData userAdditionalData) {
		EntityCacheUtil.putResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataImpl.class, userAdditionalData.getPrimaryKey(),
			userAdditionalData);

		userAdditionalData.resetOriginalValues();
	}

	/**
	 * Caches the user additional datas in the entity cache if it is enabled.
	 *
	 * @param userAdditionalDatas the user additional datas
	 */
	@Override
	public void cacheResult(List<UserAdditionalData> userAdditionalDatas) {
		for (UserAdditionalData userAdditionalData : userAdditionalDatas) {
			if (EntityCacheUtil.getResult(
						UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
						UserAdditionalDataImpl.class,
						userAdditionalData.getPrimaryKey()) == null) {
				cacheResult(userAdditionalData);
			}
			else {
				userAdditionalData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user additional datas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UserAdditionalDataImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UserAdditionalDataImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user additional data.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserAdditionalData userAdditionalData) {
		EntityCacheUtil.removeResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataImpl.class, userAdditionalData.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserAdditionalData> userAdditionalDatas) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserAdditionalData userAdditionalData : userAdditionalDatas) {
			EntityCacheUtil.removeResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
				UserAdditionalDataImpl.class, userAdditionalData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user additional data with the primary key. Does not add the user additional data to the database.
	 *
	 * @param userId the primary key for the new user additional data
	 * @return the new user additional data
	 */
	@Override
	public UserAdditionalData create(long userId) {
		UserAdditionalData userAdditionalData = new UserAdditionalDataImpl();

		userAdditionalData.setNew(true);
		userAdditionalData.setPrimaryKey(userId);

		return userAdditionalData;
	}

	/**
	 * Removes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user additional data
	 * @return the user additional data that was removed
	 * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData remove(long userId)
		throws NoSuchUserAdditionalDataException, SystemException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the user additional data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user additional data
	 * @return the user additional data that was removed
	 * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData remove(Serializable primaryKey)
		throws NoSuchUserAdditionalDataException, SystemException {
		Session session = null;

		try {
			session = openSession();

			UserAdditionalData userAdditionalData = (UserAdditionalData)session.get(UserAdditionalDataImpl.class,
					primaryKey);

			if (userAdditionalData == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserAdditionalDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userAdditionalData);
		}
		catch (NoSuchUserAdditionalDataException nsee) {
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
	protected UserAdditionalData removeImpl(
		UserAdditionalData userAdditionalData) throws SystemException {
		userAdditionalData = toUnwrappedModel(userAdditionalData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userAdditionalData)) {
				userAdditionalData = (UserAdditionalData)session.get(UserAdditionalDataImpl.class,
						userAdditionalData.getPrimaryKeyObj());
			}

			if (userAdditionalData != null) {
				session.delete(userAdditionalData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userAdditionalData != null) {
			clearCache(userAdditionalData);
		}

		return userAdditionalData;
	}

	@Override
	public UserAdditionalData updateImpl(
		es.eina.tfg.model.UserAdditionalData userAdditionalData)
		throws SystemException {
		userAdditionalData = toUnwrappedModel(userAdditionalData);

		boolean isNew = userAdditionalData.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userAdditionalData.isNew()) {
				session.save(userAdditionalData);

				userAdditionalData.setNew(false);
			}
			else {
				session.merge(userAdditionalData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
			UserAdditionalDataImpl.class, userAdditionalData.getPrimaryKey(),
			userAdditionalData);

		return userAdditionalData;
	}

	protected UserAdditionalData toUnwrappedModel(
		UserAdditionalData userAdditionalData) {
		if (userAdditionalData instanceof UserAdditionalDataImpl) {
			return userAdditionalData;
		}

		UserAdditionalDataImpl userAdditionalDataImpl = new UserAdditionalDataImpl();

		userAdditionalDataImpl.setNew(userAdditionalData.isNew());
		userAdditionalDataImpl.setPrimaryKey(userAdditionalData.getPrimaryKey());

		userAdditionalDataImpl.setUserId(userAdditionalData.getUserId());
		userAdditionalDataImpl.setRegisterType(userAdditionalData.getRegisterType());
		userAdditionalDataImpl.setWeight(userAdditionalData.getWeight());
		userAdditionalDataImpl.setHeight(userAdditionalData.getHeight());
		userAdditionalDataImpl.setSmsCounter(userAdditionalData.getSmsCounter());

		return userAdditionalDataImpl;
	}

	/**
	 * Returns the user additional data with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user additional data
	 * @return the user additional data
	 * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserAdditionalDataException, SystemException {
		UserAdditionalData userAdditionalData = fetchByPrimaryKey(primaryKey);

		if (userAdditionalData == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserAdditionalDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userAdditionalData;
	}

	/**
	 * Returns the user additional data with the primary key or throws a {@link es.eina.tfg.NoSuchUserAdditionalDataException} if it could not be found.
	 *
	 * @param userId the primary key of the user additional data
	 * @return the user additional data
	 * @throws es.eina.tfg.NoSuchUserAdditionalDataException if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData findByPrimaryKey(long userId)
		throws NoSuchUserAdditionalDataException, SystemException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the user additional data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user additional data
	 * @return the user additional data, or <code>null</code> if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		UserAdditionalData userAdditionalData = (UserAdditionalData)EntityCacheUtil.getResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
				UserAdditionalDataImpl.class, primaryKey);

		if (userAdditionalData == _nullUserAdditionalData) {
			return null;
		}

		if (userAdditionalData == null) {
			Session session = null;

			try {
				session = openSession();

				userAdditionalData = (UserAdditionalData)session.get(UserAdditionalDataImpl.class,
						primaryKey);

				if (userAdditionalData != null) {
					cacheResult(userAdditionalData);
				}
				else {
					EntityCacheUtil.putResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
						UserAdditionalDataImpl.class, primaryKey,
						_nullUserAdditionalData);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UserAdditionalDataModelImpl.ENTITY_CACHE_ENABLED,
					UserAdditionalDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userAdditionalData;
	}

	/**
	 * Returns the user additional data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user additional data
	 * @return the user additional data, or <code>null</code> if a user additional data with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public UserAdditionalData fetchByPrimaryKey(long userId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns all the user additional datas.
	 *
	 * @return the user additional datas
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<UserAdditionalData> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<UserAdditionalData> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<UserAdditionalData> findAll(int start, int end,
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

		List<UserAdditionalData> list = (List<UserAdditionalData>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERADDITIONALDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERADDITIONALDATA;

				if (pagination) {
					sql = sql.concat(UserAdditionalDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserAdditionalData>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<UserAdditionalData>(list);
				}
				else {
					list = (List<UserAdditionalData>)QueryUtil.list(q,
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
	 * Removes all the user additional datas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (UserAdditionalData userAdditionalData : findAll()) {
			remove(userAdditionalData);
		}
	}

	/**
	 * Returns the number of user additional datas.
	 *
	 * @return the number of user additional datas
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

				Query q = session.createQuery(_SQL_COUNT_USERADDITIONALDATA);

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
	 * Initializes the user additional data persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.es.eina.tfg.model.UserAdditionalData")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<UserAdditionalData>> listenersList = new ArrayList<ModelListener<UserAdditionalData>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<UserAdditionalData>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(UserAdditionalDataImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERADDITIONALDATA = "SELECT userAdditionalData FROM UserAdditionalData userAdditionalData";
	private static final String _SQL_COUNT_USERADDITIONALDATA = "SELECT COUNT(userAdditionalData) FROM UserAdditionalData userAdditionalData";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userAdditionalData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserAdditionalData exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UserAdditionalDataPersistenceImpl.class);
	private static UserAdditionalData _nullUserAdditionalData = new UserAdditionalDataImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<UserAdditionalData> toCacheModel() {
				return _nullUserAdditionalDataCacheModel;
			}
		};

	private static CacheModel<UserAdditionalData> _nullUserAdditionalDataCacheModel =
		new CacheModel<UserAdditionalData>() {
			@Override
			public UserAdditionalData toEntityModel() {
				return _nullUserAdditionalData;
			}
		};
}
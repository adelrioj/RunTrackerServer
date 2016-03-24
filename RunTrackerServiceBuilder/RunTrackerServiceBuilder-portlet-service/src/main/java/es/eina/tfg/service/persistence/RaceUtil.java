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

import es.eina.tfg.model.Race;

import java.util.List;

/**
 * The persistence utility for the race service. This utility wraps {@link RacePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RacePersistence
 * @see RacePersistenceImpl
 * @generated
 */
public class RaceUtil {
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
	public static void clearCache(Race race) {
		getPersistence().clearCache(race);
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
	public static List<Race> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Race> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Race> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Race update(Race race) throws SystemException {
		return getPersistence().update(race);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Race update(Race race, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(race, serviceContext);
	}

	/**
	* Returns all the races where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findByuserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns a range of all the races where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of races
	* @param end the upper bound of the range of races (not inclusive)
	* @return the range of matching races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findByuserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the races where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of races
	* @param end the upper bound of the range of races (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first race in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching race
	* @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRaceException {
		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first race in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching race, or <code>null</code> if a matching race could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last race in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching race
	* @throws es.eina.tfg.NoSuchRaceException if a matching race could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRaceException {
		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last race in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching race, or <code>null</code> if a matching race could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the races before and after the current race in the ordered set where userId = &#63;.
	*
	* @param raceId the primary key of the current race
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next race
	* @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race[] findByuserId_PrevAndNext(
		long raceId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRaceException {
		return getPersistence()
				   .findByuserId_PrevAndNext(raceId, userId, orderByComparator);
	}

	/**
	* Removes all the races where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Returns the number of races where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching races
	* @throws SystemException if a system exception occurred
	*/
	public static int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Caches the race in the entity cache if it is enabled.
	*
	* @param race the race
	*/
	public static void cacheResult(es.eina.tfg.model.Race race) {
		getPersistence().cacheResult(race);
	}

	/**
	* Caches the races in the entity cache if it is enabled.
	*
	* @param races the races
	*/
	public static void cacheResult(java.util.List<es.eina.tfg.model.Race> races) {
		getPersistence().cacheResult(races);
	}

	/**
	* Creates a new race with the primary key. Does not add the race to the database.
	*
	* @param raceId the primary key for the new race
	* @return the new race
	*/
	public static es.eina.tfg.model.Race create(long raceId) {
		return getPersistence().create(raceId);
	}

	/**
	* Removes the race with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param raceId the primary key of the race
	* @return the race that was removed
	* @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race remove(long raceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRaceException {
		return getPersistence().remove(raceId);
	}

	public static es.eina.tfg.model.Race updateImpl(es.eina.tfg.model.Race race)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(race);
	}

	/**
	* Returns the race with the primary key or throws a {@link es.eina.tfg.NoSuchRaceException} if it could not be found.
	*
	* @param raceId the primary key of the race
	* @return the race
	* @throws es.eina.tfg.NoSuchRaceException if a race with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race findByPrimaryKey(long raceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRaceException {
		return getPersistence().findByPrimaryKey(raceId);
	}

	/**
	* Returns the race with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param raceId the primary key of the race
	* @return the race, or <code>null</code> if a race with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static es.eina.tfg.model.Race fetchByPrimaryKey(long raceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(raceId);
	}

	/**
	* Returns all the races.
	*
	* @return the races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the races.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of races
	* @param end the upper bound of the range of races (not inclusive)
	* @return the range of races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the races.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of races
	* @param end the upper bound of the range of races (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of races
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<es.eina.tfg.model.Race> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the races from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of races.
	*
	* @return the number of races
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RacePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RacePersistence)PortletBeanLocatorUtil.locate(es.eina.tfg.service.ClpSerializer.getServletContextName(),
					RacePersistence.class.getName());

			ReferenceRegistry.registerReference(RaceUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RacePersistence persistence) {
	}

	private static RacePersistence _persistence;
}
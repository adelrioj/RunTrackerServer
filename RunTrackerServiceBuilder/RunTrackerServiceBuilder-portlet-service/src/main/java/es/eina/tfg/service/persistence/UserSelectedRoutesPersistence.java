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

import com.liferay.portal.service.persistence.BasePersistence;

import es.eina.tfg.model.UserSelectedRoutes;

/**
 * The persistence interface for the user selected routes service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see UserSelectedRoutesPersistenceImpl
 * @see UserSelectedRoutesUtil
 * @generated
 */
public interface UserSelectedRoutesPersistence extends BasePersistence<UserSelectedRoutes> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserSelectedRoutesUtil} to access the user selected routes persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the user selected routeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first user selected routes in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user selected routes
	* @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a matching user selected routes could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes findByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchUserSelectedRoutesException;

	/**
	* Returns the first user selected routes in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last user selected routes in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user selected routes
	* @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a matching user selected routes could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchUserSelectedRoutesException;

	/**
	* Returns the last user selected routes in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user selected routes, or <code>null</code> if a matching user selected routes could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public es.eina.tfg.model.UserSelectedRoutes[] findByuserId_PrevAndNext(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchUserSelectedRoutesException;

	/**
	* Removes all the user selected routeses where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user selected routeses where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the user selected routes in the entity cache if it is enabled.
	*
	* @param userSelectedRoutes the user selected routes
	*/
	public void cacheResult(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes);

	/**
	* Caches the user selected routeses in the entity cache if it is enabled.
	*
	* @param userSelectedRouteses the user selected routeses
	*/
	public void cacheResult(
		java.util.List<es.eina.tfg.model.UserSelectedRoutes> userSelectedRouteses);

	/**
	* Creates a new user selected routes with the primary key. Does not add the user selected routes to the database.
	*
	* @param userSelectedRoutesPK the primary key for the new user selected routes
	* @return the new user selected routes
	*/
	public es.eina.tfg.model.UserSelectedRoutes create(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK);

	/**
	* Removes the user selected routes with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes that was removed
	* @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes remove(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchUserSelectedRoutesException;

	public es.eina.tfg.model.UserSelectedRoutes updateImpl(
		es.eina.tfg.model.UserSelectedRoutes userSelectedRoutes)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the user selected routes with the primary key or throws a {@link es.eina.tfg.NoSuchUserSelectedRoutesException} if it could not be found.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes
	* @throws es.eina.tfg.NoSuchUserSelectedRoutesException if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes findByPrimaryKey(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchUserSelectedRoutesException;

	/**
	* Returns the user selected routes with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userSelectedRoutesPK the primary key of the user selected routes
	* @return the user selected routes, or <code>null</code> if a user selected routes with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.UserSelectedRoutes fetchByPrimaryKey(
		es.eina.tfg.service.persistence.UserSelectedRoutesPK userSelectedRoutesPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the user selected routeses.
	*
	* @return the user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<es.eina.tfg.model.UserSelectedRoutes> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the user selected routeses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of user selected routeses.
	*
	* @return the number of user selected routeses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
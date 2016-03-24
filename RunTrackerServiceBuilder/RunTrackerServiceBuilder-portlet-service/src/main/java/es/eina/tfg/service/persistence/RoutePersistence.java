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

import es.eina.tfg.model.Route;

/**
 * The persistence interface for the route service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adelrioj
 * @see RoutePersistenceImpl
 * @see RouteUtil
 * @generated
 */
public interface RoutePersistence extends BasePersistence<Route> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RouteUtil} to access the route persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the routes where authorId = &#63;.
	*
	* @param authorId the author ID
	* @return the matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByuserId(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the routes where authorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param authorId the author ID
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @return the range of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByuserId(long authorId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the routes where authorId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param authorId the author ID
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByuserId(long authorId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first route in the ordered set where authorId = &#63;.
	*
	* @param authorId the author ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching route
	* @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route findByuserId_First(long authorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Returns the first route in the ordered set where authorId = &#63;.
	*
	* @param authorId the author ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching route, or <code>null</code> if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route fetchByuserId_First(long authorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last route in the ordered set where authorId = &#63;.
	*
	* @param authorId the author ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching route
	* @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route findByuserId_Last(long authorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Returns the last route in the ordered set where authorId = &#63;.
	*
	* @param authorId the author ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching route, or <code>null</code> if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route fetchByuserId_Last(long authorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the routes before and after the current route in the ordered set where authorId = &#63;.
	*
	* @param routeId the primary key of the current route
	* @param authorId the author ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next route
	* @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route[] findByuserId_PrevAndNext(long routeId,
		long authorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Removes all the routes where authorId = &#63; from the database.
	*
	* @param authorId the author ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByuserId(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of routes where authorId = &#63;.
	*
	* @param authorId the author ID
	* @return the number of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public int countByuserId(long authorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the routes where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @return the matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByisPublic(
		boolean isPublic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the routes where isPublic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isPublic the is public
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @return the range of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByisPublic(
		boolean isPublic, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the routes where isPublic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param isPublic the is public
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findByisPublic(
		boolean isPublic, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first route in the ordered set where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching route
	* @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route findByisPublic_First(boolean isPublic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Returns the first route in the ordered set where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching route, or <code>null</code> if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route fetchByisPublic_First(boolean isPublic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last route in the ordered set where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching route
	* @throws es.eina.tfg.NoSuchRouteException if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route findByisPublic_Last(boolean isPublic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Returns the last route in the ordered set where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching route, or <code>null</code> if a matching route could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route fetchByisPublic_Last(boolean isPublic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the routes before and after the current route in the ordered set where isPublic = &#63;.
	*
	* @param routeId the primary key of the current route
	* @param isPublic the is public
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next route
	* @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route[] findByisPublic_PrevAndNext(long routeId,
		boolean isPublic,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Removes all the routes where isPublic = &#63; from the database.
	*
	* @param isPublic the is public
	* @throws SystemException if a system exception occurred
	*/
	public void removeByisPublic(boolean isPublic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of routes where isPublic = &#63;.
	*
	* @param isPublic the is public
	* @return the number of matching routes
	* @throws SystemException if a system exception occurred
	*/
	public int countByisPublic(boolean isPublic)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the route in the entity cache if it is enabled.
	*
	* @param route the route
	*/
	public void cacheResult(es.eina.tfg.model.Route route);

	/**
	* Caches the routes in the entity cache if it is enabled.
	*
	* @param routes the routes
	*/
	public void cacheResult(java.util.List<es.eina.tfg.model.Route> routes);

	/**
	* Creates a new route with the primary key. Does not add the route to the database.
	*
	* @param routeId the primary key for the new route
	* @return the new route
	*/
	public es.eina.tfg.model.Route create(long routeId);

	/**
	* Removes the route with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param routeId the primary key of the route
	* @return the route that was removed
	* @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route remove(long routeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	public es.eina.tfg.model.Route updateImpl(es.eina.tfg.model.Route route)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the route with the primary key or throws a {@link es.eina.tfg.NoSuchRouteException} if it could not be found.
	*
	* @param routeId the primary key of the route
	* @return the route
	* @throws es.eina.tfg.NoSuchRouteException if a route with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route findByPrimaryKey(long routeId)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchRouteException;

	/**
	* Returns the route with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param routeId the primary key of the route
	* @return the route, or <code>null</code> if a route with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public es.eina.tfg.model.Route fetchByPrimaryKey(long routeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the routes.
	*
	* @return the routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the routes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @return the range of routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the routes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of routes
	* @param end the upper bound of the range of routes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of routes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<es.eina.tfg.model.Route> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the routes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of routes.
	*
	* @return the number of routes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
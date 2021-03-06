package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Route. This utility wraps
 * {@link es.eina.tfg.service.impl.RouteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see RouteLocalService
 * @see es.eina.tfg.service.base.RouteLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteLocalServiceImpl
 * @generated
 */
public class RouteLocalServiceUtil {
    private static RouteLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RouteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the route to the database. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Route addRoute(
        es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRoute(route);
    }

    /**
    * Creates a new route with the primary key. Does not add the route to the database.
    *
    * @param idRoute the primary key for the new route
    * @return the new route
    */
    public static es.eina.tfg.model.Route createRoute(long idRoute) {
        return getService().createRoute(idRoute);
    }

    /**
    * Deletes the route with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idRoute the primary key of the route
    * @return the route that was removed
    * @throws PortalException if a route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Route deleteRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRoute(idRoute);
    }

    /**
    * Deletes the route from the database. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Route deleteRoute(
        es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRoute(route);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.Route fetchRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRoute(idRoute);
    }

    /**
    * Returns the route with the primary key.
    *
    * @param idRoute the primary key of the route
    * @return the route
    * @throws PortalException if a route with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Route getRoute(long idRoute)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRoute(idRoute);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

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
    public static java.util.List<es.eina.tfg.model.Route> getRoutes(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRoutes(start, end);
    }

    /**
    * Returns the number of routes.
    *
    * @return the number of routes
    * @throws SystemException if a system exception occurred
    */
    public static int getRoutesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRoutesCount();
    }

    /**
    * Updates the route in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param route the route
    * @return the route that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Route updateRoute(
        es.eina.tfg.model.Route route)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRoute(route);
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

    public static java.lang.Long generateNewIdRoute()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdRoute();
    }

    public static java.util.List<es.eina.tfg.model.Route> getByAuthor(
        java.lang.Long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByAuthor(idAuthor);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByisPublic(
        boolean isPublic)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByisPublic(isPublic);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByisPublic(
        boolean isPublic, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByisPublic(isPublic, start, end);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByName(name, start, end, orderByComparator);
    }

    public static int getByNameCount(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByNameCount(name);
    }

    public static java.util.List<es.eina.tfg.model.Route> getByIdUserAndName(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByIdUserAndName(idUser, name, start, end);
    }

    public static long getByIdUserAndNameCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByIdUserAndNameCount(idUser, name);
    }

    public static java.util.List<es.eina.tfg.model.Route> getPublicRoutesNotSelectedByUser(
        long idUser, java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getPublicRoutesNotSelectedByUser(idUser, name, start, end);
    }

    public static long getPublicRoutesNotSelectedByUserCount(long idUser,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPublicRoutesNotSelectedByUserCount(idUser, name);
    }

    public static long countByIdAuthor(long idAuthor)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countByIdAuthor(idAuthor);
    }

    public static void clearService() {
        _service = null;
    }

    public static RouteLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RouteLocalService.class.getName());

            if (invokableLocalService instanceof RouteLocalService) {
                _service = (RouteLocalService) invokableLocalService;
            } else {
                _service = new RouteLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RouteLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RouteLocalService service) {
    }
}

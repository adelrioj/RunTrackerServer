package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for RouteLocation. This utility wraps
 * {@link es.eina.tfg.service.impl.RouteLocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see RouteLocationLocalService
 * @see es.eina.tfg.service.base.RouteLocationLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.RouteLocationLocalServiceImpl
 * @generated
 */
public class RouteLocationLocalServiceUtil {
    private static RouteLocationLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RouteLocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the route location to the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation addRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRouteLocation(routeLocation);
    }

    /**
    * Creates a new route location with the primary key. Does not add the route location to the database.
    *
    * @param routeLocationPK the primary key for the new route location
    * @return the new route location
    */
    public static es.eina.tfg.model.RouteLocation createRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK) {
        return getService().createRouteLocation(routeLocationPK);
    }

    /**
    * Deletes the route location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location that was removed
    * @throws PortalException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation deleteRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRouteLocation(routeLocationPK);
    }

    /**
    * Deletes the route location from the database. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation deleteRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRouteLocation(routeLocation);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.RouteLocation fetchRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRouteLocation(routeLocationPK);
    }

    /**
    * Returns the route location with the primary key.
    *
    * @param routeLocationPK the primary key of the route location
    * @return the route location
    * @throws PortalException if a route location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation getRouteLocation(
        es.eina.tfg.service.persistence.RouteLocationPK routeLocationPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRouteLocation(routeLocationPK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the route locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RouteLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of route locations
    * @param end the upper bound of the range of route locations (not inclusive)
    * @return the range of route locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<es.eina.tfg.model.RouteLocation> getRouteLocations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRouteLocations(start, end);
    }

    /**
    * Returns the number of route locations.
    *
    * @return the number of route locations
    * @throws SystemException if a system exception occurred
    */
    public static int getRouteLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRouteLocationsCount();
    }

    /**
    * Updates the route location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param routeLocation the route location
    * @return the route location that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.RouteLocation updateRouteLocation(
        es.eina.tfg.model.RouteLocation routeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRouteLocation(routeLocation);
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

    public static es.eina.tfg.service.persistence.RouteLocationPK generateNewIdRouteLocation(
        long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdRouteLocation(idRoute);
    }

    public static es.eina.tfg.model.RouteLocation createRouteLocation(
        long idRoute, long idRouteLocation) {
        return getService().createRouteLocation(idRoute, idRouteLocation);
    }

    public static java.util.List<es.eina.tfg.model.RouteLocation> getByidRoute(
        java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidRoute(idRoute);
    }

    public static java.util.List<es.eina.tfg.model.RouteLocation> getByidRoute(
        long idRoute, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidRoute(idRoute, start, end);
    }

    public static int getByidRouteCount(java.lang.Long idRoute)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByidRouteCount(idRoute);
    }

    public static void clearService() {
        _service = null;
    }

    public static RouteLocationLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RouteLocationLocalService.class.getName());

            if (invokableLocalService instanceof RouteLocationLocalService) {
                _service = (RouteLocationLocalService) invokableLocalService;
            } else {
                _service = new RouteLocationLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RouteLocationLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RouteLocationLocalService service) {
    }
}

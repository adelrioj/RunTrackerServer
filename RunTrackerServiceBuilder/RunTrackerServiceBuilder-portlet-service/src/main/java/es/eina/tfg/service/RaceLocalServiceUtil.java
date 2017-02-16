package es.eina.tfg.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Race. This utility wraps
 * {@link es.eina.tfg.service.impl.RaceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author adelrioj
 * @see RaceLocalService
 * @see es.eina.tfg.service.base.RaceLocalServiceBaseImpl
 * @see es.eina.tfg.service.impl.RaceLocalServiceImpl
 * @generated
 */
public class RaceLocalServiceUtil {
    private static RaceLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link es.eina.tfg.service.impl.RaceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the race to the database. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was added
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Race addRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addRace(race);
    }

    /**
    * Creates a new race with the primary key. Does not add the race to the database.
    *
    * @param idRace the primary key for the new race
    * @return the new race
    */
    public static es.eina.tfg.model.Race createRace(long idRace) {
        return getService().createRace(idRace);
    }

    /**
    * Deletes the race with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idRace the primary key of the race
    * @return the race that was removed
    * @throws PortalException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Race deleteRace(long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRace(idRace);
    }

    /**
    * Deletes the race from the database. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was removed
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Race deleteRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteRace(race);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.RaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static es.eina.tfg.model.Race fetchRace(long idRace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRace(idRace);
    }

    /**
    * Returns the race with the primary key.
    *
    * @param idRace the primary key of the race
    * @return the race
    * @throws PortalException if a race with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Race getRace(long idRace)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRace(idRace);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<es.eina.tfg.model.Race> getRaces(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRaces(start, end);
    }

    /**
    * Returns the number of races.
    *
    * @return the number of races
    * @throws SystemException if a system exception occurred
    */
    public static int getRacesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRacesCount();
    }

    /**
    * Updates the race in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param race the race
    * @return the race that was updated
    * @throws SystemException if a system exception occurred
    */
    public static es.eina.tfg.model.Race updateRace(es.eina.tfg.model.Race race)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateRace(race);
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

    public static java.lang.Long generateNewIdRace()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().generateNewIdRace();
    }

    public static java.util.List<es.eina.tfg.model.Race> getByUserId(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getByUserId(userId);
    }

    public static java.util.List<es.eina.tfg.model.Race> getByIdUserAndTimeRange(
        long idUser, java.util.Date startTime, java.util.Date endTime,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getByIdUserAndTimeRange(idUser, startTime, endTime, start,
            end);
    }

    public static es.eina.tfg.model.Race getLastRace(long idUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLastRace(idUser);
    }

    public static java.util.List<es.eina.tfg.model.Location> getLocations(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLocations(idRace);
    }

    public static java.util.List<es.eina.tfg.model.Power> getPowerMeasurements(
        long idRace) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPowerMeasurements(idRace);
    }

    public static void clearService() {
        _service = null;
    }

    public static RaceLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    RaceLocalService.class.getName());

            if (invokableLocalService instanceof RaceLocalService) {
                _service = (RaceLocalService) invokableLocalService;
            } else {
                _service = new RaceLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(RaceLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RaceLocalService service) {
    }
}

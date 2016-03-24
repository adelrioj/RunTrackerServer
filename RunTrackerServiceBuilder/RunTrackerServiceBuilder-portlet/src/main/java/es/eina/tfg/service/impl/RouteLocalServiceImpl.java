package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import es.eina.tfg.NonExistingRouteException;
import es.eina.tfg.model.Route;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.base.RouteLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.RouteUtil;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the route local service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RouteLocalService} interface.
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see RouteLocalServiceBaseImpl
 * @see es.eina.tfg.service.RouteLocalServiceUtil
 */
public class RouteLocalServiceImpl extends RouteLocalServiceBaseImpl {
    public Route add(String type, String name, String description, Long authorId, boolean isPublic, Date startingTime)
            throws SystemException {
        Long routeId = counterLocalService.increment();
        DateTime creationDate = DateTime.now();

        Route route = createRoute(routeId);

        if (Validator.isNotNull(type)){
            route.setType(type);
        }else {
            route.setType(DEFAULT_TYPE);
        }
        if (Validator.isNotNull(name)){
            route.setName(name);
        }else {
            route.setName(DEFAULT_NAME + creationDate.toString());
        }
        if (Validator.isNotNull(description)){
            route.setDescription(description);
        }else {
            route.setDescription(DEFAULT_DESC);
        }
        route.setAuthorId(authorId);
        if (Validator.isNotNull(isPublic)){
            route.setIsPublic(isPublic);
        }else {
            route.setIsPublic(DEFAULT_ISPUBLIC);
        }
        if (startingTime == null){
            route.setStartingTime(DEFAULT_STARTINGTIME);
        }else {
            route.setStartingTime(startingTime);
        }
        route.setCreationTime(creationDate.toDate());

        return updateRoute(route);
    }

    public Route update(Long routeId, String type, String name, String description, Long authorId, boolean isPublic, Date startingTime, Date creationTime)
            throws SystemException, NonExistingRouteException {

        Route route = fetchRoute(routeId);
        if (route == null){
            throw new NonExistingRouteException("Route: " + routeId + " does not exists on the database.");
        }
        route.setType(type);
        route.setName(name);
        route.setDescription(description);
        route.setAuthorId(authorId);
        route.setIsPublic(isPublic);
        route.setStartingTime(startingTime);
        route.setCreationTime(creationTime);

        return updateRoute(route);
    }

    public List<Route> findByAuthor (Long userId) throws SystemException {
        return RouteUtil.findByuserId(userId);
    }

    public List<Route> getPublicRoutes() throws SystemException {
        return RouteUtil.findByisPublic(true);
    }

    public List<Route> getPublicRoutes(int start, int end) throws SystemException {
        return RouteUtil.findByisPublic(true, start, end);
    }

    public List<Route> getRoutesByName (String name, int start, int end, OrderByComparator orderByComparator)
        throws SystemException{
        return RouteLocalServiceUtil.dynamicQuery(buildGetRoutesByNameDynamicQuery(name), start, end, orderByComparator);
    }

    public int getRoutesByNameCount(String name)
            throws SystemException{
        return (int) RouteLocalServiceUtil.dynamicQueryCount(buildGetRoutesByNameDynamicQuery(name));
    }

    protected DynamicQuery buildGetRoutesByNameDynamicQuery (String name){
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Route.class);
        if (Validator.isNotNull(name)){
            dynamicQuery.add(RestrictionsFactoryUtil.ilike("name", (new StringBuilder("%")).append(name).append("%").toString()));
        }
        return dynamicQuery;
    }

    public static final String DEFAULT_NAME = "ROUTE_";
    public static final String DEFAULT_DESC = "NO DESCRIPTION PROVIDED";
    public static final String DEFAULT_TYPE = "NOT DEFINED";
    public static final boolean DEFAULT_ISPUBLIC = false;
    public static final Date DEFAULT_STARTINGTIME = new DateTime(1,1,1,1,1,1).toDate();

    public static final String TYPE_WALKING = "WALKING";
    public static final String TYPE_RUNNING = "RUNNING";
    public static final String TYPE_CYCLING = "CYCLING";
}
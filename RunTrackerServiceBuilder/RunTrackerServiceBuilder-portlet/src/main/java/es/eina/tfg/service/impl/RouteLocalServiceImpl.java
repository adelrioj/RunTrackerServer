package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import es.eina.tfg.model.Route;
import es.eina.tfg.service.base.RouteLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.RouteFinderUtil;
import es.eina.tfg.service.persistence.RouteUtil;
import org.joda.time.DateTime;

import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNotNull;

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

    public Long generateNewIdRoute()
            throws SystemException {
        try {
            return counterLocalService.increment(Route.class.getName());
        } catch (SystemException e) {
            _log.error("SystemException: Cannot generate counterLocalService.increment() for class: "
                    + Route.class.getName());
            throw e;
        }
    }

    @Override
    public Route addRoute(Route route)
            throws SystemException {
        checkMadatoryAttributes(route);
        route.setCreationTime(DateTime.now().toDate());
        return super.addRoute(route);
    }

    @Override
    public Route updateRoute(Route route)
            throws SystemException {
        checkMadatoryAttributes(route);
        return super.updateRoute(route);
    }

    private void checkMadatoryAttributes(Route route)
            throws SystemException {
        User user = UserLocalServiceUtil.fetchUser(route.getIdAuthor());
        if (user == null){
            throw new SystemException("The user: " + route.getIdAuthor() +" does not exists on the database");
        }
    }

    public List<Route> getByAuthor (Long idAuthor)
            throws SystemException {
        return RouteUtil.findByauthor(idAuthor);
    }

    public List<Route> getByisPublic(boolean isPublic)
            throws SystemException {
        return RouteUtil.findByisPublic(isPublic);
    }

    public List<Route> getByisPublic(boolean isPublic, int start, int end)
            throws SystemException {
        return RouteUtil.findByisPublic(isPublic, start, end);
    }

    public List<Route> getByName (String name, int start, int end, OrderByComparator orderByComparator)
            throws SystemException{
        return RouteUtil.findWithDynamicQuery(buildGetRoutesByNameDynamicQuery(name), start, end, orderByComparator);
    }

    public int getByNameCount(String name)
            throws SystemException{

        return (int) RouteUtil.countWithDynamicQuery(buildGetRoutesByNameDynamicQuery(name));
    }

    public List<Route> getByIdUserAndName(long idUser, String name, int start, int end)
            throws SystemException {
        return RouteFinderUtil.getByIdUserAndName(idUser, name, start, end);
    }

    public long getByIdUserAndNameCount(long idUser, String name)
            throws SystemException {
        return RouteFinderUtil.getByIdUserAndNameCount(idUser, name);
    }

    public List<Route> getPublicRoutesNotSelectedByUser(long idUser, String name, int start, int end)
            throws SystemException {
        return RouteFinderUtil.getPublicRoutesNotSelectedByUser(idUser, name, start, end);
    }

    public long getPublicRoutesNotSelectedByUserCount(long idUser, String name)
            throws SystemException {
        return RouteFinderUtil.getPublicRoutesNotSelectedByUserCount(idUser, name);
    }

    private DynamicQuery buildGetRoutesByNameDynamicQuery(String name){
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Route.class);
        if (isNotNull(name)){
            dynamicQuery.add(RestrictionsFactoryUtil.ilike("name",
                    (new StringBuilder("%")).append(name).append("%").toString()));
        }
        return dynamicQuery;
    }

    public static final String TYPE_WALKING = "WALKING";
    public static final String TYPE_RUNNING = "RUNNING";
    public static final String TYPE_CYCLING = "CYCLING";

    private static Log _log = LogFactoryUtil.getLog(RouteLocalServiceImpl.class);
}

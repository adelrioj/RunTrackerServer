package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingRouteException;
import es.eina.tfg.model.Route;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.base.RouteServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the route remote service.
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.RouteService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see RouteServiceBaseImpl
 * @see es.eina.tfg.service.RouteServiceUtil
 */
public class RouteServiceImpl extends RouteServiceBaseImpl {
    public Route add(String type, String name, String description, Long authorId, boolean isPublic,
                     Date startingTime) throws SystemException {
        return RouteLocalServiceUtil.add(type, name, description, authorId, isPublic, startingTime);
    }

    public Route update( Long routeId, String type, String name, String description, Long authorId, boolean isPublic,
                         Date startingTime, Date creationTime) throws SystemException, NonExistingRouteException {
        return RouteLocalServiceUtil.update(routeId, type, name, description, authorId, isPublic, startingTime,
                creationTime);
    }

    public Route delete(Long routeId) throws SystemException, PortalException {
        return RouteLocalServiceUtil.deleteRoute(routeId);
    }

    public Route getRoute(Long routeId) throws SystemException, PortalException {
        return RouteLocalServiceUtil.getRoute(routeId);
    }

    public List<Route> findByAuthor(Long userId) throws SystemException {
        return RouteLocalServiceUtil.findByAuthor(userId);
    }

    public List<Route> getPublicRoutes() throws SystemException {
        return RouteLocalServiceUtil.getPublicRoutes();
    }

    public List<Route> getPublicRoutes(int start, int end) throws SystemException {
        return RouteLocalServiceUtil.getPublicRoutes(start,end);
    }

    public static final String DEFAULT_NAME = RouteLocalServiceImpl.DEFAULT_NAME;
    public static final String DEFAULT_DESC = RouteLocalServiceImpl.DEFAULT_DESC;
    public static final String DEFAULT_TYPE = RouteLocalServiceImpl.DEFAULT_TYPE;
    public static final boolean DEFAULT_ISPUBLIC = RouteLocalServiceImpl.DEFAULT_ISPUBLIC;
    public static final Date DEFAULT_STARTINGTIME = RouteLocalServiceImpl.DEFAULT_STARTINGTIME;

    public static final String TYPE_WALKING = RouteLocalServiceImpl.TYPE_WALKING;
    public static final String TYPE_RUNNING = RouteLocalServiceImpl.TYPE_RUNNING;
    public static final String TYPE_CYCLING = RouteLocalServiceImpl.TYPE_CYCLING;
}
package es.eina.tfg.RouteViewer.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import es.eina.tfg.RouteViewer.exception.*;
import es.eina.tfg.RouteViewer.model.RouteDisplayTerms;
import es.eina.tfg.RouteViewer.model.parser.RouteParserFactory;
import es.eina.tfg.RunTrackerBL.converter.RouteUtils;
import es.eina.tfg.RunTrackerBL.dao.RouteDAO;
import es.eina.tfg.RunTrackerBL.dao.RouteLocationDAO;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.entity.RouteLocation;

import java.io.File;
import java.util.Collections;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNull;

public class RouteManager {

    public static Route addRoute(final Route route, File locations)
            throws UnableToAddException {
        if (Validator.isNull(route.getAuthor()))
            throw new UnableToAddException("Cannot add route with empty or null author for: " + route);
        if (Validator.isNull(route.getName()))
            throw new UnableToAddException("Cannot add route with empty or null name for: " + route);
        if (Validator.isNull(route.getType()))
            throw new UnableToAddException("Cannot add route with empty or null type for: " + route);

        try {
            return _addRoute(route, locations);
        } catch (SystemException e) {
            _log.error("SystemException while insert: " + route, e);
            throw new UnableToAddException(e);
        } catch (PortalException e) {
            _log.error("PortalException while insert: " + route, e);
            throw new UnableToAddException(e);
        } catch (UnableToParseGPXException e) {
            _log.error("UnableToParseGPXException while getLocationsFromFile: " + route, e);
            throw new UnableToAddException(e);
        } catch (UnableToObtainElevationException e) {
            _log.error("UnableToObtainElevationException while getLocationsFromFile: " + route, e);
            throw new UnableToAddException(e);
        }
    }

    private static Route _addRoute(Route route, File locations)
            throws UnableToParseGPXException, UnableToObtainElevationException, SystemException, PortalException {
        List<RouteLocation> locationList = RouteParserFactory.getSAXHandler(locations.getName())
                .getLocationsFromFile(locations);

        Route addedRoute = RouteDAO.insert(route);
        RouteLocationDAO.insertMany(addedRoute.getIdRoute(), locationList);

        RouteUtils.setLocationBasedProperties(addedRoute, locationList);

        _log.info("Added route: " + addedRoute);
        return addedRoute;
    }

    public static Route updateRoute(final Route route)
            throws UnableToUpdateException {
        if (isNull(route.getName()))
            throw new UnableToUpdateException("Route name cannot be null or empty");
        if (isNull(route.getDescription()))
            throw new UnableToUpdateException("Route description cannot be null or empty");
        if (isNull(route.getType()))
            throw new UnableToUpdateException("Route type cannot be null or empty");

        try {
            return RouteDAO.update(route);
        } catch (SystemException e) {
            _log.error("SystemException while updating route: " + route, e);
            throw new UnableToUpdateException(e);
        } catch (PortalException e) {
            _log.error("SystemException while updating route: " + route, e);
            throw new UnableToUpdateException(e);
        }
    }

    public static void deleteRoute(final Long idRoute)
            throws UnableToDeleteException {
        try {
            if (Validator.isNotNull(idRoute)){
                RouteDAO.delete(idRoute);
                _log.info("Route " + idRoute + " successfully deleted");
            }
        } catch (SystemException e) {
            _log.error("SystemException while deleteRoute for: " + idRoute, e);
            throw new UnableToDeleteException(e);
        } catch (PortalException e) {
            _log.error("PortalException while deleteRoute for: " + idRoute, e);
            throw new  UnableToDeleteException(e);
        }
    }

    public static Route getRouteToRender(final Long idRoute, final Long idUser) {
        es.eina.tfg.RunTrackerBL.entity.Route route = null;
        if (isNull(idRoute) || idRoute == 0){
            try {
                route = RouteDAO.getFirstRoute(idUser);
            } catch (SystemException e) {
                _log.error("Cannot obtain first route of the list on start.", e);
            } catch (PortalException e) {
                _log.error("PortalException while toLocalRoute for idUser: " + idUser, e);
            }
        } else {
            try {
                route = RouteDAO.getByIdRoute(idRoute);
            } catch (PortalException e) {
                _log.error("PortalException while searching for route with ID: " + idRoute, e);
            } catch (SystemException e) {
                _log.error("SystemException while searching for route with ID: " + idRoute, e);
            }
        }
        return route;
    }

    public static List<Route> getRouteByDisplayTerms(final RouteDisplayTerms displayTerms,
                                              final int start,
                                              final int end) {
        Long idUser = displayTerms.getUser().getUserId();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        List<Route> obtainedRoutes;
        try {
            obtainedRoutes = RouteDAO.getByIdUserAndName(idUser, name, start, end);
        }  catch (Exception e) {
            obtainedRoutes = Collections.emptyList();
            _log.error("Exception while dynamicQuery. Returned empty list", e);
        }
        return obtainedRoutes;
    }

    public static int getRouteByDisplayTermsCount(final RouteDisplayTerms displayTerms){
        Long idUser = displayTerms.getUser().getUserId();
        String name = displayTerms.isAdvancedSearch() ? displayTerms.getName() : displayTerms.getKeywords();

        long result = 0L;
        try {
            result = RouteDAO.getByIdUserAndNameCount(idUser, name);
        } catch (SystemException e) {
            _log.error("SystemException while getRoutesCount: returned 0 as result", e);
        }
        return (int) result;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteManager.class);
}

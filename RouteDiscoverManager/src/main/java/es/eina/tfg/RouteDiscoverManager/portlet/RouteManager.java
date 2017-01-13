package es.eina.tfg.RouteDiscoverManager.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RouteDiscoverManager.exception.UnableToAddRouteToUserException;
import es.eina.tfg.RunTrackerBL.entity.Route;
import es.eina.tfg.RunTrackerBL.dao.RouteDAO;
import es.eina.tfg.RouteDiscoverManager.model.RouteDisplayTerms;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;

import java.util.Collections;
import java.util.List;

import static com.liferay.portal.kernel.util.Validator.isNull;

public class RouteManager {

    public static void addRouteToUserRoutes(final Long idRoute, final Long idUser)
            throws UnableToAddRouteToUserException {
        try {
            UserAndRouteLocalServiceUtil.addUserAndRoute(idUser, idRoute);
        } catch (SystemException e) {
            _log.error("SystemException while adding route: " + idRoute + " to user: " + idUser, e);
            throw new UnableToAddRouteToUserException(e);
        }
    }

    public static Route getRouteToRender(final Long idRoute, final Long idUser) {
        Route route = null;
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
            obtainedRoutes = RouteDAO.getPublicRoutesNotSelectedByUser(idUser, name, start, end);
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
            result = RouteDAO.getPublicRoutesNotSelectedByUserCount(idUser, name);
        } catch (SystemException e) {
            _log.error("SystemException while getRoutesCount: returned 0 as result", e);
        }
        return (int) result;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteManager.class);
}

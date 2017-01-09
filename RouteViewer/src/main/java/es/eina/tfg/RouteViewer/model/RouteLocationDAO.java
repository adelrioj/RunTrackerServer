package es.eina.tfg.RouteViewer.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RouteLocationDAO {

    public static RouteLocation insert(final Long relatedIdRoute, final RouteLocation location)
            throws SystemException {
        es.eina.tfg.model.RouteLocation insertedRouteLocation;
        try {
            insertedRouteLocation = RouteLocationLocalServiceUtil.addRouteLocation(
                    toSBRouteLocation(relatedIdRoute, location));
        } catch (SystemException e) {
            _log.error("SystemException while adding RouteLocation: " + location.getId()
                    + " to route: " + relatedIdRoute + " on DB", e);
            throw e;
        }
        return toLocalRouteLocation(insertedRouteLocation);
    }

    public static List<RouteLocation> insertMany(final Long relatedIdRoute, final List<RouteLocation> routeLocations)
            throws SystemException {
        List<RouteLocation> result = new ArrayList<RouteLocation>();
        for (RouteLocation routeLocation : routeLocations) {
            result.add(insert(relatedIdRoute, routeLocation));
        }
        return result;
    }

    public static void deleteByIdRoute(final long idRoute)
            throws SystemException {
        RouteLocationLocalServiceUtil.deleteByIdRoute(idRoute);
    }

    public static List<RouteLocation> getByIdRoute(final Long idRoute)
            throws SystemException {
        List<es.eina.tfg.model.RouteLocation> SBLocations;
        try {
            SBLocations = RouteLocationLocalServiceUtil.getByidRoute(idRoute);
        } catch (SystemException e) {
            _log.error("SystemException while getByidRoute for id: " + idRoute);
            throw e;
        }
        List<RouteLocation> localLocations = new ArrayList<RouteLocation>();
        for (es.eina.tfg.model.RouteLocation sbLocation : SBLocations) {
            localLocations.add(toLocalRouteLocation(sbLocation));
        }
        return localLocations;
    }

    private static es.eina.tfg.RouteViewer.model.RouteLocation toLocalRouteLocation(
            final es.eina.tfg.model.RouteLocation toConvert){
        es.eina.tfg.RouteViewer.model.RouteLocation location = new es.eina.tfg.RouteViewer.model.RouteLocation();
        location.setId(toConvert.getIdRouteLocation());
        location.setLongitude(toConvert.getLongitude());
        location.setLatitude(toConvert.getLatitude());
        location.setElevation(toConvert.getElevation());
        return location;
    }

    private static es.eina.tfg.model.RouteLocation toSBRouteLocation(
            final Long relatedIdRoute,
            final es.eina.tfg.RouteViewer.model.RouteLocation toConvert){
        es.eina.tfg.model.RouteLocation locationToInsert =
                RouteLocationLocalServiceUtil.createRouteLocation(relatedIdRoute, toConvert.getId());
        locationToInsert.setLongitude(toConvert.getLongitude());
        locationToInsert.setLatitude(toConvert.getLatitude());
        locationToInsert.setElevation(toConvert.getElevation());
        return locationToInsert;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteLocationDAO.class);
}

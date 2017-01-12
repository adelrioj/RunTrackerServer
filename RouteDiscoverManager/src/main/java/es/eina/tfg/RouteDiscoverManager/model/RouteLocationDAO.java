package es.eina.tfg.RouteDiscoverManager.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class RouteLocationDAO {

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

    private static es.eina.tfg.RouteDiscoverManager.model.RouteLocation toLocalRouteLocation(
            final es.eina.tfg.model.RouteLocation toConvert){
        es.eina.tfg.RouteDiscoverManager.model.RouteLocation location = new es.eina.tfg.RouteDiscoverManager.model.RouteLocation();
        location.setId(toConvert.getIdRouteLocation());
        location.setLongitude(toConvert.getLongitude());
        location.setLatitude(toConvert.getLatitude());
        location.setElevation(toConvert.getElevation());
        return location;
    }

    private static Log _log = LogFactoryUtil.getLog(RouteLocationDAO.class);
}

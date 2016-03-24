package es.eina.tfg.RouteViewer.model.parser;

import com.hs.gpxparser.GPXParser;
import com.hs.gpxparser.modal.GPX;
import com.hs.gpxparser.modal.Track;
import com.hs.gpxparser.modal.TrackSegment;
import com.hs.gpxparser.modal.Waypoint;
import com.liferay.portal.kernel.util.Validator;
import es.eina.tfg.model.Route;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import org.joda.time.DateTime;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

/**
 * Processes GPX xml type files.
 *
 * @see <a href="http://www.topografix.com/GPX/1/1/">GPX documentation</a>
 * Created by adelrioj on 09/10/2015.
 */
public class GPXRouteParserHandler implements GenericRouteParserHandler {

    @Override
    public Route addRouteFromLocationListFile(File inputFile, String name, String description, boolean isPublic,
                                              String type, Long authorId, DateTime startingDate) throws Exception {
        GPXParser parser = new GPXParser();
        FileInputStream in = new FileInputStream(inputFile);
        GPX gpx = parser.parseGPX(in);

        Date startDate = null;
        if (Validator.isNotNull(startingDate)){
            startDate = startingDate.toDate();
        }

        Route route = RouteLocalServiceUtil.add(type, name, description, authorId, isPublic, startDate);

        for (Track track : gpx.getTracks()) {
            for (TrackSegment trackSegment : track.getTrackSegments()) {
                for (Waypoint waypoint : trackSegment.getWaypoints()) {
                    RouteLocationLocalServiceUtil.add(route.getRouteId(), waypoint.getLatitude(),
                            waypoint.getLongitude());
                }
            }
        }
        return route;
    }
}

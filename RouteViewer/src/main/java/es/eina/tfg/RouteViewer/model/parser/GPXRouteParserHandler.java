package es.eina.tfg.RouteViewer.model.parser;

import com.hs.gpxparser.GPXParser;
import com.hs.gpxparser.modal.GPX;
import com.hs.gpxparser.modal.Track;
import com.hs.gpxparser.modal.TrackSegment;
import com.hs.gpxparser.modal.Waypoint;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import es.eina.tfg.RouteViewer.exception.UnableToParseGPXException;
import es.eina.tfg.RouteViewer.model.RouteLocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Processes GPX xml type files.
 *
 * @see <a href="http://www.topografix.com/GPX/1/1/">GPX documentation</a>
 * @author  adelrioj.
 */
public class GPXRouteParserHandler implements RouteParserHandler {

    @Override
    public List<RouteLocation> getLocationsFromFile(File inputFile)
            throws UnableToParseGPXException {
        GPX gpx = parseFile(inputFile);

        List<RouteLocation> locations = new ArrayList<RouteLocation>();
        long routeLocationIdCounter = 0;
        for (Track track : gpx.getTracks()) {
            for (TrackSegment trackSegment : track.getTrackSegments()) {
                for (Waypoint waypoint : trackSegment.getWaypoints()) {
                    locations.add(toLocation(routeLocationIdCounter, waypoint));
                    routeLocationIdCounter++;
                }
            }
        }
        return locations;
    }

    private RouteLocation toLocation(Long idLocation, Waypoint waypoint) {
        RouteLocation location = new RouteLocation();
        location.setId(idLocation);
        location.setLatitude(waypoint.getLatitude());
        location.setLongitude(waypoint.getLongitude());
        return location;
    }

    private GPX parseFile(File inputFile)
            throws UnableToParseGPXException {
        try {
            GPXParser parser = new GPXParser();
            FileInputStream in = new FileInputStream(inputFile);
            return parser.parseGPX(in);
        } catch (FileNotFoundException e) {
            _log.error("FileNotFoundException while parsing GPX file: " + inputFile, e);
            throw new UnableToParseGPXException(e);
        } catch (Exception e){
            _log.error("Generic Exception while parsing GPX file: " + inputFile, e);
            throw new UnableToParseGPXException(e);
        }
    }

    private static Log _log = LogFactoryUtil.getLog(GPXRouteParserHandler.class);
}

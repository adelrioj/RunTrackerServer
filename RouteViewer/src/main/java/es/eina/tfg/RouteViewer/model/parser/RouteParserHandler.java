package es.eina.tfg.RouteViewer.model.parser;

import es.eina.tfg.model.Route;
import org.joda.time.DateTime;

import java.io.File;

/**
 * Generic interface created for Factory pattern implementation reasons.
 *
 * Created by adelrioj on 09/10/2015.
 */
public interface RouteParserHandler {
    Route addRouteFromLocationListFile(File inputFile, String name, String description, boolean isPublic, String type,
                                       Long authorId, DateTime startingDate) throws Exception;
}

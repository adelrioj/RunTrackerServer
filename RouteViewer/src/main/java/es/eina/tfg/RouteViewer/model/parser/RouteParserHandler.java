package es.eina.tfg.RouteViewer.model.parser;

import es.eina.tfg.RouteViewer.exception.UnableToParseGPXException;
import es.eina.tfg.RouteViewer.model.RouteLocation;

import java.io.File;
import java.util.List;

/**
 * Generic interface created for Factory pattern implementation reasons.
 *
 * Created by adelrioj on 09/10/2015.
 */
public interface RouteParserHandler {

    List<RouteLocation> getLocationsFromFile(File inputFile)
            throws UnableToParseGPXException;
}

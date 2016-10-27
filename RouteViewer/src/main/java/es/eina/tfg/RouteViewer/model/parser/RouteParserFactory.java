package es.eina.tfg.RouteViewer.model.parser;

import org.apache.commons.io.FilenameUtils;

/**
 * Factory para obtener el handler de SAX correcto.
 *
 * @author adelrioj
 * Created on 02/09/2015.
 */
public class RouteParserFactory {

    public static RouteParserHandler getSAXHandler(String fileNameIncludingExtension){
        String extension = FilenameUtils.getExtension(fileNameIncludingExtension);
        if ("GPX".equalsIgnoreCase(extension)){
            return new GPXRouteParserHandler();
        }

        //Default handler
        return new GPXRouteParserHandler();
    }
}

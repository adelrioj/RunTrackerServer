package es.eina.tfg.RouteViewer.model.googlemapsapi;

import com.google.maps.GeoApiContext;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class GoogleAuthenticationAPI {

    private static final String ENVIRONMENT_KEY = "java:/comp/env";
    private static final String GOOGLE_API_KEY = "googleApiKey";

    static GeoApiContext context;

    static {
        String apiKey = findGoogleApiKeyOnEnvVariables();
        context = (new GeoApiContext()).setApiKey(apiKey);
    }

    private static String findGoogleApiKeyOnEnvVariables() {
        try {
            InitialContext initialContext = new InitialContext();
            Context environmentContext = (Context) initialContext.lookup(ENVIRONMENT_KEY);
            return (String) environmentContext.lookup(GOOGLE_API_KEY);
        } catch (NamingException e) {
            throw new RuntimeException("Cannot find environment variable named: " + GOOGLE_API_KEY);
        }
    }
}

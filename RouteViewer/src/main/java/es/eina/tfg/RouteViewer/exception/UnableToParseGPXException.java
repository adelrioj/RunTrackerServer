package es.eina.tfg.RouteViewer.exception;

/**
 * @author adelrioj.
 */
public class UnableToParseGPXException extends Exception {

    public UnableToParseGPXException() {
    }

    public UnableToParseGPXException(String message) {
        super(message);
    }

    public UnableToParseGPXException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToParseGPXException(Throwable cause) {
        super(cause);
    }
}

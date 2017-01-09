package es.eina.tfg.RouteViewer.exception;

public class UnableToObtainElevationException extends Exception {

    public UnableToObtainElevationException() {
    }

    public UnableToObtainElevationException(String message) {
        super(message);
    }

    public UnableToObtainElevationException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToObtainElevationException(Throwable cause) {
        super(cause);
    }
}

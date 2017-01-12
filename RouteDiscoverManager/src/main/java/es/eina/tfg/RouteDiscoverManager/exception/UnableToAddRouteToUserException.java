package es.eina.tfg.RouteDiscoverManager.exception;

public class UnableToAddRouteToUserException extends Exception {
    public UnableToAddRouteToUserException() {
    }

    public UnableToAddRouteToUserException(String message) {
        super(message);
    }

    public UnableToAddRouteToUserException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToAddRouteToUserException(Throwable cause) {
        super(cause);
    }
}

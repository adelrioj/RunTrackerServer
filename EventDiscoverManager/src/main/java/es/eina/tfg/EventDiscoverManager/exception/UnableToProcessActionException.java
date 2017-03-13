package es.eina.tfg.EventDiscoverManager.exception;

public class UnableToProcessActionException extends Exception {

    public UnableToProcessActionException() {
    }

    public UnableToProcessActionException(String message) {
        super(message);
    }

    public UnableToProcessActionException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToProcessActionException(Throwable cause) {
        super(cause);
    }
}

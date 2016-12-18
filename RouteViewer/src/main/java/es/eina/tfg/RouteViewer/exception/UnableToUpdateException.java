package es.eina.tfg.RouteViewer.exception;

public class UnableToUpdateException extends Exception {

    public UnableToUpdateException() {
        super();
    }

    public UnableToUpdateException(String message) {
        super(message);
    }

    public UnableToUpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToUpdateException(Throwable cause) {
        super(cause);
    }
}

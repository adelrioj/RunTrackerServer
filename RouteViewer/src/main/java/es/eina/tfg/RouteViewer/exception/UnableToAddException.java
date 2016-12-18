package es.eina.tfg.RouteViewer.exception;

public class UnableToAddException extends Exception {
    public UnableToAddException() {
    }

    public UnableToAddException(String message) {
        super(message);
    }

    public UnableToAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToAddException(Throwable cause) {
        super(cause);
    }
}

package es.eina.tfg.RouteViewer.exception;

public class UnableToDeleteException extends Exception {
    public UnableToDeleteException() {
    }

    public UnableToDeleteException(String message) {
        super(message);
    }

    public UnableToDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToDeleteException(Throwable cause) {
        super(cause);
    }
}

package es.eina.tfg.EventViewerManager.exception;

public class UnableToObtainEventException extends Exception {
    public UnableToObtainEventException() {
    }

    public UnableToObtainEventException(String message) {
        super(message);
    }

    public UnableToObtainEventException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToObtainEventException(Throwable cause) {
        super(cause);
    }
}

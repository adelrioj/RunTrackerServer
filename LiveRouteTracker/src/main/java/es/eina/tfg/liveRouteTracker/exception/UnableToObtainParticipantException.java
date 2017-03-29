package es.eina.tfg.liveRouteTracker.exception;

public class UnableToObtainParticipantException extends Exception {

    public UnableToObtainParticipantException() {
    }

    public UnableToObtainParticipantException(String message) {
        super(message);
    }

    public UnableToObtainParticipantException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToObtainParticipantException(Throwable cause) {
        super(cause);
    }
}

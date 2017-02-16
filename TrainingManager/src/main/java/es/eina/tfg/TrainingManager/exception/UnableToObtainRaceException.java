package es.eina.tfg.TrainingManager.exception;

public class UnableToObtainRaceException extends Exception {
    public UnableToObtainRaceException() {
    }

    public UnableToObtainRaceException(String message) {
        super(message);
    }

    public UnableToObtainRaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToObtainRaceException(Throwable cause) {
        super(cause);
    }
}

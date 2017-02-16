package es.eina.tfg.TrainingManager.exception;

public class UnableToDeleteRaceException extends Exception {

    public UnableToDeleteRaceException() {
    }

    public UnableToDeleteRaceException(String message) {
        super(message);
    }

    public UnableToDeleteRaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToDeleteRaceException(Throwable cause) {
        super(cause);
    }
}

package es.eina.tfg.RunTrackerFrontPage.exception;

public class UnableToFindRaceException extends Exception {

    public UnableToFindRaceException() {
    }

    public UnableToFindRaceException(String message) {
        super(message);
    }

    public UnableToFindRaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToFindRaceException(Throwable cause) {
        super(cause);
    }
}

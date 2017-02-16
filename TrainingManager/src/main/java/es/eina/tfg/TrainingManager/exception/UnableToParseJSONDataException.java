package es.eina.tfg.TrainingManager.exception;

public class UnableToParseJSONDataException extends Exception {

    public UnableToParseJSONDataException() {
    }

    public UnableToParseJSONDataException(String message) {
        super(message);
    }

    public UnableToParseJSONDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToParseJSONDataException(Throwable cause) {
        super(cause);
    }
}

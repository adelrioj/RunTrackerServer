package es.eina.tfg.DeviceManager.exception;

public class UnableToDeleteDeviceException extends Exception {
    public UnableToDeleteDeviceException() {
    }

    public UnableToDeleteDeviceException(String message) {
        super(message);
    }

    public UnableToDeleteDeviceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnableToDeleteDeviceException(Throwable cause) {
        super(cause);
    }
}

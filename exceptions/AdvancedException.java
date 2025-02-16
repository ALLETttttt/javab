package exceptions;

public class AdvancedException extends Exception {
    private int errorCode;

    public AdvancedException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

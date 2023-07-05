package test5june.exception;

public class InvalidGenderException extends RuntimeException {
    public InvalidGenderException(String msg) {
        super(msg);
    }
}

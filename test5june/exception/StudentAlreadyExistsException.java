package test5june.exception;

public class StudentAlreadyExistsException extends RuntimeException {
    public StudentAlreadyExistsException(String msg) {
        super(msg);
    }
}

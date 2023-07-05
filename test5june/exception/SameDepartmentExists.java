package test5june.exception;

public class SameDepartmentExists extends RuntimeException {
    public SameDepartmentExists(String msg) {
        super(msg);
    }
}

package pro.sky.exceptionsbushmelev;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}

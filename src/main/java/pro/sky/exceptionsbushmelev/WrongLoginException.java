package pro.sky.exceptionsbushmelev;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String massage) {
        super(massage);
    }
}

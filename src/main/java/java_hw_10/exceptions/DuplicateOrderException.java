package java_hw_10.exceptions;

public class DuplicateOrderException extends RuntimeException{

    public DuplicateOrderException(String message) {
        super(message);
    }
}

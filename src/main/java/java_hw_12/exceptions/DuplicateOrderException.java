package java_hw_12.exceptions;

public class DuplicateOrderException extends RuntimeException{

    public DuplicateOrderException(String message) {
        super(message);
    }
}

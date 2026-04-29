package java_hw_12.exceptions;

public class InvalidOrderStatusException extends RuntimeException{

    public InvalidOrderStatusException(String message) {
        super(message);
    }
}

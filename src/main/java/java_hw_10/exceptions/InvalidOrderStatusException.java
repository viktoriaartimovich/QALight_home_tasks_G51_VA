package java_hw_10.exceptions;

public class InvalidOrderStatusException extends RuntimeException{

    public InvalidOrderStatusException(String message) {
        super(message);
    }
}

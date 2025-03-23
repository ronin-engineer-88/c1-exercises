package _12_Exception.Exercise06;

public class NegativeNumberException extends NumberFormatException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

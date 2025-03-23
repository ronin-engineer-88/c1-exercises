package _12_Exception.Exercise08;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) { // exception cho số dư k đủ.
        super(message);
    }
}

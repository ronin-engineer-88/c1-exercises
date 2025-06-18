package com.roninEngineerF02.shoppingOnline.exception;

public class StockInsufficientException extends RuntimeException {
    public StockInsufficientException(String message) {
        super(message);
    }
}

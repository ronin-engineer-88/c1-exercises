package com.roninEngineerF02.shoppingOnline.exception;

public class StockInsufficientException extends ApiException {
    public StockInsufficientException(String message) {
        super(message, 400);
    }
}

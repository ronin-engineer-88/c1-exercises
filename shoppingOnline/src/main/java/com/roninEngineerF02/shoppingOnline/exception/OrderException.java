package com.roninEngineerF02.shoppingOnline.exception;

public class OrderException extends RuntimeException {
    public OrderException(String message) {
        super(message);
    }

    public OrderException(Long orderId) {
        super("Order not found with id: " + orderId);
    }
}
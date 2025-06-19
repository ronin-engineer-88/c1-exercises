package com.roninEngineerF02.shoppingOnline.exception;

public class OrderException extends ApiException {
    public OrderException(String message) {
        super(message, 400);
    }

    public OrderException(Long orderId) {
        super("Order not found with id: " + orderId, 404);
    }
}
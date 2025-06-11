package com.roninEngineerF02.shoppingOnline.exception;

public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(Integer userId) {
        super("Cart not found for user ID: " + userId);
    }
}
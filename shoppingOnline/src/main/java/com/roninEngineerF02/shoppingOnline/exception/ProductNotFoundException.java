package com.roninEngineerF02.shoppingOnline.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Integer productId) {
        super("Product not found with ID: " + productId);
    }
}
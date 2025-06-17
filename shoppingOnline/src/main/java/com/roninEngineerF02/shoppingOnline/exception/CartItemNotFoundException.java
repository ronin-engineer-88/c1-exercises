package com.roninEngineerF02.shoppingOnline.exception;

public class CartItemNotFoundException extends RuntimeException {
    public CartItemNotFoundException(Long cartItemId) {
        super("Not found CartItem with ID: " + cartItemId);
    }

    public CartItemNotFoundException(
            Long cartId,
            Long cartItemId
    ) {
        super("Cart with ID " + cartId + " does not have cart item with ID: " + cartItemId);
    }


}
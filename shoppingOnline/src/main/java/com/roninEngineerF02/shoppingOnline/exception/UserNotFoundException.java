package com.roninEngineerF02.shoppingOnline.exception;

public class UserNotFoundException extends ApiException {
    public UserNotFoundException(Long userId) {
        super("User not found with ID: " + userId, 404);
    }
}

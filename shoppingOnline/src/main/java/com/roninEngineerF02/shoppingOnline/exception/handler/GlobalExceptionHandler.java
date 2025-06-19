package com.roninEngineerF02.shoppingOnline.exception.handler;

import com.roninEngineerF02.shoppingOnline.exception.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    public ResponseEntity<Object> handleBindException(BindException e) {
        return ResponseEntity
                .status(400)
                .body(e.getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<Object> handleApiException(ApiException e) {
        return ResponseEntity
                .status(e.getHttpCode())
                .body(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception e) {
        return ResponseEntity
                .status(500)
                .body("Internal Server Error");
    }

}

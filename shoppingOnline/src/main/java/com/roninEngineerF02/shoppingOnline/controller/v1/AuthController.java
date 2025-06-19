package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.exception.ApiException;
import com.roninEngineerF02.shoppingOnline.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(UrlConstant.LOGIN)
    public ResponseEntity<Object> login(@RequestBody UserLoginRequestDto request) {
        try {
            return ResponseEntity.ok(authService.login(request));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PostMapping(UrlConstant.REGISTER)
    public ResponseEntity<Object> register(@RequestBody UserRegisterRequestDto request) {
        try {
            return ResponseEntity.ok(authService.register(request));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }
}

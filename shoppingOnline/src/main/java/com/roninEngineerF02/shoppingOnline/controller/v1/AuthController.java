package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(UrlConstant.LOGIN)
    public ResponseEntity<Object> login(@Valid @RequestBody UserLoginRequestDto request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @PostMapping(UrlConstant.REGISTER)
    public ResponseEntity<Object> register(@Valid @RequestBody UserRegisterRequestDto request) {
        return ResponseEntity.ok(authService.register(request));
    }
}

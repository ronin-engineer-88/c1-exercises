package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping(UrlConstant.LOGIN)
    public Object login(@RequestBody UserLoginRequestDto request) {
        return authService.login(request);
    }

    @PostMapping(UrlConstant.REGISTER)
    public Object register(@RequestBody UserRegisterRequestDto request) {
        return authService.register(request);
    }
}

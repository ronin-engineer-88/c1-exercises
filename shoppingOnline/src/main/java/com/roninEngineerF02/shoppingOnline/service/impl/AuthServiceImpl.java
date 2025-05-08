package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserLoginResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserRegisterResponseDto;
import com.roninEngineerF02.shoppingOnline.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public UserLoginResponseDto login(UserLoginRequestDto request) {

        // logic

        return new UserLoginResponseDto();
    }

    @Override
    public UserRegisterResponseDto register(UserRegisterRequestDto request) {

        // logic

        return new UserRegisterResponseDto();
    }

}

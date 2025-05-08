package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserLoginResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserRegisterResponseDto;

public interface AuthService {

    UserLoginResponseDto login(UserLoginRequestDto request);

    UserRegisterResponseDto register(UserRegisterRequestDto request);
}

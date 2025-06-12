package com.roninEngineerF02.shoppingOnline.dto.request.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDto {

    private String email;
    private String password;

}

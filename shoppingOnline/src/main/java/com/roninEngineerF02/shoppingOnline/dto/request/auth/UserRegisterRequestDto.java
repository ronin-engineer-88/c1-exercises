package com.roninEngineerF02.shoppingOnline.dto.request.auth;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterRequestDto {

    private String email;
    private String password;
    private String fullname;
    private String status;
    private String role;

}

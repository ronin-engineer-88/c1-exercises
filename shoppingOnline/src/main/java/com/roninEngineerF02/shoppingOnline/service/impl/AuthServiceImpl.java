package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserLoginRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.auth.UserRegisterRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserLoginResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.auth.UserRegisterResponseDto;
import com.roninEngineerF02.shoppingOnline.entity.User;
import com.roninEngineerF02.shoppingOnline.repository.UserRepository;
import com.roninEngineerF02.shoppingOnline.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserLoginResponseDto login(UserLoginRequestDto request) {
        // Simple validation - find user by email
        User user = userRepository.findByEmail(request.getEmail());

        if (user == null) {
            return new UserLoginResponseDto(null, null, null, null,
                    "Email không tồn tại trong hệ thống", false);
        }

        // Checking password
        if (!user.getPassword().equals(request.getPassword())) {
            return new UserLoginResponseDto(null, null, null, null,
                    "Mật khẩu không chính xác", false);
        }

        // Login success
        return UserLoginResponseDto.builder()
                .userId(user.getId())
                .email(user.getEmail())
                .fullname(user.getFullname())
                .role(user.getRole())
                .message("Đăng nhập thành công")
                .success(true)
                .build();
    }

    @Override
    public UserRegisterResponseDto register(UserRegisterRequestDto request) {
        // Checking if email exist
        User existingUser = userRepository.findByEmail(request.getEmail());
        if (existingUser != null) {
            return new UserRegisterResponseDto(null, null, null,
                    "Email đã được sử dụng", false);
        }

        // Create new user
        User user = new User();
        BeanUtils.copyProperties(request, user);

        // Set default values
        if (user.getStatus() == null) {
            user.setStatus("ACTIVE");
        }
        if (user.getRole() == null) {
            user.setRole("USER");
        }
        user.setCreatedDate(new Date());

        User savedUser = userRepository.save(user);

        return UserRegisterResponseDto.builder()
                .userId(savedUser.getId())
                .email(savedUser.getEmail())
                .fullname(savedUser.getFullname())
                .message("Đăng ký thành công")
                .success(true)
                .build();
    }

}

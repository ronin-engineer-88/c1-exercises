package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.response.user.UserResponseDto;
import com.roninEngineerF02.shoppingOnline.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserResponseDto getUserById(Long id) {

        // logic

        return new UserResponseDto();
    }

    @Override
    public List<UserResponseDto> getUsers(String email) {

        // logic

        return List.of();
    }

    @Override
    public void deleteUserById(Long id) {

        // logic

    }

    @Override
    public UserResponseDto blockUser(Long id) {

        // logic

        return new UserResponseDto();
    }

    @Override
    public UserResponseDto unblockUser(Long id) {

        // logic

        return new UserResponseDto();
    }

}

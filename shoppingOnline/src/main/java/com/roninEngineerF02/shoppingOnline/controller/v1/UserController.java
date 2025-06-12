package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(UrlConstant.USER_PROFILE)
    public Object getUserProfile() {
        Long userId = getCurrentUserId();
        return userService.getUserById(userId);
    }

    // Helper method to get current user ID (placeholder)
    public static Long getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring Security is added
        return 2L;
    }

}

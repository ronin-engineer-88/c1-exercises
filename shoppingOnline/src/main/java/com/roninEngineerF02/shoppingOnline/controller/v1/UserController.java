package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class UserController {


    @GetMapping(UrlConstant.USER_PROFILE)
    public Object getUserProfile() {
        return null; // No parameters
    }

    // Helper method to get current user ID (placeholder)
    public static Long getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring Security is added
        return 1L;
    }

}

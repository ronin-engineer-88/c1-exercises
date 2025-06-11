package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class CartController {

    @GetMapping(UrlConstant.USER_CARTS)
    public Object getCart() {
        Long userId = getCurrentUserId();
        return cartService.getCartByUserId(userId);
    }

    @PostMapping(UrlConstant.CART_ITEMS)
    public Object addToCart(@RequestBody CartAdditemRequestDto request) {
        Long userId = getCurrentUserId();
        return cartService.addItem(userId, request);
    }

    @PatchMapping(UrlConstant.UPDATE_CART_ITEMS_QUANTITY)
    public Object updateCartItemQuantity(@PathVariable Long id,
                                         @RequestBody CartUpdateItemQuantityRequest request) {
        Long userId = getCurrentUserId();
        return cartService.updateItemQuantity(userId, id, request);
    }

    @DeleteMapping(UrlConstant.CRUD_CART_ITEMS)
    public Object removeFromCart(@PathVariable Long id) {
        Long userId = getCurrentUserId();
        cartService.removeItem(userId, id);
        return id;
    }

    @DeleteMapping(UrlConstant.CARTS)
    public Object clearCart() {
        Long userId = getCurrentUserId();
        cartService.clearCart(userId);
        return null;
    }

    // Helper method to get current user ID (placeholder)
    public static Long getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring Security is added
        return 1L;
    }

}

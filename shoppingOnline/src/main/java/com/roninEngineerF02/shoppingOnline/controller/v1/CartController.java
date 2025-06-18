package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class CartController {

    private final CartService cartService;

    // API view cart by userId
    @GetMapping(UrlConstant.USER_CARTS)
    public Object viewCart() {
        Long userId = getCurrentUserId();
        return cartService.getCartItems(userId);
    }

    // API add to cart
    @PostMapping(UrlConstant.CART_ITEMS)
    public Object addToCart(@RequestBody CartAdditemRequestDto request) {
        Long userId = getCurrentUserId();
        cartService.addToCart(userId, request);
        return "Added to cart successfully";
    }

    @PatchMapping(UrlConstant.UPDATE_CART_ITEMS_QUANTITY)
    public Object updateCartItemQuantity(@PathVariable Long id,
                                         @RequestBody CartUpdateItemQuantityRequest request) {
        Long userId = getCurrentUserId();
        return cartService.updateItemQuantity(userId, id, request);
    }

    @DeleteMapping(UrlConstant.CRUD_CART_ITEMS)
    public Object removeFromCart(@PathVariable("id") Long productId) {
        Long userId = getCurrentUserId();
        cartService.removeItem(userId, productId);
        return "Item removed";
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
        return 2L;
    }

}

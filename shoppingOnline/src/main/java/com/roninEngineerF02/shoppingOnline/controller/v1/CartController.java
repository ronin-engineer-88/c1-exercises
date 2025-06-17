package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;
import com.roninEngineerF02.shoppingOnline.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class CartController {

    private final CartService cartService;

    // API view cart by userId
    @GetMapping(UrlConstant.USER_CARTS)
    public ResponseEntity<CartResponseDto> viewCart() {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(cartService.getCartItems(userId));
    }

    // API add to cart
    @PostMapping(UrlConstant.CART_ITEMS)
    public ResponseEntity<?> addToCart(@RequestBody CartAdditemRequestDto request) {
        Long userId = getCurrentUserId();
        cartService.addToCart(userId, request);
        return ResponseEntity.ok("Added to cart successfully");
    }

    @PatchMapping(UrlConstant.UPDATE_CART_ITEMS_QUANTITY)
    public ResponseEntity<CartResponseDto> updateCartItemQuantity(
            @PathVariable("id") Long cartItemId,
            @RequestBody CartUpdateItemQuantityRequest request) {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(cartService.updateItemQuantity(userId, cartItemId, request));
    }

    @DeleteMapping(UrlConstant.CRUD_CART_ITEMS)
    public ResponseEntity<?> removeFromCart(@PathVariable("id") Long cartItemId) {
        Long userId = getCurrentUserId();
        cartService.removeItem(userId, cartItemId);
        return ResponseEntity.ok("Item removed successfully");
    }

    @DeleteMapping(UrlConstant.CARTS)
    public ResponseEntity<?> clearCart() {
        Long userId = getCurrentUserId();
        cartService.clearCart(userId);
        return ResponseEntity.ok("Cart cleared successfully");
    }

    // Helper method to get current user ID (placeholder)
    public static Long getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring
        // Security is added
        return 3L;
    }

}

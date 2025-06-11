package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping(UrlConstant.USER_CARTS)
    public Object getCart() {
        Integer userId = getCurrentUserId();
        return cartService.getCartByUserId(userId);
    }

    // API add to cart
    @PostMapping(UrlConstant.CART_ITEMS)
    public ResponseEntity<?> addToCart(@RequestBody CartAdditemRequestDto request) {
        Integer userId = getCurrentUserId();
        cartService.addToCart(userId, request);
        return ResponseEntity.ok("Added to cart successfully");
    }

    @PatchMapping(UrlConstant.UPDATE_CART_ITEMS_QUANTITY)
    public Object updateCartItemQuantity(@PathVariable Long id,
                                         @RequestBody CartUpdateItemQuantityRequest request) {
        Integer userId = getCurrentUserId();
        return cartService.updateItemQuantity(userId, id, request);
    }

    @DeleteMapping(UrlConstant.CRUD_CART_ITEMS)
    public Object removeFromCart(@PathVariable Long id) {
        Integer userId = getCurrentUserId();
        cartService.removeItem(userId, id);
        return id;
    }

    @DeleteMapping(UrlConstant.CARTS)
    public Object clearCart() {
        Integer userId = getCurrentUserId();
        cartService.clearCart(userId);
        return null;
    }

    // Helper method to get current user ID (placeholder)
    public static Integer getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring Security is added
        return 0;
    }

}

package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;
import com.roninEngineerF02.shoppingOnline.entity.CartItem;

import java.util.List;

public interface CartService {

    List<CartItem> getCartItems(Long userId);

    CartResponseDto updateItemQuantity(Long userId,
                                       Long cartItemId,
                                       CartUpdateItemQuantityRequest request);

    void removeItem(Long userId,
                    Long productId);

    void clearCart(Long userId);

    void addToCart(Long userId, CartAdditemRequestDto request);
}

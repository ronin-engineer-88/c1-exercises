package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;


public interface CartService {

    CartResponseDto getCartItems(Long userId);

    CartResponseDto updateItemQuantity(Long userId,
                                       Long cartItemId,
                                       CartUpdateItemQuantityRequest request);

    void removeItem(Long userId,
                    Long cartItemId);

    void clearCart(Long userId);

    void addToCart(Long userId, CartAdditemRequestDto request);
}

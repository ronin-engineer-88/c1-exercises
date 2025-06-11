package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;

public interface CartService {

    CartResponseDto getCartByUserId(Integer userId);

    CartResponseDto updateItemQuantity(Integer userId,
                                       Long cartItemId,
                                       CartUpdateItemQuantityRequest request);

    void removeItem(Integer userId,
                    Long cartItemId);

    void clearCart(Integer userId);

    void addToCart(Integer userId, CartAdditemRequestDto request);
}

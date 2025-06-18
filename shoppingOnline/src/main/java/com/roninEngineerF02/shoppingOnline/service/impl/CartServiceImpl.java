package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;
import com.roninEngineerF02.shoppingOnline.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Override
    public CartResponseDto getCartByUserId(Long userId) {

        // Logic here

        return new CartResponseDto();
    }

    @Override
    public CartResponseDto addItem(Long userId,
                                   CartAdditemRequestDto request) {

        // Logic here

        return new CartResponseDto();
    }

    @Override
    public CartResponseDto updateItemQuantity(Long userId,
                                              Long cartItemId,
                                              CartUpdateItemQuantityRequest request) {

        // Logic here

        return new CartResponseDto();
    }

    @Override
    public void removeItem(Long userId, Long cartItemId) {

        // Logic here

    }

    @Override
    public void clearCart(Long userId) {

        // Logic here

    }

}
package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;
import com.roninEngineerF02.shoppingOnline.entity.CartItem;

import java.util.List;

public interface CartService {

    List<CartItem> getCartItems(Integer userId);

    CartResponseDto updateItemQuantity(Integer userId,
                                       Long cartItemId,
                                       CartUpdateItemQuantityRequest request);

    void removeItem(Integer userId,
                    Integer productId);

    void clearCart(Integer userId);

    void addToCart(Integer userId, CartAdditemRequestDto request);
}

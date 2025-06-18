package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartAdditemRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.cart.CartUpdateItemQuantityRequest;
import com.roninEngineerF02.shoppingOnline.dto.response.cart.CartResponseDto;
import com.roninEngineerF02.shoppingOnline.entity.Cart;
import com.roninEngineerF02.shoppingOnline.entity.CartItem;
import com.roninEngineerF02.shoppingOnline.entity.Product;
import com.roninEngineerF02.shoppingOnline.exception.CartNotFoundException;
import com.roninEngineerF02.shoppingOnline.exception.ProductNotFoundException;
import com.roninEngineerF02.shoppingOnline.repository.CartItemRepository;
import com.roninEngineerF02.shoppingOnline.repository.CartRepository;
import com.roninEngineerF02.shoppingOnline.repository.ProductRepository;
import com.roninEngineerF02.shoppingOnline.service.CartService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    private final ProductRepository productRepository;

    private final CartItemRepository cartItemRepository;

    @Override
    public CartResponseDto getCartByUserId(Long userId) {
        return null;
    }

    @Override
    public CartResponseDto updateItemQuantity(Long userId, Long cartItemId, CartUpdateItemQuantityRequest request) {
        return null;
    }

    @Override
    public void removeItem(Long userId, Long cartItemId) {

    }

    @Override
    public void clearCart(Long userId) {

    }

    @Override
    public void addToCart(Long userId, CartAdditemRequestDto request) {
        Cart cart = cartRepository.findByUser_Id(userId)
                .orElseThrow(() -> new CartNotFoundException(userId));

        Product product = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new ProductNotFoundException(request.getProductId()));

        CartItem item = cartItemRepository.findByCart_IdAndProduct_Id(cart.getId(), product.getId())
                .orElseGet(() -> {
                    CartItem newItem = new CartItem();
                    newItem.setCart(cart);
                    newItem.setProduct(product);
                    newItem.setQuantity(0);
                    return newItem;
                });

        item.setQuantity(item.getQuantity() + request.getQuantity());
        cartItemRepository.save(item);
    }
}

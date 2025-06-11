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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public CartResponseDto getCartByUserId(Integer userId) {
        return null;
    }

    @Override
    public CartResponseDto updateItemQuantity(Integer userId, Long cartItemId, CartUpdateItemQuantityRequest request) {
        return null;
    }

    @Override
    public void removeItem(Integer userId, Long cartItemId) {

    }

    @Override
    public void clearCart(Integer userId) {

    }

    @Override
    public void addToCart(Integer userId, CartAdditemRequestDto request) {
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

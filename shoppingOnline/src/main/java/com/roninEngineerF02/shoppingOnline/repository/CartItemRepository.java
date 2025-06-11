package com.roninEngineerF02.shoppingOnline.repository;

import com.roninEngineerF02.shoppingOnline.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    Optional<CartItem> findByCart_IdAndProduct_Id(Integer cartId, Integer productId);
}
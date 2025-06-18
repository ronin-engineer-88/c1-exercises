package com.roninEngineerF02.shoppingOnline.repository;

import com.roninEngineerF02.shoppingOnline.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository  extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser_Id(Long userId);
}

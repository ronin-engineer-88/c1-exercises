package com.roninEngineerF02.shoppingOnline.repository;

import com.roninEngineerF02.shoppingOnline.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByUser_Id(Integer userId);
}

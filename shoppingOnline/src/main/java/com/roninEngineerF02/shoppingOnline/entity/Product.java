package com.roninEngineerF02.shoppingOnline.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product extends BaseEntity<Long> {

    private String name;

    private String description;

    private Double price;

    private Integer stock;

    @Column(name = "original_price")
    private Double originalPrice;

    private String category;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItems;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}

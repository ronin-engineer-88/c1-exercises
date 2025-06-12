package com.roninEngineerF02.shoppingOnline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity<Long> {

    private String name;

    private String description;

    private Integer stock;

    private Double price;

    private Double originalPrice;

    private String category;

}

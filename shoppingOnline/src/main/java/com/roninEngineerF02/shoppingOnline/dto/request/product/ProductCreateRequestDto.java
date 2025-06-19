package com.roninEngineerF02.shoppingOnline.dto.request.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateRequestDto {

    private String name;
    private String description;
    private Integer stock;
    private Double price;
    private Double originalPrice;
    private String category;

}

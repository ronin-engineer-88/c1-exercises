package com.roninEngineerF02.shoppingOnline.dto.request.cart;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CartAdditemRequestDto {
    private Long productId;
    private Integer quantity;
}

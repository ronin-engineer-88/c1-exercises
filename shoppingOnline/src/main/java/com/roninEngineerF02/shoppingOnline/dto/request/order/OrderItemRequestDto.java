package com.roninEngineerF02.shoppingOnline.dto.request.order;

import lombok.Data;

@Data
public class OrderItemRequestDto {
    private Long productId;
    private Integer quantity;
}
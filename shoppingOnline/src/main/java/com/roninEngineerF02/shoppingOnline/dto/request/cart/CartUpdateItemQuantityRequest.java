package com.roninEngineerF02.shoppingOnline.dto.request.cart;

import lombok.Data;

@Data
public class CartUpdateItemQuantityRequest {

    private Long productId;

    private Integer quantity;
}

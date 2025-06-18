package com.roninEngineerF02.shoppingOnline.dto.request.order;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequestDto {
    private String description;
    private List<OrderItemRequestDto> items;
}

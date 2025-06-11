package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.order.CreateOrderRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderInfoRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.order.OrderResponseDto;
import com.roninEngineerF02.shoppingOnline.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public List<OrderResponseDto> getUserOrders(Long userId) {

        // Logic here

        return List.of(new OrderResponseDto());
    }

    @Override
    public OrderResponseDto createOrder(Long userId,
                                        CreateOrderRequestDto request) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public OrderResponseDto getOrderDetailsForUser(Long userId,
                                                   Long orderId) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public OrderResponseDto updateOrderInfo(Long userId,
                                            Long orderId,
                                            UpdateOrderInfoRequestDto request) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public OrderResponseDto cancelOrder(Long userId,
                            Long orderId) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public List<OrderResponseDto> getAllOrders() {

        // Logic here

        return List.of(new OrderResponseDto());
    }

    @Override
    public OrderResponseDto getOrderDetails(Long orderId) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public OrderResponseDto updateOrderStatus(Long orderId,
                                              UpdateOrderStatusRequestDto request) {

        // Logic here

        return new OrderResponseDto();
    }

    @Override
    public void getOrderHistory(Long orderId) {

        // Logic here

    }

}

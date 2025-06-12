package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.order.OrderResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductCreateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductUpdateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.user.UserResponseDto;
import com.roninEngineerF02.shoppingOnline.service.AdminService;
import com.roninEngineerF02.shoppingOnline.service.OrderService;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import com.roninEngineerF02.shoppingOnline.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final UserService userService;

    private final ProductService productService;

    private final OrderService orderService;

    @Override
    public List<UserResponseDto> getUsers(String email) {
        return userService.getUsers(email);
    }

    @Override
    public void deleteUser(Long userId) {
        userService.deleteUserById(userId);
    }

    @Override
    public UserResponseDto blockUser(Long userId) {
        return userService.blockUser(userId);
    }

    @Override
    public UserResponseDto unblockUser(Long userId) {
        return userService.unblockUser(userId);
    }

    @Override
    public ProductCreateResponseDto createProduct(ProductCreateRequestDto request) {
        return productService.create(request);
    }

    @Override
    public ProductUpdateResponseDto updateProduct(Long productId,
            ProductUpdateRequestDto request) {
        return productService.update(productId, request);
    }

    @Override
    public void deleteProduct(Long productId) {
        productService.delete(productId);
    }

    @Override
    public List<OrderResponseDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Override
    public OrderResponseDto getOrderDetails(Long orderId) {
        return orderService.getOrderDetails(orderId);
    }

    @Override
    public OrderResponseDto updateOrderStatus(Long orderId,
            UpdateOrderStatusRequestDto request) {
        return orderService.updateOrderStatus(orderId, request);
    }

    @Override
    public void getOrderHistory(Long orderId) {
        orderService.getOrderHistory(orderId);
    }

}

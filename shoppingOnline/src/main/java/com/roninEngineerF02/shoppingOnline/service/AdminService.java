package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.order.OrderResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.AdminProductResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductCreateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductUpdateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.user.UserResponseDto;

import java.util.List;

public interface AdminService {

    // User management function
    List<UserResponseDto> getUsers(String email);

    void deleteUser(Long userId);

    UserResponseDto blockUser(Long userId);

    UserResponseDto unblockUser(Long userId);

    // Product management function
    List<AdminProductResponseDto> getProducts(String category, String name);

    ProductCreateResponseDto createProduct(ProductCreateRequestDto request);

    ProductUpdateResponseDto updateProduct(Long productId,
                                           ProductUpdateRequestDto request);

    void deleteProduct(Long productId);

    // Order management function
    List<OrderResponseDto> getAllOrders();

    OrderResponseDto getOrderDetails(Long orderId);

    OrderResponseDto updateOrderStatus(Long orderId,
                                       UpdateOrderStatusRequestDto request);

    void getOrderHistory(Long orderId);

}

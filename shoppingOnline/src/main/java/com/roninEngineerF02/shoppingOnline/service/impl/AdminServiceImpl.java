package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.order.OrderResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.AdminProductResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductCreateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductUpdateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.user.UserResponseDto;
import com.roninEngineerF02.shoppingOnline.entity.Product;
import com.roninEngineerF02.shoppingOnline.repository.ProductRepository;
import com.roninEngineerF02.shoppingOnline.service.AdminService;
import com.roninEngineerF02.shoppingOnline.service.OrderService;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import com.roninEngineerF02.shoppingOnline.service.UserService;
import com.roninEngineerF02.shoppingOnline.utils.DateUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final UserService userService;

    private final ProductService productService;

    private final OrderService orderService;

    private final ProductRepository productRepository;


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
    public List<AdminProductResponseDto> getProducts(String name, String category) {
        List<Product> products;

        // Use repository method for search (handles all cases)
        products = productRepository.findByNameAndCategory(name, category);

        // Convert to DTO
        return products.stream()
                .map(this::convertToAdminProductDto)
                .toList();
    }

    private AdminProductResponseDto convertToAdminProductDto(Product product) {
        AdminProductResponseDto dto = new AdminProductResponseDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setStock(product.getStock());
        dto.setPrice(product.getPrice());
        dto.setOriginalPrice(product.getOriginalPrice());
        dto.setCategory(product.getCategory());

        // Determine status based on stock
        if (product.getStock() == null || product.getStock() <= 0) {
            dto.setStatus("OUT_OF_STOCK");
        } else {
            dto.setStatus("ACTIVE");
        }

        dto.setCreatedAt(
                product.getCreatedDate() != null ?
                        DateUtils.formatDate(product.getCreatedDate()) : null);
        dto.setUpdatedAt(
                product.getUpdatedDate() != null ?
                        DateUtils.formatDate(product.getUpdatedDate()) : null);

        return dto;
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

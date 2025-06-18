package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class AdminController {

    private final AdminService adminService;

// ============================= USER MANAGEMENT ========================================

    @GetMapping(UrlConstant.ADMIN_USERS)
    public Object getUsers(@RequestParam(required = false) String email) {
        checkAdminAccess();
        return adminService.getUsers(email);
    }

    @DeleteMapping(UrlConstant.CRUD_ADMIN_USERS)
    public Object deleteUser(@PathVariable Long id) {
        checkAdminAccess();
        adminService.deleteUser(id);
        return "Delete user successfully";
    }

    @PatchMapping(UrlConstant.BLOCK_USERS)
    public Object blockUser(@PathVariable Long id) {
        checkAdminAccess();
        return adminService.blockUser(id);
    }

    @PatchMapping(UrlConstant.UNBLOCK_USERS)
    public Object unblockUser(@PathVariable Long id) {
        checkAdminAccess();
        return adminService.unblockUser(id);
    }

// ============================= PRODUCT MANAGEMENT ========================================

    @GetMapping(UrlConstant.ADMIN_PRODUCTS)
    public Object getProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category) {
        checkAdminAccess();
        return adminService.getProducts(name, category);
    }

    @PostMapping(UrlConstant.ADMIN_PRODUCTS)
    public Object createProduct(@RequestBody ProductCreateRequestDto request) {
        checkAdminAccess();
        return adminService.createProduct(request);
    }

    @PutMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public Object updateProduct(@PathVariable Long id,
                                @RequestBody ProductUpdateRequestDto request) {
        checkAdminAccess();
        return adminService.updateProduct(id, request);
    }

    @DeleteMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public Object deleteProduct(@PathVariable Long id) {
        checkAdminAccess();
        adminService.deleteProduct(id);
        return String.format(
                "Delete product with id %d successfully",
                id);
    }

// ============================= ORDER MANAGEMENT ========================================

    @GetMapping(UrlConstant.ADMIN_ORDERS)
    public Object getAllOrders() {
        checkAdminAccess();
        return adminService.getAllOrders();
    }

    @GetMapping(UrlConstant.CRUD_ADMIN_ORDERS)
    public Object getOrderDetails(@PathVariable Long id) {
        checkAdminAccess();
        return adminService.getOrderDetails(id);
    }

    @PatchMapping(UrlConstant.UPDATE_ORDER_DETAIL)
    public Object updateOrderStatus(@PathVariable Long id,
            @RequestBody UpdateOrderStatusRequestDto request) {
        checkAdminAccess();
        return adminService.updateOrderStatus(id, request);
    }

    @GetMapping(UrlConstant.GET_ORDER_HISTORY)
    public Object getOrderHistory(@PathVariable Long id) {
        checkAdminAccess();
        adminService.getOrderHistory(id);
        return id;
    }

    // Helper method to check admin access (placeholder)
    private void checkAdminAccess() {
        // Placeholder implementation
        // Will be replaced with proper admin role check when Spring Security is added
        // Could throw AccessDeniedException if not admin
    }

}

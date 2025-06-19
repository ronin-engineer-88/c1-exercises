package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderStatusRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.exception.ApiException;
import com.roninEngineerF02.shoppingOnline.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class AdminController {

    private final AdminService adminService;

    // ============================= USER MANAGEMENT========================================

    @GetMapping(UrlConstant.ADMIN_USERS)
    public ResponseEntity<Object> getUsers(@RequestParam(required = false) String email) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.getUsers(email));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @DeleteMapping(UrlConstant.CRUD_ADMIN_USERS)
    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
        try {
            checkAdminAccess();
            adminService.deleteUser(id);
            return ResponseEntity.ok("Delete user successfully");
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PatchMapping(UrlConstant.BLOCK_USERS)
    public ResponseEntity<Object> blockUser(@PathVariable Long id) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.blockUser(id));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PatchMapping(UrlConstant.UNBLOCK_USERS)
    public ResponseEntity<Object> unblockUser(@PathVariable Long id) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.unblockUser(id));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    // ============================= PRODUCT MANAGEMENT========================================

    @GetMapping(UrlConstant.ADMIN_PRODUCTS)
    public ResponseEntity<Object> getProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.getProducts(name, category));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PostMapping(UrlConstant.ADMIN_PRODUCTS)
    public ResponseEntity<Object> createProduct(@RequestBody ProductCreateRequestDto request) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.createProduct(request));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PutMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public ResponseEntity<Object> updateProduct(@PathVariable Long id,
            @RequestBody ProductUpdateRequestDto request) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.updateProduct(id, request));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @DeleteMapping(UrlConstant.CRUD_ADMIN_PRODUCTS)
    public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
        try {
            checkAdminAccess();
            adminService.deleteProduct(id);
            return ResponseEntity.ok(String.format(
                    "Delete product with id %d successfully",
                    id));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    // ============================= ORDER MANAGEMENT========================================

    @GetMapping(UrlConstant.ADMIN_ORDERS)
    public ResponseEntity<Object> getAllOrders() {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.getAllOrders());
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @GetMapping(UrlConstant.CRUD_ADMIN_ORDERS)
    public ResponseEntity<Object> getOrderDetails(@PathVariable Long id) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.getOrderDetails(id));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @PatchMapping(UrlConstant.UPDATE_ORDER_DETAIL)
    public ResponseEntity<Object> updateOrderStatus(@PathVariable Long id,
            @RequestBody UpdateOrderStatusRequestDto request) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.updateOrderStatus(id, request));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @GetMapping(UrlConstant.GET_ORDER_HISTORY)
    public ResponseEntity<Object> getOrderHistory(@PathVariable("id") Long userId) {
        try {
            checkAdminAccess();
            return ResponseEntity.ok(adminService.getOrderHistory(userId));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    // Helper method to check admin access (placeholder)
    private void checkAdminAccess() {
        // Placeholder implementation
        // Will be replaced with proper admin role check when Spring Security is added
        // Could throw AccessDeniedException if not admin
    }

}

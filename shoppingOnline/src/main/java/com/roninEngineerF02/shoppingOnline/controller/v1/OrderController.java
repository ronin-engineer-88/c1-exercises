package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.dto.request.order.CreateOrderRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.order.UpdateOrderInfoRequestDto;
import com.roninEngineerF02.shoppingOnline.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class OrderController {

    private final OrderService orderService;

    @GetMapping(UrlConstant.USER_ORDERS)
    public ResponseEntity<Object> getUserOrders() {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(orderService.getUserOrders(userId));
    }

    @PostMapping(UrlConstant.ORDERS)
    public ResponseEntity<Object> createOrder(@RequestBody CreateOrderRequestDto request) {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(orderService.createOrder(userId, request));
    }

    @GetMapping(UrlConstant.CRUD_USER_ORDERS)
    public ResponseEntity<Object> getUserOrderDetail(@PathVariable Long id) {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(orderService.getOrderDetailsForUser(userId, id));
    }

    @PatchMapping(UrlConstant.UPDATE_ORDER_INFO)
    public ResponseEntity<Object> updateOrderInfo(@PathVariable Long id,
            @RequestBody UpdateOrderInfoRequestDto request) {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(orderService.updateOrderInfo(userId, id, request));
    }

    @PatchMapping(UrlConstant.CANCEL_ORDER)
    public ResponseEntity<Object> cancelOrder(@PathVariable Long id) {
        Long userId = getCurrentUserId();
        return ResponseEntity.ok(orderService.cancelOrder(userId, id));
    }

    // Helper method to get current user ID (placeholder)
    public static Long getCurrentUserId() {
        // Placeholder implementation
        // Will be replaced with SecurityContextHolder implementation when Spring
        // Security is added
        return 2L;
    }

}

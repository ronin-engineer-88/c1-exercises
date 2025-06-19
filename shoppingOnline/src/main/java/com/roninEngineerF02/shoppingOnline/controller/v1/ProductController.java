package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.exception.ApiException;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class ProductController {

    private final ProductService productService;

    @GetMapping(UrlConstant.PRODUCTS)
    public ResponseEntity<Object> getProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category) {
        try {
            return ResponseEntity.ok(productService.getProducts(name, category));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

    @GetMapping(UrlConstant.CRUD_PRODUCT)
    public ResponseEntity<Object> getProductById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(productService.getProductById(id));
        } catch (ApiException e) {
            return ResponseEntity.status(e.getHttpCode()).body(e.getMessage());
        }
    }

}

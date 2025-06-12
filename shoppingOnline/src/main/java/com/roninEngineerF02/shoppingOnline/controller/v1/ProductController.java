package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(UrlConstant.API_BASE_V1)
public class ProductController {

    private final ProductService productService;

    @GetMapping(UrlConstant.PRODUCTS)
    public Object getProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category) {
        return productService.getProducts(name, category);
    }

    @GetMapping(UrlConstant.CRUD_PRODUCT)
    public Object getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

}

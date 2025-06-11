package com.roninEngineerF02.shoppingOnline.controller.v1;

import com.roninEngineerF02.shoppingOnline.constant.UrlConstant;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UrlConstant.API_BASE_V1)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(UrlConstant.PRODUCTS)
    public Object getProducts(@RequestParam(required = false) String category,
                              @RequestParam(required = false) String name) {
        return productService.getProducts(category, name);
    }

    @GetMapping(UrlConstant.CRUD_PRODUCT)
    public Object getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}

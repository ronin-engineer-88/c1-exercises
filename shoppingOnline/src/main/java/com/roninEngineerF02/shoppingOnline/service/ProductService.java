package com.roninEngineerF02.shoppingOnline.service;

import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductCreateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductUpdateResponseDto;

import java.util.List;

public interface ProductService {

    // User function
    ProductResponseDto getProductById(Long id);

    List<ProductResponseDto> getProducts(String name,
                                                String category);

    // Admin function
    ProductCreateResponseDto create(ProductCreateRequestDto request);

    ProductUpdateResponseDto update(Long id,
                                    ProductUpdateRequestDto request);

    void delete(Long id);



}

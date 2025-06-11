package com.roninEngineerF02.shoppingOnline.service.impl;

import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductCreateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.request.product.ProductUpdateRequestDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductCreateResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductResponseDto;
import com.roninEngineerF02.shoppingOnline.dto.response.product.ProductUpdateResponseDto;
import com.roninEngineerF02.shoppingOnline.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponseDto getProductById(Long id) {

        // logic

        return new ProductResponseDto();
    }

    @Override
    public List<ProductResponseDto> getProducts(String name, String category) {

        // logic

        return List.of();
    }

    @Override
    public ProductCreateResponseDto create(ProductCreateRequestDto request) {

        // logic

        return new ProductCreateResponseDto();
    }

    @Override
    public ProductUpdateResponseDto update(Long id,
                                           ProductUpdateRequestDto request) {

        // logic

        return new ProductUpdateResponseDto();
    }

    @Override
    public void delete(Long id) {

        // logic

    }

}

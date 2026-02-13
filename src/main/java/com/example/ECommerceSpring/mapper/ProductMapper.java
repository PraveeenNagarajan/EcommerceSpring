package com.example.ECommerceSpring.mapper;

import com.example.ECommerceSpring.dto.ProductDTO;
import com.example.ECommerceSpring.entity.Product;

public class ProductMapper {

    public static ProductDTO toDto (Product product){
        return ProductDTO.builder()
                .name(product.getName())
                .brand(product.getBrand())
                .price(product.getPrice())
                .categoryId(product.getId())
                .build();
    }

    public static Product toEntity (ProductDTO dto){
        return Product.builder()
                .name(dto.getName())
                .brand(dto.getBrand())
                .price(dto.getPrice())
                .build();
    }
}

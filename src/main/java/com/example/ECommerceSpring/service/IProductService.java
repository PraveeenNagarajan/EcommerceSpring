package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.ProductDTO;

public interface IProductService {
    ProductDTO getProductById(Long id) throws Exception;
    ProductDTO createProduct(ProductDTO dto);
}

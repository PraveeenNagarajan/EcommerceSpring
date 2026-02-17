package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.ProductCategoryDTO;
import com.example.ECommerceSpring.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    ProductDTO getProductById(Long id) throws Exception;
    ProductDTO createProduct(ProductDTO dto);
    List<ProductDTO> getAllProducts();
    List<ProductDTO> rangeQuery(double min, double max);
    ProductCategoryDTO getProductWithCategory(Long id) throws Exception;
}

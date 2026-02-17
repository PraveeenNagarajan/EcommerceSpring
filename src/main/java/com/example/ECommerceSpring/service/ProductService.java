package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.ProductCategoryDTO;
import com.example.ECommerceSpring.dto.ProductDTO;
import com.example.ECommerceSpring.entity.Category;
import com.example.ECommerceSpring.entity.Product;
import com.example.ECommerceSpring.mapper.ProductMapper;
import com.example.ECommerceSpring.repository.CategoryRepository;
import com.example.ECommerceSpring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService{
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public ProductDTO getProductById(Long id) throws Exception{
        return productRepository.findById(id)
                .map(ProductMapper :: toDto)
                .orElseThrow(()->new Exception("Product not found !"));
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) {
        Category category = categoryRepository.findById(dto .getCategoryId())
                .orElseThrow(() -> new RuntimeException(
                        "Category not found with id " + dto.getCategoryId()));
        Product product = ProductMapper.toEntity(dto);
        product.setCategory(category);
        Product saved = productRepository.save(product);
        return ProductMapper.toDto(saved);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(ProductMapper::toDto).toList();
    }

    @Override
    public List<ProductDTO> rangeQuery(double min, double max) {
        return productRepository.rangeQuery(min,max).stream().map(ProductMapper::toDto).toList();
    }

    @Override
    public ProductCategoryDTO getProductWithCategory(Long id) throws Exception {
        Product product = productRepository.findById(id).orElseThrow(() -> new Exception("Category not found !..."));
        return ProductMapper.toProductWithCategoryDTO(product);
    }


}

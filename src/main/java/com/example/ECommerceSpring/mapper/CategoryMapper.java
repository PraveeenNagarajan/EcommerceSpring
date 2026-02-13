package com.example.ECommerceSpring.mapper;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.dto.ProductDTO;
import com.example.ECommerceSpring.entity.Category;

public class CategoryMapper {
    public static CategoryDTO toDto(Category category){
        return CategoryDTO.builder()
                .name(category.getCategoryName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto){
        return Category.builder()
                .categoryName(dto.getName())
                .build();
    }
}

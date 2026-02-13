package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.entity.Category;

public interface ICategoryService  {

    CategoryDTO addCategory(CategoryDTO dto);

    CategoryDTO getCategoryById(Long id);
}

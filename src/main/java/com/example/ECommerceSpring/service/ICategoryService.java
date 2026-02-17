package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.entity.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService  {

    CategoryDTO addCategory(CategoryDTO dto);

    CategoryDTO getCategoryById(Long id);

   CategoryDTO getCategoryByName(String name);

   List<CategoryDTO> getAllCategories();

}

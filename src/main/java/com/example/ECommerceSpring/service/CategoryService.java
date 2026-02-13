package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.entity.Category;
import com.example.ECommerceSpring.mapper.CategoryMapper;
import com.example.ECommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public CategoryDTO addCategory(CategoryDTO dto) {
        Category result =categoryRepository.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(result);
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
       Category result = categoryRepository.getById(id);
       return CategoryMapper.toDto(result);
    }
}

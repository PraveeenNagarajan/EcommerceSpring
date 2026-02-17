package com.example.ECommerceSpring.service;

import com.example.ECommerceSpring.dto.CategoryDTO;
import com.example.ECommerceSpring.entity.Category;
import com.example.ECommerceSpring.mapper.CategoryMapper;
import com.example.ECommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO addCategory(CategoryDTO dto) {
        Category result = categoryRepository.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(result);
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        Category result = categoryRepository.getById(id);
        return CategoryMapper.toDto(result);
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        Category result = categoryRepository.findByName(name);
        return CategoryMapper.toDto(result);
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> result = categoryRepository.findAll();
        return result.stream().map(CategoryMapper::toDto).toList();
    }
}

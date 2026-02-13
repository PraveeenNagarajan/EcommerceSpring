package com.example.ECommerceSpring.repository;

import com.example.ECommerceSpring.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

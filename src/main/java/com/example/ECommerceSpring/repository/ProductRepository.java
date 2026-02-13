package com.example.ECommerceSpring.repository;

import com.example.ECommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long> {
}

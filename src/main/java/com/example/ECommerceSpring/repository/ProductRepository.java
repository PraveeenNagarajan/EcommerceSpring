package com.example.ECommerceSpring.repository;

import com.example.ECommerceSpring.dto.ProductDTO;
import com.example.ECommerceSpring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product,Long> {

    @Query(value = "select * from product p where p.price >:min and p.price <:max",nativeQuery = true)
    List<Product> rangeQuery(@Param("min") double min, @Param("max") double max);
}

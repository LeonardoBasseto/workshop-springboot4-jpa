package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test_spring.test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

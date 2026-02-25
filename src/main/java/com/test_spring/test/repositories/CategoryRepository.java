package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test_spring.test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

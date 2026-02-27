package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test_spring.test.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
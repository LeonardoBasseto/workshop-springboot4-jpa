package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test_spring.test.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

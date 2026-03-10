package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test_spring.test.entities.OrderItem;
import com.test_spring.test.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
package com.emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

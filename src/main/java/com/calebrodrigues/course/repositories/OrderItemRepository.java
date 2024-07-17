package com.calebrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calebrodrigues.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

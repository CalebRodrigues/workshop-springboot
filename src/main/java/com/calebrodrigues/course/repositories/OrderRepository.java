package com.calebrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calebrodrigues.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

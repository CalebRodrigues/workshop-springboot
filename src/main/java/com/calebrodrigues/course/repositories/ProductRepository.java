package com.calebrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calebrodrigues.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

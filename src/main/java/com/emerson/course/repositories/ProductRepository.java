package com.emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

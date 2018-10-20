package com.project.inventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.inventory.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

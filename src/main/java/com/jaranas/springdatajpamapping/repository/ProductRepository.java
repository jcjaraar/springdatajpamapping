package com.jaranas.springdatajpamapping.repository;

import com.jaranas.springdatajpamapping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

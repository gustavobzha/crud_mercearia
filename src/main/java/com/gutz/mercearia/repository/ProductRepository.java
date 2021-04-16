package com.gutz.mercearia.repository;

import com.gutz.mercearia.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// The first argument of JpaRepository is your Product and the second one is the primary key type
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}

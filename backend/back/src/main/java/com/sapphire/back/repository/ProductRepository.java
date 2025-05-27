package com.sapphire.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sapphire.back.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
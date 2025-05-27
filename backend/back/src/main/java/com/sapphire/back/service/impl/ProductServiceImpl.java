package com.sapphire.back.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapphire.back.model.Product;
import com.sapphire.back.repository.ProductRepository;
import com.sapphire.back.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{


  @Autowired
  ProductRepository productRepository;

  /* 
  @Override
  public Product create(Product products) {
    return productRepository.save(products);
  }
  */

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }
  
}

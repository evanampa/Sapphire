package com.sapphire.back.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.sapphire.back.model.Product;

@Service
public interface ProductService {

  //public Product create(Product products);

  public List<Product> getAllProducts();

}

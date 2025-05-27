package com.sapphire.back.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapphire.back.model.Product;
import com.sapphire.back.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://127.0.0.1:5500") 
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping("")
  public List<Product> getProducts() {
      return productService.getAllProducts();
  }

  /* 
  @PostMapping("/store")
  public Product saveProduct(@RequestBody Product products){
    return productService.create(products);
  }
  */
}

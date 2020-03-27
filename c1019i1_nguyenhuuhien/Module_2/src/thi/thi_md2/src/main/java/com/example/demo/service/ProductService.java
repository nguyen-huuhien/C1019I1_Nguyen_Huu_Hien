package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> getAllProducts(Pageable pageable);
    Product getProductById(Long id);
    void saveProduct(Product product);
    void deleteProductById(Long id);
    Page<Product> findAllByNameContaining(String name,Pageable pageable);
}

package com.app.app_di.repositories;

import java.util.List;

import com.app.app_di.models.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}

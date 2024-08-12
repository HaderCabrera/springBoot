package com.app.app_di.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.app_di.models.Product;
import com.app.app_di.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    // public List<Product> findAll() {
    //     return productRepository.findAll();
    // }

    public List<Product> findAll() {
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.45d;
            Product newProduct = new Product(p.getId(), p.getName(),

                    priceImp.longValue());

            // p.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }


}

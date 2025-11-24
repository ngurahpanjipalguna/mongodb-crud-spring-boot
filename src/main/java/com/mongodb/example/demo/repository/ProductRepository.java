package com.mongodb.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.example.demo.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}

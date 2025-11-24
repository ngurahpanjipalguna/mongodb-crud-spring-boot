package com.mongodb.example.demo.service;



import org.springframework.stereotype.Service;

import com.mongodb.example.demo.model.Product;
import com.mongodb.example.demo.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> findAll() {
        return repo.findAll();
    }

    public Product findById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(String id, Product product) {
        Product existing = repo.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setName(product.getName());
        existing.setDescription(product.getDescription());
        existing.setPrice(product.getPrice());

        return repo.save(existing);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/products")
public class Controller {

    @Autowired
    private ProductService service;

    // Add product
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // Filter by price
    @GetMapping("/filter")
    public List<Product> filterProducts(
            @RequestParam double min,
            @RequestParam double max) {
        return service.getProductsByPriceRange(min, max);
    }
}
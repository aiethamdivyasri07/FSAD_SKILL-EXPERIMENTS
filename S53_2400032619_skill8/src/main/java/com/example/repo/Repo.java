package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.Product;

public interface Repo extends JpaRepository<Product, Integer> {

    // find by category
    List<Product> findByCategory(String category);

    // find by price range
    List<Product> findByPriceBetween(double min, double max);

    // sorted products
    @Query("SELECT p FROM Product p ORDER BY p.price ASC")
    List<Product> getProductsSortedByPrice();

    // expensive products
    @Query("SELECT p FROM Product p WHERE p.price > ?1")
    List<Product> getExpensiveProducts(double price);

}
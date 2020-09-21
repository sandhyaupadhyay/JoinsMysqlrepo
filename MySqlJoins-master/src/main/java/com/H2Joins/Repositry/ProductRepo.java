package com.H2Joins.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.H2Joins.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}

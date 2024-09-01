package com.shopping.smartkart.repository;

import org.springframework.data.repository.CrudRepository;

import com.shopping.smartkart.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}

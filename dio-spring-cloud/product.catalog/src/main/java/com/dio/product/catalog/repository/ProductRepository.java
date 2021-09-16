package com.dio.product.catalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.product.catalog.model.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{

}

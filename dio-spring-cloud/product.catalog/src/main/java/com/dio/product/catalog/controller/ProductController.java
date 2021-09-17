package com.dio.product.catalog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.product.catalog.model.Product;
import com.dio.product.catalog.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	    public Product create(@RequestBody Product product) {
	        return productRepository.save(product);
	    }

	@GetMapping(value = "/{id}")
	public Optional<Product> findbyId(@PathVariable Integer id) {
		return productRepository.findById(id);
	}
}

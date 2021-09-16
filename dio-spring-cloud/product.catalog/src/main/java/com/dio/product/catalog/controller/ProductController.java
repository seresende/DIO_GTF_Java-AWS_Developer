package com.dio.product.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dio.product.catalog.model.Product;
import com.dio.product.catalog.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	 @RequestMapping(method = RequestMethod.POST)
	    public Product create(@RequestBody Product product) {
	        return productRepository.save(product);
	    }

}

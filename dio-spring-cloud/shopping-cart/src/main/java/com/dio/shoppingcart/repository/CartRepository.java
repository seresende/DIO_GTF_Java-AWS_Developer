package com.dio.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.dio.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);
}

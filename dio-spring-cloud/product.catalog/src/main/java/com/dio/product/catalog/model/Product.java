package com.dio.product.catalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(indexName = "product")
public class Product {

    @Id
    private Integer id;
    private String name;
    private Integer amount;

}
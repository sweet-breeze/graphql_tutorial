package com.migu.graphql.model;

import java.util.List;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String title;
    private String desc;
    private double price;
    
    public Product(Integer id, String title, String desc, double d) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.price = d;
    }
}

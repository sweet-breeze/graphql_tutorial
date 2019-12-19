package com.migu.graphql.model;

import java.util.List;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private double price;
    private Integer userId;
    private List<Integer> productList;
    
    public Order(Integer id, double price, Integer userId, List<Integer> productList) {
        this.id = id;
        this.price = price;
        this.userId = userId;
        this.productList = productList;
    }
}

package com.migu.graphql.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.migu.graphql.model.Order;
import com.migu.graphql.model.Product;
import com.migu.graphql.model.User;

public class DataService {

    public static List<User> userList = new ArrayList<User>();
    public static List<Product> productList = new ArrayList<Product>();
    public static List<Order> orderList = new ArrayList<Order>();
    
    static {
        userList.add(new User(1, "admin", "123", 18));
        userList.add(new User(2, "Jim", "123", 19));
        userList.add(new User(3, "Linda", "123", 16));
        
        productList.add(new Product(1, "bag", "black bag", 20.8));
        productList.add(new Product(2, "hat", "yellow hat", 10.2));
        productList.add(new Product(3, "gloves", "white gloves", 5.0));
        
        orderList.add(new Order(1, 31, 1, Arrays.asList(1,2)));
        orderList.add(new Order(2, 10.2, 2, Arrays.asList(2)));
        orderList.add(new Order(3, 15.2, 2, Arrays.asList(3,2)));
        orderList.add(new Order(4, 36, 1, Arrays.asList(1,2,3)));
        orderList.add(new Order(5, 31, 3, Arrays.asList(1,2)));
        orderList.add(new Order(6, 36, 2, Arrays.asList(1,2,3)));
    }
}

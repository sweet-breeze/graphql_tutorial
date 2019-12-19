package com.migu.graphql.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.migu.graphql.model.Order;
import com.migu.graphql.model.Product;
import com.migu.graphql.model.User;
import com.migu.graphql.service.DataService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class UserQuery implements GraphQLResolver<User> {

    public List<Order> getOrders(User user) {
        List<Order> orders = DataService.orderList.stream().filter(s -> s.getUserId().equals(user.getId()))
                .collect(Collectors.toList());

        return orders;
    }

    // public Order order(Integer id) {
    // System.out.println("order");
    // Order orderLocal = Data.orderList.stream().filter(s ->
    // s.getId().equals(id)).findFirst().orElse(null);
    //
    // return orderLocal;
    // }

    // public List<Order> orders(Integer userId) {
    // System.out.println("order by userId");
    // List<Order> orders = Data.orderList.stream().filter(s ->
    // s.getUserId().equals(userId))
    // .collect(Collectors.toList());
    //
    // return orders;
    // }

    // public List<Order> orders2(Integer productId) {
    // System.out.println("order by userId");
    // List<Order> orders = Data.orderList.stream().filter(s ->
    // s.getProductId().equals(productId))
    // .collect(Collectors.toList());
    //
    // return orders;
    // }

    // public Product product(Integer id) {
    // System.out.println("order");
    // Product productLocal = Data.productList.stream().filter(s ->
    // s.getId().equals(id)).findFirst().orElse(null);
    //
    // return productLocal;
    // }

}

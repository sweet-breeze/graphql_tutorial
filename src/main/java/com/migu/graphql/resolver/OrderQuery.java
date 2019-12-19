package com.migu.graphql.resolver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.migu.graphql.model.Order;
import com.migu.graphql.model.Product;
import com.migu.graphql.service.DataService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class OrderQuery implements GraphQLResolver<Order> {

//    public Order order(Integer id) {
//        System.out.println("get order by id");
//        return null;
//    }

    public List<Product> getProducts(Order order) {
        
        List<Product> products = new ArrayList<Product>();
        for(Integer i : order.getProductList()) {
            for(Product p : DataService.productList) {
                if(i.equals(p.getId())) {
                    products.add(p);
                }
            }
        }

        return products;
    }
}

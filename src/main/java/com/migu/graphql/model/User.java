package com.migu.graphql.model;

import java.util.List;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private int age;
    
    public User(Integer id, String userName, String password, int age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }
}

package com.migu.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.migu.graphql.model.User;
import com.migu.graphql.service.DataService;

import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    public User findUserById(Integer id) {
        
        System.out.println("get user by id");
        // Optional<User> userLocal = Users.userList.stream().filter(s ->
        // s.getId().equals(id)).findFirst();
        User userLocal = DataService.userList.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);

        return userLocal;
    }

//    public List<Author> findAllAuthors() {
//        return authorRepo.findAll();
//    }

//    public Long countAuthors() {
//        return authorRepo.count();
//    }
//
//    public List<Book> findAllBooks() {
//        return bookRepo.findAll();
//    }
//
//    public Long countBooks() {
//        return bookRepo.count();
//    }
//
//    public Book findBookById(Long id) {
//        return bookRepo.findBookById(id);
//    }
//
//    public String testEnum(CountryEnum country) {
//        return country.toString();
//    }
//
//    /**
//     * 分页测试
//     * @param first
//     * @param after
//     * @param env
//     * @return
//     */
//    public Connection<Book> books(int first,String after,DataFetchingEnvironment env) {
//        return new SimpleListConnection<>(bookRepo.findAll()).get(env);
//    }
//
//    /**
//     * @descript: 测试一下接口的使用
//     * @auther: hanliwei
//     * @date: 2019/3/3 18:31
//     * @param name
//     * @return
//     */
//    public Animal getAnimal(String name) {
//        Dog dog = new Dog();
//        dog.setName(name);
//        dog.setLegs(4);
//
//        Fish fish = new Fish();
//        fish.setName(name);
//        fish.setTailColor("BlueAndRead");
//
//        if ("dog".equals(name)) {
//            return dog;
//        } else if ("fish".equals(name)) {
//            return fish;
//        }
//        return null;
//    }
//
//    /**
//     * @descript: 返回不同类型的数据
//     * @auther: hanliwei
//     * @date: 2019/3/3 20:42
//     * @return
//     */
//    public List<Animal> animals() {
//        Dog dog = new Dog();
//        dog.setName("I am Dog");
//        dog.setLegs(4);
//
//        Fish fish = new Fish();
//        fish.setName("I am Fish");
//        fish.setTailColor("BlueAndRead");
//
//        List<Animal> list = new ArrayList<>();
//        list.add(dog);
//        list.add(fish);
//
//        return list;
//    }
}

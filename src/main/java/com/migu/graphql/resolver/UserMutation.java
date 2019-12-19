package com.migu.graphql.resolver;

import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.migu.graphql.model.User;
import com.migu.graphql.service.DataService;

@Component
public class UserMutation implements GraphQLMutationResolver {
    
    public boolean saveUser(User user) {
        System.out.print("save");
        DataService.userList.add(user);
        
        return true;
    }
    
    public boolean deleteUser(Integer id) {
        System.out.println("delete");
        Iterator<User> iter = DataService.userList.iterator();  
        while(iter.hasNext()){  
            User s = iter.next();  
            if(s.getId().equals(id)){  
                iter.remove();  
            }  
        }
        
        return true;
    }
    
    public boolean updateUser(User user) {
        System.out.println("update");
        User localUser = DataService.userList.get(user.getId());
        if(user.getAge() != 0) {
            localUser.setAge(user.getAge());
        }
        if(!StringUtils.isEmpty(user.getPassword())) {
            localUser.setPassword(user.getPassword());
        }
        if (!StringUtils.isEmpty(user.getUserName())) {
            localUser.setUserName(user.getUserName());
        }
        
        return true;
    }
}

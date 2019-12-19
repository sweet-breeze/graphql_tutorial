package com.migu.threadlambda.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.migu.threadlambda.util.ThreadManageUtil;

@RestController
public class HelloThreadController {
    
    @RequestMapping(value="/lambda", method = RequestMethod.GET)
    public String saveArea() {
        
        ThreadManageUtil.execute(() -> sum(1, 2));
        return "hello python";
    }
    
    public int sum(int a, int b) {
        System.out.print(a+b);
        return a+b;
    }
}
package com.migu.python.controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
* Java通过命令调用Python
* Project Name:HelloResearch
* File Name:HelloPythonController.java
* Package Name:com.migu.python.controller
* ClassName: HelloPythonController <br/>
* date: 2019年6月3日 下午2:06:20 <br/>
* 
* @author breeze
* @version 
* @since JDK 1.6
*/

@RestController
public class HelloPythonController {
    

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String saveArea() throws IOException {
        String exe = "python";
        String command = "hello_java.py";
        String num1 = "6";
        String num2 = "9";
        String[] cmdArr = new String[] {exe, command, num1, num2};
        
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(cmdArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream is = process.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str;
        try {
            str = dis.readLine();
            process.waitFor();
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello python";
    }
}
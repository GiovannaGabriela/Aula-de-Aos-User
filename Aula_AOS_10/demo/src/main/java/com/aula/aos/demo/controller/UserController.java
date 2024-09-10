package com.aula.aos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula.aos.demo.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //Definições dos métodos do CRUD

    @PostMapping
    public boolean User login(@RequestBody,org.apache.catalina.User user){
        String username = user.getUsername();
        String password = user.getPassword();
        try{
            User userlogin = UserService.login(username,password);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

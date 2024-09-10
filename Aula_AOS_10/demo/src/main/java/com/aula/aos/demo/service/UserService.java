package com.aula.aos.demo.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.aos.demo.exception.UserNotFoundException;
import com.aula.aos.demo.model.User;
import com.aula.aos.demo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    //Métodos do CRUD
    public User login(String username, String password) throws UserNotFoundException{
        User userSearch = userRepository findByUsernameAndPassword(username,password);

        if(userSearch != null){
            return userSearch;
        }
    }
}

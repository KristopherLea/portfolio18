package com.example.portfolio.Controller;

import com.example.portfolio.Model.User;
import com.example.portfolio.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("user")
    public Iterable<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("/create/user")
    public String postUser(){
        User user = userServiceImpl.getUser();
        userServiceImpl.postUser(user);
        return "fetched and created";
    }
}

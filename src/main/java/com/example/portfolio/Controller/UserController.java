package com.example.portfolio.Controller;

import com.example.portfolio.Model.User;
import com.example.portfolio.Service.UserService;
import com.example.portfolio.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/user")
    public Iterable<User> getUsers(){
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("/created")
    public void postUser(@RequestBody User user) {
       userServiceImpl.postUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userServiceImpl.deleteById(id);
    }

    @PutMapping("/{id}")
    public User updateProject(@PathVariable Long id, @RequestBody User user){
        User foundUser = userServiceImpl.getUserById(id).orElse(null);
        if(foundUser != null) {
            foundUser.setFirstName(user.getFirstName());
            foundUser.setLastName(user.getLastName());
            foundUser.setId(user.getId());
            return foundUser;
        }
        return null;
    }
}

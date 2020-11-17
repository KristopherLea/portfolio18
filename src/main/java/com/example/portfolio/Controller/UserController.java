package com.example.portfolio.Controller;

import com.example.portfolio.Model.User;
import com.example.portfolio.Repo.UserRepo;
//import com.example.portfolio.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/user")
    public Iterable<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/created")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public User updateProject(@PathVariable Long id, @RequestBody User user){
        User foundUser = userRepo.findById(id).orElse(null);
        if(foundUser != null) {
            foundUser.setFirstName(user.getFirstName());
            foundUser.setLastName(user.getLastName());
            userRepo.save(foundUser);
            return foundUser;
        }
        return null;
    }
}

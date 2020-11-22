package com.example.portfolio.Service;

import com.example.portfolio.Model.User;
import com.example.portfolio.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id){
     return userRepo.findById(id);
    }

    @Override
    public void postUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
         userRepo.deleteById(id);
    }

    @Override
    public User saveAllUsers(User user) {
        return userRepo.save(user);
    }

}

package com.example.portfolio.Service;

import com.example.portfolio.Model.User;
import com.example.portfolio.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }
}

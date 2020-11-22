package com.example.portfolio.Service;

import com.example.portfolio.Model.User;

import java.util.Optional;

public interface UserService {
     Optional<User> getUserById(Long id);
     Iterable<User> getAllUsers();
     void postUser(User user);
     void deleteById(Long id);
     User saveAllUsers(User user);
}

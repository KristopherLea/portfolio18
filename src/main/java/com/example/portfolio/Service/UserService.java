package com.example.portfolio.Service;

import com.example.portfolio.Model.User;

public interface UserService {
    public User getUser();
    public void postUser(User user);
    public Iterable<User> getAllUsers();
}

//package com.example.portfolio.Service;
//
//import com.example.portfolio.Model.User;
//import com.example.portfolio.Repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    UserRepo userRepo;
//
//    @Override
//    public User getUser(){
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("https://dog.ceo/api/breeds/image/random",User.class);
//    }
//
//    @Override
//    public void postUser(User user) {
//        userRepo.save(user);
//    }
//
//    @Override
//    public Iterable<User> getAllUsers() {
//        return userRepo.findAll();
//    }
//}

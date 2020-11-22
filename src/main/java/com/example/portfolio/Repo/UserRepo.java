package com.example.portfolio.Repo;

import com.example.portfolio.Model.User;

import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User, Long> {
}

package com.example.portfolio.Repo;

import com.example.portfolio.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User, Long> {
}

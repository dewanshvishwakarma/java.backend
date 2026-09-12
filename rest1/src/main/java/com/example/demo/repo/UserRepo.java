package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.User;

//import com.cybrom.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}


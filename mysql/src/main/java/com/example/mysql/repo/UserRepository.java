package com.example.mysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

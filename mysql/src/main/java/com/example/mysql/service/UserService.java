package com.example.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.entity.User;
import com.example.mysql.repo.UserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public int save(User user) {
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(int userId) {
		return userRepository.findById(userId);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(int userId) {
		System.out.println("user deleted");
	}

}
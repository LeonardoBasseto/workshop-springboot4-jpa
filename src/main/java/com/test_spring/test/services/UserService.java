package com.test_spring.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test_spring.test.entities.User;
import com.test_spring.test.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAlL(){
		return repository.findAll();
	}
}

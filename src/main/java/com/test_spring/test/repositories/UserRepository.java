package com.test_spring.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.test_spring.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

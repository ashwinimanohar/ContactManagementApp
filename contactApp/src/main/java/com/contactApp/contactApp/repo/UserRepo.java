package com.contactApp.contactApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactApp.contactApp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	//User findByEmail(String email);
}
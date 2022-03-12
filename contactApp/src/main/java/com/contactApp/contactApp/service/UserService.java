package com.contactApp.contactApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactApp.contactApp.entity.Contact;
import com.contactApp.contactApp.entity.User;
import com.contactApp.contactApp.repo.ContactRepo;
import com.contactApp.contactApp.repo.UserRepo;
@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	public void save(User user) {
		repo.save(user);
	}
}

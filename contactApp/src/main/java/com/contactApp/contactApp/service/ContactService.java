package com.contactApp.contactApp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactApp.contactApp.entity.Contact;
import com.contactApp.contactApp.repo.ContactRepo;

@Service
public class ContactService {


	@Autowired
	private ContactRepo repo;
	public List<Contact> listAll(){
		return repo.findAll();
		}
	
	public void save(Contact std) {
		repo.save(std);
	}
	
}








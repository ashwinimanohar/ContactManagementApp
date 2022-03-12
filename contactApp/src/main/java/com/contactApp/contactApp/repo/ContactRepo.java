package com.contactApp.contactApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactApp.contactApp.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String>{

}


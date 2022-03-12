package com.contactApp.contactApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class ContactAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactAppApplication.class, args);
		System.out.println("my app is running...");
	}

}




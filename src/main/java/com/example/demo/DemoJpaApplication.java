package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.jpa.services.PersonService;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner{

	
	
	@Autowired private PersonService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		service.insertPerson();
		service.printAllPersons();
		service.getPersonById();
		
	}
}

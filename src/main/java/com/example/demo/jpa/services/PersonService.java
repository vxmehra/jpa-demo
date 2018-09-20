package com.example.demo.jpa.services;

import java.time.LocalDate;
import java.time.Month;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jpa.entities.Person;
import com.example.demo.jpa.entities.PhoneDetails;
import com.example.demo.jpa.repositories.PersonRepository;

@Service
@Transactional
public class PersonService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired private PersonRepository personRepository;
	
	public void printAllPersons() {
		logger.info("\nGet all persons-->{}",personRepository.getAllPersons());
	}

	
	public Person getPersonById() {
		Person p = personRepository.getPersonById(1);
		logger.info("\nPerson-->{}",p);
		return p;
	}
	
	
	public void insertPerson() {
		PhoneDetails phoneDetails = new PhoneDetails();
		phoneDetails.setCounrtyCode("91");
		phoneDetails.setPhoneNumber("123456789");
		
		Person person = new Person();
		person.setAddress("Address22");
		person.setDateOfBirth(LocalDate.of(1980, Month.APRIL, 1));
		person.setName("Mehra");
		person.setPhoneDetails(phoneDetails);
		
		logger.info("\nInserted Person --> {}",personRepository.savePerson(person));
		
	}
	public PersonService() {
		super();
	}

}

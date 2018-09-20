package com.example.demo.jpa.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.jpa.entities.Person;

@Repository
public class PersonRepository {

	@Autowired
	private EntityManager em;
	
	public PersonRepository() {
		super();
	}

	
	public List<Person> getAllPersons(){
		TypedQuery<Person> personQuery =  em.createNamedQuery("getAllPersons",Person.class);
		return personQuery.getResultList();
	}

	
	public Person getPersonById(Integer id){
		return em.find(Person.class, id);
		
	}

	public Person savePerson(Person p) {
		em.persist(p);
		return p;
	}
}

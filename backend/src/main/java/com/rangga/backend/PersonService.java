package com.rangga.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	private PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public PersonModel createPerson(PersonModel personModel) {
		return personRepository.save(personModel);
	}
	
	
}

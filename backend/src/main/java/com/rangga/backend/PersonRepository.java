package com.rangga.backend;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonModel, Integer> {

	Iterable<PersonModel> getPersonModelByPersonName(String personName);

}

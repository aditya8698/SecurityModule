package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.entity.Person;
import com.spring.demo.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository repo;
	
	@Override
	public void savePerson(Person person) {
		repo.save(person);
	}

	@Override
	public List<Person> getlist() {
		return repo.findAll();
	}

	@Override
	public void deletePerson(Integer id) {
		repo.deleteById(id);
	}

}

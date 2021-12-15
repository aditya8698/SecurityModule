package com.spring.demo.service;

import java.util.List;

import com.spring.demo.entity.Person;

public interface PersonService {
	
	public List<Person> getlist();

	public void savePerson(Person person);
	
	public void deletePerson(Integer id);
}

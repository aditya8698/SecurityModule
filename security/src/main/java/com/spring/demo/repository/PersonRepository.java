package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}

package com.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	@NonNull
	private String name;
	
	@Column
	@NonNull
	private String address;
	
	@Column
	@NonNull
	private String city;
	
}

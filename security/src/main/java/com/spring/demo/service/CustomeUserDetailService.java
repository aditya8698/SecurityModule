package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.demo.entity.CustomUserDetails;
import com.spring.demo.entity.User;
import com.spring.demo.repository.UserRepository;

public class CustomeUserDetailService implements UserDetailsService {

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("UserName not FOUND..");
		}
		return new CustomUserDetails(user);
	}

}

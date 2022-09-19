package com.practice.securityapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.securityapp.entity.LoginDetails;
import com.practice.securityapp.repository.LoginRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private LoginRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginDetails loginDetails = repo.findByUsername(username);
		if(loginDetails==null)
			throw new UsernameNotFoundException("User 404");
		return new LoginPrincipal(loginDetails);
	}

}

package com.practice.securityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.securityapp.entity.LoginDetails;

@Repository
public interface LoginRepo extends JpaRepository<LoginDetails, Integer>{
	LoginDetails findByUsername(String username);
}

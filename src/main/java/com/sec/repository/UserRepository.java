package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser, String> {
	public AppUser findByUsername(String username);

}

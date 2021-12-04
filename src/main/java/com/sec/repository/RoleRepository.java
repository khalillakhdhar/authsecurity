package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, String> {
	public AppRole findByRoleName(String roleName);

}

package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.example.hibernate.entity.Role;

public interface RoleService {

	List<Role> getAllRole();

	void saveRole(Role object);

	void deleteRole(Long id);

	Optional<Role> findRoleById(Long id);
	
}

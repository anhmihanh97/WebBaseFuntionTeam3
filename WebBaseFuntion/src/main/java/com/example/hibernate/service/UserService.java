package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.example.hibernate.entity.Role;

public interface UserService {

	List<Role> getAllUser();

	void saveUser(Role object);

	void deleteUser(Long id);

	Optional<Role> findUserById(Long id);

}

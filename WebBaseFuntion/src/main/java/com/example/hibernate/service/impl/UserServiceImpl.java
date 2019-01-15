package com.example.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.service.RoleService;
import com.example.hibernate.entity.Role;
import com.example.hibernate.repository.UserRepository;

@Service
public class UserServiceImpl implements RoleService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Role> getAllRole() {
		return (List<Role>) userRepository.findAll();
	}

	@Override
	public void saveRole(Role object) {
		userRepository.save(object);
	}

	@Override
	public Optional<Role> findRoleById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteRole(Long id) {
		userRepository.deleteById(id);
	}

	public List<Role> findByTitleContaining(String name) {
		List<Role> list = userRepository.findByNameContaining(name);
		return list;
	}
	
}

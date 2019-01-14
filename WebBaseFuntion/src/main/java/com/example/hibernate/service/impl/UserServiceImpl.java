package com.example.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.service.UserService;
import com.example.hibernate.entity.Role;
import com.example.hibernate.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<Role> getAllUser() {
		return (List<Role>) userRepository.findAll() ;
	}

	@Override
	public void saveUser(Role object) {
		userRepository.save(object);
	}

	@Override
	public Optional<Role> findUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}

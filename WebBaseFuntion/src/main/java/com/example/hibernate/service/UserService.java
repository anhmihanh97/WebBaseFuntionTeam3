package com.example.hibernate.service;

import java.util.List;

import com.example.hibernate.model.UserDTO;

public interface UserService {
	public List<UserDTO> getAllUser();
	
	public void addUser(UserDTO userDTO);
	
	public void deleteUser(int id);
	
	public void updateUser(UserDTO userDTO);
	
	public UserDTO getAllUser(int id);
}

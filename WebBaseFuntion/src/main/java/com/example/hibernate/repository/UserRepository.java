package com.example.hibernate.repository;

import java.util.List;


import com.example.hibernate.entity.User;

public interface UserRepository{
	public List<User> getALLUser() ;
	
	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public void updateUser(User user);
	
	public User getAllUser(int id);
}

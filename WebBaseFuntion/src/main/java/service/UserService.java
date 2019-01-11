package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> findAll(){
		return userRepository.findAll();
	}
	
	
}

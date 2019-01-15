 package com.example.hibernate.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernate.entity.User;
import com.example.hibernate.model.UserDTO;
import com.example.hibernate.repository.UserRepository;
import com.example.hibernate.service.UserService;
@Service
@Transactional
public class UserServiceimpl implements UserService{
	@Autowired
	private UserRepository userrepository;
	@Override
	public List<UserDTO> getAllUser() {
		List<User> user = userrepository.getALLUser();

		List<UserDTO> dtos= new ArrayList<UserDTO>();
		for(User u : user) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUserId(u.getUserId());
			userDTO.setFullName(u.getFullName());
			userDTO.setEmail(u.getEmail());
			userDTO.setMobile(u.getMobile());
			userDTO.setPassword(u.getPassword());
			userDTO.setStatus(u.getStatus());
			dtos.add(userDTO);
		}
		return dtos;
	}

	@Override
	public void addUser(UserDTO userDTO) {
		User u = new User();
		u.setFullName(userDTO.getFullName());
		u.setEmail(userDTO.getEmail());
		u.setMobile(userDTO.getMobile());
		u.setPassword(userDTO.getPassword());
		userrepository.addUser(u);

	}

	@Override
	public void deleteUser(int id) {
		User user = userrepository.getAllUser(id);
		if(user != null) {
			userrepository.deleteUser(user);
		}
	}

	@Override
	public void updateUser(UserDTO userDTOO) {
		User user = userrepository.getAllUser(userDTOO.getUserId());
		if(user != null) {
			user.setFullName(userDTOO.getFullName());
			user.setEmail(userDTOO.getEmail());
			user.setMobile(userDTOO.getMobile());
			user.setPassword(userDTOO.getPassword());
			user.setStatus(userDTOO.getStatus());
			userrepository.updateUser(user);
		}

	}

}

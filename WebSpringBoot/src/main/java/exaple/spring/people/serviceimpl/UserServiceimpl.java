package exaple.spring.people.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import exaple.spring.people.entity.User;
import exaple.spring.people.model.UserDTO;
import exaple.spring.people.repository.UserRepository;
import exaple.spring.people.service.UserService;

@Service
@Transactional
public class UserServiceimpl implements UserService{
	@Autowired
	private UserRepository userrepository;
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @return
	 */
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

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTO
	 */
	@Override
	public void addUser(UserDTO userDTO) {
		User u = new User();
		u.setFullName(userDTO.getFullName());
		u.setEmail(userDTO.getEmail());
		u.setMobile(userDTO.getMobile());
		u.setPassword(userDTO.getPassword());
		u.setStatus(userDTO.getStatus());
		userrepository.addUser(u);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 */
	@Override
	public void deleteUser(int id) {
		User user = userrepository.getAllUser(id);
		if(user != null) {
			userrepository.deleteUser(user);
		}
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTOO
	 */
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

	@Override
	public UserDTO getAllUser(int id) {
		User u =userrepository.getAllUser(id);
		UserDTO userDTO = new UserDTO();
		userDTO.setUserId(u.getUserId());
		userDTO.setFullName(u.getFullName());
		userDTO.setEmail(u.getEmail());
		userDTO.setMobile(u.getMobile());
		userDTO.setPassword(u.getPassword());
		userDTO.setStatus(u.getStatus());
		return userDTO;
	}
}

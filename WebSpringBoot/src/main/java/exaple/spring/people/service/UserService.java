package exaple.spring.people.service;

import java.util.List;

import exaple.spring.people.model.UserDTO;



public interface UserService {
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @return
	 */
	public List<UserDTO> getAllUser();
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTO
	 */
	public void addUser(UserDTO userDTO);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 */
	public void deleteUser(int id);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTO
	 */
	public void updateUser(UserDTO userDTO);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 * @return
	 */
	public UserDTO getAllUser(int id);
}

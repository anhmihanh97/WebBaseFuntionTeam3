package exaple.spring.people.service;

import java.util.List;

import exaple.spring.people.model.PersonalDTO;

public interface PersonalService {
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return object
	 * Version 1.0
	 * @return
	 */
	public List<PersonalDTO> getAllPersonal();
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add Personal
	 * Version 1.0
	 * @param personalDTO
	 */
	public void addPersonal(PersonalDTO personalDTO);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: delete Personal
	 * Version 1.0
	 * @param id
	 */
	public void deletePersonal(int id);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: update Personal
	 * Version 1.0
	 * @param personalDTO
	 */
	public void updatePersonal(PersonalDTO personalDTO);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add all Personal
	 * Version 1.0
	 * @param id
	 * @return
	 */
	public PersonalDTO getAllPersonal(int id);
}

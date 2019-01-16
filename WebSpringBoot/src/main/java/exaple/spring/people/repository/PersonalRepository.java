package exaple.spring.people.repository;

import java.util.List;

import exaple.spring.people.entity.Personal;

public interface PersonalRepository {
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description:return object
	 * Version 1.0
	 * @return
	 */
	public List<Personal> getAllPersona();
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add Personal
	 * Version 1.0
	 * @param personal
	 */
	public void addPersonal(Personal personal);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: delete Personal
	 * Version 1.0
	 * @param user
	 */
	public void deletePersonal(Personal personal);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: update Personal
	 * Version 1.0
	 * @param user
	 */
	public void updatePersonal(Personal personal);
	
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
	public Personal getAllPersonal(int id);
}

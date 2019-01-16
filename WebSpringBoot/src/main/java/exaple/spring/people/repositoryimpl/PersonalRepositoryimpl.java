package exaple.spring.people.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import exaple.spring.people.entity.Personal;
import exaple.spring.people.repository.PersonalRepository;

@Repository
@Transactional
public class PersonalRepositoryimpl implements PersonalRepository{
	@PersistenceContext
	EntityManager entitymanager;

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: return object
	 * Version 1.0
	 * @return
	 */
	@Override
	public List<Personal> getAllPersona() {
		String jql="SELECT e From Personal e";
		return entitymanager.createQuery(jql,Personal.class).getResultList();
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: add Personal
	 * Version 1.0
	 * @param personal
	 */
	@Override
	public void addPersonal(Personal personal) {
		entitymanager.persist(personal);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: delete Personal
	 * Version 1.0
	 * @param personal
	 */
	@Override
	public void deletePersonal(Personal personal) {
		entitymanager.remove(personal);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description:  update Personal
	 * Version 1.0
	 * @param personal
	 */
	@Override
	public void updatePersonal(Personal personal) {
		entitymanager.merge(personal);
		
	}

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
	@Override
	public Personal getAllPersonal(int id) {
		return entitymanager.find(Personal.class, id);
		
	}
	
	
	
}

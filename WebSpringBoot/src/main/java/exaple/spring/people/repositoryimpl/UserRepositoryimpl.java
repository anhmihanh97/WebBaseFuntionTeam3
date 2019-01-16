package exaple.spring.people.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import exaple.spring.people.entity.User;
import exaple.spring.people.repository.UserRepository;

@Repository
@Transactional
public class UserRepositoryimpl implements UserRepository {
	@PersistenceContext
	EntityManager entitymanager;

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
	public List<User> getALLUser() {
		String jql="SELECT e From User e";
		return entitymanager.createQuery(jql,User.class).getResultList();
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param user
	 */
	@Override
	public void addUser(User user) {
		entitymanager.persist(user);
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param user
	 */
	@Override
	public void deleteUser(User user) {
		entitymanager.remove(user);
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param user
	 */
	@Override
	public void updateUser(User user) {
		entitymanager.merge(user);
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 * @return
	 */
	@Override
	public User getAllUser(int id) {
		return entitymanager.find(User.class, id);
	}

	
	

}


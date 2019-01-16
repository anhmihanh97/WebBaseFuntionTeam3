package exaple.spring.people.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import exaple.spring.people.entity.Menu;
import exaple.spring.people.repository.MenuRepository;
@Repository
@Transactional
public class MenuRepositoryimpl implements MenuRepository {
	@PersistenceContext
	EntityManager entitymanager;
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @return
	 */
	@Override
	public List<Menu> getALLMenus() {
		String jql="SELECT e From Menu e";
		return entitymanager.createQuery(jql,Menu.class).getResultList();
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param menu
	 */
	@Override
	public void addMenu(Menu menu) {
		entitymanager.persist(menu);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param menu
	 */
	@Override
	public void deleteMenu(Menu menu) {
		entitymanager.remove(menu);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param menu
	 */
	@Override
	public void updateMenu(Menu menu) {
		entitymanager.merge(menu);
		
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
	public Menu getAllMenu(int id) {
		return entitymanager.find(Menu.class, id);
	}

}

package exaple.spring.people.repositoryimpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import exaple.spring.people.entity.News;
import exaple.spring.people.repository.NewsRepository;
@Repository
@Transactional
public class NewsRepositoryimpl implements NewsRepository{
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
	public List<News> getAllNews() {
		String jql="SELECT e From News e";
		return entitymanager.createQuery(jql,News.class).getResultList();
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param news
	 */
	@Override
	public void addNews(News news) {
		entitymanager.persist(news);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param news
	 */
	@Override
	public void deleteNews(News news) {
		entitymanager.remove(news);
		
	}

	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 16, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 16, 2019
	 * Description: ....
	 * Version 1.0
	 * @param news
	 */
	@Override
	public void updateNews(News news) {
		entitymanager.merge(news);
		
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
	public News getAllNews(int id) {
		return entitymanager.find(News.class, id);
	}

}

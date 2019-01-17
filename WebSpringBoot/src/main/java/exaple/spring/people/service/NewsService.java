package exaple.spring.people.service;

import java.util.List;
import exaple.spring.people.model.NewsDTO;

public interface NewsService {
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @return
	 */
	public List<NewsDTO> getAllNews();
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTO
	 */
	public void addNews(NewsDTO newsDTO);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param id
	 */
	public void deleteNews(int id);
	
	/**
	 * Create by: nmanh - CMC
	 * Create date: Jan 15, 2019
	 * Modifier: nmanh
	 * Modified date: Jan 15, 2019
	 * Description: ....
	 * Version 1.0
	 * @param userDTO
	 */
	public void updateNews(NewsDTO newsDTO);
	
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
	public NewsDTO getAllNews(int id);
}

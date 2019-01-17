package exaple.spring.people.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import exaple.spring.people.entity.News;
import exaple.spring.people.model.NewsDTO;
import exaple.spring.people.repository.NewsRepository;
import exaple.spring.people.service.NewsService;

@Service
@Transactional
public class NewsServiceimpl implements NewsService{
	@Autowired
	private NewsRepository newsRepository;

	@Override
	public List<NewsDTO> getAllNews() {
		List<News> news = newsRepository.getAllNews();
		
		List<NewsDTO> dtos= new ArrayList<NewsDTO>();
		for(News u : news) {
			NewsDTO newsDTO = new NewsDTO();
			newsDTO.setNewsId(u.getNewsId());
			newsDTO.setUrl(u.getUrl());
			newsDTO.setTitle(u.getTitle());
			newsDTO.setDesc(u.getDesc());
			newsDTO.setContent(u.getContent());
			newsDTO.setStatus(u.getStatus());
			newsDTO.setIsHot(u.getIsHot());
			dtos.add(newsDTO);
		}
		return dtos;
	}

	@Override
	public void addNews(NewsDTO newsDTO) {
		News u = new News();
		u.setUrl(newsDTO.getUrl());
		u.setTitle(newsDTO.getTitle());
		u.setDesc(newsDTO.getDesc());
		u.setContent(newsDTO.getContent());
		u.setStatus(newsDTO.getStatus());
		u.setIsHot(newsDTO.getIsHot());
		newsRepository.addNews(u);
	}

	@Override
	public void deleteNews(int id) {
		News news = newsRepository.getAllNews(id);
		if(news != null) {
			newsRepository.deleteNews(news);
		}
		
	}

	@Override
	public void updateNews(NewsDTO newsDTOO) {
		News news = newsRepository.getAllNews(newsDTOO.getNewsId());
		if(news != null) {
			news.setUrl(newsDTOO.getUrl());
			news.setTitle(newsDTOO.getTitle());
			news.setDesc(newsDTOO.getDesc());
			news.setContent(newsDTOO.getContent());
			news.setStatus(newsDTOO.getStatus());
			news.setIsHot(newsDTOO.getIsHot());
			newsRepository.updateNews(news);;
		}
	}

	@Override
	public NewsDTO getAllNews(int id) {
		News u =newsRepository.getAllNews(id);
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setUrl(u.getUrl());
		newsDTO.setTitle(u.getTitle());
		newsDTO.setDesc(u.getDesc());
		newsDTO.setContent(u.getContent());
		newsDTO.setStatus(u.getStatus());
		newsDTO.setIsHot(u.getIsHot());
		return newsDTO;
	}	
}

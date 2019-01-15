package com.example.hibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.hibernate.entity.News;
import com.example.hibernate.repository.NewsReponsitory;
import com.example.hibernate.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	
	private NewsReponsitory newsReponsitory;

	@Override
	public Iterable<News> findAll() {
		// TODO Auto-generated method stub
		return newsReponsitory.findAll();
	}

	@Override
	public List<News> search(String q) {
		// TODO Auto-generated method stub
		return newsReponsitory.findByTitleContaining(q);
	}

	@Override
	public Optional<News> findOne(int id) {
		// TODO Auto-generated method stub
		return newsReponsitory.findById(id);
	}

	@Override
	public void save(News news) {
		// TODO Auto-generated method stub
		newsReponsitory.save(news);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		newsReponsitory.deleteById(id);
	}

}

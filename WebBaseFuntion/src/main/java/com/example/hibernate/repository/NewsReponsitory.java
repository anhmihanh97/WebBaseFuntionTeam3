package com.example.hibernate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.hibernate.entity.News;

public interface NewsReponsitory extends CrudRepository<News, Integer> {
	List<News> findByTitleContaining(String title);
 }

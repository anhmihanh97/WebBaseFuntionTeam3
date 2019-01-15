package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import com.example.hibernate.entity.News;

public interface NewsService {
	Iterable<News> findAll();

    List<News> search(String q);

    Optional<News> findOne(int id);

    void save(News news);

    void delete(int id);
}

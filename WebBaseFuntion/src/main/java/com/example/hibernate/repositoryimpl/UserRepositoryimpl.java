package com.example.hibernate.repositoryimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.hibernate.entity.User;
import com.example.hibernate.repository.UserRepository;

@Repository
@Transactional
public class UserRepositoryimpl implements UserRepository {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<User> getALLUser() {
		String jql="SELECT e From User e";
		return entitymanager.createQuery(jql,User.class).getResultList();
	}

	@Override
	public void addUser(User user) {
		entitymanager.persist(user);
	}

	@Override
	public void deleteUser(User user) {
		entitymanager.remove(user);
	}

	@Override
	public void updateUser(User user) {
		entitymanager.merge(user);
	}

	@Override
	public User getAllUser(int id) {
		return entitymanager.find(User.class, id);
	}

}

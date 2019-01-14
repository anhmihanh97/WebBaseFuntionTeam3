package com.example.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.entity.Role;

@Repository
public interface UserRepository extends CrudRepository<Role, Long>{

}

package com.example.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.entity.Role;

@Repository
public interface UserRepository extends JpaRepository<Role, Long>{
//	@Query("select e from Role e where e.name like '%?1%'")
//	List<Role> findByFullNameLike(String name);
	
	List<Role> findByNameContaining(String q);
}

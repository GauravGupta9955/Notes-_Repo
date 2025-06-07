package com.JPA.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.JPA.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User> findByName(String name);
	List<User> findByCity(String city);

}

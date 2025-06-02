package com.JPA.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.JPA.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

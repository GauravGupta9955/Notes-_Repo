package com.JPA.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String city;
	
	private String status;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}

	

	public User(String city) {
		super();
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}

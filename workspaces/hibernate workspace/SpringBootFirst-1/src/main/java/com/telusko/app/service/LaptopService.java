package com.telusko.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.telusko.app.model.Laptop;
import com.telusko.app.repo.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;

	public void addlaptop(Laptop lap) {
		// TODO Auto-generated method stub
		laptopRepository.save(lap);
	}

	
	public boolean isGoodForProg(Laptop lap) {
		return true;
	}
}

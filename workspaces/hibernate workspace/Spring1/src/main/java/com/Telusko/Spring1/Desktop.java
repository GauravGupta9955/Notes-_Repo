package com.Telusko.Spring1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Desktop implements Computer{
	
	public Desktop() {
	   System.out.println("Desktop object created");
	}

	@Override
	public void compile() {
		// TODO Auto-generated method stub
		System.out.println("Compiling through desktop");
	}

}

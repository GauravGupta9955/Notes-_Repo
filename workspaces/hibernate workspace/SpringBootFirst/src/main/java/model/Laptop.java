package model;

import org.springframework.stereotype.Component;

import com.telusko.model.Computer;

@Component
public class Laptop implements Computer {

	public void compile() {
		System.out.println("Compiling in Laptop....");
	}
}

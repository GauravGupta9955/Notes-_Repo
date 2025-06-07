package encapsulation;

import java.util.Scanner;

class Alien{
private int age;
private String name;

Alien(int age, String name)
{
	this.age=age;
	this.name=name;
}
public int getAge() { 
	return age;
}

public String getName() {
	return name;
}

}


public class Enclaps2 {
	public static void main(String[] args) {

		Alien a =new Alien(10,"gaurav");
		System.out.println(a.getAge());
		
		 
	}

}

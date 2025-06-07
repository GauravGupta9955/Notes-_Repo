package com.singleton;

public class gettingclass {
	public static void main(String[] args) {
		Singleton single= Singleton.getSingleTon();
		Singleton single1= Singleton.getSingleTon();
		if(single==single1)
			System.out.println("same instance");
		else
			System.out.println("different instance");
	}

}

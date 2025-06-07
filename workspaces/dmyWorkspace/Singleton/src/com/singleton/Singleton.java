package com.singleton;

public class Singleton {
	
	private static Singleton singleton;
	private Singleton() {
		
	}
	
	public static Singleton getSingleTon() {
		if (singleton==null) {
			singleton= new Singleton();
			return singleton;
		}
		return singleton;
	}

}

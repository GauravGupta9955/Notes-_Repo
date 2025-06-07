package com.factoryDesignPattern;
public class FactoryDesignPattern {
	public static void main(String[] args) {
		Factory devops = new DevopsFactory();
		Company com1=devops.FactoryMethod();
		com1.Employee();
		
		Factory java = new javaFactory();
		Company com2=java.FactoryMethod();
		com2.Employee();
		
		Factory Frontend  = new FrontendFactory();
		Company com3=Frontend.FactoryMethod();
		com3.Employee();
		
		
	}

}

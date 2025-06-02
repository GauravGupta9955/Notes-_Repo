package com.factoryDesignPattern;

class javaFactory implements Factory{

	@Override
	public Company FactoryMethod() {
		// TODO Auto-generated method stub
		return new Agency2();
	}
	
}

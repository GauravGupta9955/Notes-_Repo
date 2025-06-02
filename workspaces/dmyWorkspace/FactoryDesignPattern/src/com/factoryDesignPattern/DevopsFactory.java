package com.factoryDesignPattern;

//Concrete Factory method
class DevopsFactory implements Factory{

	@Override
	public Company FactoryMethod() {
		// TODO Auto-generated method stub
		return new Agency1();
	}
	
}
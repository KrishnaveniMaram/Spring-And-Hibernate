package com.demo;

public class Car implements Vehicle {

	public void myInitmethod(){
		System.out.println("i am init method xml version for person in car");
	}


	public Car() {
		System.out.println("cntr of car is called");
	}
	
	@Override
	public void move(){
		System.out.println("in car");
	}

	public void myDestroyMethod(){
		System.out.println("i am destroy method xml version for person");
	}
}

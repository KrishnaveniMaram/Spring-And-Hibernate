package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String args[]){
		
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("ex1.xml");
		ctx.registerShutdownHook();
		Person person=ctx.getBean("p",Person.class);
		person.travel();
		
		
	}
	
	
	
	
}

package com.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext  ctx=new ClassPathXmlApplicationContext("ex1.xml");
		Figure figure=(Figure) ctx.getBean("fig");
		figure.printFigure();		
		
	}

}

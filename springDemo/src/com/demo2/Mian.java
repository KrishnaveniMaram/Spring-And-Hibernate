package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("example.xml");
		/*Point point=(Point) ctx.getBean("p1");
		System.out.println(point);
		Point point1=(Point) ctx.getBean("p2");
		System.out.println(point1);
		Point point2=(Point) ctx.getBean("p3");
		System.out.println(point2);
		Point point3=(Point) ctx.getBean("p4");
		System.out.println(point3);*/
		
		Traingle traingle=(Traingle) ctx.getBean("tr");
		System.out.println(traingle);
	
	}

}

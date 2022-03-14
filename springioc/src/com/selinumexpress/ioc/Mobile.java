package com.selinumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[]arg) {
		
	 ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
	 System.out.println("config loaded");
		
	Sim sim = context.getBean("sim", Sim.class);
	sim.calling();
	sim.data();
	}

}

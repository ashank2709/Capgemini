package com.selinumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		student shw = context.getBean("student",student.class);
		shw.displaystudentInfo();
		
		student kaushiki = context.getBean("kaushiki",student.class);
		kaushiki.displaystudentInfo();

	}

}

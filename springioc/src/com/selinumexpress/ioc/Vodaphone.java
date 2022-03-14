package com.selinumexpress.ioc;

public class Vodaphone implements Sim {
	
	public Vodaphone() {
		System.out.println("vodaphone constr called");
	}

	@Override
	public void calling() {
		
		System.out.println("calling using vodaphone sim");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodaphone sim");
		
	}

}
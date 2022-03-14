package com.org.practice;

public class employee {
	
	
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public employee(int id,String f, String l, int s) {
		
		id=id;
		firstname=f;
		lastname=l;
		salary=s;
		}
	
	public int getId() {
		return id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getName() {
		return firstname+""+lastname;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int s) {
	salary=s;
	}
	
	public int getAnnualsalary() {
		return salary*12;
	}
	
	public int raisesalary(int percent) {
		return salary=salary+(salary*percent/100);
	}
	
	public String toString() {
		return "Employee[id=8,name=peter tan ,salary=2500] ";
	}

	
	}

	



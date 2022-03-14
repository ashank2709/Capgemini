package com.selinumexpress.di;

public class student {
	
	
	private int id;
	private String studentname;
	
	

	public void setId(int id) {
		this.id = id;
	}



	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}



	public void displaystudentInfo()
	{
		System.out.println("Student name is :" + studentname +"  " + " the id is:" +id);
		
	}

}

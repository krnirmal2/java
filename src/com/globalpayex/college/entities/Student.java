package com.globalpayex.college.entities;

public class Student extends CollegeUser{
	
	int Roll;
	float marks;
	
	public Student(String name, char gender, int roll, float marks){
		// super();//calls the class constructor of CollegeUser
		//internally
		// it will passed the this to CollegeUser(this)
//		this.name = name;
//		this.gender = gender;
		
		super(name, gender);
		this.Roll = roll ;
		this.marks = marks;
		
	}
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		//
		String detailsOfSuperClass = super.getDetails();
		
			return String.format(" %s\nmarks: %s",detailsOfSuperClass, this.marks);
			
		
		
	}
	

}

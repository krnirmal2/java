package com.globalpayex.college.entities;

public class CollegeUser extends Object{
	public String name;
	public char gender;
	
	// so this constructor help to reduce the initialisation part in the child
	//class explicitly becuase technically we need to initialised the name and gender
	// here rather than child class that's why we create a parmeterised constructor 
	// which help to initialsed the name and gender in both the child classes
	// and we have to only call the super() class by passing the parameter of name and gender 
	public CollegeUser(String name, char gender) {
//		super();
		this.name = name;
		this.gender = gender;
	}
	
	
//	Defualt constructor with out parmeter means it will create super() constructor in
	// both or all the childclasses where it has been inheritent
//	CollegeUser(){
//		// this--> Student object, professor object 
//		
//	}
	
    public String getDetails() {
    	return String.format("Name : %sGender : %s",this.name,this.gender);
    }
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return String.format("%s\n %s ",this.name, this.gender);
    }
	
	

}

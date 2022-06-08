package com.globalpayex.college.entities;

public class Professor extends CollegeUser {
	
	String subject[];
	
	public Professor(String name, char gender, String[] subject) {
		super(name,gender);// internally calls the super class constructor of CollegeUser
		
//		this.name = name;
//		this.gender = gender;
		this.subject = subject;
	}
	
	

}

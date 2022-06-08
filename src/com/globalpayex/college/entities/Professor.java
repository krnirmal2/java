package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {
	
	double costPerDay;
	int workingDay;
	
	String subject[];
	
	public Professor(String name, char gender, String[] subject, double costPerDay,int 
			workingDay) {
		super(name,gender);// internally calls the super class constructor of CollegeUser
		
//		this.name = name;
//		this.gender = gender;
		this.subject = subject;
		this.costPerDay = costPerDay;
		this.workingDay = workingDay;
	}

	@Override
	public int getNoOfDayWorked() {
		// TODO Auto-generated method stub
		return this.workingDay;
	}

	@Override
	public double getPRicePerDay() {
		// TODO Auto-generated method stub
		return this.costPerDay;
	}
	
	

}

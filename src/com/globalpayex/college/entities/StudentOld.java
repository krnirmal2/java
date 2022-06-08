package com.globalpayex.college.entities;

public class StudentOld {
	//instance attributes or properties of student but not class attribute
	String name;
	char gender;
	int Roll;
	float marks;
	
	//now for count the no. of object created by the user we need static keyword 
	// which helps to remain the value through out program and it not lived inside 
	// the Student but it will lived inside the "class" class which track that each
	// time create constructor when ever there is creation of object of Student class
	static int count;// it present in class "class" which is build in already and presenet
	                // in RAM
	
	// static variable always called with the class name with dot operator
	
	//default constructor if other constructor 
//	Student(Student this){
//		
//	}
	
	//parameterised constructor and a default this parameter
	public StudentOld(String name, char gender, int roll, float marks){
		this.name = name;
		this.gender = gender;
		this.Roll = roll ;
		this.marks = marks;
		StudentOld.count++;
		
	}
	// so here we have done access specifier as public
	// it resolved the reference of access one class member 
	// means when two file are in different directory or package on that
//	time it will help to resolve the error due to not accessing the "Default"
	//access specifier
	public StudentOld(){
		// must be the first statement in a constructor
		// and also we can't call using new keywork
		this("Na",'m',-1,0.0f);
	}
	
	// return Student type object without new keyword in CreateStudent file
	static StudentOld CreateObjectForUsWithOutNewKeyword(String name, char gender, int roll, float marks) {
		return new StudentOld( name, gender, roll, marks);// it doesn't need this keyword because it doesn't call by object
	}
	
	//internally getdetails will call like 
	//String getDetails(Student this)
	String getDetails() {
//		String result ="";
//		result = "name : "+ this.name +"\n"+
//				 "Gender : "+ this.gender+"\n"+
//				 "Roll : "+ this.Roll +"\n"+
//				 "Marks : "+ this.marks;
//		
//		return result;
		return String.format("Name: %s\nGender: %s\nRoll: %s\nMarks: %s", 
				this.name, this.gender, this.Roll,this.marks);
		
	}
	 String getGenderName() {
		String result = "";
		result = "name : "+ this.name +"\n"+
				 "Gender : "+ this.gender;
		return result;
	}

	char getGrade() {
		char grade;
		if(this.marks<0 || this.marks>100) {
    		grade ='I';
    	}
    	if(this.marks>=70) {
    		grade ='A';
    	}
    	else if(this.marks>=60){
    		grade ='B';
    	}
    	else if(this.marks>=40){
    		grade ='C';
    	}
    	else {
    		grade ='F';
    	}
    	 return grade;
    }
	
}

// let add

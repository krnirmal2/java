package com.globalpayex.geometery.square;

import com.globalpayex.geometery.ABCcompany.entity.Shape;

public class Rectangle extends Shape {
	
	float length;
	float breath;
	
	public Rectangle(float length, float breath) {
		this.length = length;
		this.breath = breath;
	}
	public float areaRec() {
		return this.length * this.breath ;
	}
	
	public float perimeterRec() {
		return 2*(this.length+this.breath);
		
	}
	
	
	

}

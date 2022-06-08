package com.globalpayex.geometery.square;

import com.globalpayex.geometery.ABCcompany.entity.Shape;

public class Squre extends Shape{
	
	float side;
	
	public Squre(float side) {
		this.side = side;
	}
	public float area() {
		return this.side*this.side;
	}
	
	public float perimeter() {
		return 4*this.side;
		
	}
	
	

}

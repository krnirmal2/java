package com.globalpayex.geometery.ABCcompany;

import com.globalpayex.geometery.ABCcompany.entity.Shape;
import com.globalpayex.geometery.square.Squre;

public class ShapeStatistics {
	
	public static void print(Shape s) {
		System.out.println("*********************Statistics***********************");
		System.out.println(String.format("Area is %s", s.area()));
		System.out.println(String.format("Perimeter is %s", s.perimeter()));
		System.out.println("*********************Statistics***********************");
	}
	

}

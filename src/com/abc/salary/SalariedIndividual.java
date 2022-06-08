package com.abc.salary;

public interface SalariedIndividual {
	
	int getNoOfDayWorked();
	
	double getPRicePerDay();
	
	
	public default double calculate() {
		int noOfDays = this.getNoOfDayWorked();
		double costperday = this.getPRicePerDay();
		
		double costWithoutTAx = noOfDays *costperday;
		int professionalTax =200;
		double costWithoutTax = costWithoutTAx-(0.1 * costWithoutTAx);
		return costWithoutTAx;
	}
	

}

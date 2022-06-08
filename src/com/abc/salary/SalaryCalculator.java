package com.abc.salary;

@Deprecated // it give warning that this below class may be in 
// future remove so it will better u will some other way to calculate your 
// salary

public class SalaryCalculator {
	public static double calculate(SalariedIndividual sal) {
		int noOfDays = sal.getNoOfDayWorked();
		double costperday = sal.getPRicePerDay();
		
		double costWithoutTAx = noOfDays *costperday;
		int professionalTax =200;
		double costWithoutTax = costWithoutTAx-(0.1 * costWithoutTAx);
		return costWithoutTAx;
	}

}

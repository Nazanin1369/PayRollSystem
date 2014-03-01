package org.MUM.PayrollSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee 
{

	private int empId;
	ArrayList<PayCheck> checks = new ArrayList<PayCheck>();

	public Employee(int empId)
	{
		this.empId = empId;
	}
	//Methods
	public void addAPayCheck(PayCheck p)
	{
		checks.add(p);
	}
	//----------------------------------------

	public void print() 
	{
		System.out.println("Id: "+this.getEmpId());

	}
	//----------------------------------------
	public PayCheck calcCompensation(int month, int year)
	{
		
		Calendar date = Calendar.getInstance();
		date.set( Calendar.YEAR, year );
		date.set( Calendar.MONTH,month-1 );
		
		Calendar startDate = DateRange.getFirstDayOfMonth(date.getTime());
		Calendar endDate = DateRange.getLastDayOfMonth(date.getTime());
		
		
		DateRange dateRange= new DateRange(startDate, endDate);

		//calculate grossPay amount
		double grossPay = calcGrossPay(dateRange);

		//Calculate taxes amount
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01; 
		double medicare = grossPay * 0.03;
		double ssn = grossPay * 0.075;
	
		PayCheck payCheck = new PayCheck(grossPay,fica, state, local, medicare, ssn, dateRange);
		
		return payCheck;


	}
	//----------------------------------------------------------
	public abstract double calcGrossPay(DateRange range);

	//---------------------------------------------------------
	/*
	 * This method calculates number of days between the range input.
	 */
	public long getDaysDiff(DateRange range)
	{
		long start = range.getStartDate().getTimeInMillis();
		long end = range.getEndDate().getTimeInMillis();
		long diff = Math.abs(start - end);
		long diffDays = diff / (24 * 60 * 60 * 1000);
		return diffDays;
	}

	//getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public ArrayList<PayCheck> getChecks() {
		return checks;
	}

	public void setChecks(ArrayList<PayCheck> checks) {
		this.checks = checks;
	}


}

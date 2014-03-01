package org.MUM.PayrollSystem;


public class Hourly extends Employee 
{
	private double hourlyWage;
	private int hoursPerWeek;
	
	
	public Hourly(int empId, double hourlyWage, int hoursPerWeek)
	{
		super(empId);
		this.hourlyWage =  hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	@Override
	public double calcGrossPay(DateRange range) 
	{
		//calculate number of days between the range
		long diffDays = getDaysDiff(range);
		//calculate gross pay
		double dailyGrossPay = 0;
		double grossPay = 0;
		dailyGrossPay = (hourlyWage+(4*hoursPerWeek))/28;//for a day
		grossPay = dailyGrossPay*diffDays;//for mentioned time
		return grossPay;
	}
	
	@Override
	public void print() 
	{
		System.out.println("Employee type: Hourly"+"\nId: " + this.getEmpId());
		System.out.println("Hourly wage: " + this.getHourlyWage());
		System.out.println("Hours per week: " + this.getHoursPerWeek() );

	}
	
	
	
	//getters and setters
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	

}

package org.MUM.PayrollSystem;

public class Salaried extends Employee 
{
	private double salary;

	
	public Salaried(int empId, double salary)
	{
		super(empId);
		this.salary = salary;
	}
	
	
	@Override
	public double calcGrossPay(DateRange range) 
	{
		//calculate number of days between the range
		long diffDays = getDaysDiff(range);
		//calculate gross pay
		double grossPay = 0;
		grossPay = (salary/30)*diffDays;
		return grossPay;
	}

	
	@Override
	public void print() 
	{
		System.out.println("Employee type: Salaried"+"\nId: " + this.getEmpId());
		System.out.println("Salary: " + this.getSalary());

	}
	
	//getters and setters
	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

}

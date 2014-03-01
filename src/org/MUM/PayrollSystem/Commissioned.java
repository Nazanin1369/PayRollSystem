package org.MUM.PayrollSystem;

import java.util.ArrayList;

public class Commissioned extends Employee 
{
	private double commission;
	private double baseSalary;
	ArrayList<Order> orders = new ArrayList<Order>();

	
	public Commissioned( int empId, double baseSalary) {
		super(empId);
		this.baseSalary = baseSalary;
	}
	
	//Methods
	public void addAnOrder(Order o)
	{
		orders.add(o);
	}
	//--------------------------------------------------

	@Override
	public double calcGrossPay(DateRange range) 
	{
		//calculate number of days between the range
		long diffDays = getDaysDiff(range);
		//calculate gross pay
		double grossPay = 0;
		double totalCommission =  getTotCommission();
		grossPay = ( (baseSalary) + (totalCommission) / 30) * diffDays;
		
		return grossPay;
	}

	//---------------------------------------------------
	
	@Override
	public void print() 
	{
		System.out.println("Employee type: Commissioned"+"\nId: " + this.getEmpId());
		System.out.println("commission: " + this.getTotCommission());
		System.out.println("Base salary: " + this.getBaseSalary() );

	}
	
	public double getTotCommission()
	{
		double totalCommission = 0;
		for(Order order : orders)
		{
			totalCommission += 0.07 * order.getOrderAmount();
		}
		return totalCommission;
	}

	//getters and setters
	public double getCommission() 
	{
		return commission;
	}

	public void setCommission(double commission) 
	{
		this.commission = commission;
	}

	public double getBaseSalary() 
	{
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) 
	{
		this.baseSalary = baseSalary;
	}

	public ArrayList<Order> getOrders() 
	{
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) 
	{
		this.orders = orders;
	}

}

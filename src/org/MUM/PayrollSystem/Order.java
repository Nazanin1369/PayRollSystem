package org.MUM.PayrollSystem;

import java.util.Calendar;

public class Order 
{
	private String orderNo;
	private Calendar orderDate;
	private double orderAmount;
	Commissioned commissioned;
	
	public Order(String orderNo, Calendar orderDate, double orderAmount)
	{
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	
	//getters and setters
	public String getOrderNo() 
	{
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) 
	{
		this.orderNo = orderNo;
	}
	
	public Calendar getOrderDate() 
	{
		return orderDate;
	}
	
	public void setOrderDate(Calendar orderDate) 
	{
		this.orderDate = orderDate;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
	
	public void setOrderAmount(double orderAmount) 
	{
		this.orderAmount = orderAmount;
	}
	
	public Commissioned getCommissioned() 
	{
		return commissioned;
	}
	
	public void setCommmissioned(Commissioned commissioned) 
	{
		this.commissioned = commissioned;
	}
	
	

}

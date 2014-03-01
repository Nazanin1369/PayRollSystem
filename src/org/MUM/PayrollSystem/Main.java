package org.MUM.PayrollSystem;

import java.util.ArrayList;
import java.util.Calendar;

public class Main 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		//Hourly
		Hourly hourlyEmployee = new Hourly(1,60,20);
		employees.add(hourlyEmployee);
		//Salaried
		Salaried salariedEmployee = new Salaried(2,3000);
		employees.add(salariedEmployee);
		//Commissioned
		Commissioned commissionedEmployee = new Commissioned(3,1000);
		employees.add(commissionedEmployee);
		
		Calendar order1Date = Calendar.getInstance();
	    order1Date.set( Calendar.YEAR, 2012 );
	    order1Date.set( Calendar.MONTH, Calendar.MAY );
	    order1Date.set( Calendar.DATE, 20 );
	    
	    Calendar order2Date = Calendar.getInstance();
	    order2Date.set( Calendar.YEAR, 2012 );
	    order2Date.set( Calendar.MONTH, Calendar.MAY );
	    order2Date.set( Calendar.DATE, 20 );
	    
	    
	    Order order1 = new Order("1",order1Date,3.5);
	    commissionedEmployee.addAnOrder(order1);
	    
	    Order order2 = new Order("2",order2Date,30);
	    commissionedEmployee.addAnOrder(order2);
	    
		
		
		
		//hourly
		hourlyEmployee.print();
		PayCheck  hourlyCkeck= hourlyEmployee.calcCompensation(2, 2012);
		hourlyEmployee.addAPayCheck(hourlyCkeck);
		hourlyCkeck.print();
		
		//salaried
		
		salariedEmployee.print();
		PayCheck salariedCheck = salariedEmployee.calcCompensation(2, 2013);
		salariedEmployee.addAPayCheck(salariedCheck);
		salariedCheck.print();
		
		//commissioned
		commissionedEmployee.print();
		PayCheck commissionedCheck = commissionedEmployee.calcCompensation(2, 2011);
		commissionedEmployee.addAPayCheck(commissionedCheck);
		commissionedCheck.print();
		
		
		
	}
}
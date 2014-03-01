package org.MUM.PayrollSystem;

//Immutable class
public class PayCheck 
{
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double ssn;
    DateRange payPeriod;
	Employee employee;
	
	public PayCheck(double grossPay,  double fica, double state, double local, double medicare, double ssn, DateRange payPeriod)
	{
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.ssn = ssn;
		this.payPeriod = payPeriod;
	}
	//Methods
	public double getNetPay()
	{
		double netPay = 0;
		netPay = grossPay - (fica + state + local + medicare + ssn);
		return netPay;
		
	}
	//------------------------------------
	public void print()
	{
		System.out.println();
		System.out.println("------------PayCheck-----------\n");
		System.out.println();
		System.out.println("Pay period: "+payPeriod.dateRangeToString());
		System.out.println();
		System.out.printf("Total salary: $ %.2f ",this.getGrossPay());
		System.out.println();
		System.out.println();
		System.out.println("       --Taxes--");
		System.out.printf("  -FICA:     $ %.2f", fica);
		System.out.println();
		System.out.printf("  -STATE:    $ %.2f " , state);
		System.out.println();
		System.out.printf(  "  -MEDICARE: $ %.2f  " , medicare);
		System.out.println();
		System.out.printf("  -SSN:      $ %.2f  " , ssn);
		System.out.println();
		System.out.printf("Net payment: $ %.2f" , getNetPay() );
		System.out.println();
		System.out.println();
		System.out.println("*******************************************************");
	
	}
	
	
	//getters 
	public double getGrossPay() 
	{
		return grossPay;
	}
	public double getFica() 
	{
		return fica;
	}
	public double getState()
	{
		return state;
	}
	public double getLocal() 
	{
		return local;
	}
	public double getMedicare()
	{
		return medicare;
	}
	public double getSsn() 
	{
		return ssn;
	}
	public DateRange getPayPeriod() 
	{
		return payPeriod;
	}
	public Employee getEmployee() 
	{
		return employee;
	}

}

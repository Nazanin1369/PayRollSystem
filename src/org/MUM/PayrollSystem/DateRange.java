package org.MUM.PayrollSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


//Immutable class
public class DateRange 
{
	private Calendar startDate;
	private Calendar endDate;


	public DateRange(Calendar startDate, Calendar endDate )
	{
		this.startDate = startDate;
		this.endDate =endDate;
	}

	
	
	//Methods
	
	public static Calendar DateToCalendar(Date date)
	{ 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	} 
	
	//-------------------------------------------------------------------
	
	
	public boolean isInRange(Date date)
	{
		return (date.before(endDate.getTime()) || date.after(startDate.getTime()));
	}
	//--------------------------------------

	public String toString(Calendar date)
	{
		String dateString;
		// 12-Apr-06
		DateFormat df  =  new SimpleDateFormat("MM/dd/yyyy", Locale.US);
		dateString = df.format(date);
		return dateString;

	}

	public String dateRangeToString()
	{
		String range;
		DateFormat df  =  new SimpleDateFormat("MM/dd/yyyy", Locale.US);
		String startDate = df.format(this.startDate.getTime());
		String endDate = df.format(this.endDate.getTime());
		
		range = startDate + " - "  + endDate;
		return range;
		
	}
	//---------------------------------------

	public static Calendar getFirstDayOfMonth(Date date)
	{
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		GregorianCalendar gc = new GregorianCalendar(year, month, 1);
		Calendar monthStartDate = Calendar.getInstance();
		monthStartDate.setTime(gc.getTime()); 
		return monthStartDate;

	}

	//-------------------------------------------

	public static Calendar getLastDayOfMonth(Date date)
	{
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		GregorianCalendar gc = new GregorianCalendar(year, month, day);
		Calendar monthEndDate = Calendar.getInstance();
		monthEndDate.setTime(gc.getTime());
		return monthEndDate;
	}

	//getters
	public Calendar getStartDate() {
		return startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

}

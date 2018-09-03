package com.capgemini.day5;

import java.util.Arrays;

public class MyDate {
	int day ;
	int month ;
	int year ;
	public MyDate() {
		
	}
	public MyDate(int day, int month, int year) throws Exception {
		super();
		
		if(month==2 && year%4!=0 && (day<1 || day>28))
				throw new InvalidDayException("not valid") ;
	
		if(month==2 && year%4==0 && (day<1 || day>29))
			throw new InvalidDayException("not valid") ;
		
		if(month<1 || month>12)
			throw new InvalidMonthException("not valid") ;
		
		if(day<1 || day>31)
			throw new InvalidDayException("not valid") ;
		
		int monthCheck[]= {1,3,5,7,8,10,12} ;
		
		
		if(Arrays.binarySearch(monthCheck,month)<0)
		{
			if(day<1 || day>30)
				throw new InvalidDayException("not valid") ;
		}
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	

}

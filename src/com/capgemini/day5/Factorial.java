package com.capgemini.day5;

public class Factorial {

	public static int getFactorial(int number) throws InvalidInputException, FactorialException {
		int fact=1;
		if (number <2)
		{
	
			throw new InvalidInputException("Invalid input");
		}    
		  else
		  {
			  for(int i=1;i<=number;i++){
				  fact=fact*i;
				  
		    if(fact<0)
		    	throw new FactorialException("Invalid factorial number");
			  }
		    	return fact;
		    }
		
			  }
		    
	}
	

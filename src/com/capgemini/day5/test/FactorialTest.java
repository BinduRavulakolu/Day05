package com.capgemini.day5.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Factorial;
import com.capgemini.day5.FactorialException;
import com.capgemini.day5.InvalidInputException;
import com.capgemini.day5.MyCalculator;

class FactorialTest {

	@Test
	void testValidInput() throws InvalidInputException, FactorialException {
		assertEquals(24,Factorial.getFactorial(4));
	}
		@Test
		void testInvalidInput()
		{
		InvalidInputException e;
		e=assertThrows(InvalidInputException.class,()-> Factorial.getFactorial(0));
		assertEquals("Invalid input",e.getMessage());
	}
		@Test
		void testInvalidFactorial()
		{
		FactorialException e;
		e=assertThrows(FactorialException.class,()-> Factorial.getFactorial(120));
		assertEquals("Invalid factorial number",e.getMessage());
	}
		


}

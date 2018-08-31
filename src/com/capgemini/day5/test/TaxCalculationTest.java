package com.capgemini.day5.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.CountryNotValidException;
import com.capgemini.day5.EmployeeNameInvalidException;
import com.capgemini.day5.TaxNotEligibleException;
import com.capgemini.day5.Taxcalculation;

class TaxCalculationTest {

	@Test
	void testCalculateTaxWithValidInput() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(3300.00,Taxcalculation.calculateTax("Jack",true,55000),0.2);
		assertEquals(1750.00,Taxcalculation.calculateTax("Tom",true,35000),0.2);
		assertEquals(11600.00,Taxcalculation.calculateTax("Tom",true,145000),0.2);
		
	}
	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		e=assertThrows(CountryNotValidException.class,()-> Taxcalculation.calculateTax("Tom",false,55000));	
		assertEquals("The employee should be an Indian citizen for calculating tax",e.getMessage());
	
	}
	@Test
	void testCalculateTaxWithIneligible() {
		Exception e;
		e=assertThrows(TaxNotEligibleException.class,()-> Taxcalculation.calculateTax("Tim",true,1000));	
		assertEquals("The employee does not need to pay tax",e.getMessage());
	
	}
	
	@Test
	void testCalculateTaxWithInvalidName() {
		Exception e;
		e=assertThrows(EmployeeNameInvalidException.class,()-> Taxcalculation.calculateTax(null,true,30000));	
		assertEquals("The employee name cannot be empty",e.getMessage());
	e=assertThrows(EmployeeNameInvalidException.class,()-> Taxcalculation.calculateTax("",true,30000));	
	assertEquals("The employee name cannot be empty",e.getMessage());
		
	
	}
	
	

}

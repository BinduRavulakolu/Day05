package com.capgemini.day5.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.NameNotValidException;
import com.capgemini.day5.Student;




class StudentTest {
	Student student;


	@Test
	void testStudentWithValidInput() throws AgeNotWithinRangeException,NameNotValidException {
		
		assertNotNull(new Student(1234,"Tom",17,"btech"));
		
		
		
	}
	@Test
	void testStudentWithAgeInvalidinput()  {
		AgeNotWithinRangeException e ;
		
		e = assertThrows(AgeNotWithinRangeException.class,()->new Student(1234,"Tom",1,"btech"));
		assertEquals("age is not with in the range ",e.getMessage());
		
	}
	
	@Test
	void testStudentWithNameInvalidinput()  {
		NameNotValidException e;
		
		e = assertThrows(NameNotValidException.class,()->new Student(1234,"To2",17,"btech"));
		assertEquals("Invalid name",e.getMessage());
		
	}
	

}

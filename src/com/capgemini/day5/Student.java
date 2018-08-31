package com.capgemini.day5;

public class Student {
	int rollNo;
	String name;
	int age;
	String course;
public Student() {
	
}
public Student(int rollNo,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException
    {

	if(age<=15 || age>=21)
	{
		throw new AgeNotWithinRangeException("age is not with in the range ");
	}
	else
	{
	for(int i=0;i<name.length();i++)
	if(name.charAt(i)>='A'&&name.charAt(i)<='Z'||name.charAt(i)>='a'&&name.charAt(i)<='z')
	{
		
	}
	else
	{
		throw new NameNotValidException("Invalid name");
	}
	}	
	this.rollNo=rollNo;
	this.name=name;
	this.age=age;
	this.course=course;

}

}

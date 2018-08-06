package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.*;
public class Grades_test
{
	
	Grades obj= new Grades();
	int [] avg= {40,40};
	int [] minimum= {50,60,30};
	int [] maximum= {50,60,70};
	@Test
	public void test1()
	{
		assertEquals("The average is 40", obj.average(avg));
	}
	@Test
	public void test2()
	{
		assertEquals("The minimum is 30", obj.min(minimum));
	}
	@Test
	public void test3()
	{
		assertEquals("The maximum is 70", obj.max(maximum));
	}
	@Test
	public void test4()
	{
		assertNotEquals("The minimum is 60",obj.min(minimum));
	}
	
}
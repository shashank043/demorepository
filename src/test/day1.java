package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	
		// TODO Auto-generated method stub
	@AfterTest
	public void endtest()
	{
		System.out.println("I will execute at last");
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello World");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("I am the number 1 from Last");
	}
	@Test
	public void secondTest()
	{
		System.out.println("Shashank");
	}

}

package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void ploan()
	{
		System.out.println("Good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I run before test");
	}
}

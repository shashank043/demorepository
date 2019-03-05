package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This will run before class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("This will run after class");
	}
	@Parameters({"URL","API"})
	@Test
	public void webloginhomeloan(String url,String api)
	{
		System.out.println("webloginhome");
		System.out.println(url);
		System.out.println(api);
	}
	@Test(groups= {"Smoke"})
	public void Mobileloginhomeloan()
	{
		System.out.println("Mobileloginhome");
	}
	@Test
	public void LoginAPIhomeloan()
	{
		System.out.println("APIloginhome");
		Assert.assertTrue(false);
	}
	

}

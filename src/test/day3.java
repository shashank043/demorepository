package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class day3 {
	
	@Test
	public void weblogincarloan()
	{
		System.out.println("weblogincar");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will run before each method");
	}
	@AfterMethod
	public void aftermethod()
	{
	System.out.println("I will run after each method");
	}
	@Test(enabled=true)
	public void Mobilelogincarloan()
	{
		System.out.println("Mobilelogincar");
	}
	@BeforeSuite
	public void aftersuite()
	{
		System.out.println("I am the Number 1 from Top");
	}
	@Test
	public void MobileSignincarloan()
	{
		System.out.println("MobileSignincar");
	}
	@Test(groups= {"Smoke"})
	public void MobileSignoutcarloan()
	{
		System.out.println("MobileSighnoutcar");
	}
	@Test(dataProvider="getData")
	public void LoginAPICarloan(String username,String password)
	{
		System.out.println("APIlogincar");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username password-good credit hisory
		//2ndusername password- no credit history
		//3rd-fraudulent credit history
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}

}

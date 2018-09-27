package Testngg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex2 
{
	@BeforeClass
	public void openapp()
	{
		Reporter.log("open application",true);
	}
	@AfterClass
	public void closeapp()
	{
		Reporter.log("close application",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login application",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout application",true);
	}
	
}

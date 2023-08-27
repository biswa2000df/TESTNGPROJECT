package UI.copy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class LoginTest extends CommonDataSetup{
	
	@BeforeTest
	public void LoginToApplication()
	{
		System.out.println("Login to application");
		
	}
	
	
	@AfterTest
	public void LogoutToApplication()
	{
		System.out.println("Logout to application");
		
	}
	
	@BeforeMethod
	public void ConnecttoDB()
	{
		System.out.println("connected to DB");
	}
	
	@AfterMethod
	public void DisConnectFromDB()
	{
		System.out.println("DisConnect from db");
	}
	
	
	@Test(priority=1,description="this is the login page")
	public void bloginTest()
	{
		System.out.println("Login page");
	}
	
	@Test(priority=2,description="this is the logout page")
	public void alogoutTest()
	{
		
		System.out.println("Logout page");
	}

}

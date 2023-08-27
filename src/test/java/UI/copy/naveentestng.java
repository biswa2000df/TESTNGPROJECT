package UI.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class naveentestng {
	
	WebDriver driver;
	
	@BeforeMethod()
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
		
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println(driver.getTitle());
	}
	@Test
	public void googleGmailTest()
	{
		Boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

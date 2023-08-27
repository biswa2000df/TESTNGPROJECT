package UI.copy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleANdText {
	
	@Test
	
	//This is the hard assert
	
	
	public void ebay()
	{
		String exceptedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exceptedText="Search";
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String actualTitle=driver.getTitle();
		System.out.println("Veryfing Title");
		Assert.assertEquals(actualTitle, exceptedTitle,"The Title is failed");	
		String actualTest=driver.findElement(By.id("gh-btn")).getAttribute("value");
		System.out.println("Veryfing Test");
		Assert.assertEquals(actualTest, exceptedText, "The text is failed");
		System.out.println("Driver close");
		driver.close();
		
	}

}

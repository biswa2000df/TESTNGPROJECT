package UI.copy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void ebay()
	{
		String exceptedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		String actualTitle=driver.getTitle();
		driver.close();
		Assert.assertEquals(actualTitle, exceptedTitle,"Hello u got the Title");
		
		
	}

}

package common;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetResponseCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String url="https://www.bing.com/";
		
		driver.get(url);
		
		String currentUrl=driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		if(url.equals(currentUrl))
			System.out.println("The url is perfect");
		else
			System.out.println("The url is not good");
		
		
		
		
//		URL url=new URL("https://www.bing.com");
//		
//		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
//		
//		int responseCode=connection.getResponseCode();
//		
//		if(responseCode>200)
//			System.out.println("Bad request response");
//		
//		else
//			System.out.println("The response code is "+ responseCode);
//			System.out.println("Ok");
		
		

		
		
	}

}

package gettitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GETURL_GETTITLE {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnn.com/");
		
		System.out.println("The title of this page is:"  + driver.getTitle());
		
		String Expected = "CNN - Breaking News, Latest News and Videos";
		String ActualResult = driver.getTitle();
		
		
		if (ActualResult.equals(Expected)) {
		System.out.println("The test case is Pass");
	}
		else {
			System.out.println("The test case is fail");
		}
           System.out.println("The Current Url of this page is ;" + driver.getCurrentUrl());
	
           
           String ExpectedUrl = "https://www.cnn.com/";
           String ActualUrl = driver.getCurrentUrl();
            if (ActualUrl.equals(ExpectedUrl)) {
            	System.out.println("The Test Case is Pass");
            }
            else {
            	System.out.println("The Test Case is Fail");
            }
	}
}
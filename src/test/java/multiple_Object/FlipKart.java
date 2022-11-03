package multiple_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/dresses-and-gown/gown/women-gown/pr?sid=clo,odx,od7,0xx&otracker=categorytree&otracker=nmenu_sub_Women_0_Gowns");

	List<WebElement> WomenGowns = driver.findElements(By.cssSelector("div._2WkVRV"));
		System.out.println("Total Women Gown in this page is : " + WomenGowns.size());
	
		List<WebElement> WomenGownsPrice = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
		
		for (int i=0 ; i<WomenGowns.size(); i++) {
			System.out.println(WomenGowns.get(i).getText()+ "---------" + WomenGownsPrice.get(i).getText());
		}
			driver.quit();
	
				
	}

}

package multiple_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Html_Tag {
public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		/* driver.get("https://www.cnn.com"); */
		 driver.get("https://www.cnn.com"); 
		
		String CNNPageTitle = driver.getTitle();
		System.out.println("The title of the landing page is: " + CNNPageTitle);

		List<WebElement> timeanddateLinks = driver.findElements(By.tagName("td"));//63
		
		
		System.out.println("Total links in this page are: " + timeanddateLinks.size());
/*
		
		for (int i = 1; i < CNNLinks.size(); i++) {
			WebElement TotalLinks = CNNLinks.get(i);
			System.out.println(TotalLinks.getText() + " --- " + TotalLinks.isDisplayed());
		}

		System.out.println("************************");
		
		WebElement particularLink = CNNLinks.get(50);

		
		System.out.println("The text of this link is: " + particularLink.getText());

		
		System.out.println("The url this links holds is :" + particularLink.getAttribute("rel"));
	}*/
}
}
		
		
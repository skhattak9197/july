package right_left;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RIGHT_LEFT_CLICK {
  public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
		
		Actions actions = new Actions (driver);
		WebElement rightclickonME = driver.findElement(By.cssSelector(null));
		
		
		WebElement Signinlink = driver.findElement(By.className("signin"));
		
		
		actions.contextClick(rightclickonME).build().perform();
		
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
